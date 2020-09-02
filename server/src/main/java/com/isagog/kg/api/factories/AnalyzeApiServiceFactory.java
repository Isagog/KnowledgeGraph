package com.isagog.kg.api.factories;

import com.isagog.kg.api.AnalyzeApiService;
import com.isagog.kg.api.impl.AnalyzeApiServiceImpl;

public class AnalyzeApiServiceFactory {
    private final static AnalyzeApiService service = new AnalyzeApiServiceImpl();

    public static AnalyzeApiService getAnalyzeApi() {
        return service;
    }
}
