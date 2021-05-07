package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Annotation type
 */
public enum AnnotationType {
  
  LEXICAL("LEXICAL"),
  
  META("META"),
  
  INFO("INFO"),
  
  LABEL("LABEL");

  private String value;

  AnnotationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AnnotationType fromValue(String text) {
    for (AnnotationType b : AnnotationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

