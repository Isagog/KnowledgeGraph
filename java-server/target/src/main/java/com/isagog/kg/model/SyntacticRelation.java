package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.SyntacticDependency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Governor&#39;s syntactin role
 */
@ApiModel(description = "Governor's syntactin role")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.326+01:00[Europe/Berlin]")
public class SyntacticRelation extends DependencyAnnotation  {
  @JsonProperty("tag")
  private SyntacticDependency tag;

  @JsonProperty("extension")
  private String extension;

  public SyntacticRelation tag(SyntacticDependency tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "")
  public SyntacticDependency getTag() {
    return tag;
  }

  public void setTag(SyntacticDependency tag) {
    this.tag = tag;
  }

  public SyntacticRelation extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Further details or non UD tag
   * @return extension
  **/
  @ApiModelProperty(value = "Further details or non UD tag")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntacticRelation syntacticRelation = (SyntacticRelation) o;
    return Objects.equals(this.tag, syntacticRelation.tag) &&
        Objects.equals(this.extension, syntacticRelation.extension) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, extension, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntacticRelation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

