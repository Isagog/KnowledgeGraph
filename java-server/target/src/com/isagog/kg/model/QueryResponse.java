package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class QueryResponse   {
  @JsonProperty("handle")
  private Long handle;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("header")
  private List<QueryResponseHeader> header = new ArrayList<QueryResponseHeader>();

  @JsonProperty("items")
  private List<QueryResponseItem> items = null;

  public QueryResponse handle(Long handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Handle to the query result, may be used to fetch results
   * @return handle
  **/
  @ApiModelProperty(required = true, value = "Handle to the query result, may be used to fetch results")
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
  @ApiModelProperty(required = true, value = "Total availabe results")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
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
   * Result set description
   * @return header
  **/
  @ApiModelProperty(required = true, value = "Result set description")
  public List<QueryResponseHeader> getHeader() {
    return header;
  }

  public void setHeader(List<QueryResponseHeader> header) {
    this.header = header;
  }

  public QueryResponse items(List<QueryResponseItem> items) {
    this.items = items;
    return this;
  }

  public QueryResponse addItemsItem(QueryResponseItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<QueryResponseItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Result items
   * @return items
  **/
  @ApiModelProperty(value = "Result items")
  public List<QueryResponseItem> getItems() {
    return items;
  }

  public void setItems(List<QueryResponseItem> items) {
    this.items = items;
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
        Objects.equals(this.items, queryResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, size, header, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponse {\n");
    
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

