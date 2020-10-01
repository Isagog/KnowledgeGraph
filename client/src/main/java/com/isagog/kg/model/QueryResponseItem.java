/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Query result set row
 */
@ApiModel(description = "Query result set row")
@JsonPropertyOrder({
  QueryResponseItem.JSON_PROPERTY_ROW,
  QueryResponseItem.JSON_PROPERTY_SUPPORT
})
@JsonTypeName("QueryResponseItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-01T15:11:01.505608900+02:00[Europe/Berlin]")
public class QueryResponseItem {
  public static final String JSON_PROPERTY_ROW = "row";
  private List<String> row = new ArrayList<String>();

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Support support;


  public QueryResponseItem row(List<String> row) {
    
    this.row = row;
    return this;
  }

  public QueryResponseItem addRowItem(String rowItem) {
    this.row.add(rowItem);
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getRow() {
    return row;
  }


  public void setRow(List<String> row) {
    this.row = row;
  }


  public QueryResponseItem support(Support support) {
    
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Support getSupport() {
    return support;
  }


  public void setSupport(Support support) {
    this.support = support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseItem queryResponseItem = (QueryResponseItem) o;
    return Objects.equals(this.row, queryResponseItem.row) &&
        Objects.equals(this.support, queryResponseItem.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, support);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseItem {\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

