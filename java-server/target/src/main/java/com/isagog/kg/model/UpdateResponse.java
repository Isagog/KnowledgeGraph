package com.isagog.kg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.*;
import com.isagog.kg.model.UpdateResponseReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Update response
 */
@ApiModel(description = "Update response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-01-15T12:22:52.499+01:00[Europe/Berlin]")
public class UpdateResponse   {
  @JsonProperty("report")
  private List<UpdateResponseReport> report = new ArrayList<UpdateResponseReport>();

  public UpdateResponse report(List<UpdateResponseReport> report) {
    this.report = report;
    return this;
  }

  public UpdateResponse addReportItem(UpdateResponseReport reportItem) {
    this.report.add(reportItem);
    return this;
  }

   /**
   * Report
   * @return report
  **/
  @ApiModelProperty(required = true, value = "Report")
  public List<UpdateResponseReport> getReport() {
    return report;
  }

  public void setReport(List<UpdateResponseReport> report) {
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

