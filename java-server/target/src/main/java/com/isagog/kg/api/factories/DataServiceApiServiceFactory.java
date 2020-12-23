package com.isagog.kg.api.factories;

import com.isagog.kg.api.DataServiceApiService;
import com.isagog.kg.api.impl.DataServiceApiServiceImpl;

public class DataServiceApiServiceFactory {
    private static final DataServiceApiService service = new DataServiceApiServiceImpl();

    public static DataServiceApiService getDataServiceApi() {
        return service;
    }
}
