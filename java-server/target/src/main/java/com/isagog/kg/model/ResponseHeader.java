package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.ValueType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Query result set header
 */
@ApiModel(description = "Query result set header")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-06T07:45:04.008+01:00[Europe/Berlin]")
public class ResponseHeader   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("dtype")
  private ValueType dtype;

  public ResponseHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseHeader dtype(ValueType dtype) {
    this.dtype = dtype;
    return this;
  }

   /**
   * Get dtype
   * @return dtype
  **/
  @ApiModelProperty(value = "")
  public ValueType getDtype() {
    return dtype;
  }

  public void setDtype(ValueType dtype) {
    this.dtype = dtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeader responseHeader = (ResponseHeader) o;
    return Objects.equals(this.name, responseHeader.name) &&
        Objects.equals(this.dtype, responseHeader.dtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeader {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
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

