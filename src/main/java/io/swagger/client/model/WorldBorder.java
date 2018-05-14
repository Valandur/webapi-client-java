/*
 * Web-API
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # List endpoints Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  > Remember that in this case the data returned by the endpoint might be quite large.  # Debugging endpoints Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  `details`: Includes details for list endpoints  `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  `pretty`: Pretty prints the data, also good for debugging in the browser.  An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)
 *
 * OpenAPI spec version: @version@
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
import io.swagger.client.model.Vector3d;
import java.io.IOException;

/**
 * WorldBorder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T13:42:56.227+02:00")
public class WorldBorder {
  @SerializedName("center")
  private Vector3d center = null;

  @SerializedName("damageAmount")
  private Double damageAmount = null;

  @SerializedName("damageThreshold")
  private Double damageThreshold = null;

  @SerializedName("diameter")
  private Double diameter = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("newDiameter")
  private Double newDiameter = null;

  @SerializedName("timeRemaining")
  private Long timeRemaining = null;

  @SerializedName("warningDistance")
  private Integer warningDistance = null;

  @SerializedName("warningTime")
  private Integer warningTime = null;

  public WorldBorder center(Vector3d center) {
    this.center = center;
    return this;
  }

   /**
   * The center of the world border
   * @return center
  **/
  @ApiModelProperty(required = true, value = "The center of the world border")
  public Vector3d getCenter() {
    return center;
  }

  public void setCenter(Vector3d center) {
    this.center = center;
  }

  public WorldBorder damageAmount(Double damageAmount) {
    this.damageAmount = damageAmount;
    return this;
  }

   /**
   * The amount of damage done to players outside the border
   * @return damageAmount
  **/
  @ApiModelProperty(required = true, value = "The amount of damage done to players outside the border")
  public Double getDamageAmount() {
    return damageAmount;
  }

  public void setDamageAmount(Double damageAmount) {
    this.damageAmount = damageAmount;
  }

  public WorldBorder damageThreshold(Double damageThreshold) {
    this.damageThreshold = damageThreshold;
    return this;
  }

   /**
   * The maximum amount of damage done to a player
   * @return damageThreshold
  **/
  @ApiModelProperty(required = true, value = "The maximum amount of damage done to a player")
  public Double getDamageThreshold() {
    return damageThreshold;
  }

  public void setDamageThreshold(Double damageThreshold) {
    this.damageThreshold = damageThreshold;
  }

  public WorldBorder diameter(Double diameter) {
    this.diameter = diameter;
    return this;
  }

   /**
   * The diameter of the border
   * @return diameter
  **/
  @ApiModelProperty(required = true, value = "The diameter of the border")
  public Double getDiameter() {
    return diameter;
  }

  public void setDiameter(Double diameter) {
    this.diameter = diameter;
  }

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public WorldBorder newDiameter(Double newDiameter) {
    this.newDiameter = newDiameter;
    return this;
  }

   /**
   * The new diameter of the border, in case it is collapsing/expanding
   * @return newDiameter
  **/
  @ApiModelProperty(required = true, value = "The new diameter of the border, in case it is collapsing/expanding")
  public Double getNewDiameter() {
    return newDiameter;
  }

  public void setNewDiameter(Double newDiameter) {
    this.newDiameter = newDiameter;
  }

  public WorldBorder timeRemaining(Long timeRemaining) {
    this.timeRemaining = timeRemaining;
    return this;
  }

   /**
   * The time remaining until the border reaches it&#39;s new size
   * @return timeRemaining
  **/
  @ApiModelProperty(required = true, value = "The time remaining until the border reaches it's new size")
  public Long getTimeRemaining() {
    return timeRemaining;
  }

  public void setTimeRemaining(Long timeRemaining) {
    this.timeRemaining = timeRemaining;
  }

  public WorldBorder warningDistance(Integer warningDistance) {
    this.warningDistance = warningDistance;
    return this;
  }

   /**
   * The amount of distance from the border a player will receive a warning at
   * @return warningDistance
  **/
  @ApiModelProperty(required = true, value = "The amount of distance from the border a player will receive a warning at")
  public Integer getWarningDistance() {
    return warningDistance;
  }

  public void setWarningDistance(Integer warningDistance) {
    this.warningDistance = warningDistance;
  }

  public WorldBorder warningTime(Integer warningTime) {
    this.warningTime = warningTime;
    return this;
  }

   /**
   * The amount of time near a border before a warning is shown for players
   * @return warningTime
  **/
  @ApiModelProperty(required = true, value = "The amount of time near a border before a warning is shown for players")
  public Integer getWarningTime() {
    return warningTime;
  }

  public void setWarningTime(Integer warningTime) {
    this.warningTime = warningTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldBorder worldBorder = (WorldBorder) o;
    return Objects.equals(this.center, worldBorder.center) &&
        Objects.equals(this.damageAmount, worldBorder.damageAmount) &&
        Objects.equals(this.damageThreshold, worldBorder.damageThreshold) &&
        Objects.equals(this.diameter, worldBorder.diameter) &&
        Objects.equals(this.link, worldBorder.link) &&
        Objects.equals(this.newDiameter, worldBorder.newDiameter) &&
        Objects.equals(this.timeRemaining, worldBorder.timeRemaining) &&
        Objects.equals(this.warningDistance, worldBorder.warningDistance) &&
        Objects.equals(this.warningTime, worldBorder.warningTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, damageAmount, damageThreshold, diameter, link, newDiameter, timeRemaining, warningDistance, warningTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldBorder {\n");
    
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    damageAmount: ").append(toIndentedString(damageAmount)).append("\n");
    sb.append("    damageThreshold: ").append(toIndentedString(damageThreshold)).append("\n");
    sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    newDiameter: ").append(toIndentedString(newDiameter)).append("\n");
    sb.append("    timeRemaining: ").append(toIndentedString(timeRemaining)).append("\n");
    sb.append("    warningDistance: ").append(toIndentedString(warningDistance)).append("\n");
    sb.append("    warningTime: ").append(toIndentedString(warningTime)).append("\n");
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

