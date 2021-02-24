package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Language;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Textual object
 */
@ApiModel(description = "Textual object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-24T12:57:05.326+01:00[Europe/Berlin]")
public class Document   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("body")
  private String body;

  @JsonProperty("lang")
  private Language lang;

  public Document title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Document title
   * @return title
  **/
  @ApiModelProperty(value = "Document title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Document body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Document body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Document body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Document lang(Language lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(value = "")
  public Language getLang() {
    return lang;
  }

  public void setLang(Language lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.title, document.title) &&
        Objects.equals(this.body, document.body) &&
        Objects.equals(this.lang, document.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body, lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

