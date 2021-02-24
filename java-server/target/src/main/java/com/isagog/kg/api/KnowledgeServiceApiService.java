package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.562+01:00[Europe/Berlin]")
public abstract class KnowledgeServiceApiService {
    public abstract Response disjoint(String first
 ,String second
 ,String kg
 ) throws NotFoundException;
    public abstract Response getAllAttributes(String kg
 ) throws NotFoundException;
    public abstract Response getAllConcepts(String kg
 ) throws NotFoundException;
    public abstract Response getAllFrames(String kg
 ) throws NotFoundException;
    public abstract Response getAllGraphs() throws NotFoundException;
    public abstract Response getAllRelations(String kg
 ) throws NotFoundException;
    public abstract Response getAttribute(String id
 ,String kg
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response getConcept(String id
 ,String kg
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response getFrame(String id
 ,String kg
 ) throws NotFoundException;
    public abstract Response getRelation(String id
 ,String kg
 ,ConceptualDetails details
 ) throws NotFoundException;
    public abstract Response includes(String sup
 ,String sub
 ,String kg
 ) throws NotFoundException;
    public abstract Response search(String query
 ,String attribute
 ,KnowledgeType ktype
 ,ConceptualDetails details
 ,String kg
 ) throws NotFoundException;
}
