package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.Document;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.SentenceAnnotation;
import com.isagog.kg.model.Task;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-18T21:02:10.323+01:00[Europe/Berlin]")
public abstract class LinguisticServiceApiService {
    public abstract Response analyze(List<Task> tasks
 ,Sentence sentence
 ) throws NotFoundException;
    public abstract Response extract(String mode
 ,Integer limit
 ,Document document
 ) throws NotFoundException;
}
