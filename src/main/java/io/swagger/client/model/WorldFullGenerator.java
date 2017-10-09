/*
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  #/ Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  #/ Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
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

/**
 * WorldFullGenerator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T13:12:20.507+02:00")
public class WorldFullGenerator {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("settings")
  private String settings = null;

  public WorldFullGenerator id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the generator type.
   * @return id
  **/
  @ApiModelProperty(value = "The unique id of the generator type.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorldFullGenerator name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the generator type.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the generator type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorldFullGenerator settings(String settings) {
    this.settings = settings;
    return this;
  }

   /**
   * A map of various generator settings to values.
   * @return settings
  **/
  @ApiModelProperty(value = "A map of various generator settings to values.")
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldFullGenerator worldFullGenerator = (WorldFullGenerator) o;
    return Objects.equals(this.id, worldFullGenerator.id) &&
        Objects.equals(this.name, worldFullGenerator.name) &&
        Objects.equals(this.settings, worldFullGenerator.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldFullGenerator {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

