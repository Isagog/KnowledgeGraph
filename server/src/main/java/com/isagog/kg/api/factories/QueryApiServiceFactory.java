package com.isagog.kg.api.factories;

import com.isagog.kg.api.QueryApiService;
import com.isagog.kg.api.impl.QueryApiServiceImpl;

public class QueryApiServiceFactory {
    private final static QueryApiService service = new QueryApiServiceImpl();

    public static QueryApiService getQueryApi() {
        return service;
    }
}
