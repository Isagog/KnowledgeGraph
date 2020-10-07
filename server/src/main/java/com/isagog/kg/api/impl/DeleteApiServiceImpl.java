package com.isagog.kg.api.impl;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;


import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:26:29.882986300+02:00[Europe/Berlin]")
public class DeleteApiServiceImpl extends DeleteApiService {
    @Override
    public Response deleteGraph(String kg
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
