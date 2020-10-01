package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TextualContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class TextualContent   {
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

  @JsonProperty("text")
  private byte[] text;

  @JsonProperty("context")
  private byte[] context;

  public TextualContent lang(LangEnum lang) {
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

  public TextualContent text(byte[] text) {
    this.text = text;
    return this;
  }

   /**
   * Textual content
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Textual content")
  public byte[] getText() {
    return text;
  }

  public void setText(byte[] text) {
    this.text = text;
  }

  public TextualContent context(byte[] context) {
    this.context = context;
    return this;
  }

   /**
   * Textual context
   * @return context
  **/
  @ApiModelProperty(value = "Textual context")
  public byte[] getContext() {
    return context;
  }

  public void setContext(byte[] context) {
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
    TextualContent textualContent = (TextualContent) o;
    return Objects.equals(this.lang, textualContent.lang) &&
        Objects.equals(this.text, textualContent.text) &&
        Objects.equals(this.context, textualContent.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, text, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextualContent {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

