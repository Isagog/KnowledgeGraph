package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.ListApiService;
import com.isagog.kg.api.factories.ListApiServiceFactory;

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

@Path("/list")


@io.swagger.annotations.Api(description = "the list API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class ListApi  {
   private final ListApiService delegate = ListApiServiceFactory.getListApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists Knowledge Graphs", notes = "Returns the list of available KGs (id)", response = String.class, responseContainer = "List", tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success, KG id list", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success, KG summary (id,description,size) list", response = String.class, responseContainer = "List") })
    public Response listGraphs(@ApiParam(value = "", defaultValue="false") @DefaultValue("false") @QueryParam("summary") Boolean summary
)
    throws NotFoundException {
        return delegate.listGraphs(summary);
    }
}
