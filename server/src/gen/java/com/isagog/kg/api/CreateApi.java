package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.CreateApiService;
import com.isagog.kg.api.factories.CreateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.KnowledgeGraph;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/create")


@io.swagger.annotations.Api(description = "the create API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class CreateApi  {
   private final CreateApiService delegate = CreateApiServiceFactory.getCreateApi();

    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Knowledge graph creation", notes = "Creates a Knowledge graph", response = Void.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Duplicated ID", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid Graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class) })
    public Response createGraph(@ApiParam(value = "The graph to be created" ,required=true) KnowledgeGraph knowledgeGraph
)
    throws NotFoundException {
        return delegate.createGraph(knowledgeGraph);
    }
}
