# KnowledgeServiceApi

All URIs are relative to *http://api.isagog.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evaluateEntity**](KnowledgeServiceApi.md#evaluateEntity) | **POST** /evaluate | Entity evaluation
[**extractFrames**](KnowledgeServiceApi.md#extractFrames) | **POST** /frames/extract | Frame extraction from sentences
[**getAllAttributes**](KnowledgeServiceApi.md#getAllAttributes) | **GET** /attributes | Gets all attributes in the Knowledge Graph ontology
[**getAllConcepts**](KnowledgeServiceApi.md#getAllConcepts) | **GET** /concepts | Get all the atomic concepts in the Knowledge Graph
[**getAllFrames**](KnowledgeServiceApi.md#getAllFrames) | **GET** /frames | Gets all the frames in the Knowledge Graph ontology
[**getAllRelations**](KnowledgeServiceApi.md#getAllRelations) | **GET** /relations | Gets all the relations in the Knowledge Graph ontology
[**getAttribute**](KnowledgeServiceApi.md#getAttribute) | **GET** /attributes/{id} | Gets an attribute
[**getConcept**](KnowledgeServiceApi.md#getConcept) | **GET** /concepts/{id} | Gets a concept
[**getFrame**](KnowledgeServiceApi.md#getFrame) | **GET** /frames/{id} | Gets a frame
[**getRelation**](KnowledgeServiceApi.md#getRelation) | **GET** /relations/{id} | Gets a relation
[**search**](KnowledgeServiceApi.md#search) | **GET** /search | Knowledge search


<a name="evaluateEntity"></a>
# **evaluateEntity**
> List&lt;ElementRanking&gt; evaluateEntity(entity, method)

Entity evaluation

Evaluates an entity as an instance of known concepts. Deductive evaluation should return asserted and implied entity classes. Abductive evaluation should return a ranking of the most plausible entity classes.

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    Entity entity = new Entity(); // Entity | Entity specification
    String method = "DEDUCTION"; // String | Inference method to be used
    try {
      List<ElementRanking> result = apiInstance.evaluateEntity(entity, method);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#evaluateEntity");
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
 **entity** | [**Entity**](Entity.md)| Entity specification |
 **method** | **String**| Inference method to be used | [optional] [default to DEDUCTION] [enum: DEDUCTION, ABDUCTION]

### Return type

[**List&lt;ElementRanking&gt;**](ElementRanking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Not found |  -  |
**402** | Unknown graph |  -  |
**403** | Invalid arguments |  -  |
**405** | Unsupported method |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="extractFrames"></a>
# **extractFrames**
> List&lt;Frame&gt; extractFrames(limit, sentenceAnnotation)

Frame extraction from sentences

Extract frames from an annotated sentence

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of returned frame candidates to the supplied value
    SentenceAnnotation sentenceAnnotation = new SentenceAnnotation(); // SentenceAnnotation | 
    try {
      List<Frame> result = apiInstance.extractFrames(limit, sentenceAnnotation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#extractFrames");
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
 **limit** | **Integer**| Limits the number of returned frame candidates to the supplied value | [optional]
 **sentenceAnnotation** | [**SentenceAnnotation**](SentenceAnnotation.md)|  | [optional]

### Return type

[**List&lt;Frame&gt;**](Frame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Frame span |  -  |
**402** | Insufficient data mapping |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAllAttributes"></a>
# **getAllAttributes**
> List&lt;Attribute&gt; getAllAttributes()

Gets all attributes in the Knowledge Graph ontology

Gets an attirbute

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    try {
      List<Attribute> result = apiInstance.getAllAttributes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAllAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Attribute&gt;**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAllConcepts"></a>
# **getAllConcepts**
> List&lt;Concept&gt; getAllConcepts()

Get all the atomic concepts in the Knowledge Graph

Get all the atomic concepts in the Knowledge Graph

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    try {
      List<Concept> result = apiInstance.getAllConcepts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAllConcepts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Concept&gt;**](Concept.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAllFrames"></a>
# **getAllFrames**
> List&lt;Frame&gt; getAllFrames()

Gets all the frames in the Knowledge Graph ontology

Gets a frame

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    try {
      List<Frame> result = apiInstance.getAllFrames();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAllFrames");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Frame&gt;**](Frame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAllRelations"></a>
# **getAllRelations**
> List&lt;Relation&gt; getAllRelations()

Gets all the relations in the Knowledge Graph ontology

Gets a relation

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    try {
      List<Relation> result = apiInstance.getAllRelations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAllRelations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Relation&gt;**](Relation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> Attribute getAttribute(id)

Gets an attribute

Gets an attirbute

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    URI id = new URI(); // URI | The attribute's id
    try {
      Attribute result = apiInstance.getAttribute(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAttribute");
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
 **id** | **URI**| The attribute&#39;s id |

### Return type

[**Attribute**](Attribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getConcept"></a>
# **getConcept**
> Concept getConcept(id)

Gets a concept

Gets a concept

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    URI id = new URI(); // URI | The concept's id
    try {
      Concept result = apiInstance.getConcept(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getConcept");
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
 **id** | **URI**| The concept&#39;s id |

### Return type

[**Concept**](Concept.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getFrame"></a>
# **getFrame**
> Frame getFrame(id)

Gets a frame

Gets a frame

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    URI id = new URI(); // URI | The frame's id
    try {
      Frame result = apiInstance.getFrame(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getFrame");
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
 **id** | **URI**| The frame&#39;s id |

### Return type

[**Frame**](Frame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getRelation"></a>
# **getRelation**
> Relation getRelation(id)

Gets a relation

Gets a relation

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    URI id = new URI(); // URI | The relation's id
    try {
      Relation result = apiInstance.getRelation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getRelation");
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
 **id** | **URI**| The relation&#39;s id |

### Return type

[**Relation**](Relation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="search"></a>
# **search**
> List&lt;ElementRanking&gt; search(query, etype, details, attribute)

Knowledge search

Search knowledge items

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.KnowledgeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.isagog.com");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String query = "query_example"; // String | The query to search by
    String etype = "ANY"; // String | Narrow search to a specific element type
    String details = "IDENTIFIER"; // String | Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only
    String attribute = "\"rdfs:label\""; // String | Attribute to search by, either an annotation or a data property
    try {
      List<ElementRanking> result = apiInstance.search(query, etype, details, attribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#search");
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
 **query** | **String**| The query to search by |
 **etype** | **String**| Narrow search to a specific element type | [optional] [default to ANY] [enum: CONCEPT, PROPERTY, ATTRIBUTE, ENTITY, FRAME, ANY]
 **details** | **String**| Details to be returned: e.g. for predicates: FULL&#x3D;full hierarchy, SUMMARY&#x3D;direct super\\subordinates, IDENTIFIER&#x3D;id only | [optional] [default to IDENTIFIER] [enum: FULL, SUMMARY, IDENTIFIER]
 **attribute** | **String**| Attribute to search by, either an annotation or a data property | [optional] [default to &quot;rdfs:label&quot;]

### Return type

[**List&lt;ElementRanking&gt;**](ElementRanking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | No results |  -  |
**402** | Invalid query |  -  |
**403** | Invalid attribute |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

