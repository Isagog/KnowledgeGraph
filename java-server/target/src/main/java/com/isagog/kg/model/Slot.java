package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Framed conceptual element
 */
@ApiModel(description = "Framed conceptual element")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-11T17:00:59.973+01:00[Europe/Berlin]")
public class Slot extends KnowledgeElement  {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("predicate")
  private String predicate;

  @JsonProperty("required")
  private Boolean required = false;

  @JsonProperty("informative")
  private Boolean informative = false;

  public Slot id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Slot identifier, must be frame-unique
   * minimum: 0
   * maximum: 128
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Slot identifier, must be frame-unique")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Slot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Slot pretty name (opt)
   * @return name
  **/
  @ApiModelProperty(value = "Slot pretty name (opt)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Slot predicate(String predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Predicate identifier, should be a valid id in a known ontology
   * @return predicate
  **/
  @ApiModelProperty(value = "Predicate identifier, should be a valid id in a known ontology")
  public String getPredicate() {
    return predicate;
  }

  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }

  public Slot required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Tells if the slot must be instantiated in order for the frame to make sense
   * @return required
  **/
  @ApiModelProperty(value = "Tells if the slot must be instantiated in order for the frame to make sense")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public Slot informative(Boolean informative) {
    this.informative = informative;
    return this;
  }

   /**
   * Tells whether slot's values contribute to frame's meaning
   * @return informative
  **/
  @ApiModelProperty(value = "Tells whether slot's values contribute to frame's meaning")
  public Boolean getInformative() {
    return informative;
  }

  public void setInformative(Boolean informative) {
    this.informative = informative;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slot slot = (Slot) o;
    return Objects.equals(this.id, slot.id) &&
        Objects.equals(this.name, slot.name) &&
        Objects.equals(this.predicate, slot.predicate) &&
        Objects.equals(this.required, slot.required) &&
        Objects.equals(this.informative, slot.informative) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, predicate, required, informative, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    informative: ").append(toIndentedString(informative)).append("\n");
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

