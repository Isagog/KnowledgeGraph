package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.isagog.kg.model.Text;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Complete word sequence
 */
@ApiModel(description = "Complete word sequence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-05-07T11:04:00.633+02:00[Europe/Berlin]")
public class Sentence extends Text  {
  @JsonProperty("context")
  private String context;

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
    return Objects.equals(this.context, sentence.context) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sentence {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

