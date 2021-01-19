package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.Query;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Query string in a specific query language
 */
@ApiModel(description = "Query string in a specific query language")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-18T16:28:29.085+01:00[Europe/Berlin]")
public class QueryExpression extends Query  {
  /**
   * Query language
   */
  public enum LangEnum {
    SPARQL("SPARQL"),
    
    GRAPHQL("GRAPHQL");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LangEnum fromValue(String text) {
      for (LangEnum b : LangEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("lang")
  private LangEnum lang;

  @JsonProperty("query")
  private String query;

  public QueryExpression lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Query language
   * @return lang
  **/
  @ApiModelProperty(required = true, value = "Query language")
  public LangEnum getLang() {
    return lang;
  }

  public void setLang(LangEnum lang) {
    this.lang = lang;
  }

  public QueryExpression query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query string
   * @return query
  **/
  @ApiModelProperty(value = "Query string")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryExpression queryExpression = (QueryExpression) o;
    return Objects.equals(this.lang, queryExpression.lang) &&
        Objects.equals(this.query, queryExpression.query) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, query, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryExpression {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

