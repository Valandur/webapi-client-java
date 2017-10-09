/**
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  #/ Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  #/ Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
 *
 * OpenAPI spec version: <version>
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UpdateEntityRequestDamage;
import io.swagger.client.model.Vector3;


/**
 * UpdateEntityRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T12:59:04.867+02:00")
public class UpdateEntityRequest   {
  @SerializedName("world")
  private String world = null;

  @SerializedName("position")
  private Vector3 position = null;

  @SerializedName("velocity")
  private Vector3 velocity = null;

  @SerializedName("rotation")
  private Vector3 rotation = null;

  @SerializedName("scale")
  private Vector3 scale = null;

  @SerializedName("damage")
  private UpdateEntityRequestDamage damage = null;

  public UpdateEntityRequest world(String world) {
    this.world = world;
    return this;
  }

   /**
   * The UUID or name of the world that the entity is moved to.
   * @return world
  **/
  @ApiModelProperty(example = "null", value = "The UUID or name of the world that the entity is moved to.")
  public String getWorld() {
    return world;
  }

  public void setWorld(String world) {
    this.world = world;
  }

  public UpdateEntityRequest position(Vector3 position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "")
  public Vector3 getPosition() {
    return position;
  }

  public void setPosition(Vector3 position) {
    this.position = position;
  }

  public UpdateEntityRequest velocity(Vector3 velocity) {
    this.velocity = velocity;
    return this;
  }

   /**
   * Get velocity
   * @return velocity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Vector3 getVelocity() {
    return velocity;
  }

  public void setVelocity(Vector3 velocity) {
    this.velocity = velocity;
  }

  public UpdateEntityRequest rotation(Vector3 rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Vector3 getRotation() {
    return rotation;
  }

  public void setRotation(Vector3 rotation) {
    this.rotation = rotation;
  }

  public UpdateEntityRequest scale(Vector3 scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(example = "null", value = "")
  public Vector3 getScale() {
    return scale;
  }

  public void setScale(Vector3 scale) {
    this.scale = scale;
  }

  public UpdateEntityRequest damage(UpdateEntityRequestDamage damage) {
    this.damage = damage;
    return this;
  }

   /**
   * Get damage
   * @return damage
  **/
  @ApiModelProperty(example = "null", value = "")
  public UpdateEntityRequestDamage getDamage() {
    return damage;
  }

  public void setDamage(UpdateEntityRequestDamage damage) {
    this.damage = damage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEntityRequest updateEntityRequest = (UpdateEntityRequest) o;
    return Objects.equals(this.world, updateEntityRequest.world) &&
        Objects.equals(this.position, updateEntityRequest.position) &&
        Objects.equals(this.velocity, updateEntityRequest.velocity) &&
        Objects.equals(this.rotation, updateEntityRequest.rotation) &&
        Objects.equals(this.scale, updateEntityRequest.scale) &&
        Objects.equals(this.damage, updateEntityRequest.damage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(world, position, velocity, rotation, scale, damage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEntityRequest {\n");
    
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
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
