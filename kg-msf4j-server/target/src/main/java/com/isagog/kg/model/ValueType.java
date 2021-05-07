package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ValueType
 */
public enum ValueType {
  
  URI("URI"),
  
  BOOLEAN("BOOLEAN"),
  
  INTEGER("INTEGER"),
  
  DOUBLE("DOUBLE"),
  
  STRING("STRING");

  private String value;

  ValueType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ValueType fromValue(String text) {
    for (ValueType b : ValueType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

