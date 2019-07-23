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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DamageRequest;
import io.swagger.client.model.SlotRequest;
import io.swagger.client.model.Vector3d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateEntityRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T12:56:27.838+02:00")
public class UpdateEntityRequest {
  @SerializedName("damage")
  private DamageRequest damage = null;

  @SerializedName("inventory")
  private List<SlotRequest> inventory = null;

  @SerializedName("position")
  private Vector3d position = null;

  @SerializedName("rotation")
  private Vector3d rotation = null;

  @SerializedName("scale")
  private Vector3d scale = null;

  @SerializedName("velocity")
  private Vector3d velocity = null;

  @SerializedName("world")
  private String world = null;

  public UpdateEntityRequest damage(DamageRequest damage) {
    this.damage = damage;
    return this;
  }

   /**
   * The damage the entity will take
   * @return damage
  **/
  @ApiModelProperty(value = "The damage the entity will take")
  public DamageRequest getDamage() {
    return damage;
  }

  public void setDamage(DamageRequest damage) {
    this.damage = damage;
  }

  public UpdateEntityRequest inventory(List<SlotRequest> inventory) {
    this.inventory = inventory;
    return this;
  }

  public UpdateEntityRequest addInventoryItem(SlotRequest inventoryItem) {
    if (this.inventory == null) {
      this.inventory = new ArrayList<SlotRequest>();
    }
    this.inventory.add(inventoryItem);
    return this;
  }

   /**
   * The slots in the inventory of the entity to modify
   * @return inventory
  **/
  @ApiModelProperty(value = "The slots in the inventory of the entity to modify")
  public List<SlotRequest> getInventory() {
    return inventory;
  }

  public void setInventory(List<SlotRequest> inventory) {
    this.inventory = inventory;
  }

  public UpdateEntityRequest position(Vector3d position) {
    this.position = position;
    return this;
  }

   /**
   * The position that the entity will be moved to
   * @return position
  **/
  @ApiModelProperty(value = "The position that the entity will be moved to")
  public Vector3d getPosition() {
    return position;
  }

  public void setPosition(Vector3d position) {
    this.position = position;
  }

  public UpdateEntityRequest rotation(Vector3d rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * The new rotation of the entity
   * @return rotation
  **/
  @ApiModelProperty(value = "The new rotation of the entity")
  public Vector3d getRotation() {
    return rotation;
  }

  public void setRotation(Vector3d rotation) {
    this.rotation = rotation;
  }

  public UpdateEntityRequest scale(Vector3d scale) {
    this.scale = scale;
    return this;
  }

   /**
   * The new scale of the entity
   * @return scale
  **/
  @ApiModelProperty(value = "The new scale of the entity")
  public Vector3d getScale() {
    return scale;
  }

  public void setScale(Vector3d scale) {
    this.scale = scale;
  }

  public UpdateEntityRequest velocity(Vector3d velocity) {
    this.velocity = velocity;
    return this;
  }

   /**
   * The new speed of the entity
   * @return velocity
  **/
  @ApiModelProperty(value = "The new speed of the entity")
  public Vector3d getVelocity() {
    return velocity;
  }

  public void setVelocity(Vector3d velocity) {
    this.velocity = velocity;
  }

  public UpdateEntityRequest world(String world) {
    this.world = world;
    return this;
  }

   /**
   * The world that the entity will be moved to
   * @return world
  **/
  @ApiModelProperty(value = "The world that the entity will be moved to")
  public String getWorld() {
    return world;
  }

  public void setWorld(String world) {
    this.world = world;
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
    return Objects.equals(this.damage, updateEntityRequest.damage) &&
        Objects.equals(this.inventory, updateEntityRequest.inventory) &&
        Objects.equals(this.position, updateEntityRequest.position) &&
        Objects.equals(this.rotation, updateEntityRequest.rotation) &&
        Objects.equals(this.scale, updateEntityRequest.scale) &&
        Objects.equals(this.velocity, updateEntityRequest.velocity) &&
        Objects.equals(this.world, updateEntityRequest.world);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damage, inventory, position, rotation, scale, velocity, world);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEntityRequest {\n");
    
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
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

