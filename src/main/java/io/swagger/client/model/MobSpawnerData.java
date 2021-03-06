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
import io.swagger.client.model.EntityArchtype;
import io.swagger.client.model.TableEntryEntityArchetype;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MobSpawnerData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T13:32:53.543+02:00")
public class MobSpawnerData {
  @SerializedName("maximumNearbyEntities")
  private Integer maximumNearbyEntities = null;

  @SerializedName("maximumSpawnDelay")
  private Integer maximumSpawnDelay = null;

  @SerializedName("minimumSpawnDelay")
  private Integer minimumSpawnDelay = null;

  @SerializedName("nextEntityToSpawn")
  private EntityArchtype nextEntityToSpawn = null;

  @SerializedName("possibleEntitiesToSpawn")
  private List<TableEntryEntityArchetype> possibleEntitiesToSpawn = new ArrayList<TableEntryEntityArchetype>();

  @SerializedName("remainingDelay")
  private Integer remainingDelay = null;

  @SerializedName("requiredPlayerRange")
  private Integer requiredPlayerRange = null;

  @SerializedName("spawnCount")
  private Integer spawnCount = null;

  @SerializedName("spawnRange")
  private Integer spawnRange = null;

  public MobSpawnerData maximumNearbyEntities(Integer maximumNearbyEntities) {
    this.maximumNearbyEntities = maximumNearbyEntities;
    return this;
  }

   /**
   * The maximum number of nearby entities for another mob to spawn
   * @return maximumNearbyEntities
  **/
  @ApiModelProperty(required = true, value = "The maximum number of nearby entities for another mob to spawn")
  public Integer getMaximumNearbyEntities() {
    return maximumNearbyEntities;
  }

  public void setMaximumNearbyEntities(Integer maximumNearbyEntities) {
    this.maximumNearbyEntities = maximumNearbyEntities;
  }

  public MobSpawnerData maximumSpawnDelay(Integer maximumSpawnDelay) {
    this.maximumSpawnDelay = maximumSpawnDelay;
    return this;
  }

   /**
   * The maximum delay between two consecutive spawns
   * @return maximumSpawnDelay
  **/
  @ApiModelProperty(required = true, value = "The maximum delay between two consecutive spawns")
  public Integer getMaximumSpawnDelay() {
    return maximumSpawnDelay;
  }

  public void setMaximumSpawnDelay(Integer maximumSpawnDelay) {
    this.maximumSpawnDelay = maximumSpawnDelay;
  }

  public MobSpawnerData minimumSpawnDelay(Integer minimumSpawnDelay) {
    this.minimumSpawnDelay = minimumSpawnDelay;
    return this;
  }

   /**
   * The minimum delay between two consecutive spawns
   * @return minimumSpawnDelay
  **/
  @ApiModelProperty(required = true, value = "The minimum delay between two consecutive spawns")
  public Integer getMinimumSpawnDelay() {
    return minimumSpawnDelay;
  }

  public void setMinimumSpawnDelay(Integer minimumSpawnDelay) {
    this.minimumSpawnDelay = minimumSpawnDelay;
  }

  public MobSpawnerData nextEntityToSpawn(EntityArchtype nextEntityToSpawn) {
    this.nextEntityToSpawn = nextEntityToSpawn;
    return this;
  }

   /**
   * The next entity type that will be spawned by this spawner
   * @return nextEntityToSpawn
  **/
  @ApiModelProperty(required = true, value = "The next entity type that will be spawned by this spawner")
  public EntityArchtype getNextEntityToSpawn() {
    return nextEntityToSpawn;
  }

  public void setNextEntityToSpawn(EntityArchtype nextEntityToSpawn) {
    this.nextEntityToSpawn = nextEntityToSpawn;
  }

  public MobSpawnerData possibleEntitiesToSpawn(List<TableEntryEntityArchetype> possibleEntitiesToSpawn) {
    this.possibleEntitiesToSpawn = possibleEntitiesToSpawn;
    return this;
  }

  public MobSpawnerData addPossibleEntitiesToSpawnItem(TableEntryEntityArchetype possibleEntitiesToSpawnItem) {
    this.possibleEntitiesToSpawn.add(possibleEntitiesToSpawnItem);
    return this;
  }

   /**
   * A weighted table of probability for each entity type to spawn
   * @return possibleEntitiesToSpawn
  **/
  @ApiModelProperty(required = true, value = "A weighted table of probability for each entity type to spawn")
  public List<TableEntryEntityArchetype> getPossibleEntitiesToSpawn() {
    return possibleEntitiesToSpawn;
  }

