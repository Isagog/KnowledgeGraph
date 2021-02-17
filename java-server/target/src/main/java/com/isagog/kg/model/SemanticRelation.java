package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.PredicativeRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Governor&#39;s semantic role
 */
@ApiModel(description = "Governor's semantic role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T19:24:07.519+01:00[Europe/Berlin]")
public class SemanticRelation extends DependencyAnnotation  {
  @JsonProperty("predicate")
  private String predicate;

  @JsonProperty("role")
  private PredicativeRoles role;

  public SemanticRelation predicate(String predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Ontology predicate (relation or attribute)
   * @return predicate
  **/
  @ApiModelProperty(required = true, value = "Ontology predicate (relation or attribute)")
  public String getPredicate() {
    return predicate;
  }

  public void setPredicate(String predicate) {
    this.predicate = predicate;
  }

  public SemanticRelation role(PredicativeRoles role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public PredicativeRoles getRole() {
    return role;
  }

  public void setRole(PredicativeRoles role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRelation semanticRelation = (SemanticRelation) o;
    return Objects.equals(this.predicate, semanticRelation.predicate) &&
        Objects.equals(this.role, semanticRelation.role) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, role, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRelation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

