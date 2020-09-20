package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.QueryApiService;
import com.isagog.kg.api.factories.QueryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Query;
import com.isagog.kg.model.QueryResponse;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/query")


@io.swagger.annotations.Api(description = "the query API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class QueryApi  {
   private final QueryApiService delegate = QueryApiServiceFactory.getQueryApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge query", notes = "Queries a Knowledge Graph", response = QueryResponse.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = QueryResponse.class) })
    public Response query(@ApiParam(value = "The query Frame" ,required=true) Query query
,@ApiParam(value = "Query context (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.query(query,kg);
    }
}
