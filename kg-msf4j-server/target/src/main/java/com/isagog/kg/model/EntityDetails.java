package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EntityDetails
 */
public enum EntityDetails {
  
  FULL("FULL"),
  
  DATA("DATA"),
  
  LABELS("LABELS");

  private String value;

  EntityDetails(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntityDetails fromValue(String text) {
    for (EntityDetails b : EntityDetails.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

