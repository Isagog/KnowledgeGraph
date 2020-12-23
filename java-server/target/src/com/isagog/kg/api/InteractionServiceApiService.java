package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.Frame;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.SentenceAnnotation;
import com.isagog.kg.model.UpdateResponse;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public abstract class InteractionServiceApiService {
    public abstract Response complete(String hook
 ) throws NotFoundException;
    public abstract Response input(Sentence sentence
 ,String kg
 ) throws NotFoundException;
    public abstract Response issue(Frame frame
 ,String kg
 ) throws NotFoundException;
}
