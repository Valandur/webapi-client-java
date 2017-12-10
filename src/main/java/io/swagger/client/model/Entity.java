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
 * Entity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-10T13:08:53.752+01:00")
public class Entity {
  @SerializedName("type")
  private String type = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("class")
  private String propertyClass = null;

  public Entity type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the entity.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the entity.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Entity uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The uuid of the entity.
   * @return uuid
  **/
  @ApiModelProperty(value = "The uuid of the entity.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Entity location(Location location) {
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

  public Entity link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The API URL which contains detailed information about this entity.
   * @return link
  **/
  @ApiModelProperty(value = "The API URL which contains detailed information about this entity.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Entity propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * The fully qualified classname of the entity.
   * @return propertyClass
  **/
  @ApiModelProperty(value = "The fully qualified classname of the entity.")
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
    Entity entity = (Entity) o;
    return Objects.equals(this.type, entity.type) &&
        Objects.equals(this.uuid, entity.uuid) &&
        Objects.equals(this.location, entity.location) &&
        Objects.equals(this.link, entity.link) &&
        Objects.equals(this.propertyClass, entity.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uuid, location, link, propertyClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

