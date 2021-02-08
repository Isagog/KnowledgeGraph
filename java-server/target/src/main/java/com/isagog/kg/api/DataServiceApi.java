package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.DataServiceApiService;
import com.isagog.kg.api.factories.DataServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityResponse;
import com.isagog.kg.model.QueryExpression;
import com.isagog.kg.model.QueryFrame;
import com.isagog.kg.model.QueryKeywords;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Statement;
import com.isagog.kg.model.StatementResponse;
import com.isagog.kg.model.Upload;

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


@io.swagger.annotations.Api(description = "the DataService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-08T18:41:02.607+01:00[Europe/Berlin]")
public class DataServiceApi  {
   private final DataServiceApiService delegate = DataServiceApiServiceFactory.getDataServiceApi();

    @POST
    @Path("/entities")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Entity creation", notes = "Creates a new entity uri and related statements", response = Void.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Unsupported element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Void.class) })
    public Response createEntity(@ApiParam(value = "Entity record" ,required=true) Entity entity
)
    throws NotFoundException {
        return delegate.createEntity(entity);
    }
    @POST
    @Path("/statements")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Entity statement creation", notes = "Creates a new entity statement", response = Void.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Unsupported element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Void.class) })
    public Response createStatement(@ApiParam(value = "Statement specification" ,required=true) Statement statement
)
    throws NotFoundException {
        return delegate.createStatement(statement);
    }
    @DELETE
    @Path("/entities")
    
    
    @io.swagger.annotations.ApiOperation(value = "Entity deletion", notes = "Deletes an entity and related statements", response = Void.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Void.class) })
    public Response deleteEntity(@ApiParam(value = "",required=true) @QueryParam("id") String id
)
    throws NotFoundException {
        return delegate.deleteEntity(id);
    }
    @DELETE
    @Path("/statements")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Statement deletion", notes = "Deletes a Statement", response = Void.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Void.class) })
    public Response deleteStatement(@ApiParam(value = "Statement specification" ,required=true) Statement statement
)
    throws NotFoundException {
        return delegate.deleteStatement(statement);
    }
    @GET
    @Path("/statements")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get statements", notes = "Retrieve statements related to a predicate, object, or subject combination", response = StatementResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = StatementResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = StatementResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Unsupported element", response = StatementResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = StatementResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = StatementResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = StatementResponse.class) })
    public Response getAllStatements(@ApiParam(value = "") @QueryParam("subject") String subject
,@ApiParam(value = "") @QueryParam("predicate") String predicate
,@ApiParam(value = "") @QueryParam("value") String value
)
    throws NotFoundException {
        return delegate.getAllStatements(subject,predicate,value);
    }
    @GET
    @Path("/entities/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Entity access", notes = "Returns an Entity", response = EntityResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = EntityResponse.class) })
    public Response getEntity(@ApiParam(value = "Entity identifier",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.getEntity(id);
    }
    @GET
    @Path("/entities")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Entity access", notes = "Returns an Entity", response = EntityResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = EntityResponse.class) })
    public Response getEntityDetails(@ApiParam(value = "Entity identifier",required=true) @QueryParam("id") String id
,@ApiParam(value = "Details to fetch", allowableValues="FULL, DATA, LABELS", defaultValue="LABELS") @DefaultValue("LABELS") @QueryParam("details") String details
)
    throws NotFoundException {
        return delegate.getEntityDetails(id,details);
    }
    @POST
    @Path("/query/expression")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Issue a graph query", notes = "Queries the Knowledge Graph by a query expression, whose syntax is specified", response = QueryResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unsupported language", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = QueryResponse.class) })
    public Response queryExpression(@ApiParam(value = "The query" ,required=true) QueryExpression queryExpression
,@ApiParam(value = "Query context (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.queryExpression(queryExpression,kg);
    }
    @POST
    @Path("/query/frame")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge query", notes = "Queries a Knowledge Graph", response = QueryResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unsupported language", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = QueryResponse.class) })
    public Response queryFrame(@ApiParam(value = "The query" ,required=true) QueryFrame queryFrame
,@ApiParam(value = "Query context (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.queryFrame(queryFrame,kg);
    }
    @POST
    @Path("/query/keywords")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge query", notes = "Queries a Knowledge Graph", response = QueryResponse.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unsupported language", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = QueryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = QueryResponse.class) })
    public Response queryKeywords(@ApiParam(value = "The query" ,required=true) QueryKeywords queryKeywords
,@ApiParam(value = "Query context (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.queryKeywords(queryKeywords,kg);
    }
    @POST
    @Path("/upload")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Bulk upload", notes = "Uploads a resource", response = Void.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unknown graph", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Malformed document", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unsupported format", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Void.class) })
    public Response upload(@ApiParam(value = "",required=true) @QueryParam("kg") String kg
,@ApiParam(value = "" ) Upload upload
)
    throws NotFoundException {
        return delegate.upload(kg,upload);
    }
}
