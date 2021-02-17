# KnowledgeServiceApi

All URIs are relative to *http://localhost:8030*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evaluateEntity**](KnowledgeServiceApi.md#evaluateEntity) | **POST** /evaluate | Entity evaluation
[**extractFrames**](KnowledgeServiceApi.md#extractFrames) | **POST** /frames/extract | Frame extraction from sentences
[**getAllAttributes**](KnowledgeServiceApi.md#getAllAttributes) | **GET** /attributes | Gets all attributes in the Knowledge Graph ontology
[**getAllConcepts**](KnowledgeServiceApi.md#getAllConcepts) | **GET** /concepts | Get all the atomic concepts in the Knowledge Graph
[**getAllFrames**](KnowledgeServiceApi.md#getAllFrames) | **GET** /frames | Gets all the frames in the Knowledge Graph ontology
[**getAllGraphs**](KnowledgeServiceApi.md#getAllGraphs) | **GET** /graphs | Get KGs
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
    defaultClient.setBasePath("http://localhost:8030");

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
    defaultClient.setBasePath("http://localhost:8030");

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
> List&lt;Attribute&gt; getAllAttributes(kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      List<Attribute> result = apiInstance.getAllAttributes(kg);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kg** | **String**| The KG id (opt) | [optional]

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
> List&lt;Concept&gt; getAllConcepts(kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      List<Concept> result = apiInstance.getAllConcepts(kg);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kg** | **String**| The KG id (opt) | [optional]

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
> List&lt;Frame&gt; getAllFrames(kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      List<Frame> result = apiInstance.getAllFrames(kg);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kg** | **String**| The KG id (opt) | [optional]

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

<a name="getAllGraphs"></a>
# **getAllGraphs**
> List&lt;KnowledgeGraph&gt; getAllGraphs()

Get KGs

Get all the known KGs

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    try {
      List<KnowledgeGraph> result = apiInstance.getAllGraphs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#getAllGraphs");
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

[**List&lt;KnowledgeGraph&gt;**](KnowledgeGraph.md)

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
> List&lt;Relation&gt; getAllRelations(kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      List<Relation> result = apiInstance.getAllRelations(kg);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kg** | **String**| The KG id (opt) | [optional]

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
> Attribute getAttribute(id, kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String id = "id_example"; // String | The attribute's id
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      Attribute result = apiInstance.getAttribute(id, kg);
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
 **id** | **String**| The attribute&#39;s id |
 **kg** | **String**| The KG id (opt) | [optional]

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
> Concept getConcept(id, kg, details)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String id = "id_example"; // String | The concept's id
    String kg = "kg_example"; // String | The KG id
    List<HierarchyDetails> details = Arrays.asList(); // List<HierarchyDetails> | Details to be fetched (opt), defaults to any
    try {
      Concept result = apiInstance.getConcept(id, kg, details);
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
 **id** | **String**| The concept&#39;s id |
 **kg** | **String**| The KG id |
 **details** | [**List&lt;HierarchyDetails&gt;**](HierarchyDetails.md)| Details to be fetched (opt), defaults to any |

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
> Frame getFrame(id, kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String id = "id_example"; // String | The frame's id
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      Frame result = apiInstance.getFrame(id, kg);
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
 **id** | **String**| The frame&#39;s id |
 **kg** | **String**| The KG id (opt) | [optional]

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
> Relation getRelation(id, kg)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String id = "id_example"; // String | The relation's id
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      Relation result = apiInstance.getRelation(id, kg);
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
 **id** | **String**| The relation&#39;s id |
 **kg** | **String**| The KG id (opt) | [optional]

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
> List&lt;ElementRanking&gt; search(query, ktype, details, attribute)

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
    defaultClient.setBasePath("http://localhost:8030");

    KnowledgeServiceApi apiInstance = new KnowledgeServiceApi(defaultClient);
    String query = "query_example"; // String | The query to search by
    String ktype = "ANY"; // String | Narrow search to a specific knowledge type
    String details = "IDENTIFIER"; // String | Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only
    String attribute = "\"rdfs:label\""; // String | Attribute to search by, either an annotation or a data property
    try {
      List<ElementRanking> result = apiInstance.search(query, ktype, details, attribute);
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
 **ktype** | **String**| Narrow search to a specific knowledge type | [optional] [default to ANY] [enum: CONCEPT, PROPERTY, ATTRIBUTE, ENTITY, FRAME, ANY]
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

