package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.AttributiveSlot;
import com.isagog.kg.model.ConceptualSlot;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.RelationalSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Conceptual pattern, e.g. a query or a form
 */
@ApiModel(description = "Conceptual pattern, e.g. a query or a form")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Frame extends KnowledgeElement  {
  @JsonProperty("conceptualSlots")
  private List<ConceptualSlot> conceptualSlots = null;

  @JsonProperty("relationalSlots")
  private List<RelationalSlot> relationalSlots = null;

  @JsonProperty("attributiveSlots")
  private List<AttributiveSlot> attributiveSlots = null;

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

