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
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalSlot;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Conceptual pattern, e.g. a query or a form
 */
@ApiModel(description = "Conceptual pattern, e.g. a query or a form")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:37.592+02:00[Europe/Berlin]")
public class Frame extends KnowledgeElement {
  public static final String SERIALIZED_NAME_CONCEPTUAL_SLOTS = "conceptualSlots";
  @SerializedName(SERIALIZED_NAME_CONCEPTUAL_SLOTS)
  private List<ConceptualSlot> conceptualSlots = null;

  public static final String SERIALIZED_NAME_RELATIONAL_SLOTS = "relationalSlots";
  @SerializedName(SERIALIZED_NAME_RELATIONAL_SLOTS)
  private List<RelationalSlot> relationalSlots = null;

  public static final String SERIALIZED_NAME_ATTRIBUTIVE_SLOTS = "attributiveSlots";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTIVE_SLOTS)
  private List<AttributiveSlot> attributiveSlots = null;

  public Frame() {
    this.ktype = this.getClass().getSimpleName();
  }

  public Frame conceptualSlots(List<ConceptualSlot> conceptualSlots) {
    
    this.conceptualSlots = conceptualSlots;
    return this;
  }

  public Frame addConceptualSlotsItem(ConceptualSlot conceptualSlotsItem) {
    if (this.conceptualSlots == null) {
      this.conceptualSlots = new ArrayList<>();
    }
    this.conceptualSlots.add(conceptualSlotsItem);
    return this;
  }

   /**
   * Conceptual elements
   * @return conceptualSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conceptual elements")

  public List<ConceptualSlot> getConceptualSlots() {
    return conceptualSlots;
  }


  public void setConceptualSlots(List<ConceptualSlot> conceptualSlots) {
    this.conceptualSlots = conceptualSlots;
  }


  public Frame relationalSlots(List<RelationalSlot> relationalSlots) {
    
    this.relationalSlots = relationalSlots;
    return this;
  }

  public Frame addRelationalSlotsItem(RelationalSlot relationalSlotsItem) {
    if (this.relationalSlots == null) {
      this.relationalSlots = new ArrayList<>();
    }
    this.relationalSlots.add(relationalSlotsItem);
    return this;
  }

   /**
   * Relational elements
   * @return relationalSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relational elements")

  public List<RelationalSlot> getRelationalSlots() {
    return relationalSlots;
  }


  public void setRelationalSlots(List<RelationalSlot> relationalSlots) {
    this.relationalSlots = relationalSlots;
  }


  public Frame attributiveSlots(List<AttributiveSlot> attributiveSlots) {
    
    this.attributiveSlots = attributiveSlots;
    return this;
  }

  public Frame addAttributiveSlotsItem(AttributiveSlot attributiveSlotsItem) {
    if (this.attributiveSlots == null) {
      this.attributiveSlots = new ArrayList<>();
    }
    this.attributiveSlots.add(attributiveSlotsItem);
    return this;
  }

   /**
   * Attributive elements
   * @return attributiveSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributive elements")

  public List<AttributiveSlot> getAttributiveSlots() {
    return attributiveSlots;
  }


  public void setAttributiveSlots(List<AttributiveSlot> attributiveSlots) {
    this.attributiveSlots = attributiveSlots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Frame frame = (Frame) o;
    return Objects.equals(this.conceptualSlots, frame.conceptualSlots) &&
        Objects.equals(this.relationalSlots, frame.relationalSlots) &&
        Objects.equals(this.attributiveSlots, frame.attributiveSlots) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conceptualSlots, relationalSlots, attributiveSlots, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    conceptualSlots: ").append(toIndentedString(conceptualSlots)).append("\n");
    sb.append("    relationalSlots: ").append(toIndentedString(relationalSlots)).append("\n");
    sb.append("    attributiveSlots: ").append(toIndentedString(attributiveSlots)).append("\n");
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

