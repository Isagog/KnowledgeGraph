package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.isagog.kg.model.QueryResponse;
import com.isagog.kg.model.ResponseType;
import com.isagog.kg.model.UpdateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response to issuing an interation
 */
@ApiModel(description = "Response to issuing an interation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-17T19:24:07.920+01:00[Europe/Berlin]")
public class IssueResponse   {
  @JsonProperty("rtype")
  private ResponseType rtype;

  @JsonProperty("qanswer")
  private QueryResponse qanswer;

  @JsonProperty("upanswer")
  private UpdateResponse upanswer;

  @JsonProperty("message")
  private String message;

  public IssueResponse rtype(ResponseType rtype) {
    this.rtype = rtype;
    return this;
  }

   /**
   * Get rtype
   * @return rtype
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseType getRtype() {
    return rtype;
  }

  public void setRtype(ResponseType rtype) {
    this.rtype = rtype;
  }

  public IssueResponse qanswer(QueryResponse qanswer) {
    this.qanswer = qanswer;
    return this;
  }

   /**
   * Get qanswer
   * @return qanswer
  **/
  @ApiModelProperty(value = "")
  public QueryResponse getQanswer() {
    return qanswer;
  }

  public void setQanswer(QueryResponse qanswer) {
    this.qanswer = qanswer;
  }

  public IssueResponse upanswer(UpdateResponse upanswer) {
    this.upanswer = upanswer;
    return this;
  }

   /**
   * Get upanswer
   * @return upanswer
  **/
  @ApiModelProperty(value = "")
  public UpdateResponse getUpanswer() {
    return upanswer;
  }

  public void setUpanswer(UpdateResponse upanswer) {
    this.upanswer = upanswer;
  }

  public IssueResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueResponse issueResponse = (IssueResponse) o;
    return Objects.equals(this.rtype, issueResponse.rtype) &&
        Objects.equals(this.qanswer, issueResponse.qanswer) &&
        Objects.equals(this.upanswer, issueResponse.upanswer) &&
        Objects.equals(this.message, issueResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtype, qanswer, upanswer, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueResponse {\n");
    
    sb.append("    rtype: ").append(toIndentedString(rtype)).append("\n");
    sb.append("    qanswer: ").append(toIndentedString(qanswer)).append("\n");
    sb.append("    upanswer: ").append(toIndentedString(upanswer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

