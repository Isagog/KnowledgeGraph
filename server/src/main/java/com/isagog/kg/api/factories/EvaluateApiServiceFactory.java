package com.isagog.kg.api.factories;

import com.isagog.kg.api.EvaluateApiService;
import com.isagog.kg.api.impl.EvaluateApiServiceImpl;

public class EvaluateApiServiceFactory {
    private final static EvaluateApiService service = new EvaluateApiServiceImpl();

    public static EvaluateApiService getEvaluateApi() {
        return service;
    }
}
