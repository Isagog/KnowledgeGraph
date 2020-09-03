package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.AnalyzeApiService;
import com.isagog.kg.api.factories.AnalyzeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.TextAnnotation;
import com.isagog.kg.model.TextualContent;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/analyze")


@io.swagger.annotations.Api(description = "the analyze API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class AnalyzeApi  {
   private final AnalyzeApiService delegate = AnalyzeApiServiceFactory.getAnalyzeApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sentence analysis", notes = "Provides an annotation of the supplied text object according to available knowledge, including entity recognition, linking and relations (opt)", response = TextAnnotation.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TextAnnotation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = TextAnnotation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid sentence", response = TextAnnotation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported task", response = TextAnnotation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = TextAnnotation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = TextAnnotation.class, responseContainer = "List") })
    public Response analyzeSentence(@ApiParam(value = "Analysis context (opt)") @QueryParam("kg") String kg
,@ApiParam(value = "", allowableValues="ENTITIES, CONCEPTS, RELATIONS", defaultValue="ENTITIES") @DefaultValue("ENTITIES") @QueryParam("task") String task
,@ApiParam(value = "" ) TextualContent textualContent
)
    throws NotFoundException {
        return delegate.analyzeSentence(kg,task,textualContent);
    }
}
