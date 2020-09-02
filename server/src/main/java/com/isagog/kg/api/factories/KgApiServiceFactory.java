package com.isagog.kg.api.factories;

import com.isagog.kg.api.KgApiService;
import com.isagog.kg.api.impl.KgApiServiceImpl;

public class KgApiServiceFactory {
    private final static KgApiService service = new KgApiServiceImpl();

    public static KgApiService getKgApi() {
        return service;
    }
}
