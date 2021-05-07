package com.isagog.service;


import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;

public class IsagogServiceConfig {

    private String name;
    private String basepath;
    private int port;
    private List<ServiceRecord> modules;
    private String classpath;
    private String resources;
    private String cache;

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }



    public String getClasspath() {
        return classpath;
    }

    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }



    @JsonCreator
    public IsagogServiceConfig() {
    }


    public List<ServiceRecord> getModules() {
        return modules;
    }

    public void setModules(List<ServiceRecord> serviceRecords) {
        this.modules = serviceRecords;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }
}

