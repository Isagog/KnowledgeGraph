package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Query frame
 */
@ApiModel(description = "Query frame")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-09-02T11:33:37.504057800+02:00[Europe/Berlin]")
public class Query extends Frame  {
  /**
   * Gets or Sets qtype
   */
  public enum QtypeEnum {
    INDIVIDUATIONQUERY("IndividuationQuery"),
    
    CARDINALITYQUERY("CardinalityQuery"),
    
    EXTENSIONQUERY("ExtensionQuery");

    private String value;

    QtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QtypeEnum fromValue(String text) {
      for (QtypeEnum b : QtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("qtype")
  private QtypeEnum qtype;

  public Query qtype(QtypeEnum qtype) {
    this.qtype = qtype;
    return this;
  }

   /**
   * Get qtype
   * @return qtype
  **/
  @ApiModelProperty(value = "")
  public QtypeEnum getQtype() {
    return qtype;
  }

  public void setQtype(QtypeEnum qtype) {
    this.qtype = qtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.qtype, query.qtype) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtype, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qtype: ").append(toIndentedString(qtype)).append("\n");
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

