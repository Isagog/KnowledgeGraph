package com.isagog.kg.api;

import com.isagog.kg.ApiClient;
import com.isagog.kg.EncodingUtils;

import com.isagog.kg.model.Classification;
import java.io.File;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.KnowledgeGraph;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Statement;
import com.isagog.kg.model.TextualContent;
import com.isagog.kg.model.TokenAnnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-08T12:36:17.061150100+02:00[Europe/Berlin]")
public interface KnowledgeGraphServiceApi extends ApiClient.Api {


  /**
   * Sentence analysis
   * Provides an annotation of the supplied text object according to available knowledge, including entity recognition, linking and relations (opt)
   * @param kg Analysis context (opt) (optional)
   * @param task  (optional, default to FRAMES)
   * @param textualContent  (optional)
   * @return List&lt;TokenAnnotation&gt;
   */
  @RequestLine("POST /analyze?kg={kg}&task={task}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<TokenAnnotation> analyzeSentence(@Param("kg") String kg, @Param("task") String task, TextualContent textualContent);

  /**
   * Sentence analysis
   * Provides an annotation of the supplied text object according to available knowledge, including entity recognition, linking and relations (opt)
   * Note, this is equivalent to the other <code>analyzeSentence</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AnalyzeSentenceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param textualContent  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - Analysis context (opt) (optional)</li>
   *   <li>task -  (optional, default to FRAMES)</li>
   *   </ul>
   * @return List&lt;TokenAnnotation&gt;
   */
  @RequestLine("POST /analyze?kg={kg}&task={task}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<TokenAnnotation> analyzeSentence(TextualContent textualContent, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>analyzeSentence</code> method in a fluent style.
   */
  public static class AnalyzeSentenceQueryParams extends HashMap<String, Object> {
    public AnalyzeSentenceQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
    public AnalyzeSentenceQueryParams task(final String value) {
      put("task", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Statement assertion
   * Asserts a statement in a Knowledge Graph
   * @param kg Assertion context (KG id) (required)
   * @param statement Assertion statement (required)
   */
  @RequestLine("POST /{kg}/assert")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void assertStatement(@Param("kg") String kg, Statement statement);

  /**
   * Knowledge graph creation
   * Creates a Knowledge graph
   * @param knowledgeGraph The graph to be created (required)
   */
  @RequestLine("POST /create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createGraph(KnowledgeGraph knowledgeGraph);

  /**
   * Deletes a Knowledge Graph
   * Knowledge graph deletion
   * @param kg The Knowledge Graph identifier (required)
   */
  @RequestLine("GET /delete?kg={kg}")
  @Headers({
    "Accept: application/json",
  })
  void deleteGraph(@Param("kg") String kg);

  /**
   * Deletes a Knowledge Graph
   * Knowledge graph deletion
   * Note, this is equivalent to the other <code>deleteGraph</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGraphQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - The Knowledge Graph identifier (required)</li>
   *   </ul>
   */
  @RequestLine("GET /delete?kg={kg}")
  @Headers({
  "Accept: application/json",
  })
  void deleteGraph(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteGraph</code> method in a fluent style.
   */
  public static class DeleteGraphQueryParams extends HashMap<String, Object> {
    public DeleteGraphQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Entity evaluation
   * Evaluates the Entity as an instance of the specified concept
   * @param id Entity identifier (required)
   * @param concept Concept to be evaluated (required)
   * @param kg Evaluation context (opt) (optional)
   * @param method Inference method to be used (optional, default to DEDUCTION)
   * @return List&lt;Classification&gt;
   */
  @RequestLine("GET /evaluate?kg={kg}&id={id}&concept={concept}&method={method}")
  @Headers({
    "Accept: application/json",
  })
  List<Classification> evaluateEntity(@Param("id") String id, @Param("concept") String concept, @Param("kg") String kg, @Param("method") String method);

  /**
   * Entity evaluation
   * Evaluates the Entity as an instance of the specified concept
   * Note, this is equivalent to the other <code>evaluateEntity</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EvaluateEntityQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - Evaluation context (opt) (optional)</li>
   *   <li>id - Entity identifier (required)</li>
   *   <li>concept - Concept to be evaluated (required)</li>
   *   <li>method - Inference method to be used (optional, default to DEDUCTION)</li>
   *   </ul>
   * @return List&lt;Classification&gt;
   */
  @RequestLine("GET /evaluate?kg={kg}&id={id}&concept={concept}&method={method}")
  @Headers({
  "Accept: application/json",
  })
  List<Classification> evaluateEntity(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>evaluateEntity</code> method in a fluent style.
   */
  public static class EvaluateEntityQueryParams extends HashMap<String, Object> {
    public EvaluateEntityQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateEntityQueryParams id(final String value) {
      put("id", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateEntityQueryParams concept(final String value) {
      put("concept", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateEntityQueryParams method(final String value) {
      put("method", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieves a Knowledge Graph
   * Returns a Knowledge Graph, either with summary or full content
   * @param kg The Knowledge Graph identifier (required)
   * @param content Triggers full content: default &#x3D; false (optional, default to false)
   * @return KnowledgeGraph
   */
  @RequestLine("GET /get?kg={kg}&content={content}")
  @Headers({
    "Accept: application/json",
  })
  KnowledgeGraph getGraph(@Param("kg") String kg, @Param("content") Boolean content);

  /**
   * Retrieves a Knowledge Graph
   * Returns a Knowledge Graph, either with summary or full content
   * Note, this is equivalent to the other <code>getGraph</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetGraphQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - The Knowledge Graph identifier (required)</li>
   *   <li>content - Triggers full content: default &#x3D; false (optional, default to false)</li>
   *   </ul>
   * @return KnowledgeGraph
   */
  @RequestLine("GET /get?kg={kg}&content={content}")
  @Headers({
  "Accept: application/json",
  })
  KnowledgeGraph getGraph(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getGraph</code> method in a fluent style.
   */
  public static class GetGraphQueryParams extends HashMap<String, Object> {
    public GetGraphQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
    public GetGraphQueryParams content(final Boolean value) {
      put("content", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieves an element in a Knowledge Graph
   * Get the named element, if present
   * @param kg  (required)
   * @param id  (required)
   * @return List&lt;KnowledgeElement&gt;
   */
  @RequestLine("GET /{kg}/get?id={id}")
  @Headers({
    "Accept: application/json",
  })
  List<KnowledgeElement> getKnowledgeElement(@Param("kg") String kg, @Param("id") String id);

  /**
   * Retrieves an element in a Knowledge Graph
   * Get the named element, if present
   * Note, this is equivalent to the other <code>getKnowledgeElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetKnowledgeElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param kg  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>id -  (required)</li>
   *   </ul>
   * @return List&lt;KnowledgeElement&gt;
   */
  @RequestLine("GET /{kg}/get?id={id}")
  @Headers({
  "Accept: application/json",
  })
  List<KnowledgeElement> getKnowledgeElement(@Param("kg") String kg, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getKnowledgeElement</code> method in a fluent style.
   */
  public static class GetKnowledgeElementQueryParams extends HashMap<String, Object> {
    public GetKnowledgeElementQueryParams id(final String value) {
      put("id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Lists Knowledge Graphs
   * Returns the list of available KGs (id)
   * @param summary  (optional, default to false)
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /list?summary={summary}")
  @Headers({
    "Accept: application/json",
  })
  List<String> listGraphs(@Param("summary") Boolean summary);

  /**
   * Lists Knowledge Graphs
   * Returns the list of available KGs (id)
   * Note, this is equivalent to the other <code>listGraphs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGraphsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>summary -  (optional, default to false)</li>
   *   </ul>
   * @return List&lt;String&gt;
   */
  @RequestLine("GET /list?summary={summary}")
  @Headers({
  "Accept: application/json",
  })
  List<String> listGraphs(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listGraphs</code> method in a fluent style.
   */
  public static class ListGraphsQueryParams extends HashMap<String, Object> {
    public ListGraphsQueryParams summary(final Boolean value) {
      put("summary", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Knowledge query
   * Queries a Knowledge Graph
   * @param query The query Frame (required)
   * @param kg Query context (opt) (optional)
   * @return QueryResponse
   */
  @RequestLine("POST /query?kg={kg}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryResponse query(Query query, @Param("kg") String kg);

  /**
   * Knowledge query
   * Queries a Knowledge Graph
   * Note, this is equivalent to the other <code>query</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param query The query Frame (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - Query context (opt) (optional)</li>
   *   </ul>
   * @return QueryResponse
   */
  @RequestLine("POST /query?kg={kg}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryResponse query(Query query, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>query</code> method in a fluent style.
   */
  public static class QueryQueryParams extends HashMap<String, Object> {
    public QueryQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Statement retraction
   * Retracts a statement and all the statements depending on it
   * @param kg  (required)
   * @param statement Retraction statement (required)
   */
  @RequestLine("POST /{kg}/retract")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void retractStatement(@Param("kg") String kg, Statement statement);

  /**
   * Knowledge search
   * Search knowledge items
   * @param query The query to search by (required)
   * @param kg Search context (opt) (optional)
   * @param attribute The attribute to search by (opt) (optional)
   * @return List&lt;KnowledgeElement&gt;
   */
  @RequestLine("GET /search?kg={kg}&query={query}&attribute={attribute}")
  @Headers({
    "Accept: application/json",
  })
  List<KnowledgeElement> search(@Param("query") String query, @Param("kg") String kg, @Param("attribute") String attribute);

  /**
   * Knowledge search
   * Search knowledge items
   * Note, this is equivalent to the other <code>search</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>kg - Search context (opt) (optional)</li>
   *   <li>query - The query to search by (required)</li>
   *   <li>attribute - The attribute to search by (opt) (optional)</li>
   *   </ul>
   * @return List&lt;KnowledgeElement&gt;
   */
  @RequestLine("GET /search?kg={kg}&query={query}&attribute={attribute}")
  @Headers({
  "Accept: application/json",
  })
  List<KnowledgeElement> search(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>search</code> method in a fluent style.
   */
  public static class SearchQueryParams extends HashMap<String, Object> {
    public SearchQueryParams kg(final String value) {
      put("kg", EncodingUtils.encode(value));
      return this;
    }
    public SearchQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }
    public SearchQueryParams attribute(final String value) {
      put("attribute", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Bulk upload
   * Uploads an RDF resource
   * @param kg  (required)
   * @param content Serialized content (required)
   * @param format Serialization format (optional)
   */
  @RequestLine("POST /{kg}/upload")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  void uploadResource(@Param("kg") String kg, @Param("content") File content, @Param("format") String format);
}
