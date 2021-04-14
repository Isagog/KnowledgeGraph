package com.isagog.service;

import com.isagog.kg.ApiClient;
import com.isagog.kg.api.DataServiceApi;
import com.isagog.kg.api.InteractionServiceApi;
import com.isagog.kg.api.KnowledgeServiceApi;
import com.isagog.kg.api.LinguisticServiceApi;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IsagogRuntime {

    private static IsagogRuntime instance = new IsagogRuntime();

    private String name;
    private Integer port;
    private String classPath;
    private String resourcePath;

    public String getCachePath() {
        return cachePath;
    }

    public IsagogRuntime setCachePath(String cachePath) {
        this.cachePath = cachePath;
        return this;
    }

    private String cachePath;

    public String getName() {
        return name;
    }


    public IsagogRuntime setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public IsagogRuntime setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getClassPath() {
        return classPath;
    }

    public String getClassLocator (String jarName) {
        return "file:///" + classPath + "/" + jarName;
    }

    public IsagogRuntime  setClassPath(String classPath) {
        this.classPath = resolvePath(classPath);
        return this;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getResourceLocator(String resourceName) {
        return "file:///" + resourcePath + "/" + resourceName;
    }

    public IsagogRuntime setResourcePath(String resourcePath) {
        this.resourcePath = resolvePath(resourcePath);
        return this;
    }




    private IsagogRuntime () {}

    public static IsagogRuntime getInstance() {
        return instance;
    }

    private  Map<String, KnowledgeServiceApi> knowledgeServiceRegistry = new HashMap<>();
    private  Map<String, DataServiceApi> dataServiceRegistry = new HashMap<>();
    private  Map<String, LinguisticServiceApi> languageServiceRegistry = new HashMap<>();
    private  Map<String, InteractionServiceApi> interactServiceRegistry = new HashMap<>();

    public void registerService (IsagogServiceModule.Type type, String signature, Object service) {
        switch (type) {
            case KNOWLEDGE:
                knowledgeServiceRegistry.put(signature,(KnowledgeServiceApi) service);
                break;
            case LANGUAGE:
                languageServiceRegistry.put(signature,(LinguisticServiceApi) service);
                break;
            case DATA:
                dataServiceRegistry.put(signature,(DataServiceApi) service);
                break;
            case INTERACTION:
                interactServiceRegistry.put(signature,(InteractionServiceApi) service);
                break;
        }
    }



    public Optional<KnowledgeServiceApi> getAnyKnowledgeService () {
        if (knowledgeServiceRegistry.isEmpty())
            return Optional.empty();
        else
            return knowledgeServiceRegistry.values().stream().findAny();
    }

    public Optional<DataServiceApi> getAnyDataService () {
        if (dataServiceRegistry.isEmpty())
            return Optional.empty();
        else
            return dataServiceRegistry.values().stream().findAny();
    }

    public  Optional<LinguisticServiceApi> getAnyLinguisticService () {
        if (languageServiceRegistry.isEmpty())
            return Optional.empty();
        else
            return languageServiceRegistry.values().stream().findAny();
    }

    public Optional<InteractionServiceApi> getAnyInteractionService () {
        if (interactServiceRegistry.isEmpty())
            return Optional.empty();
        else
            return interactServiceRegistry.values().stream().findAny();
    }


    private String resolvePath(String cfg) {
        if (cfg.startsWith(".")) {
            return System.getProperty("user.dir").replaceAll("\\\\","/") + cfg.substring(1);
        } else {
            return cfg;
        }
    }


}
