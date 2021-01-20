package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base class for token annotations, should be abstract
 */
@ApiModel(description = "Base class for token annotations, should be abstract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-20T12:31:14.314+01:00[Europe/Berlin]")
public class TokenAnnotation   {
  @JsonProperty("ttype")
  private String ttype;

  @JsonProperty("token")
  private String token;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("support")
  private Double support;

  public TokenAnnotation ttype(String ttype) {
    this.ttype = ttype;
    return this;
  }

   /**
   * Token type
   * @return ttype
  **/
  @ApiModelProperty(required = true, value = "Token type")
  public String getTtype() {
    return ttype;
  }

  public void setTtype(String ttype) {
    this.ttype = ttype;
  }

  public TokenAnnotation token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public TokenAnnotation offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Head character offset
   * minimum: 0
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "Head character offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public TokenAnnotation support(Double support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public Double getSupport() {
    return support;
  }

  public void setSupport(Double support) {
    this.support = support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenAnnotation tokenAnnotation = (TokenAnnotation) o;
    return Objects.equals(this.ttype, tokenAnnotation.ttype) &&
        Objects.equals(this.token, tokenAnnotation.token) &&
        Objects.equals(this.offset, tokenAnnotation.offset) &&
        Objects.equals(this.support, tokenAnnotation.support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttype, token, offset, support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenAnnotation {\n");
    
    sb.append("    ttype: ").append(toIndentedString(ttype)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

