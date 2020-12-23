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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.QueryExpression;
import com.isagog.kg.model.QueryFrame;
import com.isagog.kg.model.QueryKeywords;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Keyword-based search
 */
@ApiModel(description = "Keyword-based search")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T10:03:50.861+01:00[Europe/Berlin]")
public class QueryKeywords extends Query {
  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys = new ArrayList<String>();

  /**
   * The search operator; OR &#x3D; at least one match, AND &#x3D; complete match, EXCEPT &#x3D; match the first value but not the others
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    OR("OR"),
    
    AND("AND"),
    
    EXCEPT("EXCEPT");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OpEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private OpEnum op = OpEnum.OR;

  public QueryKeywords() {
    this.qtype = this.getClass().getSimpleName();
  }

  public QueryKeywords keys(List<String> keys) {
    
    this.keys = keys;
    return this;
  }

  public QueryKeywords addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getKeys() {
    return keys;
  }


  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  public QueryKeywords op(OpEnum op) {
    
    this.op = op;
    return this;
  }

   /**
   * The search operator; OR &#x3D; at least one match, AND &#x3D; complete match, EXCEPT &#x3D; match the first value but not the others
   * @return op
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The search operator; OR = at least one match, AND = complete match, EXCEPT = match the first value but not the others")

  public OpEnum getOp() {
    return op;
  }


  public void setOp(OpEnum op) {
    this.op = op;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryKeywords queryKeywords = (QueryKeywords) o;
    return Objects.equals(this.keys, queryKeywords.keys) &&
        Objects.equals(this.op, queryKeywords.op) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, op, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryKeywords {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

