package com.isagog.kg.service.factories;

import com.isagog.kg.service.InteractionServiceApiService;
import com.isagog.kg.service.impl.InteractionServiceApiServiceImpl;

public class InteractionServiceApiServiceFactory {
    private static final InteractionServiceApiService service = new InteractionServiceApiServiceImpl();

    public static InteractionServiceApiService getInteractionServiceApi() {
        return service;
    }
}
