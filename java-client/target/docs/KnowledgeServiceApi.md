# KnowledgeServiceApi

All URIs are relative to *http://localhost:8030*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disjoint**](KnowledgeServiceApi.md#disjoint) | **GET** /axioms/disjontness | Tells about disjointess
[**getAllAttributes**](KnowledgeServiceApi.md#getAllAttributes) | **GET** /attributes | Gets all attributes in the Knowledge Graph ontology
[**getAllConcepts**](KnowledgeServiceApi.md#getAllConcepts) | **GET** /concepts | Get all the concepts in the Knowledge Graph
[**getAllFrames**](KnowledgeServiceApi.md#getAllFrames) | **GET** /frames | Gets all the frames in the Knowledge Graph ontology
[**getAllGraphs**](KnowledgeServiceApi.md#getAllGraphs) | **GET** /graphs | Get KGs
[**getAllRelations**](KnowledgeServiceApi.md#getAllRelations) | **GET** /relations | Gets all the relations in the Knowledge Graph ontology
[**getAttribute**](KnowledgeServiceApi.md#getAttribute) | **GET** /attributes/{id} | Gets an attribute
[**getConcept**](KnowledgeServiceApi.md#getConcept) | **GET** /concepts/{id} | Gets a concept
[**getFrame**](KnowledgeServiceApi.md#getFrame) | **GET** /frames/{id} | Gets a frame
[**getRelation**](KnowledgeServiceApi.md#getRelation) | **GET** /relations/{id} | Gets a relation
[**includes**](KnowledgeServiceApi.md#includes) | **GET** /axioms/inclusion | Tells about inclusion dependencies
[**search**](KnowledgeServiceApi.md#search) | **GET** /search | Knowledge search


<a name="disjoint"></a>
# **disjoint**
> Boolean disjoint(first, second, kg)

Tells about disjointess

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
    String first = "first_example"; // String | Candidate classifier
    String second = "second_example"; // String | Candidate classifier
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      Boolean result = apiInstance.disjoint(first, second, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#disjoint");
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
 **first** | **String**| Candidate classifier |
 **second** | **String**| Candidate classifier |
 **kg** | **String**| The KG id (opt) | [optional]

### Return type

**Boolean**

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
**402** | Invalid argument pair |  -  |
**403** | Unknown first |  -  |
**404** | Unwnown second |  -  |
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

Get all the concepts in the Knowledge Graph

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
> Attribute getAttribute(id, kg, details)

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
    ConceptualDetails details = ConceptualDetails.fromValue("SUPERPREDICATES"); // ConceptualDetails | Details to be fetched (opt), defaults to any
    try {
      Attribute result = apiInstance.getAttribute(id, kg, details);
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
 **kg** | **String**| The KG id (opt) |
 **details** | [**ConceptualDetails**](.md)| Details to be fetched (opt), defaults to any | [default to NONE] [enum: SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE]

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
    ConceptualDetails details = ConceptualDetails.fromValue("SUPERPREDICATES"); // ConceptualDetails | Details to be fetched (opt), defaults to any
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
 **details** | [**ConceptualDetails**](.md)| Details to be fetched (opt), defaults to any | [default to NONE] [enum: SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE]

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
> Relation getRelation(id, kg, details)

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
    ConceptualDetails details = ConceptualDetails.fromValue("SUPERPREDICATES"); // ConceptualDetails | Details to be fetched (opt), defaults to any
    try {
      Relation result = apiInstance.getRelation(id, kg, details);
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
 **kg** | **String**| The KG id (opt) |
 **details** | [**ConceptualDetails**](.md)| Details to be fetched (opt), defaults to any | [default to NONE] [enum: SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE]

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

<a name="includes"></a>
# **includes**
> Boolean includes(sup, sub, kg)

Tells about inclusion dependencies

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
    String sup = "sup_example"; // String | Candidate super classifier
    String sub = "sub_example"; // String | Candidate sub classifier
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      Boolean result = apiInstance.includes(sup, sub, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KnowledgeServiceApi#includes");
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
 **sup** | **String**| Candidate super classifier |
 **sub** | **String**| Candidate sub classifier |
 **kg** | **String**| The KG id (opt) | [optional]

### Return type

**Boolean**

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
**402** | Invalid argument pair |  -  |
**403** | Unknown superclass |  -  |
**404** | Unwnown subclass |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="search"></a>
# **search**
> List&lt;ElementRanking&gt; search(query, attribute, ktype, details, kg)

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
    String query = "query_example"; // String | The value to search by
    String attribute = "\"rdfs:label\""; // String | Attribute to search by, either an annotation or a data property
    KnowledgeType ktype = KnowledgeType.fromValue("CONCEPT"); // KnowledgeType | Narrow search to a specific knowledge type
    ConceptualDetails details = ConceptualDetails.fromValue("SUPERPREDICATES"); // ConceptualDetails | Details to be returned: e.g. for predicates: FULL=full hierarchy, SUMMARY=direct super\\subordinates, IDENTIFIER=id only
    String kg = "kg_example"; // String | The KG id (opt)
    try {
      List<ElementRanking> result = apiInstance.search(query, attribute, ktype, details, kg);
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
 **query** | **String**| The value to search by |
 **attribute** | **String**| Attribute to search by, either an annotation or a data property | [optional] [default to &quot;rdfs:label&quot;]
 **ktype** | [**KnowledgeType**](.md)| Narrow search to a specific knowledge type | [optional] [enum: CONCEPT, RELATION, ATTRIBUTE, ENTITY, FRAME, GRAPH, STATEMENT, CONCEPTUALSLOT, RELATIONALSLOT, ATTRIBUTIVESLOT]
 **details** | [**ConceptualDetails**](.md)| Details to be returned: e.g. for predicates: FULL&#x3D;full hierarchy, SUMMARY&#x3D;direct super\\subordinates, IDENTIFIER&#x3D;id only | [optional] [default to NONE] [enum: SUPERPREDICATES, SUBPREDICATES, DISJOINTPREDICATES, ALL, NONE]
 **kg** | **String**| The KG id (opt) | [optional]

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

