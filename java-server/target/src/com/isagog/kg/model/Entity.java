package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.KnowledgeElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Individual entity
 */
@ApiModel(description = "Individual entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class Entity extends KnowledgeElement  {
  @JsonProperty("id")
  private URI id;

  @JsonProperty("statements")
  private List<EntityStatement> statements = null;

  public Entity id(URI id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public URI getId() {
    return id;
  }

  public void setId(URI id) {
    this.id = id;
  }

  public Entity statements(List<EntityStatement> statements) {
    this.statements = statements;
    return this;
  }

  public Entity addStatementsItem(EntityStatement statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<EntityStatement>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(value = "")
  public List<EntityStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<EntityStatement> statements) {
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
    return Objects.equals(this.id, entity.id) &&
        Objects.equals(this.statements, entity.statements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
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

