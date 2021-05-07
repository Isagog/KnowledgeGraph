package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The search operator; OR = at least one match, AND = complete match, EXCEPT = match the first value but not the others
 */
public enum SearchOperator {
  
  OR("OR"),
  
  AND("AND"),
  
  EXCEPT("EXCEPT");

  private String value;

  SearchOperator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SearchOperator fromValue(String text) {
    for (SearchOperator b : SearchOperator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

