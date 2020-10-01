package com.isagog.kg.api.factories;

import com.isagog.kg.api.GetApiService;
import com.isagog.kg.api.impl.GetApiServiceImpl;

public class GetApiServiceFactory {
    private final static GetApiService service = new GetApiServiceImpl();

    public static GetApiService getGetApi() {
        return service;
    }
}
