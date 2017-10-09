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
import io.swagger.client.model.World;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * NationsRect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class NationsRect {
  @SerializedName("world")
  private World world = null;

  @SerializedName("minX")
  private BigDecimal minX = null;

  @SerializedName("minY")
  private BigDecimal minY = null;

  @SerializedName("maxX")
  private BigDecimal maxX = null;

  @SerializedName("maxY")
  private BigDecimal maxY = null;

  public NationsRect world(World world) {
    this.world = world;
    return this;
  }

   /**
   * Get world
   * @return world
  **/
  @ApiModelProperty(value = "")
  public World getWorld() {
    return world;
  }

  public void setWorld(World world) {
    this.world = world;
  }

  public NationsRect minX(BigDecimal minX) {
    this.minX = minX;
    return this;
  }

   /**
   * The minimum x coordinate of this rect.
   * @return minX
  **/
  @ApiModelProperty(value = "The minimum x coordinate of this rect.")
  public BigDecimal getMinX() {
    return minX;
  }

  public void setMinX(BigDecimal minX) {
    this.minX = minX;
  }

  public NationsRect minY(BigDecimal minY) {
    this.minY = minY;
    return this;
  }

   /**
   * The minimum y coordinate of this rect.
   * @return minY
  **/
  @ApiModelProperty(value = "The minimum y coordinate of this rect.")
  public BigDecimal getMinY() {
    return minY;
  }

  public void setMinY(BigDecimal minY) {
    this.minY = minY;
  }

  public NationsRect maxX(BigDecimal maxX) {
    this.maxX = maxX;
    return this;
  }

   /**
   * The maximum x coordinate of this rect.
   * @return maxX
  **/
  @ApiModelProperty(value = "The maximum x coordinate of this rect.")
  public BigDecimal getMaxX() {
    return maxX;
  }

  public void setMaxX(BigDecimal maxX) {
    this.maxX = maxX;
  }

  public NationsRect maxY(BigDecimal maxY) {
    this.maxY = maxY;
    return this;
  }

   /**
   * The maximum y coordinate of this rect.
   * @return maxY
  **/
  @ApiModelProperty(value = "The maximum y coordinate of this rect.")
  public BigDecimal getMaxY() {
    return maxY;
  }

  public void setMaxY(BigDecimal maxY) {
    this.maxY = maxY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationsRect nationsRect = (NationsRect) o;
    return Objects.equals(this.world, nationsRect.world) &&
        Objects.equals(this.minX, nationsRect.minX) &&
        Objects.equals(this.minY, nationsRect.minY) &&
        Objects.equals(this.maxX, nationsRect.maxX) &&
        Objects.equals(this.maxY, nationsRect.maxY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(world, minX, minY, maxX, maxY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationsRect {\n");
    
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    minX: ").append(toIndentedString(minX)).append("\n");
    sb.append("    minY: ").append(toIndentedString(minY)).append("\n");
    sb.append("    maxX: ").append(toIndentedString(maxX)).append("\n");
    sb.append("    maxY: ").append(toIndentedString(maxY)).append("\n");
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
