package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AttributeRange
 */
public enum AttributeRange {
  
  STRING("STRING"),
  
  TEXT("TEXT"),
  
  INTEGER("INTEGER"),
  
  DOUBLE("DOUBLE");

  private String value;

  AttributeRange(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AttributeRange fromValue(String text) {
    for (AttributeRange b : AttributeRange.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

