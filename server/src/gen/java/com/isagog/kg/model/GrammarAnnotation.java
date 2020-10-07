package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.TokenAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Token grammar spec
 */
@ApiModel(description = "Token grammar spec")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-07T16:45:39.881731200+02:00[Europe/Berlin]")
public class GrammarAnnotation extends TokenAnnotation  {
  /**
   * Part of speech
   */
  public enum PosEnum {
    NOUN("NOUN"),
    
    VERB("VERB"),
    
    ADJECTIVE("ADJECTIVE"),
    
    ADVERB("ADVERB"),
    
    PRONOUN("PRONOUN"),
    
    NUMERAL("NUMERAL");

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

  /**
   * Part of speech modifier
   */
  public enum ModifierEnum {
    V_MODAL("V-MODAL"),
    
    V_AUXILIAR("V-AUXILIAR"),
    
    N_NAME("N-NAME"),
    
    QUALIFIER("QUALIFIER"),
    
    NONE("NONE");

    private String value;

    ModifierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModifierEnum fromValue(String text) {
      for (ModifierEnum b : ModifierEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("modifier")
  private ModifierEnum modifier = ModifierEnum.NONE;

  /**
   * Grammatical number
   */
  public enum NumberEnum {
    SINGULAR("SINGULAR"),
    
    PLURAL("PLURAL"),
    
    DUAL("DUAL"),
    
    NONE("NONE");

    private String value;

    NumberEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NumberEnum fromValue(String text) {
      for (NumberEnum b : NumberEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("number")
  private NumberEnum number = NumberEnum.NONE;

  /**
   * Grammatical person (for VERBS)
   */
  public enum PersonEnum {
    FIRST("FIRST"),
    
    SECOND("SECOND"),
    
    THIRD("THIRD"),
    
    NONE("NONE");

    private String value;

    PersonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PersonEnum fromValue(String text) {
      for (PersonEnum b : PersonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("person")
  private PersonEnum person = PersonEnum.NONE;

  public GrammarAnnotation pos(PosEnum pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Part of speech
   * @return pos
  **/
  @ApiModelProperty(required = true, value = "Part of speech")
  public PosEnum getPos() {
    return pos;
  }

  public void setPos(PosEnum pos) {
    this.pos = pos;
  }

  public GrammarAnnotation modifier(ModifierEnum modifier) {
    this.modifier = modifier;
    return this;
  }

   /**
   * Part of speech modifier
   * @return modifier
  **/
  @ApiModelProperty(value = "Part of speech modifier")
  public ModifierEnum getModifier() {
    return modifier;
  }

  public void setModifier(ModifierEnum modifier) {
    this.modifier = modifier;
  }

  public GrammarAnnotation number(NumberEnum number) {
    this.number = number;
    return this;
  }

   /**
   * Grammatical number
   * @return number
  **/
  @ApiModelProperty(value = "Grammatical number")
  public NumberEnum getNumber() {
    return number;
  }

  public void setNumber(NumberEnum number) {
    this.number = number;
  }

  public GrammarAnnotation person(PersonEnum person) {
    this.person = person;
    return this;
  }

   /**
   * Grammatical person (for VERBS)
   * @return person
  **/
  @ApiModelProperty(value = "Grammatical person (for VERBS)")
  public PersonEnum getPerson() {
    return person;
  }

  public void setPerson(PersonEnum person) {
    this.person = person;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrammarAnnotation grammarAnnotation = (GrammarAnnotation) o;
    return Objects.equals(this.pos, grammarAnnotation.pos) &&
        Objects.equals(this.modifier, grammarAnnotation.modifier) &&
        Objects.equals(this.number, grammarAnnotation.number) &&
        Objects.equals(this.person, grammarAnnotation.person) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, modifier, number, person, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrammarAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

