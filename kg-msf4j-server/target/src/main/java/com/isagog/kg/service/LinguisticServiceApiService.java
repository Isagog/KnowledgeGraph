package com.isagog.kg.service;

import com.isagog.kg.service.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.AnnotatedDocument;
import com.isagog.kg.model.AnnotatedSentence;
import com.isagog.kg.model.Document;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.Task;

import java.util.List;
import com.isagog.kg.service.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public abstract class LinguisticServiceApiService {
    public abstract Response documentAnalysis(List<Task> tasks
 ,Document document
 ) throws NotFoundException;
    public abstract Response sentenceAnalysis(List<Task> tasks
 ,Sentence sentence
 ) throws NotFoundException;
}
