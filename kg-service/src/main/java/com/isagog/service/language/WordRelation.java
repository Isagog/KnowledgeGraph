package com.isagog.service.language;

abstract public class WordRelation {

    public WordRelation(String label, double confidence) {
        this.label = label;
        this.confidence = confidence;
    }

    public WordRelation(String label) {
        this(label,1.0);
    }


    private String label;

    public double getConfidence() {
        return confidence;
    }

    private double confidence;


    public String getLabel() {
        return label;
    }




}
