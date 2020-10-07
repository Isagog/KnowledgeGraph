package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.SearchApiService;
import com.isagog.kg.api.factories.SearchApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.KnowledgeElement;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/search")


@io.swagger.annotations.Api(description = "the search API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class SearchApi  {
   private final SearchApiService delegate = SearchApiServiceFactory.getSearchApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge search", notes = "Search knowledge items", response = KnowledgeElement.class, responseContainer = "List", tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No results", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid key", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeElement.class, responseContainer = "List") })
    public Response search(@ApiParam(value = "The query to search by",required=true) @QueryParam("query") String query
,@ApiParam(value = "Search context (opt)") @QueryParam("kg") String kg
,@ApiParam(value = "The attribute to search by (opt)") @QueryParam("attribute") String attribute
)
    throws NotFoundException {
        return delegate.search(query,kg,attribute);
    }
}
