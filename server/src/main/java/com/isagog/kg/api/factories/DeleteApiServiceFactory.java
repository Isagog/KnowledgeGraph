package com.isagog.kg.api.factories;

import com.isagog.kg.api.DeleteApiService;
import com.isagog.kg.api.impl.DeleteApiServiceImpl;

public class DeleteApiServiceFactory {
    private final static DeleteApiService service = new DeleteApiServiceImpl();

    public static DeleteApiService getDeleteApi() {
        return service;
    }
}
