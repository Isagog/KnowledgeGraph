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
 * Entity classification
 */
@ApiModel(description = "Entity classification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-03T13:37:24.989+02:00[Europe/Berlin]")
public class ClassificationStatement extends EntityStatement  {
  @JsonProperty("concept")
  private String concept;

  public ClassificationStatement concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Get concept
   * @return concept
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationStatement classificationStatement = (ClassificationStatement) o;
    return Objects.equals(this.concept, classificationStatement.concept) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concept, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
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

