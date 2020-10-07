package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.DeleteApiService;
import com.isagog.kg.api.factories.DeleteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/delete")


@io.swagger.annotations.Api(description = "the delete API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class DeleteApi  {
   private final DeleteApiService delegate = DeleteApiServiceFactory.getDeleteApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a Knowledge Graph", notes = "Knowledge graph deletion", response = Void.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success, json content", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown Graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Dependencies violation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class) })
    public Response deleteGraph(@ApiParam(value = "The Knowledge Graph identifier",required=true) @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.deleteGraph(kg);
    }
}