  public void setPossibleEntitiesToSpawn(List<TableEntryEntityArchetype> possibleEntitiesToSpawn) {
    this.possibleEntitiesToSpawn = possibleEntitiesToSpawn;
  }

  public MobSpawnerData remainingDelay(Integer remainingDelay) {
    this.remainingDelay = remainingDelay;
    return this;
  }

   /**
   * The remaining time until the next spawn attempt
   * @return remainingDelay
  **/
  @ApiModelProperty(required = true, value = "The remaining time until the next spawn attempt")
  public Integer getRemainingDelay() {
    return remainingDelay;
  }

  public void setRemainingDelay(Integer remainingDelay) {
    this.remainingDelay = remainingDelay;
  }

  public MobSpawnerData requiredPlayerRange(Integer requiredPlayerRange) {
    this.requiredPlayerRange = requiredPlayerRange;
    return this;
  }

   /**
   * The block range within there must be a player to trigger the spawn
   * @return requiredPlayerRange
  **/
  @ApiModelProperty(required = true, value = "The block range within there must be a player to trigger the spawn")
  public Integer getRequiredPlayerRange() {
    return requiredPlayerRange;
  }

  public void setRequiredPlayerRange(Integer requiredPlayerRange) {
    this.requiredPlayerRange = requiredPlayerRange;
  }

  public MobSpawnerData spawnCount(Integer spawnCount) {
    this.spawnCount = spawnCount;
    return this;
  }

   /**
   * The amount of entities that will spawn in one attempt
   * @return spawnCount
  **/
  @ApiModelProperty(required = true, value = "The amount of entities that will spawn in one attempt")
  public Integer getSpawnCount() {
    return spawnCount;
  }

  public void setSpawnCount(Integer spawnCount) {
    this.spawnCount = spawnCount;
  }

  public MobSpawnerData spawnRange(Integer spawnRange) {
    this.spawnRange = spawnRange;
    return this;
  }

   /**
   * The range from the spawner within which the entities will spawn
   * @return spawnRange
  **/
  @ApiModelProperty(required = true, value = "The range from the spawner within which the entities will spawn")
  public Integer getSpawnRange() {
    return spawnRange;
  }

  public void setSpawnRange(Integer spawnRange) {
    this.spawnRange = spawnRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobSpawnerData mobSpawnerData = (MobSpawnerData) o;
    return Objects.equals(this.maximumNearbyEntities, mobSpawnerData.maximumNearbyEntities) &&
        Objects.equals(this.maximumSpawnDelay, mobSpawnerData.maximumSpawnDelay) &&
        Objects.equals(this.minimumSpawnDelay, mobSpawnerData.minimumSpawnDelay) &&
        Objects.equals(this.nextEntityToSpawn, mobSpawnerData.nextEntityToSpawn) &&
        Objects.equals(this.possibleEntitiesToSpawn, mobSpawnerData.possibleEntitiesToSpawn) &&
        Objects.equals(this.remainingDelay, mobSpawnerData.remainingDelay) &&
        Objects.equals(this.requiredPlayerRange, mobSpawnerData.requiredPlayerRange) &&
        Objects.equals(this.spawnCount, mobSpawnerData.spawnCount) &&
        Objects.equals(this.spawnRange, mobSpawnerData.spawnRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumNearbyEntities, maximumSpawnDelay, minimumSpawnDelay, nextEntityToSpawn, possibleEntitiesToSpawn, remainingDelay, requiredPlayerRange, spawnCount, spawnRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobSpawnerData {\n");
    
    sb.append("    maximumNearbyEntities: ").append(toIndentedString(maximumNearbyEntities)).append("\n");
    sb.append("    maximumSpawnDelay: ").append(toIndentedString(maximumSpawnDelay)).append("\n");
    sb.append("    minimumSpawnDelay: ").append(toIndentedString(minimumSpawnDelay)).append("\n");
    sb.append("    nextEntityToSpawn: ").append(toIndentedString(nextEntityToSpawn)).append("\n");
    sb.append("    possibleEntitiesToSpawn: ").append(toIndentedString(possibleEntitiesToSpawn)).append("\n");
    sb.append("    remainingDelay: ").append(toIndentedString(remainingDelay)).append("\n");
    sb.append("    requiredPlayerRange: ").append(toIndentedString(requiredPlayerRange)).append("\n");
    sb.append("    spawnCount: ").append(toIndentedString(spawnCount)).append("\n");
    sb.append("    spawnRange: ").append(toIndentedString(spawnRange)).append("\n");
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

