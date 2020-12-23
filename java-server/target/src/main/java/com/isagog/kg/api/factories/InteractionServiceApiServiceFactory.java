package com.isagog.kg.api.factories;

import com.isagog.kg.api.InteractionServiceApiService;
import com.isagog.kg.api.impl.InteractionServiceApiServiceImpl;

public class InteractionServiceApiServiceFactory {
    private static final InteractionServiceApiService service = new InteractionServiceApiServiceImpl();

    public static InteractionServiceApiService getInteractionServiceApi() {
        return service;
    }
}
