package com.isagog.kg.service;

import com.isagog.kg.service.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.273+02:00[Europe/Berlin]")
public abstract class DataServiceApiService {
    public abstract Response createEntity(Entity entity
 ) throws NotFoundException;
    public abstract Response createStatement(Statement statement
 ) throws NotFoundException;
    public abstract Response deleteEntity(URI id
 ) throws NotFoundException;
    public abstract Response deleteStatement(Statement statement
 ) throws NotFoundException;
    public abstract Response getAllStatements(URI subject
 ,URI predicate
 ,String value
 ) throws NotFoundException;
    public abstract Response getEntity(URI id
 ,EntityDetails details
 ) throws NotFoundException;
    public abstract Response getGraphs(Integer update
 ) throws NotFoundException;
    public abstract Response queryExpression(QueryExpression queryExpression
 ,String kg
 ) throws NotFoundException;
    public abstract Response queryFrame(QueryFrame queryFrame
 ,String kg
 ) throws NotFoundException;
    public abstract Response queryKeywords(QueryKeywords queryKeywords
 ,String kg
 ) throws NotFoundException;
    public abstract Response upload(String kg
 ,Upload upload
 ) throws NotFoundException;
}
