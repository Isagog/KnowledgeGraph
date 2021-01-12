package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.KnowledgeServiceApiService;
import com.isagog.kg.api.factories.KnowledgeServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ElementRanking;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.SentenceAnnotation;

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


@io.swagger.annotations.Api(description = "the KnowledgeService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-11T17:00:59.973+01:00[Europe/Berlin]")
public class KnowledgeServiceApi  {
   private final KnowledgeServiceApiService delegate = KnowledgeServiceApiServiceFactory.getKnowledgeServiceApi();

    @POST
    @Path("/evaluate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Entity evaluation", notes = "Evaluates an entity as an instance of known concepts. Deductive evaluation should return asserted and implied entity classes. Abductive evaluation should return a ranking of the most plausible entity classes.", response = ElementRanking.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not found", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Unknown graph", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid arguments", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Unsupported method", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = ElementRanking.class, responseContainer = "List") })
    public Response evaluateEntity(@ApiParam(value = "Entity specification" ,required=true) Entity entity
,@ApiParam(value = "Inference method to be used", allowableValues="DEDUCTION, ABDUCTION", defaultValue="DEDUCTION") @DefaultValue("DEDUCTION") @QueryParam("method") String method
)
    throws NotFoundException {
        return delegate.evaluateEntity(entity,method);
    }
    @POST
    @Path("/frames/extract")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Frame extraction from sentences", notes = "Extract frames from an annotated sentence", response = Frame.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Frame span", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Insufficient data mapping", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Frame.class, responseContainer = "List") })
    public Response extractFrames(@ApiParam(value = "Limits the number of returned frame candidates to the supplied value") @QueryParam("limit") Integer limit
,@ApiParam(value = "" ) SentenceAnnotation sentenceAnnotation
)
    throws NotFoundException {
        return delegate.extractFrames(limit,sentenceAnnotation);
    }
    @GET
    @Path("/attributes")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets all attributes in the Knowledge Graph ontology", notes = "Gets an attirbute", response = Attribute.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Attribute.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Attribute.class, responseContainer = "List") })
    public Response getAllAttributes()
    throws NotFoundException {
        return delegate.getAllAttributes();
    }
    @GET
    @Path("/concepts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all the atomic concepts in the Knowledge Graph", notes = "Get all the atomic concepts in the Knowledge Graph", response = Concept.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Concept.class, responseContainer = "List") })
    public Response getAllConcepts()
    throws NotFoundException {
        return delegate.getAllConcepts();
    }
    @GET
    @Path("/frames")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets all the frames in the Knowledge Graph ontology", notes = "Gets a frame", response = Frame.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Frame.class, responseContainer = "List") })
    public Response getAllFrames()
    throws NotFoundException {
        return delegate.getAllFrames();
    }
    @GET
    @Path("/relations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets all the relations in the Knowledge Graph ontology", notes = "Gets a relation", response = Relation.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Relation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Relation.class, responseContainer = "List") })
    public Response getAllRelations()
    throws NotFoundException {
        return delegate.getAllRelations();
    }
    @GET
    @Path("/attributes/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets an attribute", notes = "Gets an attirbute", response = Attribute.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Attribute.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Attribute.class) })
    public Response getAttribute(@ApiParam(value = "The attribute's id",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.getAttribute(id);
    }
    @GET
    @Path("/concepts/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets a concept", notes = "Gets a concept", response = Concept.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Concept.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Concept.class) })
    public Response getConcept(@ApiParam(value = "The concept's id",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.getConcept(id);
    }
    @GET
    @Path("/frames/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets a frame", notes = "Gets a frame", response = Frame.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Frame.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Frame.class) })
    public Response getFrame(@ApiParam(value = "The frame's id",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.getFrame(id);
    }
    @GET
    @Path("/relations/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets a relation", notes = "Gets a relation", response = Relation.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Relation.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Relation.class) })
    public Response getRelation(@ApiParam(value = "The relation's id",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.getRelation(id);
    }
    @GET
    @Path("/search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge search", notes = "Search knowledge items", response = ElementRanking.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = ElementRanking.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = ElementRanking.class, responseContainer = "List") })
    public Response search(@ApiParam(value = "The query to search by",required=true) @QueryParam("query") String query
,@ApiParam(value = "Narrow search to a specific element type", allowableValues="CONCEPT, PROPERTY, ATTRIBUTE, ENTITY, FRAME, ANY", defaultValue="ANY") @DefaultValue("ANY") @QueryParam("etype") String etype
,@ApiParam(value = "Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only", allowableValues="FULL, SUMMARY, IDENTIFIER", defaultValue="IDENTIFIER") @DefaultValue("IDENTIFIER") @QueryParam("details") String details
,@ApiParam(value = "Attribute to search by, either an annotation or a data property", defaultValue="rdfs:label") @DefaultValue("rdfs:label") @QueryParam("attribute") String attribute
)
    throws NotFoundException {
        return delegate.search(query,etype,details,attribute);
    }
}
