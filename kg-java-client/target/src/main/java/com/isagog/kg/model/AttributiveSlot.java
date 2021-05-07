/*
 * Isagog Knowledge Service
 * Isagog Knowledge Graph Ontology service
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
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.Comparator;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.RelationalSlot;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot bound to an Attribute (data property)
 */
@ApiModel(description = "A slot bound to an Attribute (data property)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.592+02:00[Europe/Berlin]")
public class AttributiveSlot extends Slot {
  public static final String SERIALIZED_NAME_SUBJECT_BINDING = "subjectBinding";
  @SerializedName(SERIALIZED_NAME_SUBJECT_BINDING)
  private String subjectBinding;

  public static final String SERIALIZED_NAME_SUBJECT_CONSTRAINTS = "subjectConstraints";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CONSTRAINTS)
  private List<URI> subjectConstraints = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_COMPARATION = "comparation";
  @SerializedName(SERIALIZED_NAME_COMPARATION)
  private Comparator comparation = Comparator.EQUAL;

  public AttributiveSlot() {
    this.ktype = this.getClass().getSimpleName();
  }

  public AttributiveSlot subjectBinding(String subjectBinding) {
    
    this.subjectBinding = subjectBinding;
    return this;
  }

   /**
   * Slot&#39;s subject binding
   * @return subjectBinding
  **/
  @ApiModelProperty(required = true, value = "Slot's subject binding")

  public String getSubjectBinding() {
    return subjectBinding;
  }


  public void setSubjectBinding(String subjectBinding) {
    this.subjectBinding = subjectBinding;
  }


  public AttributiveSlot subjectConstraints(List<URI> subjectConstraints) {
    
    this.subjectConstraints = subjectConstraints;
    return this;
  }

  public AttributiveSlot addSubjectConstraintsItem(URI subjectConstraintsItem) {
    if (this.subjectConstraints == null) {
      this.subjectConstraints = new ArrayList<>();
    }
    this.subjectConstraints.add(subjectConstraintsItem);
    return this;
  }

   /**
   * Domain constraints
   * @return subjectConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Domain constraints")

  public List<URI> getSubjectConstraints() {
    return subjectConstraints;
  }


  public void setSubjectConstraints(List<URI> subjectConstraints) {
    this.subjectConstraints = subjectConstraints;
  }


  public AttributiveSlot value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Constant data value (opt)
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constant data value (opt)")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public AttributiveSlot comparation(Comparator comparation) {
    
    this.comparation = comparation;
    return this;
  }

   /**
   * Get comparation
   * @return comparation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Comparator getComparation() {
    return comparation;
  }


  public void setComparation(Comparator comparation) {
    this.comparation = comparation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributiveSlot attributiveSlot = (AttributiveSlot) o;
    return Objects.equals(this.subjectBinding, attributiveSlot.subjectBinding) &&
        Objects.equals(this.subjectConstraints, attributiveSlot.subjectConstraints) &&
        Objects.equals(this.value, attributiveSlot.value) &&
        Objects.equals(this.comparation, attributiveSlot.comparation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, subjectConstraints, value, comparation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributiveSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    subjectConstraints: ").append(toIndentedString(subjectConstraints)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comparation: ").append(toIndentedString(comparation)).append("\n");
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
