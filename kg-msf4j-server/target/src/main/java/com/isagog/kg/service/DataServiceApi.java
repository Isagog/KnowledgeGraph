package com.isagog.kg.service;

import com.isagog.kg.model.*;
import com.isagog.kg.service.DataServiceApiService;
import com.isagog.kg.service.factories.DataServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityDetails;
import com.isagog.kg.model.KnowledgeGraph;
import com.isagog.kg.model.QueryExpression;
import com.isagog.kg.model.QueryFrame;
import com.isagog.kg.model.QueryKeywords;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Statement;
import java.net.URI;
import com.isagog.kg.model.Upload;

import java.util.List;
import com.isagog.kg.service.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the DataService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.273+02:00[Europe/Berlin]")
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
    
    @io.swagger.annotations.ApiOperation(value = "Statement creation", notes = "Creates a new statement", response = Void.class, tags={ "DataService", })
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
    public Response deleteEntity(@ApiParam(value = "",required=true) @QueryParam("id") URI id
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
    @io.swagger.annotations.ApiOperation(value = "Get statements", notes = "Retrieve statements related to a predicate, object, or subject combination", response = Statement.class, responseContainer = "List", tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Statement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Statement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Unsupported element", response = Statement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Statement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Statement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Statement.class, responseContainer = "List") })
    public Response getAllStatements(@ApiParam(value = "") @QueryParam("subject") URI subject
,@ApiParam(value = "") @QueryParam("predicate") URI predicate
,@ApiParam(value = "") @QueryParam("value") String value
)
    throws NotFoundException {
        return delegate.getAllStatements(subject,predicate,value);
    }
    @GET
    @Path("/entities")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Entity access", notes = "Returns knowledge about an entity", response = Entity.class, tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Entity.class) })
    public Response getEntity(@ApiParam(value = "Entity identifier",required=true) @QueryParam("id") URI id
,@ApiParam(value = "Details to fetch", allowableValues="FULL, DATA, LABELS") @QueryParam("details") EntityDetails details
)
    throws NotFoundException {
        return delegate.getEntity(id,details);
    }
    @GET
    @Path("/graphs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Managed KGs", notes = "Lista all known Knowledge Graphs", response = KnowledgeGraph.class, responseContainer = "List", tags={ "DataService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Element not found", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Not authorized", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid element", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Protected element", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = KnowledgeGraph.class, responseContainer = "List") })
    public Response getGraphs(@ApiParam(value = "Last update (Seconds since Unix Epoch)") @QueryParam("update") Integer update
)
    throws NotFoundException {
        return delegate.getGraphs(update);
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
