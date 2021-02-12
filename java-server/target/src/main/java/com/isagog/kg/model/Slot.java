package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:33.397+01:00[Europe/Berlin]")
public class Slot extends KnowledgeElement  {
  @JsonProperty("id")
  private String id;

  @JsonProperty("predicates")
  private List<String> predicates = null;

  @JsonProperty("required")
  private Boolean required = true;

  public Slot id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Slot identifier, must be frame-unique
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Slot identifier, must be frame-unique")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Slot predicates(List<String> predicates) {
    this.predicates = predicates;
    return this;
  }

  public Slot addPredicatesItem(String predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<String>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * Constraint predicates
   * @return predicates
  **/
  @ApiModelProperty(value = "Constraint predicates")
  public List<String> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<String> predicates) {
    this.predicates = predicates;
  }

  public Slot required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Tells if the slot should be instantiated in order for the frame to be processed
   * @return required
  **/
  @ApiModelProperty(value = "Tells if the slot should be instantiated in order for the frame to be processed")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
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
        Objects.equals(this.predicates, slot.predicates) &&
        Objects.equals(this.required, slot.required) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, predicates, required, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

