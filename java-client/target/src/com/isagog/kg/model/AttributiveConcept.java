/*
 * Isagog Knowledge Graph Knowledge Service
 * Isagog Knowledge Graph Knowledge module
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
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.PredicateStatement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary attributive classifier
 */
@ApiModel(description = "Unary attributive classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T10:03:51.921+01:00[Europe/Berlin]")
public class AttributiveConcept extends Concept {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private URI attribute;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private byte[] value;

  /**
   * Gets or Sets constraint
   */
  @JsonAdapter(ConstraintEnum.Adapter.class)
  public enum ConstraintEnum {
    EQUAL("EQUAL"),
    
    GREATER_THAN("GREATER_THAN"),
    
    SMALLER_THAN("SMALLER_THAN"),
    
    SIMILAR("SIMILAR");

    private String value;

    ConstraintEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConstraintEnum fromValue(String value) {
      for (ConstraintEnum b : ConstraintEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConstraintEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConstraintEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConstraintEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConstraintEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONSTRAINT = "constraint";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT)
  private ConstraintEnum constraint = ConstraintEnum.EQUAL;

  public AttributiveConcept() {
    this.ktype = this.getClass().getSimpleName();
  }

  public AttributiveConcept attribute(URI attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(required = true, value = "")

  public URI getAttribute() {
    return attribute;
  }


  public void setAttribute(URI attribute) {
    this.attribute = attribute;
  }


  public AttributiveConcept value(byte[] value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getValue() {
    return value;
  }


  public void setValue(byte[] value) {
    this.value = value;
  }


  public AttributiveConcept constraint(ConstraintEnum constraint) {
    
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConstraintEnum getConstraint() {
    return constraint;
  }


  public void setConstraint(ConstraintEnum constraint) {
    this.constraint = constraint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveConcept attributiveConcept = (AttributiveConcept) o;
    return Objects.equals(this.attribute, attributiveConcept.attribute) &&
        Arrays.equals(this.value, attributiveConcept.value) &&
        Objects.equals(this.constraint, attributiveConcept.constraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, Arrays.hashCode(value), constraint, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveConcept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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

