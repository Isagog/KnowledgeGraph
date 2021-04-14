package com.isagog.service.data;

import com.isagog.kg.model.*;

import com.isagog.service.ServiceException;

import java.net.URI;
import java.util.List;
import java.util.Optional;


public interface QueryManager {

    List<KnowledgeElement> search (String query, URI attribute, KnowledgeType ktype, ConceptualDetails details) throws ServiceException;

    Optional<Entity> getEntity(URI id, EntityDetails details)  throws ServiceException;

    QueryResponse queryExpression (QueryExpression q, String kb) throws ServiceException;

    QueryResponse queryFrame (QueryFrame q, String kb) throws ServiceException;

    QueryResponse queryKeywords (QueryKeywords q, String kb) throws ServiceException;

    List<Frame> getFrames (List<Classification> classes, String kb) throws ServiceException;

    List<Statement> getStatements(URI subject, URI predicate, String value)  throws ServiceException;

}
