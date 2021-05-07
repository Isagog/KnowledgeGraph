package com.isagog.kg.service.factories;

import com.isagog.kg.service.KnowledgeServiceApiService;
import com.isagog.kg.service.impl.KnowledgeServiceApiServiceImpl;

public class KnowledgeServiceApiServiceFactory {
    private static final KnowledgeServiceApiService service = new KnowledgeServiceApiServiceImpl();

    public static KnowledgeServiceApiService getKnowledgeServiceApi() {
        return service;
    }
}
