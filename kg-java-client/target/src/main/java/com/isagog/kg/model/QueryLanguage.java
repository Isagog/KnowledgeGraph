/*
 * Isagog Knowledge Graph Data Service
 * Isagog Knowledge Graph Data module
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
 * Query languages
 */
@JsonAdapter(QueryLanguage.Adapter.class)
public enum QueryLanguage {
  
  SPARQL("SPARQL"),
  
  GRAPHQL("GRAPHQL");

  private String value;

  QueryLanguage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryLanguage fromValue(String value) {
    for (QueryLanguage b : QueryLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryLanguage> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryLanguage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryLanguage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryLanguage.fromValue(value);
    }
  }
}

