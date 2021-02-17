package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot bound to a concept
 */
@ApiModel(description = "A slot bound to a concept")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T18:16:25.422+01:00[Europe/Berlin]")
public class ConceptualSlot extends Slot  {
  @JsonProperty("entity")
  private String entity;

  @JsonProperty("individual")
  private Boolean individual = false;

  public ConceptualSlot entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Constant entity reference (opt)
   * @return entity
  **/
  @ApiModelProperty(value = "Constant entity reference (opt)")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public ConceptualSlot individual(Boolean individual) {
    this.individual = individual;
    return this;
  }

   /**
   * Tells if the entity value is required
   * @return individual
  **/
  @ApiModelProperty(value = "Tells if the entity value is required")
  public Boolean getIndividual() {
    return individual;
  }

  public void setIndividual(Boolean individual) {
    this.individual = individual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptualSlot conceptualSlot = (ConceptualSlot) o;
    return Objects.equals(this.entity, conceptualSlot.entity) &&
        Objects.equals(this.individual, conceptualSlot.individual) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, individual, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptualSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
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

