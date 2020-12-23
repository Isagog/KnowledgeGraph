package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data query
 */
@ApiModel(description = "Data query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:51.221+01:00[Europe/Berlin]")
public class Query   {
  @JsonProperty("qtype")
  private String qtype;

  public Query qtype(String qtype) {
    this.qtype = qtype;
    return this;
  }

   /**
   * Get qtype
   * @return qtype
  **/
  @ApiModelProperty(required = true, value = "")
  public String getQtype() {
    return qtype;
  }

  public void setQtype(String qtype) {
    this.qtype = qtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.qtype, query.qtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    qtype: ").append(toIndentedString(qtype)).append("\n");
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

