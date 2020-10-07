package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Token semantic dependency
 */
@ApiModel(description = "Token semantic dependency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class RelationAnnotation extends DependencyAnnotation  {
  @JsonProperty("relation")
  private String relation;

  public RelationAnnotation relation(String relation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationAnnotation relationAnnotation = (RelationAnnotation) o;
    return Objects.equals(this.relation, relationAnnotation.relation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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

