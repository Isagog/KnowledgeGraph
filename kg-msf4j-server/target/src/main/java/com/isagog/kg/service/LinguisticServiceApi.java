package com.isagog.kg.service;

import com.isagog.kg.model.*;
import com.isagog.kg.service.LinguisticServiceApiService;
import com.isagog.kg.service.factories.LinguisticServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.AnnotatedDocument;
import com.isagog.kg.model.AnnotatedSentence;
import com.isagog.kg.model.Document;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.Task;

import java.util.List;
import com.isagog.kg.service.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the LinguisticService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class LinguisticServiceApi  {
   private final LinguisticServiceApiService delegate = LinguisticServiceApiServiceFactory.getLinguisticServiceApi();

    @POST
    @Path("/document/analyze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Document analysis", notes = "Extract and analyze sentences from a document", response = AnnotatedDocument.class, tags={ "LinguisticService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid document", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported task", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = AnnotatedDocument.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = AnnotatedDocument.class) })
    public Response documentAnalysis(@ApiParam(value = "Tasks to be executed",required=true, defaultValue="new ArrayList<>()") @DefaultValue("new ArrayList<>()") @QueryParam("tasks") List<Task> tasks
,@ApiParam(value = "" ) Document document
)
    throws NotFoundException {
        return delegate.documentAnalysis(tasks,document);
    }
    @POST
    @Path("/sentence/analyze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sentence analysis", notes = "Provides an annotation of the supplied sentence", response = AnnotatedSentence.class, tags={ "LinguisticService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid sentence", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported task", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = AnnotatedSentence.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = AnnotatedSentence.class) })
    public Response sentenceAnalysis(@ApiParam(value = "Tasks to be executed",required=true, defaultValue="new ArrayList<>()") @DefaultValue("new ArrayList<>()") @QueryParam("tasks") List<Task> tasks
,@ApiParam(value = "" ) Sentence sentence
)
    throws NotFoundException {
        return delegate.sentenceAnalysis(tasks,sentence);
    }
}
