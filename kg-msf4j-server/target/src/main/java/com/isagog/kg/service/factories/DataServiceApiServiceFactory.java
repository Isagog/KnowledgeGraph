package com.isagog.kg.service.factories;

import com.isagog.kg.service.DataServiceApiService;
import com.isagog.kg.service.impl.DataServiceApiServiceImpl;

public class DataServiceApiServiceFactory {
    private static final DataServiceApiService service = new DataServiceApiServiceImpl();

    public static DataServiceApiService getDataServiceApi() {
        return service;
    }
}
