package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Comparation operator for data values (opt)
 */
public enum Comparator {
  
  EQUAL("EQUAL"),
  
  GREATER("GREATER"),
  
  SMALLER("SMALLER"),
  
  SIMILAR("SIMILAR");

  private String value;

  Comparator(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Comparator fromValue(String text) {
    for (Comparator b : Comparator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

