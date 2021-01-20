package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-20T12:31:14.314+01:00[Europe/Berlin]")
public abstract class KnowledgeServiceApiService {
    public abstract Response evaluateEntity(Entity entity
 ,String method
 ) throws NotFoundException;
    public abstract Response extractFrames(Integer limit
 ,SentenceAnnotation sentenceAnnotation
 ) throws NotFoundException;
    public abstract Response getAllAttributes() throws NotFoundException;
    public abstract Response getAllConcepts() throws NotFoundException;
    public abstract Response getAllFrames() throws NotFoundException;
    public abstract Response getAllRelations() throws NotFoundException;
    public abstract Response getAttribute(String id
 ) throws NotFoundException;
    public abstract Response getConcept(String id
 ) throws NotFoundException;
    public abstract Response getFrame(String id
 ) throws NotFoundException;
    public abstract Response getRelation(String id
 ) throws NotFoundException;
    public abstract Response search(String query
 ,String etype
 ,String details
 ,String attribute
 ) throws NotFoundException;
}
