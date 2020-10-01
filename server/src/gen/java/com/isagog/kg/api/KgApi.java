package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.KgApiService;
import com.isagog.kg.api.factories.KgApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Statement;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/{kg}")


@io.swagger.annotations.Api(description = "the {kg} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class KgApi  {
   private final KgApiService delegate = KgApiServiceFactory.getKgApi();

    @POST
    @Path("/assert")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Statement assertion", notes = "Asserts a statement in a Knowledge Graph", response = Void.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed statement", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported statement", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class) })
    public Response assertStatement(@ApiParam(value = "Assertion context (KG id)",required=true) @PathParam("kg") String kg
,@ApiParam(value = "Assertion statement" ,required=true) Statement statement
)
    throws NotFoundException {
        return delegate.assertStatement(kg,statement);
    }
    @GET
    @Path("/get")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an element in a Knowledge Graph", notes = "Get the named element, if present", response = KnowledgeElement.class, responseContainer = "List", tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Unknown Entity", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeElement.class, responseContainer = "List") })
    public Response getKnowledgeElement(@ApiParam(value = "",required=true) @PathParam("kg") String kg
,@ApiParam(value = "",required=true) @QueryParam("id") String id
)
    throws NotFoundException {
        return delegate.getKnowledgeElement(kg,id);
    }
    @POST
    @Path("/retract")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Statement retraction", notes = "Retracts a statement and all the statements depending on it", response = Void.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed statement", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported statement", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class) })
    public Response retractStatement(@ApiParam(value = "",required=true) @PathParam("kg") String kg
,@ApiParam(value = "Retraction statement" ,required=true) Statement statement
)
    throws NotFoundException {
        return delegate.retractStatement(kg,statement);
    }
    @POST
    @Path("/upload")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "Bulk upload", notes = "Uploads an RDF resource", response = Void.class, tags={ "KnowledgeGraphService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed document", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported format", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class) })
    public Response uploadResource(@ApiParam(value = "",required=true) @PathParam("kg") String kg
,
            @FormDataParam("content") InputStream contentInputStream,
            @FormDataParam("content") FileInfo contentDetail
,@ApiParam(value = "Serialization format", allowableValues="turtle, rdf-xml, rdf-json, json-ld")@FormDataParam("format")  String format
)
    throws NotFoundException {
        return delegate.uploadResource(kg,contentInputStream, contentDetail,format);
    }
}
