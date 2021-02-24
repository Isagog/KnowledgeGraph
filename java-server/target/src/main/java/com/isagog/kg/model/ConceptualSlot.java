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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.562+01:00[Europe/Berlin]")
public class ConceptualSlot extends Slot  {
  @JsonProperty("isIndividual")
  private Boolean isIndividual = false;

  @JsonProperty("constraints")
  private List<String> constraints = null;

  @JsonProperty("root")
  private Boolean root = false;

  public ConceptualSlot isIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
    return this;
  }

   /**
   * Tells if reference points to an individual
   * @return isIndividual
  **/
  @ApiModelProperty(value = "Tells if reference points to an individual")
  public Boolean getIsIndividual() {
    return isIndividual;
  }

  public void setIsIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public ConceptualSlot constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ConceptualSlot addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<String>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraint concepts
   * @return constraints
  **/
  @ApiModelProperty(value = "Constraint concepts")
  public List<String> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<String> constraints) {
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
    return Objects.equals(this.isIndividual, conceptualSlot.isIndividual) &&
        Objects.equals(this.constraints, conceptualSlot.constraints) &&
        Objects.equals(this.root, conceptualSlot.root) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isIndividual, constraints, root, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptualSlot {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isIndividual: ").append(toIndentedString(isIndividual)).append("\n");
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

