package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QueryType
 */
public enum QueryType {
  
  QUERYFRAME("QUERYFRAME"),
  
  QUERYEXPRESSION("QUERYEXPRESSION"),
  
  QUERYKEYWORDS("QUERYKEYWORDS");

  private String value;

  QueryType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QueryType fromValue(String text) {
    for (QueryType b : QueryType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

