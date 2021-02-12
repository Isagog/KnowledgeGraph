package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.LinguisticServiceApiService;
import com.isagog.kg.api.factories.LinguisticServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Document;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.SentenceAnnotation;
import com.isagog.kg.model.Task;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the LinguisticService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:33.133+01:00[Europe/Berlin]")
public class LinguisticServiceApi  {
   private final LinguisticServiceApiService delegate = LinguisticServiceApiServiceFactory.getLinguisticServiceApi();

    @POST
    @Path("/analyze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sentence analysis", notes = "Provides an annotation of the supplied text object", response = SentenceAnnotation.class, tags={ "LinguisticService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid sentence", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported task", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = SentenceAnnotation.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = SentenceAnnotation.class) })
    public Response analyze(@ApiParam(value = "Tasks to be executed, all available if missing", defaultValue="new ArrayList<Task>()") @DefaultValue("new ArrayList<Task>()") @QueryParam("tasks") List<Task> tasks
,@ApiParam(value = "" ) Sentence sentence
)
    throws NotFoundException {
        return delegate.analyze(tasks,sentence);
    }
    @POST
    @Path("/extract")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sentence extraction", notes = "Extract sentences from a text", response = Sentence.class, responseContainer = "List", tags={ "LinguisticService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid document", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported task", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Sentence.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Sentence.class, responseContainer = "List") })
    public Response extract(@ApiParam(value = "", allowableValues="SUMMARY, PASSAGES, FULL", defaultValue="FULL") @DefaultValue("FULL") @QueryParam("mode") String mode
,@ApiParam(value = "") @QueryParam("limit") Integer limit
,@ApiParam(value = "" ) Document document
)
    throws NotFoundException {
        return delegate.extract(mode,limit,document);
    }
}
