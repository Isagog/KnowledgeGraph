package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.EvaluateApiService;
import com.isagog.kg.api.factories.EvaluateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Classification;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/evaluate")


@io.swagger.annotations.Api(description = "the evaluate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class EvaluateApi  {
   private final EvaluateApiService delegate = EvaluateApiServiceFactory.getEvaluateApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Entity evaluation", notes = "Evaluates the Entity as an instance of the specified concept", response = Classification.class, responseContainer = "List", tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Classification.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not found", response = Classification.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Unknown graph", response = Classification.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid arguments", response = Classification.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Classification.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Classification.class, responseContainer = "List") })
    public Response evaluateEntity(@ApiParam(value = "Entity identifier",required=true) @QueryParam("id") String id
,@ApiParam(value = "Concept to be evaluated",required=true) @QueryParam("concept") String concept
,@ApiParam(value = "Evaluation context (opt)") @QueryParam("kg") String kg
,@ApiParam(value = "Inference method to be used", allowableValues="DEDUCTION, ABDUCTION", defaultValue="DEDUCTION") @DefaultValue("DEDUCTION") @QueryParam("method") String method
)
    throws NotFoundException {
        return delegate.evaluateEntity(id,concept,kg,method);
    }
}
