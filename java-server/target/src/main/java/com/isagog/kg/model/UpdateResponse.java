package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Update response
 */
@ApiModel(description = "Update response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-02-06T07:45:04.008+01:00[Europe/Berlin]")
public class UpdateResponse   {
  @JsonProperty("report")
  private String report;

  public UpdateResponse report(String report) {
    this.report = report;
    return this;
  }

   /**
   * Report
   * @return report
  **/
  @ApiModelProperty(required = true, value = "Report")
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResponse updateResponse = (UpdateResponse) o;
    return Objects.equals(this.report, updateResponse.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResponse {\n");
    
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

