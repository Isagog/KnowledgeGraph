package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.InteractionServiceApiService;
import com.isagog.kg.api.factories.InteractionServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.CompletionResponse;
import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.IssueResponse;
import java.util.List;

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


@io.swagger.annotations.Api(description = "the InteractionService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T19:24:07.920+01:00[Europe/Berlin]")
public class InteractionServiceApi  {
   private final InteractionServiceApiService delegate = InteractionServiceApiServiceFactory.getInteractionServiceApi();

    @GET
    @Path("/complete")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Suggets completions", notes = "Provides a list of candidate completions to the provided input (hook)", response = CompletionResponse.class, tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of suitable completions", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Illegal hook", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = CompletionResponse.class) })
    public Response complete(@ApiParam(value = "String to search by",required=true) @QueryParam("hook") String hook
,@ApiParam(value = "Conceptual type restriction (opt)") @QueryParam("itype") String itype
)
    throws NotFoundException {
        return delegate.complete(hook,itype);
    }
    @POST
    @Path("/complete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Suggets completions", notes = "Provides completion to the provided hook wrt a frame", response = CompletionResponse.class, tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of suitable completions", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Illegal hook", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = CompletionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = CompletionResponse.class) })
    public Response completeInContext(@ApiParam(value = "String to search by",required=true) @QueryParam("hook") String hook
,@ApiParam(value = "" ) List<InteractRecord> interactRecord
)
    throws NotFoundException {
        return delegate.completeInContext(hook,interactRecord);
    }
    @POST
    @Path("/issue")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sends an interaction sequence for processing", notes = "Sends list of interaction records, to be processed according to the service's buisiness logic", response = IssueResponse.class, tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IssueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = IssueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed frame", response = IssueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = IssueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = IssueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = IssueResponse.class) })
    public Response issue(@ApiParam(value = "Interaction record array" ,required=true) List<InteractRecord> interactRecord
,@ApiParam(value = "Issuing target (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.issue(interactRecord,kg);
    }
}
