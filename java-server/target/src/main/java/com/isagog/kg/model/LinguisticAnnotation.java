package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Language;
import com.isagog.kg.model.PartOfSpeech;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Linguistic attachment to knowledge elements
 */
@ApiModel(description = "Linguistic attachment to knowledge elements")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-20T12:31:14.314+01:00[Europe/Berlin]")
public class LinguisticAnnotation extends KnowledgeAnnotation  {
  @JsonProperty("lang")
  private Language lang;

  @JsonProperty("pos")
  private PartOfSpeech pos;

  @JsonProperty("form")
  private String form;

  @JsonProperty("regex")
  private String regex;

  public LinguisticAnnotation lang(Language lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(required = true, value = "")
  public Language getLang() {
    return lang;
  }

  public void setLang(Language lang) {
    this.lang = lang;
  }

  public LinguisticAnnotation pos(PartOfSpeech pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(value = "")
  public PartOfSpeech getPos() {
    return pos;
  }

  public void setPos(PartOfSpeech pos) {
    this.pos = pos;
  }

  public LinguisticAnnotation form(String form) {
    this.form = form;
    return this;
  }

   /**
   * Linguistic rendering (base form)
   * @return form
  **/
  @ApiModelProperty(required = true, value = "Linguistic rendering (base form)")
  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public LinguisticAnnotation regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Regular expression to match occurrences (opt)
   * @return regex
  **/
  @ApiModelProperty(value = "Regular expression to match occurrences (opt)")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinguisticAnnotation linguisticAnnotation = (LinguisticAnnotation) o;
    return Objects.equals(this.lang, linguisticAnnotation.lang) &&
        Objects.equals(this.pos, linguisticAnnotation.pos) &&
        Objects.equals(this.form, linguisticAnnotation.form) &&
        Objects.equals(this.regex, linguisticAnnotation.regex) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, pos, form, regex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinguisticAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

