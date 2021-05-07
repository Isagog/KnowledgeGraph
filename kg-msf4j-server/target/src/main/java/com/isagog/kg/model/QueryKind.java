package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Query kind, where (INDIVIDUATION = single entity, CARDINALITY = entity count, LIST = list of entity n-tuples)
 */
public enum QueryKind {
  
  EXTENSION("EXTENSION"),
  
  CARDINALITY("CARDINALITY");

  private String value;

  QueryKind(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryKind fromValue(String text) {
    for (QueryKind b : QueryKind.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

