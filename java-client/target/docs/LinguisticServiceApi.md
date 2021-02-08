# LinguisticServiceApi

All URIs are relative to *http://api.isagog.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze**](LinguisticServiceApi.md#analyze) | **POST** /analyze | Sentence analysis
[**extract**](LinguisticServiceApi.md#extract) | **POST** /extract | Sentence extraction


<a name="analyze"></a>
# **analyze**
> SentenceAnnotation analyze(tasks, sentence)

Sentence analysis

Provides an annotation of the supplied text object

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.LinguisticServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    LinguisticServiceApi apiInstance = new LinguisticServiceApi(defaultClient);
    List<Task> tasks = Arrays.asList(); // List<Task> | Tasks to be executed, all available if missing
    Sentence sentence = new Sentence(); // Sentence | 
    try {
      SentenceAnnotation result = apiInstance.analyze(tasks, sentence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinguisticServiceApi#analyze");
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
 **tasks** | [**List&lt;Task&gt;**](Task.md)| Tasks to be executed, all available if missing | [optional]
 **sentence** | [**Sentence**](Sentence.md)|  | [optional]

### Return type

[**SentenceAnnotation**](SentenceAnnotation.md)

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
**402** | Invalid sentence |  -  |
**403** | Unsupported task |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="extract"></a>
# **extract**
> List&lt;Sentence&gt; extract(mode, limit, document)

Sentence extraction

Extract sentences from a text

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.LinguisticServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    LinguisticServiceApi apiInstance = new LinguisticServiceApi(defaultClient);
    String mode = "FULL"; // String | 
    Integer limit = 56; // Integer | 
    Document document = new Document(); // Document | 
    try {
      List<Sentence> result = apiInstance.extract(mode, limit, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinguisticServiceApi#extract");
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
 **mode** | **String**|  | [optional] [default to FULL] [enum: SUMMARY, PASSAGES, FULL]
 **limit** | **Integer**|  | [optional]
 **document** | [**Document**](Document.md)|  | [optional]

### Return type

[**List&lt;Sentence&gt;**](Sentence.md)

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
**402** | Invalid document |  -  |
**403** | Unsupported task |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

