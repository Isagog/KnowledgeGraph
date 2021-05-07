package com.isagog.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.cli.*;
import org.wso2.msf4j.MicroservicesRunner;

import javax.ws.rs.core.Response;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Application entry point (singleton)
 *
 * @since 1.0.0-SNAPSHOT
 */
public final class IsagogService {

    /* singleton object */
    private static IsagogService service = null;

    public IsagogService() {
    }

    /**
     * Get singleton
     *
     * @return
     */
    public static IsagogService getService() {
        if (service == null) throw ServiceException.raise("Service not initialized").get();
        return service;
    }


    public static Logger getLog() {
        if (service == null) {
            Logger.getGlobal().warning("Service not initialized, getting global log");
            return Logger.getGlobal();
        }
        return service.Log;
    }

    public static IsagogServiceConfig getConfig() {
        if (service == null) {
            getLog().warning("Service not configured, return void config");
            return new IsagogServiceConfig();
        }
        return service.config;
    }

    private final Map<ServiceRecord, Class<? extends IsagogServiceModule>> endpoints = new HashMap<>();

    private MicroservicesRunner microservicesRunner = null;

    public Logger Log = Logger.getLogger("isagog-service");

    public IsagogServiceConfig config = null;


    public boolean start(File configFile) {
        try {
            if (isConfigured()) throw new ServiceException("Service " + config.getName() + " already configured");

            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

            mapper.findAndRegisterModules();

            config = mapper.readValue(configFile, IsagogServiceConfig.class);

            // config.sortModules();

            Log.info("Starting " + config.getName() + " on port " + config.getPort());

            Log.setLevel(Level.ALL);


            IsagogRuntime.getInstance()
                    .setName(config.getName())
                    .setPort(config.getPort())
                    .setClassPath(config.getClasspath())
                    .setResourcePath(config.getResources())
                    .setCachePath(config.getCache());



            microservicesRunner = new MicroservicesRunner(config.getPort());

            microservicesRunner.addGlobalRequestInterceptor((request, response) -> {
                Log.info("request: " + request.getUri() + " response code: " + response.getStatusCode());
                return true;
            });


            microservicesRunner.addExceptionMapper(new ServiceExceptionMapper());
            microservicesRunner.addExceptionMapper(throwable -> {
                IsagogService.getLog().severe(throwable.toString());
                return Response
                        .serverError()
                        .entity("Unrecoverable service exception")
                        .build();

            });

            service = this;

            deployEndpoints(config);


        } catch (RuntimeException | ServiceException re) {
            Log.warning(" CAUSE " + re.toString());
        } catch (Exception e) {
            Log.severe( " CAUSE " + e.toString());
            service = null;
        }

        if (service != null) {
            microservicesRunner.start();
            Log.info("started");
            return true;
        } else {
            Log.severe("failed");
            return false;
        }

    }

    private boolean isConfigured() {
        return config != null;
    }


    private void deployEndpoints(IsagogServiceConfig cfg) throws IllegalAccessException, InstantiationException, ServiceException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        IsagogClassLoader classLoader = (IsagogClassLoader) ClassLoader.getSystemClassLoader();
        Thread.currentThread().setContextClassLoader(classLoader);
        IsagogRuntime rt = IsagogRuntime.getInstance();
        for (ServiceRecord ep : cfg.getModules()) {
            Optional.ofNullable(ep.getJar()).ifPresent(jar ->
                    {
                        try {
                            classLoader.add(rt.getClassPath(), jar);
                        } catch (MalformedURLException e) {
                            Log.severe(e.getMessage());
                        }
                    }
            );

            String className = Optional.ofNullable(ep.getClassName())
                    .orElseThrow(ServiceException.raise("Missing service's class name"));


            Class<IsagogServiceModule> moduleClass = null;
            try {
                moduleClass = (Class<IsagogServiceModule>) Class.forName(className, true, classLoader);
            } catch (Exception e) {
                throw ServiceException.of("Loading " + className + " failed due to " + e.toString()).get();
            }

            IsagogServiceModule module = null;
            try {
                module = moduleClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw ServiceException.of("Instantiation of " + className + " failed due to " + e.getCause().toString()).get();
            }



                module.initialize(ep);

                for (String signature : ep.getUses()) {
                    module.addServiceModule(signature, cfg.getBasepath(), cfg.getPort());
                }

                if (microservicesRunner.getMsRegistry()
                        .getServiceWithBasePath(ep.getProxy())
                        .isPresent()) {
                    Log.warning("service at " + ep.getProxy() + " will be replaced");
                }

                // ep.setService(module);
                microservicesRunner.deploy(module);
                String addr = ep.getProxy();

                if (addr == null)
                    addr = "localhost";

                Log.info(ep.getType() + " service at " + addr + " deployed");



        }


    }





    public static void main(String[] args) {

        Options options = new Options();

        Option config = new Option("c", "config", true, "service configuration file");
        config.setRequired(true);
        options.addOption(config);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("java -jar isagog-kg-service-jar-with-dependencies.jar", options);

            System.exit(1);
        }

        String configFilePath = cmd.getOptionValue("config");

        IsagogService srv = new IsagogService();

        if (!srv.start(new File(configFilePath))) {
            srv.Log.severe("aborting the service process");
            System.exit(-1);
        }


    }


}


