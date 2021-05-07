/*
 * Isagog Knowledge Graph Interaction Service
 * Isagog Knowledge Graph Interaction module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.api;

import com.isagog.kg.ApiCallback;
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.ApiResponse;
import com.isagog.kg.Configuration;
import com.isagog.kg.Pair;
import com.isagog.kg.ProgressRequestBody;
import com.isagog.kg.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.isagog.kg.model.CompletionResponse;
import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.IssueResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InteractionServiceApi {
    private ApiClient localVarApiClient;

    public InteractionServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InteractionServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for complete
     * @param hook String to search by (required)
     * @param itype Conceptual type restriction (opt) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeCall(String hook, String itype, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/complete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hook != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hook", hook));
        }

        if (itype != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("itype", itype));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call completeValidateBeforeCall(String hook, String itype, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'hook' is set
        if (hook == null) {
            throw new ApiException("Missing the required parameter 'hook' when calling complete(Async)");
        }
        

        okhttp3.Call localVarCall = completeCall(hook, itype, _callback);
        return localVarCall;

    }

    /**
     * Suggets completions
     * Provides a list of candidate completions to the provided input (hook)
     * @param hook String to search by (required)
     * @param itype Conceptual type restriction (opt) (optional)
     * @return CompletionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public CompletionResponse complete(String hook, String itype) throws ApiException {
        ApiResponse<CompletionResponse> localVarResp = completeWithHttpInfo(hook, itype);
        return localVarResp.getData();
    }

    /**
     * Suggets completions
     * Provides a list of candidate completions to the provided input (hook)
     * @param hook String to search by (required)
     * @param itype Conceptual type restriction (opt) (optional)
     * @return ApiResponse&lt;CompletionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompletionResponse> completeWithHttpInfo(String hook, String itype) throws ApiException {
        okhttp3.Call localVarCall = completeValidateBeforeCall(hook, itype, null);
        Type localVarReturnType = new TypeToken<CompletionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Suggets completions (asynchronously)
     * Provides a list of candidate completions to the provided input (hook)
     * @param hook String to search by (required)
     * @param itype Conceptual type restriction (opt) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeAsync(String hook, String itype, final ApiCallback<CompletionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeValidateBeforeCall(hook, itype, _callback);
        Type localVarReturnType = new TypeToken<CompletionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for completeInContext
     * @param hook String to search by (required)
     * @param interactRecord  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeInContextCall(String hook, List<InteractRecord> interactRecord, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = interactRecord;

        // create path and map variables
        String localVarPath = "/complete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hook != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hook", hook));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call completeInContextValidateBeforeCall(String hook, List<InteractRecord> interactRecord, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'hook' is set
        if (hook == null) {
            throw new ApiException("Missing the required parameter 'hook' when calling completeInContext(Async)");
        }
        

        okhttp3.Call localVarCall = completeInContextCall(hook, interactRecord, _callback);
        return localVarCall;

    }

    /**
     * Suggets completions
     * Provides completion to the provided hook wrt a frame
     * @param hook String to search by (required)
     * @param interactRecord  (optional)
     * @return CompletionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public CompletionResponse completeInContext(String hook, List<InteractRecord> interactRecord) throws ApiException {
        ApiResponse<CompletionResponse> localVarResp = completeInContextWithHttpInfo(hook, interactRecord);
        return localVarResp.getData();
    }

    /**
     * Suggets completions
     * Provides completion to the provided hook wrt a frame
     * @param hook String to search by (required)
     * @param interactRecord  (optional)
     * @return ApiResponse&lt;CompletionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompletionResponse> completeInContextWithHttpInfo(String hook, List<InteractRecord> interactRecord) throws ApiException {
        okhttp3.Call localVarCall = completeInContextValidateBeforeCall(hook, interactRecord, null);
        Type localVarReturnType = new TypeToken<CompletionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Suggets completions (asynchronously)
     * Provides completion to the provided hook wrt a frame
     * @param hook String to search by (required)
     * @param interactRecord  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of suitable completions </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Illegal hook </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call completeInContextAsync(String hook, List<InteractRecord> interactRecord, final ApiCallback<CompletionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = completeInContextValidateBeforeCall(hook, interactRecord, _callback);
        Type localVarReturnType = new TypeToken<CompletionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for issue
     * @param interactRecord Interaction record array (required)
     * @param kg Issuing target (opt) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unknown graph </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Malformed frame </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueCall(List<InteractRecord> interactRecord, String kg, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = interactRecord;

        // create path and map variables
        String localVarPath = "/issue";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (kg != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("kg", kg));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issueValidateBeforeCall(List<InteractRecord> interactRecord, String kg, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'interactRecord' is set
        if (interactRecord == null) {
            throw new ApiException("Missing the required parameter 'interactRecord' when calling issue(Async)");
        }
        

        okhttp3.Call localVarCall = issueCall(interactRecord, kg, _callback);
        return localVarCall;

    }

    /**
     * Sends an interaction sequence for processing
     * Sends list of interaction records to be processed
     * @param interactRecord Interaction record array (required)
     * @param kg Issuing target (opt) (optional)
     * @return IssueResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unknown graph </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Malformed frame </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public IssueResponse issue(List<InteractRecord> interactRecord, String kg) throws ApiException {
        ApiResponse<IssueResponse> localVarResp = issueWithHttpInfo(interactRecord, kg);
        return localVarResp.getData();
    }

    /**
     * Sends an interaction sequence for processing
     * Sends list of interaction records to be processed
     * @param interactRecord Interaction record array (required)
     * @param kg Issuing target (opt) (optional)
     * @return ApiResponse&lt;IssueResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unknown graph </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Malformed frame </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IssueResponse> issueWithHttpInfo(List<InteractRecord> interactRecord, String kg) throws ApiException {
        okhttp3.Call localVarCall = issueValidateBeforeCall(interactRecord, kg, null);
        Type localVarReturnType = new TypeToken<IssueResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sends an interaction sequence for processing (asynchronously)
     * Sends list of interaction records to be processed
     * @param interactRecord Interaction record array (required)
     * @param kg Issuing target (opt) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unknown graph </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Malformed frame </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Service unavailable </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Server error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Missing implementation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueAsync(List<InteractRecord> interactRecord, String kg, final ApiCallback<IssueResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = issueValidateBeforeCall(interactRecord, kg, _callback);
        Type localVarReturnType = new TypeToken<IssueResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
