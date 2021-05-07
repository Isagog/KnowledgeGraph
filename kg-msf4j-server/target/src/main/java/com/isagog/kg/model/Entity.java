package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Individual entity
 */
@ApiModel(description = "Individual entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:01.705+02:00[Europe/Berlin]")
public class Entity extends KnowledgeElement  {
  @JsonProperty("ns")
  private String ns;

  @JsonProperty("statements")
  private List<Statement> statements = null;

  public Entity ns(String ns) {
    this.ns = ns;
    return this;
  }

   /**
   * Namespace
   * @return ns
  **/
  @ApiModelProperty(required = true, value = "Namespace")
  public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public Entity statements(List<Statement> statements) {
    this.statements = statements;
    return this;
  }

  public Entity addStatementsItem(Statement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Statements about the entity
   * @return statements
  **/
  @ApiModelProperty(value = "Statements about the entity")
  public List<Statement> getStatements() {
    return statements;
  }

  public void setStatements(List<Statement> statements) {
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
    Entity entity = (Entity) o;
    return Objects.equals(this.ns, entity.ns) &&
        Objects.equals(this.statements, entity.statements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ns, statements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ns: ").append(toIndentedString(ns)).append("\n");
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

