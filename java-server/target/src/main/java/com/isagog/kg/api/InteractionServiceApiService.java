package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.CompletionResponse;
import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.IssueResponse;
import java.util.List;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-01T16:07:23.995+01:00[Europe/Berlin]")
public abstract class InteractionServiceApiService {
    public abstract Response complete(String hook
 ,String itype
 ) throws NotFoundException;
    public abstract Response completeInContext(String hook
 ,List<InteractRecord> interactRecord
 ) throws NotFoundException;
    public abstract Response issue(List<InteractRecord> interactRecord
 ,String kg
 ) throws NotFoundException;
}
