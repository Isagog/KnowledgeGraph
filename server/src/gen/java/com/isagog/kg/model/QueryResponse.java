package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.QueryResponseHeader;
import com.isagog.kg.model.QueryResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Query result set
 */
@ApiModel(description = "Query result set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-02T11:33:37.504057800+02:00[Europe/Berlin]")
public class QueryResponse   {
  @JsonProperty("query")
  private String query;

  @JsonProperty("header")
  private List<QueryResponseHeader> header = new ArrayList<QueryResponseHeader>();

  @JsonProperty("rows")
  private List<QueryResponseItem> rows = new ArrayList<QueryResponseItem>();

  public QueryResponse query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QueryResponse header(List<QueryResponseHeader> header) {
    this.header = header;
    return this;
  }

  public QueryResponse addHeaderItem(QueryResponseHeader headerItem) {
    this.header.add(headerItem);
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  public List<QueryResponseHeader> getHeader() {
    return header;
  }

  public void setHeader(List<QueryResponseHeader> header) {
    this.header = header;
  }

  public QueryResponse rows(List<QueryResponseItem> rows) {
    this.rows = rows;
    return this;
  }

  public QueryResponse addRowsItem(QueryResponseItem rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(required = true, value = "")
  public List<QueryResponseItem> getRows() {
    return rows;
  }

  public void setRows(List<QueryResponseItem> rows) {
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
    return Objects.equals(this.query, queryResponse.query) &&
        Objects.equals(this.header, queryResponse.header) &&
        Objects.equals(this.rows, queryResponse.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, header, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

