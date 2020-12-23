package com.isagog.kg.api.impl;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import com.isagog.kg.model.Frame;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.SentenceAnnotation;
import com.isagog.kg.model.UpdateResponse;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T17:39:55.205+01:00[Europe/Berlin]")
public class InteractionServiceApiServiceImpl extends InteractionServiceApiService {
    @Override
    public Response complete(String hook
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response input(Sentence sentence
, String kg
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response issue(Frame frame
, String kg
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
