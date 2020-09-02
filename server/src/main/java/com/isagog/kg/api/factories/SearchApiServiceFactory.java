package com.isagog.kg.api.factories;

import com.isagog.kg.api.SearchApiService;
import com.isagog.kg.api.impl.SearchApiServiceImpl;

public class SearchApiServiceFactory {
    private final static SearchApiService service = new SearchApiServiceImpl();

    public static SearchApiService getSearchApi() {
        return service;
    }
}
