package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.ResponseHeader;
import com.isagog.kg.model.ResponseRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Query result set
 */
@ApiModel(description = "Query result set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-20T12:31:14.635+01:00[Europe/Berlin]")
public class QueryResponse   {
  @JsonProperty("handle")
  private Long handle;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("header")
  private List<ResponseHeader> header = new ArrayList<ResponseHeader>();

  @JsonProperty("rows")
  private List<ResponseRow> rows = null;

  public QueryResponse handle(Long handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Handle to the query result for paging (opt)
   * @return handle
  **/
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
      this.rows = new ArrayList<ResponseRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Result items
   * @return rows
  **/
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

