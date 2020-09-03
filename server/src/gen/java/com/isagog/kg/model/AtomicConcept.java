package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.ConceptStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Unary atomic classifier
 */
@ApiModel(description = "Unary atomic classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class AtomicConcept extends KnowledgeElement  {
  @JsonProperty("statements")
  private List<ConceptStatement> statements = null;

  public AtomicConcept statements(List<ConceptStatement> statements) {
    this.statements = statements;
    return this;
  }

  public AtomicConcept addStatementsItem(ConceptStatement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<ConceptStatement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public List<ConceptStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<ConceptStatement> statements) {
    this.statements = statements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtomicConcept atomicConcept = (AtomicConcept) o;
    return Objects.equals(this.statements, atomicConcept.statements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtomicConcept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

