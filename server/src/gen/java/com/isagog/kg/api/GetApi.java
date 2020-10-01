package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.GetApiService;
import com.isagog.kg.api.factories.GetApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
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

@Path("/get")


@io.swagger.annotations.Api(description = "the get API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class GetApi  {
   private final GetApiService delegate = GetApiServiceFactory.getGetApi();

    @GET
    
    
    @Produces({ "application/json", "application/zip" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a Knowledge Graph", notes = "Returns a Knowledge Graph, either with summary or full content", response = KnowledgeGraph.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success, json content", response = KnowledgeGraph.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success, zipped content", response = KnowledgeGraph.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown Graph", response = KnowledgeGraph.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Graph too large", response = KnowledgeGraph.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeGraph.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeGraph.class) })
    public Response getGraph(@ApiParam(value = "The Knowledge Graph identifier",required=true) @QueryParam("kg") String kg
,@ApiParam(value = "Triggers full content: default = false", defaultValue="false") @DefaultValue("false") @QueryParam("content") Boolean content
)
    throws NotFoundException {
        return delegate.getGraph(kg,content);
    }
}
