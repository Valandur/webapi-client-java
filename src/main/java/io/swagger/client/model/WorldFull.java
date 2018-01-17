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
import io.swagger.client.model.Vector3;
import io.swagger.client.model.World;
import io.swagger.client.model.WorldFullBorder;
import io.swagger.client.model.WorldFullDimension;
import io.swagger.client.model.WorldFullGenerator;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * WorldFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class WorldFull {
  @SerializedName("name")
  private String name = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("border")
  private WorldFullBorder border = null;

  @SerializedName("difficulty")
  private String difficulty = null;

  @SerializedName("dimension")
  private WorldFullDimension dimension = null;

  @SerializedName("gameMode")
  private String gameMode = null;

  @SerializedName("generator")
  private WorldFullGenerator generator = null;

  @SerializedName("seed")
  private BigDecimal seed = null;

  @SerializedName("spawn")
  private Vector3 spawn = null;

  @SerializedName("time")
  private BigDecimal time = null;

  @SerializedName("weather")
  private String weather = null;

  public WorldFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the world.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the world.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorldFull uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The unique id of the world.
   * @return uuid
  **/
  @ApiModelProperty(value = "The unique id of the world.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public WorldFull link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The API URL which contains detailed information about this world.
   * @return link
  **/
  @ApiModelProperty(value = "The API URL which contains detailed information about this world.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public WorldFull border(WorldFullBorder border) {
    this.border = border;
    return this;
  }

   /**
   * Get border
   * @return border
  **/
  @ApiModelProperty(value = "")
  public WorldFullBorder getBorder() {
    return border;
  }

  public void setBorder(WorldFullBorder border) {
    this.border = border;
  }

  public WorldFull difficulty(String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * The current difficulty of the world.
   * @return difficulty
  **/
  @ApiModelProperty(value = "The current difficulty of the world.")
  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public WorldFull dimension(WorldFullDimension dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @ApiModelProperty(value = "")
  public WorldFullDimension getDimension() {
    return dimension;
  }

  public void setDimension(WorldFullDimension dimension) {
    this.dimension = dimension;
  }

  public WorldFull gameMode(String gameMode) {
    this.gameMode = gameMode;
    return this;
  }

   /**
   * The default game mode of the world.
   * @return gameMode
  **/
  @ApiModelProperty(value = "The default game mode of the world.")
  public String getGameMode() {
    return gameMode;
  }

  public void setGameMode(String gameMode) {
    this.gameMode = gameMode;
  }

  public WorldFull generator(WorldFullGenerator generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Get generator
   * @return generator
  **/
  @ApiModelProperty(value = "")
  public WorldFullGenerator getGenerator() {
    return generator;
  }

  public void setGenerator(WorldFullGenerator generator) {
    this.generator = generator;
  }

  public WorldFull seed(BigDecimal seed) {
    this.seed = seed;
    return this;
  }

   /**
   * The seed used to generate this world.
   * @return seed
  **/
  @ApiModelProperty(value = "The seed used to generate this world.")
  public BigDecimal getSeed() {
    return seed;
  }

  public void setSeed(BigDecimal seed) {
    this.seed = seed;
  }

  public WorldFull spawn(Vector3 spawn) {
    this.spawn = spawn;
    return this;
  }

   /**
   * Get spawn
   * @return spawn
  **/
  @ApiModelProperty(value = "")
  public Vector3 getSpawn() {
    return spawn;
  }

  public void setSpawn(Vector3 spawn) {
    this.spawn = spawn;
  }

  public WorldFull time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * The current in game time.
   * @return time
  **/
  @ApiModelProperty(value = "The current in game time.")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public WorldFull weather(String weather) {
    this.weather = weather;
    return this;
  }

   /**
   * The current weather of the world.
   * @return weather
  **/
  @ApiModelProperty(value = "The current weather of the world.")
  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldFull worldFull = (WorldFull) o;
    return Objects.equals(this.name, worldFull.name) &&
        Objects.equals(this.uuid, worldFull.uuid) &&
        Objects.equals(this.link, worldFull.link) &&
        Objects.equals(this.border, worldFull.border) &&
        Objects.equals(this.difficulty, worldFull.difficulty) &&
        Objects.equals(this.dimension, worldFull.dimension) &&
        Objects.equals(this.gameMode, worldFull.gameMode) &&
        Objects.equals(this.generator, worldFull.generator) &&
        Objects.equals(this.seed, worldFull.seed) &&
        Objects.equals(this.spawn, worldFull.spawn) &&
        Objects.equals(this.time, worldFull.time) &&
        Objects.equals(this.weather, worldFull.weather);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, link, border, difficulty, dimension, gameMode, generator, seed, spawn, time, weather);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldFull {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    spawn: ").append(toIndentedString(spawn)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
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

