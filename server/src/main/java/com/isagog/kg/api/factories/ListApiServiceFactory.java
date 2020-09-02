package com.isagog.kg.api.factories;

import com.isagog.kg.api.ListApiService;
import com.isagog.kg.api.impl.ListApiServiceImpl;

public class ListApiServiceFactory {
    private final static ListApiService service = new ListApiServiceImpl();

    public static ListApiService getListApi() {
        return service;
    }
}
