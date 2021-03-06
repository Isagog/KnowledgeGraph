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
 * A slot bound to a relation (property)
 */
@ApiModel(description = "A slot bound to a relation (property)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.592+02:00[Europe/Berlin]")
public class RelationalSlot extends Slot {
  public static final String SERIALIZED_NAME_SUBJECT_BINDING = "subjectBinding";
  @SerializedName(SERIALIZED_NAME_SUBJECT_BINDING)
  private String subjectBinding;

  public static final String SERIALIZED_NAME_OBJECT_BINDING = "objectBinding";
  @SerializedName(SERIALIZED_NAME_OBJECT_BINDING)
  private String objectBinding;

  public static final String SERIALIZED_NAME_SUBJECT_CONSTRAINTS = "subjectConstraints";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CONSTRAINTS)
  private List<URI> subjectConstraints = null;

  public static final String SERIALIZED_NAME_OBJECT_CONSTRAINTS = "objectConstraints";
  @SerializedName(SERIALIZED_NAME_OBJECT_CONSTRAINTS)
  private List<URI> objectConstraints = null;

  public RelationalSlot() {
    this.ktype = this.getClass().getSimpleName();
  }

  public RelationalSlot subjectBinding(String subjectBinding) {
    
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


  public RelationalSlot objectBinding(String objectBinding) {
    
    this.objectBinding = objectBinding;
    return this;
  }

   /**
   * Slot&#39;s object binding
   * @return objectBinding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Slot's object binding")

  public String getObjectBinding() {
    return objectBinding;
  }


  public void setObjectBinding(String objectBinding) {
    this.objectBinding = objectBinding;
  }


  public RelationalSlot subjectConstraints(List<URI> subjectConstraints) {
    
    this.subjectConstraints = subjectConstraints;
    return this;
  }

  public RelationalSlot addSubjectConstraintsItem(URI subjectConstraintsItem) {
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


  public RelationalSlot objectConstraints(List<URI> objectConstraints) {
    
    this.objectConstraints = objectConstraints;
    return this;
  }

  public RelationalSlot addObjectConstraintsItem(URI objectConstraintsItem) {
    if (this.objectConstraints == null) {
      this.objectConstraints = new ArrayList<>();
    }
    this.objectConstraints.add(objectConstraintsItem);
    return this;
  }

   /**
   * Range constraints
   * @return objectConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Range constraints")

  public List<URI> getObjectConstraints() {
    return objectConstraints;
  }


  public void setObjectConstraints(List<URI> objectConstraints) {
    this.objectConstraints = objectConstraints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalSlot relationalSlot = (RelationalSlot) o;
    return Objects.equals(this.subjectBinding, relationalSlot.subjectBinding) &&
        Objects.equals(this.objectBinding, relationalSlot.objectBinding) &&
        Objects.equals(this.subjectConstraints, relationalSlot.subjectConstraints) &&
        Objects.equals(this.objectConstraints, relationalSlot.objectConstraints) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectBinding, objectBinding, subjectConstraints, objectConstraints, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subjectBinding: ").append(toIndentedString(subjectBinding)).append("\n");
    sb.append("    objectBinding: ").append(toIndentedString(objectBinding)).append("\n");
    sb.append("    subjectConstraints: ").append(toIndentedString(subjectConstraints)).append("\n");
    sb.append("    objectConstraints: ").append(toIndentedString(objectConstraints)).append("\n");
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

