# InteractionServiceApi

All URIs are relative to *http://localhost:8030*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete**](InteractionServiceApi.md#complete) | **GET** /complete | Suggets completions
[**completeInContext**](InteractionServiceApi.md#completeInContext) | **POST** /complete | Suggets completions
[**issue**](InteractionServiceApi.md#issue) | **POST** /issue | Sends an interaction sequence for processing


<a name="complete"></a>
# **complete**
> CompletionResponse complete(hook, itype)

Suggets completions

Provides a list of candidate completions to the provided input (hook)

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.InteractionServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    String hook = "hook_example"; // String | String to search by
    String itype = "itype_example"; // String | Conceptual type restriction (opt)
    try {
      CompletionResponse result = apiInstance.complete(hook, itype);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionServiceApi#complete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook** | **String**| String to search by |
 **itype** | **String**| Conceptual type restriction (opt) | [optional]

### Return type

[**CompletionResponse**](CompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of suitable completions |  -  |
**402** | Illegal hook |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="completeInContext"></a>
# **completeInContext**
> CompletionResponse completeInContext(hook, interactRecord)

Suggets completions

Provides completion to the provided hook wrt a frame

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.InteractionServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    String hook = "hook_example"; // String | String to search by
    List<InteractRecord> interactRecord = Arrays.asList(); // List<InteractRecord> | 
    try {
      CompletionResponse result = apiInstance.completeInContext(hook, interactRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionServiceApi#completeInContext");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook** | **String**| String to search by |
 **interactRecord** | [**List&lt;InteractRecord&gt;**](InteractRecord.md)|  | [optional]

### Return type

[**CompletionResponse**](CompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of suitable completions |  -  |
**402** | Illegal hook |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="issue"></a>
# **issue**
> IssueResponse issue(interactRecord, kg)

Sends an interaction sequence for processing

Sends list of interaction records, to be processed according to the service&#39;s buisiness logic

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.InteractionServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    List<InteractRecord> interactRecord = Arrays.asList(); // List<InteractRecord> | Interaction record array
    String kg = "kg_example"; // String | Issuing target (opt)
    try {
      IssueResponse result = apiInstance.issue(interactRecord, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionServiceApi#issue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactRecord** | [**List&lt;InteractRecord&gt;**](InteractRecord.md)| Interaction record array |
 **kg** | **String**| Issuing target (opt) | [optional]

### Return type

[**IssueResponse**](IssueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unknown graph |  -  |
**402** | Malformed frame |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

