package com.isagog.kg.api.impl;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import com.isagog.kg.model.TextAnnotation;
import com.isagog.kg.model.TextualContent;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class AnalyzeApiServiceImpl extends AnalyzeApiService {
    @Override
    public Response analyzeSentence(String kg
, String task
, TextualContent textualContent
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
