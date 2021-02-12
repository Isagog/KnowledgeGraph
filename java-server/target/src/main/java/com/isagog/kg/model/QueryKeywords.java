package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.SearchOperator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Keyword-based query (search)
 */
@ApiModel(description = "Keyword-based query (search)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:32.641+01:00[Europe/Berlin]")
public class QueryKeywords extends Query  {
  @JsonProperty("keys")
  private List<String> keys = new ArrayList<String>();

  @JsonProperty("op")
  private SearchOperator op = SearchOperator.OR;

  public QueryKeywords keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public QueryKeywords addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public QueryKeywords op(SearchOperator op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(value = "")
  public SearchOperator getOp() {
    return op;
  }

  public void setOp(SearchOperator op) {
    this.op = op;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryKeywords queryKeywords = (QueryKeywords) o;
    return Objects.equals(this.keys, queryKeywords.keys) &&
        Objects.equals(this.op, queryKeywords.op) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, op, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryKeywords {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

