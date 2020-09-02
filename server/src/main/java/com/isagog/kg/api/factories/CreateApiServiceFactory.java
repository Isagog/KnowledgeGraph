package com.isagog.kg.api.factories;

import com.isagog.kg.api.CreateApiService;
import com.isagog.kg.api.impl.CreateApiServiceImpl;

public class CreateApiServiceFactory {
    private final static CreateApiService service = new CreateApiServiceImpl();

    public static CreateApiService getCreateApi() {
        return service;
    }
}
