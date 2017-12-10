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
import io.swagger.client.model.Location;
import java.io.IOException;

/**
 * Player
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-10T13:08:53.752+01:00")
public class Player {
  @SerializedName("type")
  private String type = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("class")
  private String propertyClass = null;

  public Player type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of player, usually &#x60;minecraft:player&#x60;
   * @return type
  **/
  @ApiModelProperty(value = "The type of player, usually `minecraft:player`")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Player uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The unique identifier of the player.
   * @return uuid
  **/
  @ApiModelProperty(value = "The unique identifier of the player.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Player online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * True if the player is currently online, false otherwise.
   * @return online
  **/
  @ApiModelProperty(value = "True if the player is currently online, false otherwise.")
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public Player location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Player name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the player.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the player.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The API URL which contains detailed information about this player.
   * @return link
  **/
  @ApiModelProperty(value = "The API URL which contains detailed information about this player.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Player propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * The fully qualified class name of the object representing the player. Usually &#x60;net.minecraft.entity.player.EntityPlayerMP&#x60;.
   * @return propertyClass
  **/
  @ApiModelProperty(value = "The fully qualified class name of the object representing the player. Usually `net.minecraft.entity.player.EntityPlayerMP`.")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return Objects.equals(this.type, player.type) &&
        Objects.equals(this.uuid, player.uuid) &&
        Objects.equals(this.online, player.online) &&
        Objects.equals(this.location, player.location) &&
        Objects.equals(this.name, player.name) &&
        Objects.equals(this.link, player.link) &&
        Objects.equals(this.propertyClass, player.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uuid, online, location, name, link, propertyClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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

