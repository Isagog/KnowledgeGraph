package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.AnalysisTask;
import com.isagog.kg.model.Document;
import com.isagog.kg.model.ExtractionMode;
import com.isagog.kg.model.Sentence;
import com.isagog.kg.model.SentenceAnnotation;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.326+01:00[Europe/Berlin]")
public abstract class LinguisticServiceApiService {
    public abstract Response documentAnalysis(ExtractionMode mode
 ,List<AnalysisTask> tasks
 ,Document document
 ) throws NotFoundException;
    public abstract Response sentenceAnalysis(List<AnalysisTask> tasks
 ,Sentence sentence
 ) throws NotFoundException;
}
