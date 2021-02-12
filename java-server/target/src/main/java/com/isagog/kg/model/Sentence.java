package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Language;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A single sentence
 */
@ApiModel(description = "A single sentence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T11:32:33.397+01:00[Europe/Berlin]")
public class Sentence   {
  @JsonProperty("lang")
  private Language lang;

  @JsonProperty("verbatim")
  private String verbatim;

  @JsonProperty("context")
  private String context;

  public Sentence lang(Language lang) {
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

  public Sentence verbatim(String verbatim) {
    this.verbatim = verbatim;
    return this;
  }

   /**
   * Textual content
   * @return verbatim
  **/
  @ApiModelProperty(required = true, value = "Textual content")
  public String getVerbatim() {
    return verbatim;
  }

  public void setVerbatim(String verbatim) {
    this.verbatim = verbatim;
  }

  public Sentence context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Textual context (opt)
   * @return context
  **/
  @ApiModelProperty(value = "Textual context (opt)")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sentence sentence = (Sentence) o;
    return Objects.equals(this.lang, sentence.lang) &&
        Objects.equals(this.verbatim, sentence.verbatim) &&
        Objects.equals(this.context, sentence.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, verbatim, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sentence {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    verbatim: ").append(toIndentedString(verbatim)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

