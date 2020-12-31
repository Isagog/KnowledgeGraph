# InteractionServiceApi

All URIs are relative to *http://api.isagog.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete**](InteractionServiceApi.md#complete) | **GET** /complete | Suggets completions
[**input**](InteractionServiceApi.md#input) | **POST** /input | User input
[**issue**](InteractionServiceApi.md#issue) | **POST** /issue | Sends a frame instance for processing


<a name="complete"></a>
# **complete**
> List&lt;CompletionChoices&gt; complete(hook, context)

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
    defaultClient.setBasePath("http://api.isagog.com");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    String hook = "hook_example"; // String | 
    List<Completion> context = Arrays.asList(); // List<Completion> | 
    try {
      List<CompletionChoices> result = apiInstance.complete(hook, context);
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
 **hook** | **String**|  |
 **context** | [**List&lt;Completion&gt;**](Completion.md)|  | [optional]

### Return type

[**List&lt;CompletionChoices&gt;**](CompletionChoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of suitable completion (typed) choices |  -  |
**402** | Illegal hook |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="input"></a>
# **input**
> String input(sentence, kg)

User input

Processes the user input

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
    defaultClient.setBasePath("http://api.isagog.com");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    Sentence sentence = new Sentence(); // Sentence | User input
    String kg = "kg_example"; // String | Upload context (KG id)
    try {
      String result = apiInstance.input(sentence, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InteractionServiceApi#input");
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
 **sentence** | [**Sentence**](Sentence.md)| User input |
 **kg** | **String**| Upload context (KG id) | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Acknowledge message |  -  |
**201** | Query response |  -  |
**202** | Frame instantiation |  -  |
**203** | Sentence analysis |  -  |
**401** | Unknown graph |  -  |
**402** | Illegal input format |  -  |
**403** | Meaningless input |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="issue"></a>
# **issue**
> List&lt;String&gt; issue(frame, kg)

Sends a frame instance for processing

Sends a frame, e.g. a user query form, to the systems

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
    defaultClient.setBasePath("http://api.isagog.com");

    InteractionServiceApi apiInstance = new InteractionServiceApi(defaultClient);
    Frame frame = new Frame(); // Frame | Frame instance
    String kg = "kg_example"; // String | Upload context (KG id)
    try {
      List<String> result = apiInstance.issue(frame, kg);
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
 **frame** | [**Frame**](Frame.md)| Frame instance |
 **kg** | **String**| Upload context (KG id) | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success acknowledge |  -  |
**201** | Query response |  -  |
**202** | Update response |  -  |
**401** | Unknown graph |  -  |
**402** | Malformed frame |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

