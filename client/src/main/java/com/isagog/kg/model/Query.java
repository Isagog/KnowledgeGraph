/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.Situation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Query frame
 */
@ApiModel(description = "Query frame")
@JsonPropertyOrder({
  Query.JSON_PROPERTY_QTYPE
})
@JsonTypeName("Query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T16:26:39.961968100+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "ftype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Query.class, name = "Query"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
})

public class Query extends Frame {
  /**
   * Gets or Sets qtype
   */
  public enum QtypeEnum {
    INDIVIDUATIONQUERY("IndividuationQuery"),
    
    CARDINALITYQUERY("CardinalityQuery"),
    
    EXTENSIONQUERY("ExtensionQuery");

    private String value;

    QtypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QtypeEnum fromValue(String value) {
      for (QtypeEnum b : QtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QTYPE = "qtype";
  private QtypeEnum qtype;


  public Query qtype(QtypeEnum qtype) {
    
    this.qtype = qtype;
    return this;
  }

   /**
   * Get qtype
   * @return qtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QtypeEnum getQtype() {
    return qtype;
  }


  public void setQtype(QtypeEnum qtype) {
    this.qtype = qtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.qtype, query.qtype) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtype, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qtype: ").append(toIndentedString(qtype)).append("\n");
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

