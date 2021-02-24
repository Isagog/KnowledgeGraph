package com.isagog.kg.api;

import com.isagog.kg.model.*;
import com.isagog.kg.api.KnowledgeServiceApiService;
import com.isagog.kg.api.factories.KnowledgeServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualDetails;
import com.isagog.kg.model.ElementRanking;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeGraph;
import com.isagog.kg.model.KnowledgeType;
import com.isagog.kg.model.Relation;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.562+01:00[Europe/Berlin]")
public class KnowledgeServiceApi  {
   private final KnowledgeServiceApiService delegate = KnowledgeServiceApiServiceFactory.getKnowledgeServiceApi();

    @GET
    @Path("/axioms/disjontness")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Tells about disjointess", notes = "", response = Boolean.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid argument pair", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unknown first", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Unwnown second", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Boolean.class) })
    public Response disjoint(@ApiParam(value = "Candidate classifier",required=true) @QueryParam("first") String first
,@ApiParam(value = "Candidate classifier",required=true) @QueryParam("second") String second
,@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.disjoint(first,second,kg);
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
    public Response getAllAttributes(@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.getAllAttributes(kg);
    }
    @GET
    @Path("/concepts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all the concepts in the Knowledge Graph", notes = "Get all the atomic concepts in the Knowledge Graph", response = Concept.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Concept.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Concept.class, responseContainer = "List") })
    public Response getAllConcepts(@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.getAllConcepts(kg);
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
    public Response getAllFrames(@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.getAllFrames(kg);
    }
    @GET
    @Path("/graphs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get KGs", notes = "Get all the known KGs", response = KnowledgeGraph.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeGraph.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = KnowledgeGraph.class, responseContainer = "List") })
    public Response getAllGraphs()
    throws NotFoundException {
        return delegate.getAllGraphs();
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
    public Response getAllRelations(@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.getAllRelations(kg);
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
,@ApiParam(value = "The KG id (opt)",required=true) @QueryParam("kg") String kg
,@ApiParam(value = "Details to be fetched (opt), defaults to any",required=true, allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE", defaultValue="NONE") @PathParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getAttribute(id,kg,details);
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
,@ApiParam(value = "The KG id",required=true) @QueryParam("kg") String kg
,@ApiParam(value = "Details to be fetched (opt), defaults to any",required=true, allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE", defaultValue="NONE") @PathParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getConcept(id,kg,details);
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
,@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.getFrame(id,kg);
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
,@ApiParam(value = "The KG id (opt)",required=true) @QueryParam("kg") String kg
,@ApiParam(value = "Details to be fetched (opt), defaults to any",required=true, allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE", defaultValue="NONE") @PathParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getRelation(id,kg,details);
    }
    @GET
    @Path("/axioms/inclusion")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Tells about inclusion dependencies", notes = "", response = Boolean.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid argument pair", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unknown superclass", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Unwnown subclass", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Boolean.class) })
    public Response includes(@ApiParam(value = "Candidate super classifier",required=true) @QueryParam("sup") String sup
,@ApiParam(value = "Candidate sub classifier",required=true) @QueryParam("sub") String sub
,@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.includes(sup,sub,kg);
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
    public Response search(@ApiParam(value = "The value to search by",required=true) @QueryParam("query") String query
,@ApiParam(value = "Attribute to search by, either an annotation or a data property", defaultValue="rdfs:label") @DefaultValue("rdfs:label") @QueryParam("attribute") String attribute
,@ApiParam(value = "Narrow search to a specific knowledge type", allowableValues="CONCEPT, RELATION, ATTRIBUTE, ENTITY, FRAME, GRAPH, STATEMENT, CONCEPTUALSLOT, RELATIONALSLOT, ATTRIBUTIVESLOT") @QueryParam("ktype") KnowledgeType ktype
,@ApiParam(value = "Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only", allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE", defaultValue="NONE") @DefaultValue("NONE") @QueryParam("details") ConceptualDetails details
,@ApiParam(value = "The KG id (opt)") @QueryParam("kg") String kg
)
    throws NotFoundException {
        return delegate.search(query,attribute,ktype,details,kg);
    }
}
