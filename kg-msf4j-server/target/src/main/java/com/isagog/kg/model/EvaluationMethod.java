package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EvaluationMethod
 */
public enum EvaluationMethod {
  
  DEDUCTION("DEDUCTION"),
  
  ABDUCTION("ABDUCTION");

  private String value;

  EvaluationMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EvaluationMethod fromValue(String text) {
    for (EvaluationMethod b : EvaluationMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

