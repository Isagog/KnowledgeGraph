package com.isagog.kg.api.factories;

import com.isagog.kg.api.LinguisticServiceApiService;
import com.isagog.kg.api.impl.LinguisticServiceApiServiceImpl;

public class LinguisticServiceApiServiceFactory {
    private static final LinguisticServiceApiService service = new LinguisticServiceApiServiceImpl();

    public static LinguisticServiceApiService getLinguisticServiceApi() {
        return service;
    }
}
