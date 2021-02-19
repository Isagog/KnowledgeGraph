package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Textual object
 */
@ApiModel(description = "Textual object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-18T21:02:10.323+01:00[Europe/Berlin]")
public class Document   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("body")
  private String body;

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
        Objects.equals(this.body, document.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

