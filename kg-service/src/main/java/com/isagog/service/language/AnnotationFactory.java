package com.isagog.service.language;


import com.isagog.kg.model.*;

public class AnnotationFactory {

    public static LemmaAnnotation getLemmaAnnotation() {
        return (LemmaAnnotation) new LemmaAnnotation().ttype("LemmaAnnotation");
    }

    public static EntityAnnotation getEntityAnnotation() {
        return (EntityAnnotation) new EntityAnnotation().ttype("EntityAnnotation");
    }

    public static KeywordAnnotation getKeywordAnnotation() {
        return (KeywordAnnotation) new KeywordAnnotation().ttype("KeywordAnnotation");
    }

    public static SyntacticRelation getSyntacticRelation() {
        return (SyntacticRelation) new SyntacticRelation().ttype("SyntacticRelation");
    }
}
