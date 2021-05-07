package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets KnowledgeType
 */
public enum KnowledgeType {
  
  CONCEPT("CONCEPT"),
  
  RELATION("RELATION"),
  
  ATTRIBUTE("ATTRIBUTE"),
  
  ENTITY("ENTITY"),
  
  FRAME("FRAME"),
  
  STATEMENT("STATEMENT"),
  
  CONCEPTUALSLOT("CONCEPTUALSLOT"),
  
  RELATIONALSLOT("RELATIONALSLOT"),
  
  ATTRIBUTIVESLOT("ATTRIBUTIVESLOT");

  private String value;

  KnowledgeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static KnowledgeType fromValue(String text) {
    for (KnowledgeType b : KnowledgeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

