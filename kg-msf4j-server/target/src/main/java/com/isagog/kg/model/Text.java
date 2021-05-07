package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Textual object
 */
@ApiModel(description = "Textual object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class Text   {
  @JsonProperty("ttype")
  private String ttype;

  @JsonProperty("body")
  private String body;

  @JsonProperty("lang")
  private String lang;

  public Text ttype(String ttype) {
    this.ttype = ttype;
    return this;
  }

   /**
   * Textual object type
   * @return ttype
  **/
  @ApiModelProperty(required = true, value = "Textual object type")
  public String getTtype() {
    return ttype;
  }

  public void setTtype(String ttype) {
    this.ttype = ttype;
  }

  public Text body(String body) {
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

  public Text lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Sentence language (ISO 639-1)
   * @return lang
  **/
  @ApiModelProperty(value = "Sentence language (ISO 639-1)")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
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
    Text text = (Text) o;
    return Objects.equals(this.ttype, text.ttype) &&
        Objects.equals(this.body, text.body) &&
        Objects.equals(this.lang, text.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttype, body, lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    
    sb.append("    ttype: ").append(toIndentedString(ttype)).append("\n");
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

