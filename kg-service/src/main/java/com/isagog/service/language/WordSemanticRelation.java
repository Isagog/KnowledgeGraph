package com.isagog.service.language;

public class WordSemanticRelation extends WordRelation {
    public WordSemanticRelation(String label, double confidence) {
        super(label, confidence);
    }

    public WordSemanticRelation(String label) {
        super(label);
    }
}
