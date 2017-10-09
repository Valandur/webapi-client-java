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
import io.swagger.client.model.Chunk;
import io.swagger.client.model.Vector3;
import io.swagger.client.model.World;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ChunkFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class ChunkFull {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("position")
  private Vector3 position = null;

  @SerializedName("world")
  private World world = null;

  @SerializedName("blockMin")
  private Vector3 blockMin = null;

  @SerializedName("blockMax")
  private Vector3 blockMax = null;

  @SerializedName("isLoaded")
  private Boolean isLoaded = null;

  @SerializedName("inhabitedTime")
  private BigDecimal inhabitedTime = null;

  @SerializedName("difficultyFactor")
  private Double difficultyFactor = null;

  @SerializedName("difficultyPercentage")
  private Double difficultyPercentage = null;

  public ChunkFull uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The unique identifier of the chunk.
   * @return uuid
  **/
  @ApiModelProperty(value = "The unique identifier of the chunk.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ChunkFull position(Vector3 position) {
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

  public ChunkFull world(World world) {
    this.world = world;
    return this;
  }

   /**
   * Get world
   * @return world
  **/
  @ApiModelProperty(value = "")
  public World getWorld() {
    return world;
  }

  public void setWorld(World world) {
    this.world = world;
  }

  public ChunkFull blockMin(Vector3 blockMin) {
    this.blockMin = blockMin;
    return this;
  }

   /**
   * Get blockMin
   * @return blockMin
  **/
  @ApiModelProperty(value = "")
  public Vector3 getBlockMin() {
    return blockMin;
  }

  public void setBlockMin(Vector3 blockMin) {
    this.blockMin = blockMin;
  }

  public ChunkFull blockMax(Vector3 blockMax) {
    this.blockMax = blockMax;
    return this;
  }

   /**
   * Get blockMax
   * @return blockMax
  **/
  @ApiModelProperty(value = "")
  public Vector3 getBlockMax() {
    return blockMax;
  }

  public void setBlockMax(Vector3 blockMax) {
    this.blockMax = blockMax;
  }

  public ChunkFull isLoaded(Boolean isLoaded) {
    this.isLoaded = isLoaded;
    return this;
  }

   /**
   * True if the chunk is currently loaded in the world, false otherwise.
   * @return isLoaded
  **/
  @ApiModelProperty(value = "True if the chunk is currently loaded in the world, false otherwise.")
  public Boolean getIsLoaded() {
    return isLoaded;
  }

  public void setIsLoaded(Boolean isLoaded) {
    this.isLoaded = isLoaded;
  }

  public ChunkFull inhabitedTime(BigDecimal inhabitedTime) {
    this.inhabitedTime = inhabitedTime;
    return this;
  }

   /**
   * The number of ticks a player has been present in this chunk.
   * @return inhabitedTime
  **/
  @ApiModelProperty(value = "The number of ticks a player has been present in this chunk.")
  public BigDecimal getInhabitedTime() {
    return inhabitedTime;
  }

  public void setInhabitedTime(BigDecimal inhabitedTime) {
    this.inhabitedTime = inhabitedTime;
  }

  public ChunkFull difficultyFactor(Double difficultyFactor) {
    this.difficultyFactor = difficultyFactor;
    return this;
  }

   /**
   * Gets the regional difficulty factor for this chunk.
   * @return difficultyFactor
  **/
  @ApiModelProperty(value = "Gets the regional difficulty factor for this chunk.")
  public Double getDifficultyFactor() {
    return difficultyFactor;
  }

  public void setDifficultyFactor(Double difficultyFactor) {
    this.difficultyFactor = difficultyFactor;
  }

  public ChunkFull difficultyPercentage(Double difficultyPercentage) {
    this.difficultyPercentage = difficultyPercentage;
    return this;
  }

   /**
   * Gets the regional difficulty as a percentage for this chunk.
   * @return difficultyPercentage
  **/
  @ApiModelProperty(value = "Gets the regional difficulty as a percentage for this chunk.")
  public Double getDifficultyPercentage() {
    return difficultyPercentage;
  }

  public void setDifficultyPercentage(Double difficultyPercentage) {
    this.difficultyPercentage = difficultyPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkFull chunkFull = (ChunkFull) o;
    return Objects.equals(this.uuid, chunkFull.uuid) &&
        Objects.equals(this.position, chunkFull.position) &&
        Objects.equals(this.world, chunkFull.world) &&
        Objects.equals(this.blockMin, chunkFull.blockMin) &&
        Objects.equals(this.blockMax, chunkFull.blockMax) &&
        Objects.equals(this.isLoaded, chunkFull.isLoaded) &&
        Objects.equals(this.inhabitedTime, chunkFull.inhabitedTime) &&
        Objects.equals(this.difficultyFactor, chunkFull.difficultyFactor) &&
        Objects.equals(this.difficultyPercentage, chunkFull.difficultyPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, position, world, blockMin, blockMax, isLoaded, inhabitedTime, difficultyFactor, difficultyPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkFull {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    blockMin: ").append(toIndentedString(blockMin)).append("\n");
    sb.append("    blockMax: ").append(toIndentedString(blockMax)).append("\n");
    sb.append("    isLoaded: ").append(toIndentedString(isLoaded)).append("\n");
    sb.append("    inhabitedTime: ").append(toIndentedString(inhabitedTime)).append("\n");
    sb.append("    difficultyFactor: ").append(toIndentedString(difficultyFactor)).append("\n");
    sb.append("    difficultyPercentage: ").append(toIndentedString(difficultyPercentage)).append("\n");
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

