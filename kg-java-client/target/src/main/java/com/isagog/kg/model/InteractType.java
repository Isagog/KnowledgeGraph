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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Interaction conceptual types
 */
@JsonAdapter(InteractType.Adapter.class)
public enum InteractType {
  
  EXPRESSION("EXPRESSION"),
  
  VALUE("VALUE"),
  
  ENTITY("ENTITY"),
  
  CONCEPT("CONCEPT"),
  
  RELATION("RELATION"),
  
  ATTRIBUTE("ATTRIBUTE"),
  
  FRAME("FRAME"),
  
  CONNECTIVE("CONNECTIVE");

  private String value;

  InteractType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InteractType fromValue(String value) {
    for (InteractType b : InteractType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InteractType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InteractType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InteractType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InteractType.fromValue(value);
    }
  }
}

