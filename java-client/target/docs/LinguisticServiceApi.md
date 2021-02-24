# LinguisticServiceApi

All URIs are relative to *http://api.isagog.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentAnalysis**](LinguisticServiceApi.md#documentAnalysis) | **POST** /document/analyze | Sentence extraction
[**sentenceAnalysis**](LinguisticServiceApi.md#sentenceAnalysis) | **POST** /sentence/analyze | Sentence analysis


<a name="documentAnalysis"></a>
# **documentAnalysis**
> List&lt;SentenceAnnotation&gt; documentAnalysis(mode, tasks, document)

Sentence extraction

Extract and analyze sentences from a text

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
    ExtractionMode mode = ExtractionMode.fromValue("SUMMARY"); // ExtractionMode | 
    List<AnalysisTask> tasks = Arrays.asList(); // List<AnalysisTask> | 
    Document document = new Document(); // Document | 
    try {
      List<SentenceAnnotation> result = apiInstance.documentAnalysis(mode, tasks, document);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinguisticServiceApi#documentAnalysis");
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
 **mode** | [**ExtractionMode**](.md)|  | [optional] [default to FULL] [enum: SUMMARY, PASSAGES, FULL]
 **tasks** | [**List&lt;AnalysisTask&gt;**](AnalysisTask.md)|  | [optional]
 **document** | [**Document**](Document.md)|  | [optional]

### Return type

[**List&lt;SentenceAnnotation&gt;**](SentenceAnnotation.md)

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

<a name="sentenceAnalysis"></a>
# **sentenceAnalysis**
> SentenceAnnotation sentenceAnalysis(tasks, sentence)

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
    List<AnalysisTask> tasks = Arrays.asList(); // List<AnalysisTask> | Tasks to be executed, all available if missing
    Sentence sentence = new Sentence(); // Sentence | 
    try {
      SentenceAnnotation result = apiInstance.sentenceAnalysis(tasks, sentence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinguisticServiceApi#sentenceAnalysis");
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
 **tasks** | [**List&lt;AnalysisTask&gt;**](AnalysisTask.md)| Tasks to be executed, all available if missing | [optional]
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

