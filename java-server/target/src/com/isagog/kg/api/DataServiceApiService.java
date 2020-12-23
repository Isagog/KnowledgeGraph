package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.QueryExpression;
import com.isagog.kg.model.QueryFrame;
import com.isagog.kg.model.QueryKeywords;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Upload;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:51.221+01:00[Europe/Berlin]")
public abstract class DataServiceApiService {
    public abstract Response createEntity(Entity entity
 ) throws NotFoundException;
    public abstract Response createStatement(EntityStatement entityStatement
 ) throws NotFoundException;
    public abstract Response deleteEntity(String id
 ) throws NotFoundException;
    public abstract Response deleteStatement(EntityStatement entityStatement
 ) throws NotFoundException;
    public abstract Response getEntity(String id
 ,String details
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
