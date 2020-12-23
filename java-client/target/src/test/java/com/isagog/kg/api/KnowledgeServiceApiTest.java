/*
 * Isagog Knowledge Graph Knowledge Service
 * Isagog Knowledge Graph Knowledge module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.api;

import com.isagog.kg.ApiException;
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ElementRanking;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.SentenceAnnotation;
import java.net.URI;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KnowledgeServiceApi
 */
@Ignore
public class KnowledgeServiceApiTest {

    private final KnowledgeServiceApi api = new KnowledgeServiceApi();

    
    /**
     * Entity evaluation
     *
     * Evaluates an entity as an instance of known concepts. Deductive evaluation should return asserted and implied entity classes. Abductive evaluation should return a ranking of the most plausible entity classes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateEntityTest() throws ApiException {
        Entity entity = null;
        String method = null;
        List<ElementRanking> response = api.evaluateEntity(entity, method);

        // TODO: test validations
    }
    
    /**
     * Frame extraction from sentences
     *
     * Extract frames from an annotated sentence
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extractFramesTest() throws ApiException {
        Integer limit = null;
        SentenceAnnotation sentenceAnnotation = null;
        List<Frame> response = api.extractFrames(limit, sentenceAnnotation);

        // TODO: test validations
    }
    
    /**
     * Gets all attributes in the Knowledge Graph ontology
     *
     * Gets an attirbute
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAttributesTest() throws ApiException {
        List<Attribute> response = api.getAllAttributes();

        // TODO: test validations
    }
    
    /**
     * Get all the atomic concepts in the Knowledge Graph
     *
     * Get all the atomic concepts in the Knowledge Graph
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllConceptsTest() throws ApiException {
        List<Concept> response = api.getAllConcepts();

        // TODO: test validations
    }
    
    /**
     * Gets all the frames in the Knowledge Graph ontology
     *
     * Gets a frame
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFramesTest() throws ApiException {
        List<Frame> response = api.getAllFrames();

        // TODO: test validations
    }
    
    /**
     * Gets all the relations in the Knowledge Graph ontology
     *
     * Gets a relation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRelationsTest() throws ApiException {
        List<Relation> response = api.getAllRelations();

        // TODO: test validations
    }
    
    /**
     * Gets an attribute
     *
     * Gets an attirbute
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributeTest() throws ApiException {
        URI id = null;
        Attribute response = api.getAttribute(id);

        // TODO: test validations
    }
    
    /**
     * Gets a concept
     *
     * Gets a concept
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConceptTest() throws ApiException {
        URI id = null;
        Concept response = api.getConcept(id);

        // TODO: test validations
    }
    
    /**
     * Gets a frame
     *
     * Gets a frame
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFrameTest() throws ApiException {
        URI id = null;
        Frame response = api.getFrame(id);

        // TODO: test validations
    }
    
    /**
     * Gets a relation
     *
     * Gets a relation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationTest() throws ApiException {
        URI id = null;
        Relation response = api.getRelation(id);

        // TODO: test validations
    }
    
    /**
     * Knowledge search
     *
     * Search knowledge items
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String query = null;
        String etype = null;
        String details = null;
        String attribute = null;
        List<ElementRanking> response = api.search(query, etype, details, attribute);

        // TODO: test validations
    }
    
}
