package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Interaction conceptual types
 */
public enum InteractType {
  
  VALUE("VALUE"),
  
  ENTITY("ENTITY"),
  
  CONCEPT("CONCEPT"),
  
  RELATION("RELATION"),
  
  ATTRIBUTE("ATTRIBUTE"),
  
  FRAME("FRAME"),
  
  SYNTAGM("SYNTAGM");

  private String value;

  InteractType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InteractType fromValue(String text) {
    for (InteractType b : InteractType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

