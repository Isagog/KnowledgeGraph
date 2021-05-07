package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Conceptual details
 */
public enum ConceptualDetails {
  
  SUPERPREDICATES("SUPERPREDICATES"),
  
  SUBPREDICATES("SUBPREDICATES"),
  
  DISJOINTPREDICATES("DISJOINTPREDICATES"),
  
  DOMAINRESTRICTION("DOMAINRESTRICTION"),
  
  RANGERESTRICTION("RANGERESTRICTION"),
  
  ALL("ALL"),
  
  NONE("NONE");

  private String value;

  ConceptualDetails(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConceptualDetails fromValue(String text) {
    for (ConceptualDetails b : ConceptualDetails.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

