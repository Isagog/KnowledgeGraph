package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.PredicateStatement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary classifier
 */
@ApiModel(description = "Unary classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class Concept extends KnowledgeElement  {
  @JsonProperty("id")
  private URI id;

  @JsonProperty("statements")
  private List<PredicateStatement> statements = null;

  public Concept id(URI id) {
    this.id = id;
    return this;
  }

   /**
   * Concept identifier (uri)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Concept identifier (uri)")
  public URI getId() {
    return id;
  }

  public void setId(URI id) {
    this.id = id;
  }

  public Concept statements(List<PredicateStatement> statements) {
    this.statements = statements;
    return this;
  }

  public Concept addStatementsItem(PredicateStatement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<PredicateStatement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public List<PredicateStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<PredicateStatement> statements) {
    this.statements = statements;
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
    return Objects.equals(this.id, concept.id) &&
        Objects.equals(this.statements, concept.statements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

