package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.Query;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Query by frame
 */
@ApiModel(description = "Query by frame")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-01T16:07:23.045+01:00[Europe/Berlin]")
public class QueryFrame extends Query  {
  /**
   * Query kind, where (INDIVIDUATION = single entity, CARDINALITY = entity count, LIST = list of entity n-tuples)
   */
  public enum QkindEnum {
    EXTENSION("EXTENSION"),
    
    CARDINALITY("CARDINALITY");

    private String value;

    QkindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QkindEnum fromValue(String text) {
      for (QkindEnum b : QkindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("qkind")
  private QkindEnum qkind;

  @JsonProperty("frame")
  private Frame frame;

  public QueryFrame qkind(QkindEnum qkind) {
    this.qkind = qkind;
    return this;
  }

   /**
   * Query kind, where (INDIVIDUATION = single entity, CARDINALITY = entity count, LIST = list of entity n-tuples)
   * @return qkind
  **/
  @ApiModelProperty(required = true, value = "Query kind, where (INDIVIDUATION = single entity, CARDINALITY = entity count, LIST = list of entity n-tuples)")
  public QkindEnum getQkind() {
    return qkind;
  }

  public void setQkind(QkindEnum qkind) {
    this.qkind = qkind;
  }

  public QueryFrame frame(Frame frame) {
    this.frame = frame;
    return this;
  }

   /**
   * Get frame
   * @return frame
  **/
  @ApiModelProperty(required = true, value = "")
  public Frame getFrame() {
    return frame;
  }

  public void setFrame(Frame frame) {
    this.frame = frame;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFrame queryFrame = (QueryFrame) o;
    return Objects.equals(this.qkind, queryFrame.qkind) &&
        Objects.equals(this.frame, queryFrame.frame) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qkind, frame, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qkind: ").append(toIndentedString(qkind)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
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

