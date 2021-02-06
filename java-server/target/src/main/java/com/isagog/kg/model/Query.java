package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data query
 */
@ApiModel(description = "Data query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-06T07:45:03.037+01:00[Europe/Berlin]")
public class Query   {
  @JsonProperty("qtype")
  private String qtype;

  @JsonProperty("limit")
  private Integer limit = -1;

  @JsonProperty("timeout")
  private Integer timeout = -1;

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

  public Query limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit results to the specified value, -1 means no limit
   * minimum: -1
   * @return limit
  **/
  @ApiModelProperty(value = "Limit results to the specified value, -1 means no limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Query timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Limits the answering time in seconds, -1 means no limit
   * minimum: -1
   * @return timeout
  **/
  @ApiModelProperty(value = "Limits the answering time in seconds, -1 means no limit")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
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
    return Objects.equals(this.qtype, query.qtype) &&
        Objects.equals(this.limit, query.limit) &&
        Objects.equals(this.timeout, query.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtype, limit, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    qtype: ").append(toIndentedString(qtype)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

