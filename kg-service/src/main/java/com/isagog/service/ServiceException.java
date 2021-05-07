package com.isagog.service;

import java.util.function.Supplier;

public class ServiceException extends Throwable {

    public ServiceException(String message) { super(message); }

    public static Supplier<ServiceException> of(String message) {
        return () -> new ServiceException(message);
    }

    public static Supplier<RuntimeException> raise(String message) {
        return () -> new RuntimeException(message);
    }
}
