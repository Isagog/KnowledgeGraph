package com.isagog.kg.api;

import com.isagog.kg.ApiClient;
import com.isagog.kg.model.Classification;
import java.io.File;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.KnowledgeGraph;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.Statement;
import com.isagog.kg.model.TextAnnotation;
import com.isagog.kg.model.TextualContent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KnowledgeServiceApi
 */
public class KnowledgeServiceApiTest {

    private KnowledgeServiceApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(KnowledgeServiceApi.class);
    }

    
    /**
     * Sentence analysis
     *
     * Provides an annotation of the supplied text object according to available knowledge, including entity recognition, linking and relations (opt)
     */
    @Test
    public void analyzeSentenceTest() {
        String kg = null;
        String task = null;
        TextualContent textualContent = null;
        // List<TextAnnotation> response = api.analyzeSentence(kg, task, textualContent);

        // TODO: test validations
    }

    /**
     * Sentence analysis
     *
     * Provides an annotation of the supplied text object according to available knowledge, including entity recognition, linking and relations (opt)
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void analyzeSentenceTestQueryMap() {
        TextualContent textualContent = null;
        KnowledgeServiceApi.AnalyzeSentenceQueryParams queryParams = new KnowledgeServiceApi.AnalyzeSentenceQueryParams()
            .kg(null)
            .task(null);
        // List<TextAnnotation> response = api.analyzeSentence(textualContent, queryParams);

    // TODO: test validations
    }
    
    /**
     * Statement assertion
     *
     * Asserts a statement in a Knowledge Graph
     */
    @Test
    public void assertStatementTest() {
        String kg = null;
        Statement statement = null;
        // api.assertStatement(kg, statement);

        // TODO: test validations
    }

    
    /**
     * Knowledge graph creation
     *
     * Creates a Knowledge graph
     */
    @Test
    public void createGraphTest() {
        KnowledgeGraph knowledgeGraph = null;
        // api.createGraph(knowledgeGraph);

        // TODO: test validations
    }

    
    /**
     * Deletes a Knowledge Graph
     *
     * Knowledge graph deletion
     */
    @Test
    public void deleteGraphTest() {
        String kg = null;
        // api.deleteGraph(kg);

        // TODO: test validations
    }

    
    /**
     * Entity individual evaluation
     *
     * Evaluates the Entity as an instance of the specified concept
     */
    @Test
    public void evaluateEntityTest() {
        String id = null;
        String concept = null;
        String kg = null;
        String method = null;
        // List<Classification> response = api.evaluateEntity(id, concept, kg, method);

        // TODO: test validations
    }

    /**
     * Entity individual evaluation
     *
     * Evaluates the Entity as an instance of the specified concept
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void evaluateEntityTestQueryMap() {
        KnowledgeServiceApi.EvaluateEntityQueryParams queryParams = new KnowledgeServiceApi.EvaluateEntityQueryParams()
            .kg(null)
            .id(null)
            .concept(null)
            .method(null);
        // List<Classification> response = api.evaluateEntity(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieves a Knowledge Graph
     *
     * Returns a Knowledge Graph, either with summary or full content
     */
    @Test
    public void getGraphTest() {
        String kg = null;
        Boolean content = null;
        // KnowledgeGraph response = api.getGraph(kg, content);

        // TODO: test validations
    }

    /**
     * Retrieves a Knowledge Graph
     *
     * Returns a Knowledge Graph, either with summary or full content
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getGraphTestQueryMap() {
        String kg = null;
        KnowledgeServiceApi.GetGraphQueryParams queryParams = new KnowledgeServiceApi.GetGraphQueryParams()
            .content(null);
        // KnowledgeGraph response = api.getGraph(kg, queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieves an element in a Knowledge Graph
     *
     * Get the named element, if present
     */
    @Test
    public void getKnowledgeElementTest() {
        String kg = null;
        String id = null;
        // List<KnowledgeElement> response = api.getKnowledgeElement(kg, id);

        // TODO: test validations
    }

    /**
     * Retrieves an element in a Knowledge Graph
     *
     * Get the named element, if present
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getKnowledgeElementTestQueryMap() {
        String kg = null;
        KnowledgeServiceApi.GetKnowledgeElementQueryParams queryParams = new KnowledgeServiceApi.GetKnowledgeElementQueryParams()
            .id(null);
        // List<KnowledgeElement> response = api.getKnowledgeElement(kg, queryParams);

    // TODO: test validations
    }
    
    /**
     * Lists Knowledge Graphs
     *
     * Returns the list of available KGs (id)
     */
    @Test
    public void listGraphsTest() {
        Boolean summary = null;
        // List<String> response = api.listGraphs(summary);

        // TODO: test validations
    }

    /**
     * Lists Knowledge Graphs
     *
     * Returns the list of available KGs (id)
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listGraphsTestQueryMap() {
        KnowledgeServiceApi.ListGraphsQueryParams queryParams = new KnowledgeServiceApi.ListGraphsQueryParams()
            .summary(null);
        // List<String> response = api.listGraphs(queryParams);

    // TODO: test validations
    }
    
    /**
     * Knowledge query
     *
     * Queries a Knowledge Graph
     */
    @Test
    public void queryTest() {
        Query query = null;
        String kg = null;
        // QueryResponse response = api.query(query, kg);

        // TODO: test validations
    }

    /**
     * Knowledge query
     *
     * Queries a Knowledge Graph
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryTestQueryMap() {
        Query query = null;
        KnowledgeServiceApi.QueryQueryParams queryParams = new KnowledgeServiceApi.QueryQueryParams()
            .kg(null);
        // QueryResponse response = api.query(query, queryParams);

    // TODO: test validations
    }
    
    /**
     * Statement retraction
     *
     * Retracts a statement and all the statements depending on it
     */
    @Test
    public void retractStatementTest() {
        String kg = null;
        Statement statement = null;
        // api.retractStatement(kg, statement);

        // TODO: test validations
    }

    
    /**
     * Knowledge general search
     *
     * Search knowledge items
     */
    @Test
    public void searchTest() {
        String query = null;
        String kg = null;
        String attribute = null;
        // List<KnowledgeElement> response = api.search(query, kg, attribute);

        // TODO: test validations
    }

    /**
     * Knowledge general search
     *
     * Search knowledge items
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void searchTestQueryMap() {
        KnowledgeServiceApi.SearchQueryParams queryParams = new KnowledgeServiceApi.SearchQueryParams()
            .kg(null)
            .query(null)
            .attribute(null);
        // List<KnowledgeElement> response = api.search(queryParams);

    // TODO: test validations
    }
    
}
