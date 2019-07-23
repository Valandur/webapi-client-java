/*
 * Web-API
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # List endpoints Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  > Remember that in this case the data returned by the endpoint might be quite large.  # Debugging endpoints Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  `details`: Includes details for list endpoints  `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  `pretty`: Pretty prints the data, also good for debugging in the browser.  An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)
 *
 * OpenAPI spec version: 5.4.2-S7.1.0
 * Contact: inithilian@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeHolder;
import java.io.IOException;

/**
 * ServerReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T12:56:27.838+02:00")
public class ServerReport {
  @SerializedName("dailyAverage")
  private TimeHolder dailyAverage = null;

  @SerializedName("from")
  private org.threeten.bp.LocalDate from = null;

  @SerializedName("monthlyAverage")
  private TimeHolder monthlyAverage = null;

  @SerializedName("to")
  private org.threeten.bp.LocalDate to = null;

  @SerializedName("total")
  private TimeHolder total = null;

  @SerializedName("weeklyAverage")
  private TimeHolder weeklyAverage = null;

  public ServerReport dailyAverage(TimeHolder dailyAverage) {
    this.dailyAverage = dailyAverage;
    return this;
  }

   /**
   * Get dailyAverage
   * @return dailyAverage
  **/
  @ApiModelProperty(value = "")
  public TimeHolder getDailyAverage() {
    return dailyAverage;
  }

  public void setDailyAverage(TimeHolder dailyAverage) {
    this.dailyAverage = dailyAverage;
  }

  public ServerReport from(org.threeten.bp.LocalDate from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  public org.threeten.bp.LocalDate getFrom() {
    return from;
  }

  public void setFrom(org.threeten.bp.LocalDate from) {
    this.from = from;
  }

  public ServerReport monthlyAverage(TimeHolder monthlyAverage) {
    this.monthlyAverage = monthlyAverage;
    return this;
  }

   /**
   * Get monthlyAverage
   * @return monthlyAverage
  **/
  @ApiModelProperty(value = "")
  public TimeHolder getMonthlyAverage() {
    return monthlyAverage;
  }

  public void setMonthlyAverage(TimeHolder monthlyAverage) {
    this.monthlyAverage = monthlyAverage;
  }

  public ServerReport to(org.threeten.bp.LocalDate to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public org.threeten.bp.LocalDate getTo() {
    return to;
  }

  public void setTo(org.threeten.bp.LocalDate to) {
    this.to = to;
  }

  public ServerReport total(TimeHolder total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public TimeHolder getTotal() {
    return total;
  }

  public void setTotal(TimeHolder total) {
    this.total = total;
  }

  public ServerReport weeklyAverage(TimeHolder weeklyAverage) {
    this.weeklyAverage = weeklyAverage;
    return this;
  }

   /**
   * Get weeklyAverage
   * @return weeklyAverage
  **/
  @ApiModelProperty(value = "")
  public TimeHolder getWeeklyAverage() {
    return weeklyAverage;
  }

  public void setWeeklyAverage(TimeHolder weeklyAverage) {
    this.weeklyAverage = weeklyAverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerReport serverReport = (ServerReport) o;
    return Objects.equals(this.dailyAverage, serverReport.dailyAverage) &&
        Objects.equals(this.from, serverReport.from) &&
        Objects.equals(this.monthlyAverage, serverReport.monthlyAverage) &&
        Objects.equals(this.to, serverReport.to) &&
        Objects.equals(this.total, serverReport.total) &&
        Objects.equals(this.weeklyAverage, serverReport.weeklyAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyAverage, from, monthlyAverage, to, total, weeklyAverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerReport {\n");
    
    sb.append("    dailyAverage: ").append(toIndentedString(dailyAverage)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    monthlyAverage: ").append(toIndentedString(monthlyAverage)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    weeklyAverage: ").append(toIndentedString(weeklyAverage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

