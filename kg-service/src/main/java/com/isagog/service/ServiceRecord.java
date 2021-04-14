package com.isagog.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServiceRecord {


    private IsagogServiceModule.Type type;

    private String jar;

    private String className;

    private String brand;

    private String protocol;

    private String version;

    private String proxy;

    private List<String> uses;

    private List<String> args;

 //   private IsagogServiceModule service = null;

    public ServiceRecord() {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public ServiceRecord(@Nonnull String type,
                         @Nonnull String brand,
                         @Nullable String protocol,
                         @Nullable String version,
                         @Nullable String proxy,
                         @Nullable List<String> uses,
                         @Nullable List<String> args) {
        this.type = IsagogServiceModule.Type.valueOf(type);
        this.brand = brand;
        this.protocol = protocol != null ? protocol : "NONE";
        this.version = version != null ? version : "*";
        this.proxy = proxy != null ? proxy : "localhost";
        this.uses = uses != null? uses : Collections.emptyList();
        this.args = args != null ? args : Collections.emptyList();
    }

    public IsagogServiceModule.Type getType() {
        return type;
    }


    public void setType(IsagogServiceModule.Type type) {
        this.type = type;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getArgs() {
        return args;
    }

    public List<String> getArgs(@Nonnull String key) {
        if (args == null) return Collections.emptyList();
        return args.stream()
                .filter(a -> a.split("=")[0].equals(key))
                .map(a -> a.split("=")[1])
                .collect(Collectors.toList());
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }


    public Optional<String> getArg (@Nonnull String key) {
        if (args == null) return Optional.empty();
        return args.stream()
            .filter(a -> a.split("=")[0].equals(key))
            .findFirst()
            .map(a -> a.split("=")[1]);
    }


    public String getProtocol() {
        return protocol != null ? protocol : "NONE";
    }

    public String getProxy() {
        return proxy != null ? proxy : "localhost";
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }



    public String getVersion() {
        return version != null ? version : "*";
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getUses() {
        return uses != null ? uses : Collections.emptyList();
    }

    public void setUses(List<String> uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "type=" + type +
                ", brand='" + brand + '\'' +
                ", protocol='" + protocol + '\'' +
                ", version='" + version + '\'' +
                ", proxy='" + proxy + '\'' +
                ", uses=" + uses +
                ", args=" + args +
                '}';
    }

    public String getJar() {
        return jar;
    }

    public String getClassName() {
        return className;
    }

    public void setJar(String jar) {
        this.jar = jar;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

