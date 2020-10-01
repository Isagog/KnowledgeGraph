package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Natural language statement
 */
@ApiModel(description = "Natural language statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-10-01T15:11:47.166962200+02:00[Europe/Berlin]")
public class LinguisticStatement extends Statement  {
  @JsonProperty("utterance")
  private byte[] utterance;

  public LinguisticStatement utterance(byte[] utterance) {
    this.utterance = utterance;
    return this;
  }

   /**
   * Utterance
   * @return utterance
  **/
  @ApiModelProperty(required = true, value = "Utterance")
  public byte[] getUtterance() {
    return utterance;
  }

  public void setUtterance(byte[] utterance) {
    this.utterance = utterance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinguisticStatement linguisticStatement = (LinguisticStatement) o;
    return Objects.equals(this.utterance, linguisticStatement.utterance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utterance, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinguisticStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
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

