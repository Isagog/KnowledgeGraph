package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * NLP Tasks
 */
public enum Task {
  
  TOKENIZATION("TOKENIZATION"),
  
  LEMMATIZATION("LEMMATIZATION"),
  
  ENTITY_EXTRACTION("ENTITY_EXTRACTION"),
  
  RELATION_ANALYSIS("RELATION_ANALYSIS"),
  
  KEYWORD_EXTRACTION("KEYWORD_EXTRACTION"),
  
  SENTENCE_EXTRACTION("SENTENCE_EXTRACTION"),
  
  DOCUMENT_SUMMARY("DOCUMENT_SUMMARY"),
  
  SENTENCE_CLASSIFICATION("SENTENCE_CLASSIFICATION"),
  
  DOCUMENT_CLASSIFICATION("DOCUMENT_CLASSIFICATION");

  private String value;

  Task(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Task fromValue(String text) {
    for (Task b : Task.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

