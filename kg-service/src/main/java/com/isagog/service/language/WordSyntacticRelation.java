package com.isagog.service.language;

public class WordSyntacticRelation extends WordRelation {
    public WordSyntacticRelation(String label, double confidence) {
        super(label, confidence);
    }

    public WordSyntacticRelation(String label) {
        super(label);
    }
}
