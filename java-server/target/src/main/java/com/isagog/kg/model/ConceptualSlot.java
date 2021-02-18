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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-18T10:42:13.655+01:00[Europe/Berlin]")
public class ConceptualSlot extends Slot  {
  @JsonProperty("entity")
  private String entity;

  @JsonProperty("individual")
  private Boolean individual = false;

  @JsonProperty("root")
  private Boolean root = false;

  public ConceptualSlot entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Entity reference (opt)
   * @return entity
  **/
  @ApiModelProperty(value = "Entity reference (opt)")
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
   * Individual (vs. predicative) slot
   * @return individual
  **/
  @ApiModelProperty(value = "Individual (vs. predicative) slot")
  public Boolean getIndividual() {
    return individual;
  }

  public void setIndividual(Boolean individual) {
    this.individual = individual;
  }

  public ConceptualSlot root(Boolean root) {
    this.root = root;
    return this;
  }

   /**
   * Distinguished root slot
   * @return root
  **/
  @ApiModelProperty(value = "Distinguished root slot")
  public Boolean getRoot() {
    return root;
  }

  public void setRoot(Boolean root) {
    this.root = root;
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
        Objects.equals(this.root, conceptualSlot.root) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, individual, root, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptualSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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

