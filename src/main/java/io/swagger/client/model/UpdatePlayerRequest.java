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
import io.swagger.client.model.DamageRequest1;
import io.swagger.client.model.Vector3;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * UpdatePlayerRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class UpdatePlayerRequest {
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

  @SerializedName("foodLevel")
  private BigDecimal foodLevel = null;

  @SerializedName("exhaustion")
  private Double exhaustion = null;

  @SerializedName("saturation")
  private Double saturation = null;

  @SerializedName("totalExperience")
  private BigDecimal totalExperience = null;

  @SerializedName("level")
  private BigDecimal level = null;

  @SerializedName("experienceSinceLevel")
  private BigDecimal experienceSinceLevel = null;

  @SerializedName("health")
  private Double health = null;

  @SerializedName("maxHealth")
  private Double maxHealth = null;

  @SerializedName("damage")
  private DamageRequest1 damage = null;

  public UpdatePlayerRequest world(String world) {
    this.world = world;
    return this;
  }

   /**
   * The UUID or name of the world that the player is moved to.
   * @return world
  **/
  @ApiModelProperty(value = "The UUID or name of the world that the player is moved to.")
  public String getWorld() {
    return world;
  }

  public void setWorld(String world) {
    this.world = world;
  }

  public UpdatePlayerRequest position(Vector3 position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Vector3 getPosition() {
    return position;
  }

  public void setPosition(Vector3 position) {
    this.position = position;
  }

  public UpdatePlayerRequest velocity(Vector3 velocity) {
    this.velocity = velocity;
    return this;
  }

   /**
   * Get velocity
   * @return velocity
  **/
  @ApiModelProperty(value = "")
  public Vector3 getVelocity() {
    return velocity;
  }

  public void setVelocity(Vector3 velocity) {
    this.velocity = velocity;
  }

  public UpdatePlayerRequest rotation(Vector3 rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @ApiModelProperty(value = "")
  public Vector3 getRotation() {
    return rotation;
  }

  public void setRotation(Vector3 rotation) {
    this.rotation = rotation;
  }

  public UpdatePlayerRequest scale(Vector3 scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public Vector3 getScale() {
    return scale;
  }

  public void setScale(Vector3 scale) {
    this.scale = scale;
  }

  public UpdatePlayerRequest foodLevel(BigDecimal foodLevel) {
    this.foodLevel = foodLevel;
    return this;
  }

   /**
   * The new food level of the player.
   * @return foodLevel
  **/
  @ApiModelProperty(value = "The new food level of the player.")
  public BigDecimal getFoodLevel() {
    return foodLevel;
  }

  public void setFoodLevel(BigDecimal foodLevel) {
    this.foodLevel = foodLevel;
  }

  public UpdatePlayerRequest exhaustion(Double exhaustion) {
    this.exhaustion = exhaustion;
    return this;
  }

   /**
   * The new exhaustion level of the player.
   * @return exhaustion
  **/
  @ApiModelProperty(value = "The new exhaustion level of the player.")
  public Double getExhaustion() {
    return exhaustion;
  }

  public void setExhaustion(Double exhaustion) {
    this.exhaustion = exhaustion;
  }

  public UpdatePlayerRequest saturation(Double saturation) {
    this.saturation = saturation;
    return this;
  }

   /**
   * The new saturation level of the player.
   * @return saturation
  **/
  @ApiModelProperty(value = "The new saturation level of the player.")
  public Double getSaturation() {
    return saturation;
  }

  public void setSaturation(Double saturation) {
    this.saturation = saturation;
  }

  public UpdatePlayerRequest totalExperience(BigDecimal totalExperience) {
    this.totalExperience = totalExperience;
    return this;
  }

   /**
   * The total amount of experience the player has. This implicitly also sets the level.
   * @return totalExperience
  **/
  @ApiModelProperty(value = "The total amount of experience the player has. This implicitly also sets the level.")
  public BigDecimal getTotalExperience() {
    return totalExperience;
  }

  public void setTotalExperience(BigDecimal totalExperience) {
    this.totalExperience = totalExperience;
  }

  public UpdatePlayerRequest level(BigDecimal level) {
    this.level = level;
    return this;
  }

   /**
   * The current level of the player. This is also defined by the total amount of experience the player has.
   * @return level
  **/
  @ApiModelProperty(value = "The current level of the player. This is also defined by the total amount of experience the player has.")
  public BigDecimal getLevel() {
    return level;
  }

  public void setLevel(BigDecimal level) {
    this.level = level;
  }

  public UpdatePlayerRequest experienceSinceLevel(BigDecimal experienceSinceLevel) {
    this.experienceSinceLevel = experienceSinceLevel;
    return this;
  }

   /**
   * The amount of experience since the last level up that the player has collected.
   * @return experienceSinceLevel
  **/
  @ApiModelProperty(value = "The amount of experience since the last level up that the player has collected.")
  public BigDecimal getExperienceSinceLevel() {
    return experienceSinceLevel;
  }

  public void setExperienceSinceLevel(BigDecimal experienceSinceLevel) {
    this.experienceSinceLevel = experienceSinceLevel;
  }

  public UpdatePlayerRequest health(Double health) {
    this.health = health;
    return this;
  }

   /**
   * The current amount of health the player has.
   * @return health
  **/
  @ApiModelProperty(value = "The current amount of health the player has.")
  public Double getHealth() {
    return health;
  }

  public void setHealth(Double health) {
    this.health = health;
  }

  public UpdatePlayerRequest maxHealth(Double maxHealth) {
    this.maxHealth = maxHealth;
    return this;
  }

   /**
   * The total amount of health the player can have at maximum.
   * @return maxHealth
  **/
  @ApiModelProperty(value = "The total amount of health the player can have at maximum.")
  public Double getMaxHealth() {
    return maxHealth;
  }

  public void setMaxHealth(Double maxHealth) {
    this.maxHealth = maxHealth;
  }

  public UpdatePlayerRequest damage(DamageRequest1 damage) {
    this.damage = damage;
    return this;
  }

   /**
   * Get damage
   * @return damage
  **/
  @ApiModelProperty(value = "")
  public DamageRequest1 getDamage() {
    return damage;
  }

  public void setDamage(DamageRequest1 damage) {
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
    UpdatePlayerRequest updatePlayerRequest = (UpdatePlayerRequest) o;
    return Objects.equals(this.world, updatePlayerRequest.world) &&
        Objects.equals(this.position, updatePlayerRequest.position) &&
        Objects.equals(this.velocity, updatePlayerRequest.velocity) &&
        Objects.equals(this.rotation, updatePlayerRequest.rotation) &&
        Objects.equals(this.scale, updatePlayerRequest.scale) &&
        Objects.equals(this.foodLevel, updatePlayerRequest.foodLevel) &&
        Objects.equals(this.exhaustion, updatePlayerRequest.exhaustion) &&
        Objects.equals(this.saturation, updatePlayerRequest.saturation) &&
        Objects.equals(this.totalExperience, updatePlayerRequest.totalExperience) &&
        Objects.equals(this.level, updatePlayerRequest.level) &&
        Objects.equals(this.experienceSinceLevel, updatePlayerRequest.experienceSinceLevel) &&
        Objects.equals(this.health, updatePlayerRequest.health) &&
        Objects.equals(this.maxHealth, updatePlayerRequest.maxHealth) &&
        Objects.equals(this.damage, updatePlayerRequest.damage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(world, position, velocity, rotation, scale, foodLevel, exhaustion, saturation, totalExperience, level, experienceSinceLevel, health, maxHealth, damage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePlayerRequest {\n");
    
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    foodLevel: ").append(toIndentedString(foodLevel)).append("\n");
    sb.append("    exhaustion: ").append(toIndentedString(exhaustion)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    totalExperience: ").append(toIndentedString(totalExperience)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    experienceSinceLevel: ").append(toIndentedString(experienceSinceLevel)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    maxHealth: ").append(toIndentedString(maxHealth)).append("\n");
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

