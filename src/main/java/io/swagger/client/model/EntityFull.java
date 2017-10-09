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
import io.swagger.client.model.Entity;
import io.swagger.client.model.Location;
import io.swagger.client.model.Vector3;


/**
 * EntityFull
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T12:59:04.867+02:00")
public class EntityFull   {
  @SerializedName("velocity")
  private Vector3 velocity = null;

  @SerializedName("rotation")
  private Vector3 rotation = null;

  @SerializedName("scale")
  private Vector3 scale = null;

  public EntityFull velocity(Vector3 velocity) {
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

  public EntityFull rotation(Vector3 rotation) {
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

  public EntityFull scale(Vector3 scale) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityFull entityFull = (EntityFull) o;
    return Objects.equals(this.velocity, entityFull.velocity) &&
        Objects.equals(this.rotation, entityFull.rotation) &&
        Objects.equals(this.scale, entityFull.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(velocity, rotation, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFull {\n");
    
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
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
