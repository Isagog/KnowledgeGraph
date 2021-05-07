package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Governor's predicative role (subject or object)
 */
public enum PredicativeRoles {
  
  SUBJECT("SUBJECT"),
  
  OBJECT("OBJECT");

  private String value;

  PredicativeRoles(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PredicativeRoles fromValue(String text) {
    for (PredicativeRoles b : PredicativeRoles.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

