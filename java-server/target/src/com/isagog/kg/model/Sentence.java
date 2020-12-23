package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A single sentence
 */
@ApiModel(description = "A single sentence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class Sentence   {
  /**
   * Language
   */
  public enum LangEnum {
    EN("en"),
    
    ES("es"),
    
    FR("fr"),
    
    IT("it"),
    
    DE("de");

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

  @JsonProperty("verbatim")
  private String verbatim;

  @JsonProperty("context")
  private String context;

  public Sentence lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Language
   * @return lang
  **/
  @ApiModelProperty(value = "Language")
  public LangEnum getLang() {
    return lang;
  }

  public void setLang(LangEnum lang) {
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

