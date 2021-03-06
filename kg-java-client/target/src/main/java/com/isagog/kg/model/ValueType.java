/*
 * Isagog Knowledge Graph Interaction Service
 * Isagog Knowledge Graph Interaction module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ValueType
 */
@JsonAdapter(ValueType.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ValueType fromValue(String value) {
    for (ValueType b : ValueType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ValueType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ValueType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ValueType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ValueType.fromValue(value);
    }
  }
}

