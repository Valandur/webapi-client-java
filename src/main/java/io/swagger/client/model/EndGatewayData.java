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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Vector3i;
import java.io.IOException;

/**
 * EndGatewayData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T13:32:53.543+02:00")
public class EndGatewayData {
  @SerializedName("age")
  private Long age = null;

  @SerializedName("exactTeleport")
  private Boolean exactTeleport = null;

  @SerializedName("exitPosition")
  private Vector3i exitPosition = null;

  @SerializedName("teleportCooldown")
  private Integer teleportCooldown = null;

  public EndGatewayData age(Long age) {
    this.age = age;
    return this;
  }

   /**
   * The age of this gateway
   * @return age
  **/
  @ApiModelProperty(required = true, value = "The age of this gateway")
  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public EndGatewayData exactTeleport(Boolean exactTeleport) {
    this.exactTeleport = exactTeleport;
    return this;
  }

   /**
   * True if this is an exact teleport, false otherwise
   * @return exactTeleport
  **/
  @ApiModelProperty(required = true, value = "True if this is an exact teleport, false otherwise")
  public Boolean isExactTeleport() {
    return exactTeleport;
  }

  public void setExactTeleport(Boolean exactTeleport) {
    this.exactTeleport = exactTeleport;
  }

  public EndGatewayData exitPosition(Vector3i exitPosition) {
    this.exitPosition = exitPosition;
    return this;
  }

   /**
   * The exit position in the nether
   * @return exitPosition
  **/
  @ApiModelProperty(required = true, value = "The exit position in the nether")
  public Vector3i getExitPosition() {
    return exitPosition;
  }

  public void setExitPosition(Vector3i exitPosition) {
    this.exitPosition = exitPosition;
  }

  public EndGatewayData teleportCooldown(Integer teleportCooldown) {
    this.teleportCooldown = teleportCooldown;
    return this;
  }

   /**
   * The cooldown of the teleport
   * @return teleportCooldown
  **/
  @ApiModelProperty(required = true, value = "The cooldown of the teleport")
  public Integer getTeleportCooldown() {
    return teleportCooldown;
  }

  public void setTeleportCooldown(Integer teleportCooldown) {
    this.teleportCooldown = teleportCooldown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndGatewayData endGatewayData = (EndGatewayData) o;
    return Objects.equals(this.age, endGatewayData.age) &&
        Objects.equals(this.exactTeleport, endGatewayData.exactTeleport) &&
        Objects.equals(this.exitPosition, endGatewayData.exitPosition) &&
        Objects.equals(this.teleportCooldown, endGatewayData.teleportCooldown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, exactTeleport, exitPosition, teleportCooldown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndGatewayData {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    exactTeleport: ").append(toIndentedString(exactTeleport)).append("\n");
    sb.append("    exitPosition: ").append(toIndentedString(exitPosition)).append("\n");
    sb.append("    teleportCooldown: ").append(toIndentedString(teleportCooldown)).append("\n");
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

