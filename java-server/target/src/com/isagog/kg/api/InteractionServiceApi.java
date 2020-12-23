package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.InteractionServiceApiService;
import com.isagog.kg.api.factories.InteractionServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the InteractionService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class InteractionServiceApi  {
   private final InteractionServiceApiService delegate = InteractionServiceApiServiceFactory.getInteractionServiceApi();

    @GET
    @Path("/complete")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Suggets completions", notes = "Provides a list of candidate completions of the provided one", response = String.class, responseContainer = "List", tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Suitable completions", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Illegal hook", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = String.class, responseContainer = "List") })
    public Response complete(@ApiParam(value = "",required=true) @QueryParam("hook") String hook
)
    throws NotFoundException {
        return delegate.complete(hook);
    }
    @POST
    @Path("/input")
    @Consumes({ "application/json" })
    @Produces({ "text/plain", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "User input", notes = "Processes the user input", response = String.class, tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Acknowledge message", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Query response", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "Frame instantiation", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 203, message = "Sentence analysis", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Illegal input format", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Meaningless input", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = String.class) })
    public Response input(@ApiParam(value = "User input" ,required=true) Sentence sentence
,@ApiParam(value = "Upload context (KG id)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.input(sentence,kg);
    }
    @POST
    @Path("/issue")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sends a frame instance for processing", notes = "Sends a frame, e.g. a user query form, to the systems", response = String.class, responseContainer = "List", tags={ "InteractionService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success acknowledge", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Query response", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "Update response", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed frame", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = String.class, responseContainer = "List") })
    public Response issue(@ApiParam(value = "Frame instance" ,required=true) Frame frame
,@ApiParam(value = "Upload context (KG id)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.issue(frame,kg);
    }
}
