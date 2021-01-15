package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary relational classifier
 */
@ApiModel(description = "Unary relational classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.234+01:00[Europe/Berlin]")
public class RelationalConcept extends Concept  {
  @JsonProperty("relation")
  private String relation;

  @JsonProperty("restriction")
  private String restriction;

  /**
   * Gets or Sets quantifier
   */
  public enum QuantifierEnum {
    SOME("SOME"),
    
    ALL("ALL"),
    
    ATLEAST1("ATLEAST1"),
    
    ATMOST1("ATMOST1");

    private String value;

    QuantifierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QuantifierEnum fromValue(String text) {
      for (QuantifierEnum b : QuantifierEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("quantifier")
  private QuantifierEnum quantifier;

  public RelationalConcept relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Relation identifier
   * @return relation
  **/
  @ApiModelProperty(required = true, value = "Relation identifier")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public RelationalConcept restriction(String restriction) {
    this.restriction = restriction;
    return this;
  }

   /**
   * Restriction identifier
   * @return restriction
  **/
  @ApiModelProperty(value = "Restriction identifier")
  public String getRestriction() {
    return restriction;
  }

  public void setRestriction(String restriction) {
    this.restriction = restriction;
  }

  public RelationalConcept quantifier(QuantifierEnum quantifier) {
    this.quantifier = quantifier;
    return this;
  }

   /**
   * Get quantifier
   * @return quantifier
  **/
  @ApiModelProperty(required = true, value = "")
  public QuantifierEnum getQuantifier() {
    return quantifier;
  }

  public void setQuantifier(QuantifierEnum quantifier) {
    this.quantifier = quantifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalConcept relationalConcept = (RelationalConcept) o;
    return Objects.equals(this.relation, relationalConcept.relation) &&
        Objects.equals(this.restriction, relationalConcept.restriction) &&
        Objects.equals(this.quantifier, relationalConcept.quantifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, restriction, quantifier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalConcept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    quantifier: ").append(toIndentedString(quantifier)).append("\n");
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

