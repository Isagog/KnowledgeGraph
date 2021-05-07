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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Framed conceptual element
 */
@ApiModel(description = "Framed conceptual element")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Slot extends KnowledgeElement  {
  @JsonProperty("reference")
  private URI reference;

  @JsonProperty("required")
  private Boolean required = true;

  public Slot reference(URI reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Classifier id, should be a concept, a relation or an attribute
   * @return reference
  **/
  @ApiModelProperty(value = "Classifier id, should be a concept, a relation or an attribute")
  public URI getReference() {
    return reference;
  }

  public void setReference(URI reference) {
    this.reference = reference;
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
  public Boolean isRequired() {
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
    return Objects.equals(this.reference, slot.reference) &&
        Objects.equals(this.required, slot.required) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, required, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

