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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PlayerFullFood
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class PlayerFullFood {
  @SerializedName("foodLevel")
  private BigDecimal foodLevel = null;

  @SerializedName("exhaustion")
  private BigDecimal exhaustion = null;

  @SerializedName("saturation")
  private BigDecimal saturation = null;

  public PlayerFullFood foodLevel(BigDecimal foodLevel) {
    this.foodLevel = foodLevel;
    return this;
  }

   /**
   * The current amount of food the player has.
   * @return foodLevel
  **/
  @ApiModelProperty(value = "The current amount of food the player has.")
  public BigDecimal getFoodLevel() {
    return foodLevel;
  }

  public void setFoodLevel(BigDecimal foodLevel) {
    this.foodLevel = foodLevel;
  }

  public PlayerFullFood exhaustion(BigDecimal exhaustion) {
    this.exhaustion = exhaustion;
    return this;
  }

   /**
   * How exhausted the player is.
   * @return exhaustion
  **/
  @ApiModelProperty(value = "How exhausted the player is.")
  public BigDecimal getExhaustion() {
    return exhaustion;
  }

  public void setExhaustion(BigDecimal exhaustion) {
    this.exhaustion = exhaustion;
  }

  public PlayerFullFood saturation(BigDecimal saturation) {
    this.saturation = saturation;
    return this;
  }

   /**
   * How saturated the player is.
   * @return saturation
  **/
  @ApiModelProperty(value = "How saturated the player is.")
  public BigDecimal getSaturation() {
    return saturation;
  }

  public void setSaturation(BigDecimal saturation) {
    this.saturation = saturation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerFullFood playerFullFood = (PlayerFullFood) o;
    return Objects.equals(this.foodLevel, playerFullFood.foodLevel) &&
        Objects.equals(this.exhaustion, playerFullFood.exhaustion) &&
        Objects.equals(this.saturation, playerFullFood.saturation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foodLevel, exhaustion, saturation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerFullFood {\n");
    
    sb.append("    foodLevel: ").append(toIndentedString(foodLevel)).append("\n");
    sb.append("    exhaustion: ").append(toIndentedString(exhaustion)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
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

