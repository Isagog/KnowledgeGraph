package com.isagog.kg.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Interaction response type
 */
public enum ResponseType {
  
  QUERY_ANSWER("QUERY_ANSWER"),
  
  SEARCH_ANSWER("SEARCH_ANSWER"),
  
  UPDATE_ACKNOWLEDGE("UPDATE_ACKNOWLEDGE"),
  
  ERROR("ERROR");

  private String value;

  ResponseType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ResponseType fromValue(String text) {
    for (ResponseType b : ResponseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

