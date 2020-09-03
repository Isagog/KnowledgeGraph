package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.KnowledgeGraph;
import com.isagog.kg.model.Statement;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public abstract class KgApiService {
    public abstract Response assertStatement(String kg
 ,Statement statement
 ) throws NotFoundException;
    public abstract Response deleteGraph(String kg
 ) throws NotFoundException;
    public abstract Response getGraph(String kg
 ,Boolean content
 ) throws NotFoundException;
    public abstract Response getKnowledgeElement(String kg
 ,String id
 ) throws NotFoundException;
    public abstract Response retractStatement(String kg
 ,Statement statement
 ) throws NotFoundException;
}
