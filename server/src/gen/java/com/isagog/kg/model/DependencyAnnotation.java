package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.TextAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Token dependency
 */
@ApiModel(description = "Token dependency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-20T08:47:47.056953700+02:00[Europe/Berlin]")
public class DependencyAnnotation extends TextAnnotation  {
  @JsonProperty("governor")
  private Integer governor;

  @JsonProperty("dependent")
  private Integer dependent;

  public DependencyAnnotation governor(Integer governor) {
    this.governor = governor;
    return this;
  }

   /**
   * Index of the governor token annotation
   * @return governor
  **/
  @ApiModelProperty(required = true, value = "Index of the governor token annotation")
  public Integer getGovernor() {
    return governor;
  }

  public void setGovernor(Integer governor) {
    this.governor = governor;
  }

  public DependencyAnnotation dependent(Integer dependent) {
    this.dependent = dependent;
    return this;
  }

   /**
   * Index of the dependent token annotation
   * @return dependent
  **/
  @ApiModelProperty(required = true, value = "Index of the dependent token annotation")
  public Integer getDependent() {
    return dependent;
  }

  public void setDependent(Integer dependent) {
    this.dependent = dependent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyAnnotation dependencyAnnotation = (DependencyAnnotation) o;
    return Objects.equals(this.governor, dependencyAnnotation.governor) &&
        Objects.equals(this.dependent, dependencyAnnotation.dependent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(governor, dependent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    governor: ").append(toIndentedString(governor)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
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

