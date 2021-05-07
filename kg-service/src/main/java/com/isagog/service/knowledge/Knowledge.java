package com.isagog.service.knowledge;

import com.isagog.kg.model.*;
import com.isagog.service.ServiceException;

import javax.annotation.Nonnull;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static com.isagog.kg.model.KnowledgeType.*;

public class Knowledge  {


    public static class Identifier  {
        private String graph;
        private String id;

        public Identifier(String context, String id) {
            this.graph = context;
            this.id = id;
        }

        public String getGraph() {
            return graph;
        }

        public String getId() {
            return id;
        }

        public static Identifier of (String context, String id) {
            return new Identifier(context,id);
        }

        public static Identifier of (URI uri) {
            if (uri.getFragment() != null) {
                return new Identifier(uri.getPath(), uri.getFragment());
            } else {
                return new Identifier(uri.getAuthority(),uri.getPath());
            }
        }

        public static Optional<Identifier> of (@Nonnull String uri) {
            try {
                return Optional.of(of(URI.create(uri)));
            } catch (IllegalArgumentException e) {
                return Optional.empty();
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Identifier that = (Identifier) o;
            return graph.equals(that.graph) && id.equals(that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(graph, id);
        }
    }

    /*
     public static Identifier id(String context, String id) {
        return Identifier.of(context,id);
     }

     */


    public static List<KnowledgeAnnotation> getMetaclasses(KnowledgeElement element) {
        return        element.getAnnotations()
                      .stream()
                      .filter(a -> a.getAtype().equals(AnnotationType.META))
                      .collect(Collectors.toList());
    }

    public static List<KnowledgeAnnotation> getLinguisticAnnotations(KnowledgeElement element) {
        return   element.getAnnotations()
                .stream()
                .filter(a -> a.getAtype().equals(AnnotationType.LEXICAL))
                .collect(Collectors.toList());
    }

    public static KnowledgeElement annotate (KnowledgeElement element, KnowledgeAnnotation ... annotations) {
//        List<KnowledgeAnnotation> asList = Arrays.stream(annotations)
//                                                 .sequential()
//                                                 .filter(a -> a.getAtype() == null)
//                                                 .map(a -> a.atype(a.getClass().getSimpleName()))
//                                                 .collect(Collectors.toList());
        return element.annotations(Arrays.asList(annotations));
    }



    public static String encodeID(String id) throws ServiceException {
        try {
            return java.net.URLEncoder.encode(id, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new ServiceException("Encoding exception");
        }
    }


    public static String decodeID(String id) throws ServiceException { //{ return id.replace("%2F","/"); }
        try {
            return java.net.URLDecoder.decode(id, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new ServiceException("Decoding exception");
        }
    }

    public static KnowledgeType classNameToKtype(String simpleClassName) throws ServiceException {
        switch (simpleClassName) {
            case "Concept":
                return CONCEPT;
            case "Relation":
                return RELATION;
            case "Attribute":
                return ATTRIBUTE;
            case "Entity":
                return ENTITY;
            case "Statement":
                return STATEMENT;
            case "Frame":
                return FRAME;
            case "ConceptualSlot":
                return CONCEPTUALSLOT;
            case "RelationalSlot":
                return RELATIONALSLOT;
            case "AttributiveSlot":
                return ATTRIBUTIVESLOT;
            default:
                throw new ServiceException("Invalid class " + simpleClassName + " for Knowledge Type");
        }
    }


}
