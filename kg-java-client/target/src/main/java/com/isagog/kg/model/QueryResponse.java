/*
 * Isagog Knowledge Graph Interaction Service
 * Isagog Knowledge Graph Interaction module
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
import com.isagog.kg.model.ResponseHeader;
import com.isagog.kg.model.ResponseRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Query result set
 */
@ApiModel(description = "Query result set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T11:03:38.134+02:00[Europe/Berlin]")
public class QueryResponse {
  public static final String SERIALIZED_NAME_HANDLE = "handle";
  @SerializedName(SERIALIZED_NAME_HANDLE)
  private Long handle;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private List<ResponseHeader> header = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<ResponseRow> rows = null;


  public QueryResponse handle(Long handle) {
    
    this.handle = handle;
    return this;
  }

   /**
   * Handle to the query result for paging (opt)
   * @return handle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Handle to the query result for paging (opt)")

  public Long getHandle() {
    return handle;
  }


  public void setHandle(Long handle) {
    this.handle = handle;
  }


  public QueryResponse size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Total availabe results
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total availabe results")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public QueryResponse header(List<ResponseHeader> header) {
    
    this.header = header;
    return this;
  }

  public QueryResponse addHeaderItem(ResponseHeader headerItem) {
    this.header.add(headerItem);
    return this;
  }

   /**
   * Result set description
   * @return header
  **/
  @ApiModelProperty(required = true, value = "Result set description")

  public List<ResponseHeader> getHeader() {
    return header;
  }


  public void setHeader(List<ResponseHeader> header) {
    this.header = header;
  }


  public QueryResponse rows(List<ResponseRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public QueryResponse addRowsItem(ResponseRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Result items
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result items")

  public List<ResponseRow> getRows() {
    return rows;
  }


  public void setRows(List<ResponseRow> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponse queryResponse = (QueryResponse) o;
    return Objects.equals(this.handle, queryResponse.handle) &&
        Objects.equals(this.size, queryResponse.size) &&
        Objects.equals(this.header, queryResponse.header) &&
        Objects.equals(this.rows, queryResponse.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, size, header, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponse {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

