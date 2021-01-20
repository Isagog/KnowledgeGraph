package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.TokenAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Token dependency
 */
@ApiModel(description = "Token dependency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-20T12:31:14.314+01:00[Europe/Berlin]")
public class DependencyAnnotation extends TokenAnnotation  {
  @JsonProperty("dtype")
  private String dtype;

  @JsonProperty("governor")
  private Integer governor;

  public DependencyAnnotation dtype(String dtype) {
    this.dtype = dtype;
    return this;
  }

   /**
   * Get dtype
   * @return dtype
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDtype() {
    return dtype;
  }

  public void setDtype(String dtype) {
    this.dtype = dtype;
  }

  public DependencyAnnotation governor(Integer governor) {
    this.governor = governor;
    return this;
  }

   /**
   * Head index of the governor's token
   * minimum: 0
   * @return governor
  **/
  @ApiModelProperty(required = true, value = "Head index of the governor's token")
  public Integer getGovernor() {
    return governor;
  }

  public void setGovernor(Integer governor) {
    this.governor = governor;
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
    return Objects.equals(this.dtype, dependencyAnnotation.dtype) &&
        Objects.equals(this.governor, dependencyAnnotation.governor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtype, governor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
    sb.append("    governor: ").append(toIndentedString(governor)).append("\n");
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

