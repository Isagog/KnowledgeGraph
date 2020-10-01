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
import com.isagog.kg.model.AtomicConcept;
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveConcept;
import com.isagog.kg.model.AttributiveStatement;
import com.isagog.kg.model.ClassificationStatement;
import com.isagog.kg.model.ConceptStatement;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalConcept;
import com.isagog.kg.model.RelationalStatement;
import com.isagog.kg.model.Situation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Unary attributive classifier
 */
@ApiModel(description = "Unary attributive classifier")
@JsonPropertyOrder({
  AttributiveConcept.JSON_PROPERTY_ATTRIBUTE,
  AttributiveConcept.JSON_PROPERTY_VALUE,
  AttributiveConcept.JSON_PROPERTY_CONSTRAINT
})
@JsonTypeName("AttributiveConcept")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "ktype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AtomicConcept.class, name = "AtomicConcept"),
  @JsonSubTypes.Type(value = Attribute.class, name = "Attribute"),
  @JsonSubTypes.Type(value = AttributiveConcept.class, name = "AttributiveConcept"),
  @JsonSubTypes.Type(value = AttributiveStatement.class, name = "AttributiveStatement"),
  @JsonSubTypes.Type(value = ClassificationStatement.class, name = "ClassificationStatement"),
  @JsonSubTypes.Type(value = ConceptStatement.class, name = "ConceptStatement"),
  @JsonSubTypes.Type(value = Entity.class, name = "Entity"),
  @JsonSubTypes.Type(value = EntityStatement.class, name = "EntityStatement"),
  @JsonSubTypes.Type(value = Relation.class, name = "Relation"),
  @JsonSubTypes.Type(value = RelationalConcept.class, name = "RelationalConcept"),
  @JsonSubTypes.Type(value = RelationalStatement.class, name = "RelationalStatement"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
})

public class AttributiveConcept extends KnowledgeElement {
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private String attribute;

  public static final String JSON_PROPERTY_VALUE = "value";
  private byte[] value;

  /**
   * Gets or Sets constraint
   */
  public enum ConstraintEnum {
    SOME("SOME"),
    
    EQUALS("EQUALS"),
    
    GREATER_THAN("GREATER_THAN"),
    
    SMALLER_THAN("SMALLER_THAN");

    private String value;

    ConstraintEnum(String value) {
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
    public static ConstraintEnum fromValue(String value) {
      for (ConstraintEnum b : ConstraintEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSTRAINT = "constraint";
  private ConstraintEnum constraint = ConstraintEnum.SOME;


  public AttributiveConcept attribute(String attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttribute() {
    return attribute;
  }


  public void setAttribute(String attribute) {
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
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

