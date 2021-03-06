package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Classifier;
import com.isagog.kg.model.Comparator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Quantifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary classifier, can be atomic, or defined as a restriction on Relation or Attributes
 */
@ApiModel(description = "Unary classifier, can be atomic, or defined as a restriction on Relation or Attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Concept extends Classifier  {
  @JsonProperty("property")
  private URI property;

  @JsonProperty("related")
  private URI related;

  @JsonProperty("quantifier")
  private Quantifier quantifier;

  @JsonProperty("value")
  private String value;

  @JsonProperty("constraint")
  private Comparator constraint = Comparator.EQUAL;

  public Concept property(URI property) {
    this.property = property;
    return this;
  }

   /**
   * For relationsl concepts, the relation or attribute identifier (opt)
   * @return property
  **/
  @ApiModelProperty(value = "For relationsl concepts, the relation or attribute identifier (opt)")
  public URI getProperty() {
    return property;
  }

  public void setProperty(URI property) {
    this.property = property;
  }

  public Concept related(URI related) {
    this.related = related;
    return this;
  }

   /**
   * For relational concepts, the restriction concept (opt)
   * @return related
  **/
  @ApiModelProperty(value = "For relational concepts, the restriction concept (opt)")
  public URI getRelated() {
    return related;
  }

  public void setRelated(URI related) {
    this.related = related;
  }

  public Concept quantifier(Quantifier quantifier) {
    this.quantifier = quantifier;
    return this;
  }

   /**
   * Get quantifier
   * @return quantifier
  **/
  @ApiModelProperty(value = "")
  public Quantifier getQuantifier() {
    return quantifier;
  }

  public void setQuantifier(Quantifier quantifier) {
    this.quantifier = quantifier;
  }

  public Concept value(String value) {
    this.value = value;
    return this;
  }

   /**
   * For attributive concepts, the restriction value (opt)
   * @return value
  **/
  @ApiModelProperty(value = "For attributive concepts, the restriction value (opt)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Concept constraint(Comparator constraint) {
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @ApiModelProperty(value = "")
  public Comparator getConstraint() {
    return constraint;
  }

  public void setConstraint(Comparator constraint) {
    this.constraint = constraint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concept concept = (Concept) o;
    return Objects.equals(this.property, concept.property) &&
        Objects.equals(this.related, concept.related) &&
        Objects.equals(this.quantifier, concept.quantifier) &&
        Objects.equals(this.value, concept.value) &&
        Objects.equals(this.constraint, concept.constraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, related, quantifier, value, constraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    quantifier: ").append(toIndentedString(quantifier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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

