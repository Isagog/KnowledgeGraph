package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Query result set header
 */
@ApiModel(description = "Query result set header")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class QueryResponseHeader   {
  @JsonProperty("name")
  private String name;

  /**
   * Gets or Sets dtype
   */
  public enum DtypeEnum {
    URI("Uri"),
    
    BOOLEAN("Boolean"),
    
    INTEGER("Integer"),
    
    DOUBLE("Double"),
    
    STRING("String");

    private String value;

    DtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DtypeEnum fromValue(String text) {
      for (DtypeEnum b : DtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("dtype")
  private DtypeEnum dtype;

  public QueryResponseHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryResponseHeader dtype(DtypeEnum dtype) {
    this.dtype = dtype;
    return this;
  }

   /**
   * Get dtype
   * @return dtype
  **/
  @ApiModelProperty(required = true, value = "")
  public DtypeEnum getDtype() {
    return dtype;
  }

  public void setDtype(DtypeEnum dtype) {
    this.dtype = dtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResponseHeader queryResponseHeader = (QueryResponseHeader) o;
    return Objects.equals(this.name, queryResponseHeader.name) &&
        Objects.equals(this.dtype, queryResponseHeader.dtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResponseHeader {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
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

