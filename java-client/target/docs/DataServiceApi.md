# DataServiceApi

All URIs are relative to *http://localhost:8030*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntity**](DataServiceApi.md#createEntity) | **POST** /entities | Entity creation
[**createStatement**](DataServiceApi.md#createStatement) | **POST** /statements | Entity statement creation
[**deleteEntity**](DataServiceApi.md#deleteEntity) | **DELETE** /entities | Entity deletion
[**deleteStatement**](DataServiceApi.md#deleteStatement) | **DELETE** /statements | Statement deletion
[**getAllStatements**](DataServiceApi.md#getAllStatements) | **GET** /statements | Get statements
[**getEntity**](DataServiceApi.md#getEntity) | **GET** /entities/{id} | Entity access
[**getEntityDetails**](DataServiceApi.md#getEntityDetails) | **GET** /entities | Entity access
[**queryExpression**](DataServiceApi.md#queryExpression) | **POST** /query/expression | Issue a graph query
[**queryFrame**](DataServiceApi.md#queryFrame) | **POST** /query/frame | Knowledge query
[**queryKeywords**](DataServiceApi.md#queryKeywords) | **POST** /query/keywords | Knowledge query
[**upload**](DataServiceApi.md#upload) | **POST** /upload | Bulk upload


<a name="createEntity"></a>
# **createEntity**
> createEntity(entity)

Entity creation

Creates a new entity uri and related statements

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    Entity entity = new Entity(); // Entity | Entity record
    try {
      apiInstance.createEntity(entity);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#createEntity");
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
 **entity** | [**Entity**](Entity.md)| Entity record |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Invalid element |  -  |
**405** | Unsupported element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="createStatement"></a>
# **createStatement**
> createStatement(statement)

Entity statement creation

Creates a new entity statement

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    Statement statement = new Statement(); // Statement | Statement specification
    try {
      apiInstance.createStatement(statement);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#createStatement");
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
 **statement** | [**Statement**](Statement.md)| Statement specification |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Invalid element |  -  |
**405** | Unsupported element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="deleteEntity"></a>
# **deleteEntity**
> deleteEntity(id)

Entity deletion

Deletes an entity and related statements

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteEntity(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#deleteEntity");
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
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Element not found |  -  |
**402** | Not authorized |  -  |
**403** | Invalid element |  -  |
**405** | Protected element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="deleteStatement"></a>
# **deleteStatement**
> deleteStatement(statement)

Statement deletion

Deletes a Statement

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    Statement statement = new Statement(); // Statement | Statement specification
    try {
      apiInstance.deleteStatement(statement);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#deleteStatement");
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
 **statement** | [**Statement**](Statement.md)| Statement specification |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Element not found |  -  |
**402** | Not authorized |  -  |
**403** | Invalid element |  -  |
**405** | Protected element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getAllStatements"></a>
# **getAllStatements**
> StatementResponse getAllStatements(subject, predicate, value)

Get statements

Retrieve statements related to a predicate, object, or subject combination

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    String subject = "subject_example"; // String | 
    String predicate = "predicate_example"; // String | 
    String value = "value_example"; // String | 
    try {
      StatementResponse result = apiInstance.getAllStatements(subject, predicate, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#getAllStatements");
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
 **subject** | **String**|  | [optional]
 **predicate** | **String**|  | [optional]
 **value** | **String**|  | [optional]

### Return type

[**StatementResponse**](StatementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Invalid element |  -  |
**405** | Unsupported element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getEntity"></a>
# **getEntity**
> EntityResponse getEntity(id, details)

Entity access

Returns an Entity

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    String id = "id_example"; // String | Entity identifier
    EntityDetails details = EntityDetails.fromValue("FULL"); // EntityDetails | Details to fetch
    try {
      EntityResponse result = apiInstance.getEntity(id, details);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#getEntity");
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
 **id** | **String**| Entity identifier |
 **details** | [**EntityDetails**](.md)| Details to fetch | [optional] [enum: FULL, DATA, LABELS]

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Element not found |  -  |
**402** | Not authorized |  -  |
**403** | Invalid element |  -  |
**405** | Protected element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="getEntityDetails"></a>
# **getEntityDetails**
> EntityResponse getEntityDetails(id, details)

Entity access

Returns an Entity

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    String id = "id_example"; // String | Entity identifier
    EntityDetails details = EntityDetails.fromValue("FULL"); // EntityDetails | Details to fetch
    try {
      EntityResponse result = apiInstance.getEntityDetails(id, details);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#getEntityDetails");
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
 **id** | **String**| Entity identifier |
 **details** | [**EntityDetails**](.md)| Details to fetch | [optional] [enum: FULL, DATA, LABELS]

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Element not found |  -  |
**402** | Not authorized |  -  |
**403** | Invalid element |  -  |
**405** | Protected element |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="queryExpression"></a>
# **queryExpression**
> QueryResponse queryExpression(queryExpression, kg)

Issue a graph query

Queries the Knowledge Graph by a query expression, whose syntax is specified

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    QueryExpression queryExpression = new QueryExpression(); // QueryExpression | The query
    String kg = "kg_example"; // String | Query context (opt)
    try {
      QueryResponse result = apiInstance.queryExpression(queryExpression, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#queryExpression");
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
 **queryExpression** | [**QueryExpression**](QueryExpression.md)| The query |
 **kg** | **String**| Query context (opt) | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unsupported language |  -  |
**402** | Invalid query |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="queryFrame"></a>
# **queryFrame**
> QueryResponse queryFrame(queryFrame, kg)

Knowledge query

Queries a Knowledge Graph

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    QueryFrame queryFrame = new QueryFrame(); // QueryFrame | The query
    String kg = "kg_example"; // String | Query context (opt)
    try {
      QueryResponse result = apiInstance.queryFrame(queryFrame, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#queryFrame");
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
 **queryFrame** | [**QueryFrame**](QueryFrame.md)| The query |
 **kg** | **String**| Query context (opt) | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unsupported language |  -  |
**402** | Invalid query |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="queryKeywords"></a>
# **queryKeywords**
> QueryResponse queryKeywords(queryKeywords, kg)

Knowledge query

Queries a Knowledge Graph

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    QueryKeywords queryKeywords = new QueryKeywords(); // QueryKeywords | The query
    String kg = "kg_example"; // String | Query context (opt)
    try {
      QueryResponse result = apiInstance.queryKeywords(queryKeywords, kg);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#queryKeywords");
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
 **queryKeywords** | [**QueryKeywords**](QueryKeywords.md)| The query |
 **kg** | **String**| Query context (opt) | [optional]

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unsupported language |  -  |
**402** | Invalid query |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

<a name="upload"></a>
# **upload**
> upload(kg, upload)

Bulk upload

Uploads a resource

### Example
```java
// Import classes:
import com.isagog.kg.ApiClient;
import com.isagog.kg.ApiException;
import com.isagog.kg.Configuration;
import com.isagog.kg.models.*;
import com.isagog.kg.api.DataServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8030");

    DataServiceApi apiInstance = new DataServiceApi(defaultClient);
    String kg = "kg_example"; // String | 
    Upload upload = new Upload(); // Upload | 
    try {
      apiInstance.upload(kg, upload);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataServiceApi#upload");
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
 **kg** | **String**|  |
 **upload** | [**Upload**](Upload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unknown graph |  -  |
**402** | Malformed document |  -  |
**403** | Unsupported format |  -  |
**501** | Service unavailable |  -  |
**502** | Server error |  -  |
**503** | Missing implementation |  -  |

