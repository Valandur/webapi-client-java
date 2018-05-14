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
import io.swagger.client.model.World;
import java.io.IOException;

/**
 * Transform
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T13:42:56.227+02:00")
public class Transform {
  @SerializedName("world")
  private World world = null;

  @SerializedName("position")
  private Vector3d position = null;

  @SerializedName("rotation")
  private Vector3d rotation = null;

  @SerializedName("scale")
  private Vector3d scale = null;

  public Transform world(World world) {
    this.world = world;
    return this;
  }

   /**
   * The world of this transform
   * @return world
  **/
  @ApiModelProperty(required = true, value = "The world of this transform")
  public World getWorld() {
    return world;
  }

  public void setWorld(World world) {
    this.world = world;
  }

  public Transform position(Vector3d position) {
    this.position = position;
    return this;
  }

   /**
   * The position within the world
   * @return position
  **/
  @ApiModelProperty(required = true, value = "The position within the world")
  public Vector3d getPosition() {
    return position;
  }

  public void setPosition(Vector3d position) {
    this.position = position;
  }

  public Transform rotation(Vector3d rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * The rotation of the object
   * @return rotation
  **/
  @ApiModelProperty(required = true, value = "The rotation of the object")
  public Vector3d getRotation() {
    return rotation;
  }

  public void setRotation(Vector3d rotation) {
    this.rotation = rotation;
  }

  public Transform scale(Vector3d scale) {
    this.scale = scale;
    return this;
  }

   /**
   * The scale of the object
   * @return scale
  **/
  @ApiModelProperty(required = true, value = "The scale of the object")
  public Vector3d getScale() {
    return scale;
  }

  public void setScale(Vector3d scale) {
    this.scale = scale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transform transform = (Transform) o;
    return Objects.equals(this.world, transform.world) &&
        Objects.equals(this.position, transform.position) &&
        Objects.equals(this.rotation, transform.rotation) &&
        Objects.equals(this.scale, transform.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(world, position, rotation, scale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transform {\n");
    
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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
