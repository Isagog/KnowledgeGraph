package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Query languages
 */
public enum QueryLanguage {
  
  SPARQL("SPARQL"),
  
  GRAPHQL("GRAPHQL");

  private String value;

  QueryLanguage(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryLanguage fromValue(String text) {
    for (QueryLanguage b : QueryLanguage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

