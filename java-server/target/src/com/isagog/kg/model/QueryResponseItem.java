package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Query result set row
 */
@ApiModel(description = "Query result set row")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class QueryResponseItem   {
  @JsonProperty("row")
  private List<String> row = new ArrayList<String>();

  @JsonProperty("support")
  private Double support;

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
  public List<String> getRow() {
    return row;
  }

  public void setRow(List<String> row) {
    this.row = row;
  }

  public QueryResponseItem support(Double support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * minimum: 0.0
   * maximum: 1.0
   * @return support
  **/
  @ApiModelProperty(value = "")
  public Double getSupport() {
    return support;
  }

  public void setSupport(Double support) {
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

