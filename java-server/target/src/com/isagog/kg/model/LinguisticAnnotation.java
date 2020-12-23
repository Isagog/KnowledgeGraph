package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Linguistic attachment to knowledge elements
 */
@ApiModel(description = "Linguistic attachment to knowledge elements")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class LinguisticAnnotation extends KnowledgeAnnotation  {
  /**
   * Gets or Sets lang
   */
  public enum LangEnum {
    EN("en"),
    
    ES("es"),
    
    DE("de"),
    
    FR("fr"),
    
    IT("it");

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

  /**
   * Part of speech (opt)
   */
  public enum PosEnum {
    ADJ("ADJ"),
    
    ADV("ADV"),
    
    NOUN("NOUN"),
    
    PRON("PRON"),
    
    PROPN("PROPN"),
    
    NUM("NUM"),
    
    VERB("VERB"),
    
    NP("NP"),
    
    VP("VP"),
    
    X("X");

    private String value;

    PosEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PosEnum fromValue(String text) {
      for (PosEnum b : PosEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("pos")
  private PosEnum pos;

  @JsonProperty("form")
  private String form;

  @JsonProperty("regex")
  private String regex;

  public LinguisticAnnotation lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(required = true, value = "")
  public LangEnum getLang() {
    return lang;
  }

  public void setLang(LangEnum lang) {
    this.lang = lang;
  }

  public LinguisticAnnotation pos(PosEnum pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Part of speech (opt)
   * @return pos
  **/
  @ApiModelProperty(value = "Part of speech (opt)")
  public PosEnum getPos() {
    return pos;
  }

  public void setPos(PosEnum pos) {
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

