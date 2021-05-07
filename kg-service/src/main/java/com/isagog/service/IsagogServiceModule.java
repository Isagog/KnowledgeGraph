package com.isagog.service;

import com.isagog.kg.ApiClient;
import com.isagog.kg.api.DataServiceApi;
import com.isagog.kg.api.InteractionServiceApi;
import com.isagog.kg.api.KnowledgeServiceApi;
import com.isagog.kg.api.LinguisticServiceApi;
import okhttp3.OkHttpClient;

import java.util.Optional;
import java.util.logging.Logger;

public interface IsagogServiceModule {

    enum Protocol {
        HTTP,
        JDBC
    }

    void initialize(ServiceRecord serviceRecord) throws ServiceException;


    boolean isInitialized();

    enum Type {

            KNOWLEDGE,
            LANGUAGE,
            DATA,
            INTERACTION;

    }

    Type type();

    default Logger log() {
        return Logger.getGlobal();
    }


    default IsagogServiceModule.Type getSignatureType (String signature) {
        return IsagogServiceModule.Type.valueOf(signature.split("\\\\")[0]); //TODO improve this
    }
    /**
     *
     * @param signature
     * @param basePath
     * @param port
     * @return
     * @throws ServiceException
     */
    default Optional<Object> addServiceModule(String signature, String basePath, int port) throws ServiceException {

        IsagogServiceModule.Type type = getSignatureType(signature);
        ApiClient cli = new ApiClient(); //.setBasePath("localhost:"+port);

        String root = "http://localhost:" + port + basePath;

        Object module = null;
        switch (type) {
            case KNOWLEDGE: {
                cli.setBasePath(root + "knowledge");
                module = new KnowledgeServiceApi(cli);
            } break;
            case LANGUAGE: {
                cli.setBasePath(root + "language");
                module = new LinguisticServiceApi(cli);
            } break;
            case DATA: {
                cli.setBasePath(root + "data");
                module = new DataServiceApi(cli);
            } break;
            case INTERACTION: {
                cli.setBasePath(root + "interact");
                module = new InteractionServiceApi(cli);
            } break;

        }

        IsagogRuntime.getInstance()
                     .registerService(type, signature, module);

        serviceModuleSetup(signature,module);

        return Optional.of(module);
    }

    default void serviceModuleSetup (String signature, Object module) {}

}
