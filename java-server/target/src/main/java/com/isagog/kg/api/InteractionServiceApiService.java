package com.isagog.kg.api;

import com.isagog.kg.api.*;
import com.isagog.kg.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import com.isagog.kg.model.CompletionResponse;
import com.isagog.kg.model.InteractRecord;
import java.util.List;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.UpdateResponse;

import java.util.List;
import com.isagog.kg.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-11T17:01:00.235+01:00[Europe/Berlin]")
public abstract class InteractionServiceApiService {
    public abstract Response complete(String hook
 ,String itype
 ) throws NotFoundException;
    public abstract Response issue(List<InteractRecord> interactRecord
 ,String kg
 ) throws NotFoundException;
}
