package com.isagog.kg.service;

import com.isagog.kg.model.*;
import com.isagog.kg.service.KnowledgeServiceApiService;
import com.isagog.kg.service.factories.KnowledgeServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualDetails;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.KnowledgeType;
import com.isagog.kg.model.Ontology;
import com.isagog.kg.model.Relation;
import java.net.URI;

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


@io.swagger.annotations.Api(description = "the KnowledgeService API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class KnowledgeServiceApi  {
   private final KnowledgeServiceApiService delegate = KnowledgeServiceApiServiceFactory.getKnowledgeServiceApi();

    @GET
    @Path("/axioms/disjontness")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "True if the first classifier is disjoint from the second", notes = "", response = Boolean.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid argument pair", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unknown first", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Unwnown second", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Boolean.class) })
    public Response disjoint(@ApiParam(value = "Candidate classifier",required=true) @QueryParam("first") URI first
,@ApiParam(value = "Candidate classifier",required=true) @QueryParam("second") URI second
)
    throws NotFoundException {
        return delegate.disjoint(first,second);
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
    public Response getAllAttributes(@ApiParam(value = "Attribute's namespace (opt)") @QueryParam("ns") String ns
)
    throws NotFoundException {
        return delegate.getAllAttributes(ns);
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
    public Response getAllConcepts(@ApiParam(value = "Concept's namespace (opt)") @QueryParam("ns") String ns
)
    throws NotFoundException {
        return delegate.getAllConcepts(ns);
    }
    @GET
    @Path("/frames")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets all the frames", notes = "Gets a frame", response = Frame.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Frame.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Frame.class, responseContainer = "List") })
    public Response getAllFrames(@ApiParam(value = "The frame's namespace (opt)") @QueryParam("ns") String ns
)
    throws NotFoundException {
        return delegate.getAllFrames(ns);
    }
    @GET
    @Path("/ontologies")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get ontologies", notes = "Get all the known ontologies", response = Ontology.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Ontology.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Ontology.class, responseContainer = "List") })
    public Response getAllOntologies()
    throws NotFoundException {
        return delegate.getAllOntologies();
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
    public Response getAllRelations(@ApiParam(value = "Relation's namespace (opt)") @QueryParam("ns") String ns
)
    throws NotFoundException {
        return delegate.getAllRelations(ns);
    }
    @GET
    @Path("/attributes/{uri}")
    
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
    public Response getAttribute(@ApiParam(value = "The attribute's uri",required=true) @PathParam("uri") URI uri
,@ApiParam(value = "Details to be fetched (opt), defaults to any", allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, DOMAINRESTRICTION, RANGERESTRICTION, ALL, NONE", defaultValue="NONE") @DefaultValue("NONE") @QueryParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getAttribute(uri,details);
    }
    @GET
    @Path("/concepts/{uri}")
    
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
    public Response getConcept(@ApiParam(value = "The concept's uri",required=true) @PathParam("uri") URI uri
,@ApiParam(value = "Details to be fetched (opt), defaults to any", allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, DOMAINRESTRICTION, RANGERESTRICTION, ALL, NONE", defaultValue="NONE") @DefaultValue("NONE") @QueryParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getConcept(uri,details);
    }
    @GET
    @Path("/frames/{uri}")
    
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
    public Response getFrame(@ApiParam(value = "The frame's id",required=true) @PathParam("uri") URI uri
)
    throws NotFoundException {
        return delegate.getFrame(uri);
    }
    @GET
    @Path("/relations/{uri}")
    
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
    public Response getRelation(@ApiParam(value = "The relation's uri",required=true) @PathParam("uri") URI uri
,@ApiParam(value = "Details to be fetched (opt), defaults to any", allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, DOMAINRESTRICTION, RANGERESTRICTION, ALL, NONE", defaultValue="NONE") @DefaultValue("NONE") @QueryParam("details") ConceptualDetails details
)
    throws NotFoundException {
        return delegate.getRelation(uri,details);
    }
    @GET
    @Path("/axioms/inclusion")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "True if the first classifier is broader than the second", notes = "", response = Boolean.class, tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid argument pair", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Unknown superclass", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Unwnown subclass", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = Boolean.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = Boolean.class) })
    public Response includes(@ApiParam(value = "Candidate super classifier",required=true) @QueryParam("sup") URI sup
,@ApiParam(value = "Candidate sub classifier",required=true) @QueryParam("sub") URI sub
)
    throws NotFoundException {
        return delegate.includes(sup,sub);
    }
    @GET
    @Path("/knowledge/search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Knowledge search", notes = "Search knowledge items", response = KnowledgeElement.class, responseContainer = "List", tags={ "KnowledgeService", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No results", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 402, message = "Invalid query", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Invalid attribute", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Service unavailable", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 502, message = "Server error", response = KnowledgeElement.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "Missing implementation", response = KnowledgeElement.class, responseContainer = "List") })
    public Response search(@ApiParam(value = "The value to search by",required=true) @QueryParam("query") String query
,@ApiParam(value = "Attribute to search by, either an annotation or a data property", defaultValue="rdfs:label") @DefaultValue("rdfs:label") @QueryParam("attribute") String attribute
,@ApiParam(value = "Narrow search to a specific knowledge type", allowableValues="CONCEPT, RELATION, ATTRIBUTE, ENTITY, FRAME, STATEMENT, CONCEPTUALSLOT, RELATIONALSLOT, ATTRIBUTIVESLOT") @QueryParam("ktype") KnowledgeType ktype
,@ApiParam(value = "Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only", allowableValues="SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, DOMAINRESTRICTION, RANGERESTRICTION, ALL, NONE", defaultValue="NONE") @DefaultValue("NONE") @QueryParam("details") ConceptualDetails details
,@ApiParam(value = "The namespace to search by (opt)") @QueryParam("ns") String ns
)
    throws NotFoundException {
        return delegate.search(query,attribute,ktype,details,ns);
    }
}
