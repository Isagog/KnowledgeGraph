package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity relatedness
 */
@ApiModel(description = "Entity relatedness")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class RelationalStatement extends EntityStatement  {
  @JsonProperty("relation")
  private String relation;

  @JsonProperty("entity")
  private String entity;

  public RelationalStatement relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Ontology relation
   * @return relation
  **/
  @ApiModelProperty(required = true, value = "Ontology relation")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public RelationalStatement entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Related entity
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "Related entity")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalStatement relationalStatement = (RelationalStatement) o;
    return Objects.equals(this.relation, relationalStatement.relation) &&
        Objects.equals(this.entity, relationalStatement.entity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, entity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

