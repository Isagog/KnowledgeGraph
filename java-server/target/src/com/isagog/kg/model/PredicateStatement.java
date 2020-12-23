package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Statement whose subject is a predicate
 */
@ApiModel(description = "Statement whose subject is a predicate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class PredicateStatement extends Statement  {
  @JsonProperty("object")
  private URI _object;

  /**
   * Gets or Sets predicate
   */
  public enum PredicateEnum {
    INCLUSION("INCLUSION"),
    
    DISJUNCTION("DISJUNCTION"),
    
    EQUIVALENCE("EQUIVALENCE");

    private String value;

    PredicateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PredicateEnum fromValue(String text) {
      for (PredicateEnum b : PredicateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("predicate")
  private PredicateEnum predicate;

  public PredicateStatement _object(URI _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public URI getObject() {
    return _object;
  }

  public void setObject(URI _object) {
    this._object = _object;
  }

  public PredicateStatement predicate(PredicateEnum predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @ApiModelProperty(required = true, value = "")
  public PredicateEnum getPredicate() {
    return predicate;
  }

  public void setPredicate(PredicateEnum predicate) {
    this.predicate = predicate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredicateStatement predicateStatement = (PredicateStatement) o;
    return Objects.equals(this._object, predicateStatement._object) &&
        Objects.equals(this.predicate, predicateStatement.predicate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, predicate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
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

