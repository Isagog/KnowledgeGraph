package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Slot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A slot bound to a concept
 */
@ApiModel(description = "A slot bound to a concept")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class ConceptualSlot extends Slot  {
  @JsonProperty("individual")
  private Boolean individual = false;

  @JsonProperty("constraints")
  private List<URI> constraints = null;

  @JsonProperty("root")
  private Boolean root = false;

  public ConceptualSlot individual(Boolean individual) {
    this.individual = individual;
    return this;
  }

   /**
   * True if references an entity, false (default) if references a concept
   * @return individual
  **/
  @ApiModelProperty(value = "True if references an entity, false (default) if references a concept")
  public Boolean isIndividual() {
    return individual;
  }

  public void setIndividual(Boolean individual) {
    this.individual = individual;
  }

  public ConceptualSlot constraints(List<URI> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ConceptualSlot addConstraintsItem(URI constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraint concepts
   * @return constraints
  **/
  @ApiModelProperty(value = "Constraint concepts")
  public List<URI> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<URI> constraints) {
    this.constraints = constraints;
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
  public Boolean isRoot() {
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
    return Objects.equals(this.individual, conceptualSlot.individual) &&
        Objects.equals(this.constraints, conceptualSlot.constraints) &&
        Objects.equals(this.root, conceptualSlot.root) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individual, constraints, root, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptualSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

