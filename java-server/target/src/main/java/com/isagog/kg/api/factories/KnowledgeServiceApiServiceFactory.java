package com.isagog.kg.api.factories;

import com.isagog.kg.api.KnowledgeServiceApiService;
import com.isagog.kg.api.impl.KnowledgeServiceApiServiceImpl;

public class KnowledgeServiceApiServiceFactory {
    private static final KnowledgeServiceApiService service = new KnowledgeServiceApiServiceImpl();

    public static KnowledgeServiceApiService getKnowledgeServiceApi() {
        return service;
    }
}
