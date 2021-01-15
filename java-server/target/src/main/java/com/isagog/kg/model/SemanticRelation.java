package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.DependencyAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Governor&#39;s semantic role
 */
@ApiModel(description = "Governor's semantic role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class SemanticRelation extends DependencyAnnotation  {
  @JsonProperty("predicate")
  private String predicate;

  /**
   * Governor's predicative role (subject or object)
   */
  public enum RoleEnum {
    SUBJECT("SUBJECT"),
    
    OBJECT("OBJECT");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

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

  public SemanticRelation role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Governor's predicative role (subject or object)
   * @return role
  **/
  @ApiModelProperty(required = true, value = "Governor's predicative role (subject or object)")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
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

