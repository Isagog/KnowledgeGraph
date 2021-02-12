package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.Query;
import com.isagog.kg.model.QueryKind;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Query by frame
 */
@ApiModel(description = "Query by frame")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-12T10:53:56.933+01:00[Europe/Berlin]")
public class QueryFrame extends Query  {
  @JsonProperty("qkind")
  private QueryKind qkind;

  @JsonProperty("frame")
  private Frame frame;

  public QueryFrame qkind(QueryKind qkind) {
    this.qkind = qkind;
    return this;
  }

   /**
   * Get qkind
   * @return qkind
  **/
  @ApiModelProperty(required = true, value = "")
  public QueryKind getQkind() {
    return qkind;
  }

  public void setQkind(QueryKind qkind) {
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

