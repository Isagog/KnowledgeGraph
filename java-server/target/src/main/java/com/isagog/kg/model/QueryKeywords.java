package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.Query;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Keyword-based query (search)
 */
@ApiModel(description = "Keyword-based query (search)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-23T13:35:22.086+01:00[Europe/Berlin]")
public class QueryKeywords extends Query  {
  @JsonProperty("keys")
  private List<String> keys = new ArrayList<String>();

  /**
   * The search operator; OR = at least one match, AND = complete match, EXCEPT = match the first value but not the others
   */
  public enum OpEnum {
    OR("OR"),
    
    AND("AND"),
    
    EXCEPT("EXCEPT");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("op")
  private OpEnum op = OpEnum.OR;

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

  public QueryKeywords op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The search operator; OR = at least one match, AND = complete match, EXCEPT = match the first value but not the others
   * @return op
  **/
  @ApiModelProperty(value = "The search operator; OR = at least one match, AND = complete match, EXCEPT = match the first value but not the others")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
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

