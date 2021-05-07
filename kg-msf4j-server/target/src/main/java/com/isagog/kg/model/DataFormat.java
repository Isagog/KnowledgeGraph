package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DataFormat
 */
public enum DataFormat {
  
  XML("XML"),
  
  TURTLE("TURTLE"),
  
  N3("N3"),
  
  CSV("CSV"),
  
  JSON("JSON");

  private String value;

  DataFormat(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DataFormat fromValue(String text) {
    for (DataFormat b : DataFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

