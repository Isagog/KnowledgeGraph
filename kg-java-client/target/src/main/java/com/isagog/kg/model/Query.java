/*
 * Isagog Knowledge Graph Data Service
 * Isagog Knowledge Graph Data module
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.isagog.kg.model.QueryExpression;
import com.isagog.kg.model.QueryFrame;
import com.isagog.kg.model.QueryKeywords;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data query
 */
@ApiModel(description = "Data query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:36.167+02:00[Europe/Berlin]")
public class Query {
  public static final String SERIALIZED_NAME_QTYPE = "qtype";
  @SerializedName(SERIALIZED_NAME_QTYPE)
  protected String qtype;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = -1;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout = -1;

  public Query() {
    this.qtype = this.getClass().getSimpleName();
  }

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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

