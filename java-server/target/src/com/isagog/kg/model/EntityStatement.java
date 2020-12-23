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
 * Statement whose subject is an individual (individual assertion)
 */
@ApiModel(description = "Statement whose subject is an individual (individual assertion)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-12-23T10:06:52.142+01:00[Europe/Berlin]")
public class EntityStatement extends Statement  {
  @JsonProperty("predicate")
  private URI predicate;

  @JsonProperty("relational")
  private Boolean relational = false;

  @JsonProperty("object")
  private String _object;

  public EntityStatement predicate(URI predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Ontology relation or attribute
   * @return predicate
  **/
  @ApiModelProperty(required = true, value = "Ontology relation or attribute")
  public URI getPredicate() {
    return predicate;
  }

  public void setPredicate(URI predicate) {
    this.predicate = predicate;
  }

  public EntityStatement relational(Boolean relational) {
    this.relational = relational;
    return this;
  }

   /**
   * Get relational
   * @return relational
  **/
  @ApiModelProperty(value = "")
  public Boolean getRelational() {
    return relational;
  }

  public void setRelational(Boolean relational) {
    this.relational = relational;
  }

  public EntityStatement _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Statement's object, i.e. an id or a value
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "Statement's object, i.e. an id or a value")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityStatement entityStatement = (EntityStatement) o;
    return Objects.equals(this.predicate, entityStatement.predicate) &&
        Objects.equals(this.relational, entityStatement.relational) &&
        Objects.equals(this._object, entityStatement._object) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, relational, _object, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    relational: ").append(toIndentedString(relational)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

