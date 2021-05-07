package com.isagog.service.knowledge;


import com.isagog.kg.model.*;
import com.isagog.service.ServiceException;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.jena.iri.IRI;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Optional;

public class KnowledgeFactory {

    private static <K extends KnowledgeElement> K newKnowledgeElement(Class<K> clz) throws ServiceException {
        try {
            K i = clz.getDeclaredConstructor().newInstance();
            i.setKtype(Knowledge.classNameToKtype(clz.getSimpleName()).name());
            return i;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    private static <K extends KnowledgeElement> K newKnowledgeElement(Class<K> clz, String id) throws ServiceException {
            K i = newKnowledgeElement(clz);
            i.setId(id);
            return i;

    }

    private static <K extends Classifier> K newClassifier(Class<K> clz, String ns, String id) throws ServiceException {
        K i = newKnowledgeElement(clz);
        i.setNs(ns);
        i.setId(id);
        return i;

    }

    public static KnowledgeGraph newKnowledgeGraph(URI id) throws ServiceException {
        return new KnowledgeGraph().id(id);
    }

    public static Ontology newOntology(URI id, URI src) throws ServiceException {
        return new Ontology().id(id).source(src);
    }

    public static Concept newConcept(String ns, String id) throws ServiceException {
        return newClassifier(Concept.class,ns,id);
    }

    public static Relation newRelation(String ns, String id) throws ServiceException {
        return newClassifier(Relation.class,ns,id);

    }

    public static Attribute newAttribute(String ns, String id) throws ServiceException {
        return newClassifier(Attribute.class,ns,id);
    }

    public static Entity newEntity(String ns, String id) throws ServiceException {
        return newKnowledgeElement(Entity.class,id).ns(ns);

    }




    public static Statement newStatement() throws ServiceException {

        return newKnowledgeElement(Statement.class);

    }

    public static Frame newFrame(String id) throws ServiceException {
        Frame f = newKnowledgeElement(Frame.class);
        f.setId(id);
        return f;
    }

    public static ConceptualSlot newConceptualSlot(String id) throws ServiceException {
        ConceptualSlot c = newKnowledgeElement(ConceptualSlot.class);
        c.setId(id);
        return c;
    }

    public static RelationalSlot newRelationalSlot(String id) throws ServiceException {
        RelationalSlot c = newKnowledgeElement(RelationalSlot.class);
        c.setId(id);
        return c;
    }

    public static AttributiveSlot newAttributiveSlot(String id) throws ServiceException {
        AttributiveSlot c = newKnowledgeElement(AttributiveSlot.class);
        c.setId(id);
        return c;
    }

    public static KnowledgeAnnotation newAnnotation(AnnotationType type, String key, String value) throws ServiceException {
        return new KnowledgeAnnotation().atype(type).key(key).value(value);
    }


    public static AnnotatedSentence newAnnotatedSentence () throws ServiceException {
        try {
            AnnotatedSentence i = new AnnotatedSentence();
            i.ttype("AnnotatedSentence");
            return i;
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public static AnnotatedDocument newAnnotatedDocument (URI id) throws ServiceException {
        try {
            AnnotatedDocument i = new AnnotatedDocument();
            i.setTtype("AnnotatedDocument");
            i.setId(id);
            return i;
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

}
