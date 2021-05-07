package com.isagog.kg.service;

import com.isagog.kg.service.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public abstract class KnowledgeServiceApiService {
    public abstract Response disjoint(URI first
 ,URI second
 ) throws NotFoundException;
    public abstract Response getAllAttributes(String ns
 ) throws NotFoundException;
    public abstract Response getAllConcepts(String ns
 ) throws NotFoundException;
    public abstract Response getAllFrames(String ns
 ) throws NotFoundException;
    public abstract Response getAllOntologies() throws NotFoundException;
    public abstract Response getAllRelations(String ns
 ) throws NotFoundException;
    public abstract Response getAttribute(URI uri
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response getConcept(URI uri
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response getFrame(URI uri
 ) throws NotFoundException;
    public abstract Response getRelation(URI uri
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response includes(URI sup
 ,URI sub
 ) throws NotFoundException;
    public abstract Response search(String query
 ,String attribute
 ,KnowledgeType ktype
 ,ConceptualDetails details
 ,String ns
 ) throws NotFoundException;
}
