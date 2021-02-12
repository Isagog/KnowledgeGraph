package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Knowledge statement
 */
@ApiModel(description = "Knowledge statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:33.397+01:00[Europe/Berlin]")
public class Statement extends KnowledgeElement  {
  @JsonProperty("subject")
  private String subject;

  @JsonProperty("predicate")
  private String predicate;

  @JsonProperty("value")
  private String value;

  @JsonProperty("provenance")
  private String provenance;

  @JsonProperty("support")
  private Double support;

  public Statement subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject id
   * @return subject
  **/
  @ApiModelProperty(value = "Subject id")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Statement predicate(String predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Ontology relation or attribute
   * @return predicate
  **/
  @ApiModelProperty(value = "Ontology relation or attribute")
  public String getPredicate() {
    return predicate;
  }

  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }

  public Statement value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Object entity id or attribute value
   * @return value
  **/
  @ApiModelProperty(value = "Object entity id or attribute value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Statement provenance(String provenance) {
    this.provenance = provenance;
    return this;
  }

   /**
   * Get provenance
   * @return provenance
  **/
  @ApiModelProperty(value = "")
  public String getProvenance() {
    return provenance;
  }

  public void setProvenance(String provenance) {
    this.provenance = provenance;
  }

  public Statement support(Double support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * minimum: 0.0
   * maximum: 1.0
   * @return support
  **/
  @ApiModelProperty(value = "")
  public Double getSupport() {
    return support;
  }

  public void setSupport(Double support) {
    this.support = support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.subject, statement.subject) &&
        Objects.equals(this.predicate, statement.predicate) &&
        Objects.equals(this.value, statement.value) &&
        Objects.equals(this.provenance, statement.provenance) &&
        Objects.equals(this.support, statement.support) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, predicate, value, provenance, support, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

