/*
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
 *
 * OpenAPI spec version: <version>
 * 
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
import io.swagger.client.model.Vector3;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * WorldFullBorder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class WorldFullBorder {
  @SerializedName("center")
  private Vector3 center = null;

  @SerializedName("diameter")
  private BigDecimal diameter = null;

  @SerializedName("damageAmount")
  private BigDecimal damageAmount = null;

  @SerializedName("damageThreshold")
  private BigDecimal damageThreshold = null;

  @SerializedName("newDiameter")
  private BigDecimal newDiameter = null;

  @SerializedName("timeRemaining")
  private BigDecimal timeRemaining = null;

  @SerializedName("warningDistance")
  private BigDecimal warningDistance = null;

  @SerializedName("warningTime")
  private BigDecimal warningTime = null;

  public WorldFullBorder center(Vector3 center) {
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(value = "")
  public Vector3 getCenter() {
    return center;
  }

  public void setCenter(Vector3 center) {
    this.center = center;
  }

  public WorldFullBorder diameter(BigDecimal diameter) {
    this.diameter = diameter;
    return this;
  }

   /**
   * The diameter of the world border.
   * @return diameter
  **/
  @ApiModelProperty(value = "The diameter of the world border.")
  public BigDecimal getDiameter() {
    return diameter;
  }

  public void setDiameter(BigDecimal diameter) {
    this.diameter = diameter;
  }

  public WorldFullBorder damageAmount(BigDecimal damageAmount) {
    this.damageAmount = damageAmount;
    return this;
  }

   /**
   * The amount of damage done to the player when outside the world border.
   * @return damageAmount
  **/
  @ApiModelProperty(value = "The amount of damage done to the player when outside the world border.")
  public BigDecimal getDamageAmount() {
    return damageAmount;
  }

  public void setDamageAmount(BigDecimal damageAmount) {
    this.damageAmount = damageAmount;
  }

  public WorldFullBorder damageThreshold(BigDecimal damageThreshold) {
    this.damageThreshold = damageThreshold;
    return this;
  }

   /**
   * The amount of time in seconds to wait before applying the damage.
   * @return damageThreshold
  **/
  @ApiModelProperty(value = "The amount of time in seconds to wait before applying the damage.")
  public BigDecimal getDamageThreshold() {
    return damageThreshold;
  }

  public void setDamageThreshold(BigDecimal damageThreshold) {
    this.damageThreshold = damageThreshold;
  }

  public WorldFullBorder newDiameter(BigDecimal newDiameter) {
    this.newDiameter = newDiameter;
    return this;
  }

   /**
   * The new diameter the world border is going to change to.
   * @return newDiameter
  **/
  @ApiModelProperty(value = "The new diameter the world border is going to change to.")
  public BigDecimal getNewDiameter() {
    return newDiameter;
  }

  public void setNewDiameter(BigDecimal newDiameter) {
    this.newDiameter = newDiameter;
  }

  public WorldFullBorder timeRemaining(BigDecimal timeRemaining) {
    this.timeRemaining = timeRemaining;
    return this;
  }

   /**
   * The amount of time remaining before the world border reaches the new diameter.
   * @return timeRemaining
  **/
  @ApiModelProperty(value = "The amount of time remaining before the world border reaches the new diameter.")
  public BigDecimal getTimeRemaining() {
    return timeRemaining;
  }

  public void setTimeRemaining(BigDecimal timeRemaining) {
    this.timeRemaining = timeRemaining;
  }

  public WorldFullBorder warningDistance(BigDecimal warningDistance) {
    this.warningDistance = warningDistance;
    return this;
  }

   /**
   * The distance at which a player is warned of the world border.
   * @return warningDistance
  **/
  @ApiModelProperty(value = "The distance at which a player is warned of the world border.")
  public BigDecimal getWarningDistance() {
    return warningDistance;
  }

  public void setWarningDistance(BigDecimal warningDistance) {
    this.warningDistance = warningDistance;
  }

  public WorldFullBorder warningTime(BigDecimal warningTime) {
    this.warningTime = warningTime;
    return this;
  }

   /**
   * The amount of time in seconds before a contracting world border reaches a player that the player is warned.
   * @return warningTime
  **/
  @ApiModelProperty(value = "The amount of time in seconds before a contracting world border reaches a player that the player is warned.")
  public BigDecimal getWarningTime() {
    return warningTime;
  }

  public void setWarningTime(BigDecimal warningTime) {
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
    WorldFullBorder worldFullBorder = (WorldFullBorder) o;
    return Objects.equals(this.center, worldFullBorder.center) &&
        Objects.equals(this.diameter, worldFullBorder.diameter) &&
        Objects.equals(this.damageAmount, worldFullBorder.damageAmount) &&
        Objects.equals(this.damageThreshold, worldFullBorder.damageThreshold) &&
        Objects.equals(this.newDiameter, worldFullBorder.newDiameter) &&
        Objects.equals(this.timeRemaining, worldFullBorder.timeRemaining) &&
        Objects.equals(this.warningDistance, worldFullBorder.warningDistance) &&
        Objects.equals(this.warningTime, worldFullBorder.warningTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(center, diameter, damageAmount, damageThreshold, newDiameter, timeRemaining, warningDistance, warningTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldFullBorder {\n");
    
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
    sb.append("    damageAmount: ").append(toIndentedString(damageAmount)).append("\n");
    sb.append("    damageThreshold: ").append(toIndentedString(damageThreshold)).append("\n");
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

