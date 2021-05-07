package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Quantifier
 */
public enum Quantifier {
  
  SOME("SOME"),
  
  ALL("ALL"),
  
  ATLEAST1("ATLEAST1"),
  
  ATMOST1("ATMOST1");

  private String value;

  Quantifier(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Quantifier fromValue(String text) {
    for (Quantifier b : Quantifier.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

