package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.InteractionServiceApiService;
import com.isagog.kg.api.factories.InteractionServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.CompletionResponse;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.InteractRecord;
import java.util.List;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.UpdateResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-13T15:29:38.710+01:00[Europe/Berlin]")
public class InteractionServiceApi  {
   private final InteractionServiceApiService delegate = InteractionServiceApiServiceFactory.getInteractionServiceApi();

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
    public Response completeFrame(@ApiParam(value = "String to search by",required=true) @QueryParam("hook") String hook
,@ApiParam(value = "" ) Frame frame
)
    throws NotFoundException {
        return delegate.completeFrame(hook,frame);
    }
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
    public Response completeString(@ApiParam(value = "String to search by",required=true) @QueryParam("hook") String hook
,@ApiParam(value = "Conceptual type restriction (opt)") @QueryParam("itype") String itype
)
    throws NotFoundException {
        return delegate.completeString(hook,itype);
    }
    @POST
    @Path("/issue")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sends an interaction sequence for processing", notes = "Sends list of interaction records, to be processed according to the service's buisiness logic", response = String.class, tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Acknowledge", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Query response", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "Update response", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed frame", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = String.class) })
    public Response issue(@ApiParam(value = "Interaction record array" ,required=true) List<InteractRecord> interactRecord
,@ApiParam(value = "Issuing target (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.issue(interactRecord,kg);
    }
}
