package com.isagog.kg.service.factories;

import com.isagog.kg.service.LinguisticServiceApiService;
import com.isagog.kg.service.impl.LinguisticServiceApiServiceImpl;

public class LinguisticServiceApiServiceFactory {
    private static final LinguisticServiceApiService service = new LinguisticServiceApiServiceImpl();

    public static LinguisticServiceApiService getLinguisticServiceApi() {
        return service;
    }
}
