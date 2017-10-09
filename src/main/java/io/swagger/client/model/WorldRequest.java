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
import java.math.BigDecimal;

/**
 * WorldRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T13:12:20.507+02:00")
public class WorldRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("seed")
  private BigDecimal seed = null;

  @SerializedName("generator")
  private String generator = null;

  @SerializedName("gameMode")
  private String gameMode = null;

  @SerializedName("difficulty")
  private String difficulty = null;

  @SerializedName("loadOnStartup")
  private Boolean loadOnStartup = null;

  @SerializedName("keepSpawnLoaded")
  private Boolean keepSpawnLoaded = null;

  @SerializedName("allowCommands")
  private Boolean allowCommands = null;

  @SerializedName("usesMapFeatures")
  private Boolean usesMapFeatures = null;

  public WorldRequest name(String name) {
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

  public WorldRequest seed(BigDecimal seed) {
    this.seed = seed;
    return this;
  }

   /**
   * The seed number. A random seed is generated if not provided.
   * @return seed
  **/
  @ApiModelProperty(value = "The seed number. A random seed is generated if not provided.")
  public BigDecimal getSeed() {
    return seed;
  }

  public void setSeed(BigDecimal seed) {
    this.seed = seed;
  }

  public WorldRequest generator(String generator) {
    this.generator = generator;
    return this;
  }

   /**
   * The id of the generator type to use. Check &#x60;/registry/org.spongepowered.api.world.GeneratorType&#x60;.
   * @return generator
  **/
  @ApiModelProperty(value = "The id of the generator type to use. Check `/registry/org.spongepowered.api.world.GeneratorType`.")
  public String getGenerator() {
    return generator;
  }

  public void setGenerator(String generator) {
    this.generator = generator;
  }

  public WorldRequest gameMode(String gameMode) {
    this.gameMode = gameMode;
    return this;
  }

   /**
   * The id of the game mode to use. Check &#x60;/registry/org.spongepowered.api.entity.living.player.gamemode.GameMode&#x60;.
   * @return gameMode
  **/
  @ApiModelProperty(value = "The id of the game mode to use. Check `/registry/org.spongepowered.api.entity.living.player.gamemode.GameMode`.")
  public String getGameMode() {
    return gameMode;
  }

  public void setGameMode(String gameMode) {
    this.gameMode = gameMode;
  }

  public WorldRequest difficulty(String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * The id of the difficutly to use. Check &#x60;/registry/org.spongepowered.api.world.difficulty.Difficulty&#x60;.
   * @return difficulty
  **/
  @ApiModelProperty(value = "The id of the difficutly to use. Check `/registry/org.spongepowered.api.world.difficulty.Difficulty`.")
  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public WorldRequest loadOnStartup(Boolean loadOnStartup) {
    this.loadOnStartup = loadOnStartup;
    return this;
  }

   /**
   * True if the world is loaded when the server starts, false otherwise.
   * @return loadOnStartup
  **/
  @ApiModelProperty(value = "True if the world is loaded when the server starts, false otherwise.")
  public Boolean getLoadOnStartup() {
    return loadOnStartup;
  }

  public void setLoadOnStartup(Boolean loadOnStartup) {
    this.loadOnStartup = loadOnStartup;
  }

  public WorldRequest keepSpawnLoaded(Boolean keepSpawnLoaded) {
    this.keepSpawnLoaded = keepSpawnLoaded;
    return this;
  }

   /**
   * True to keep the spawn area of the world loaded, even if it is empty.
   * @return keepSpawnLoaded
  **/
  @ApiModelProperty(value = "True to keep the spawn area of the world loaded, even if it is empty.")
  public Boolean getKeepSpawnLoaded() {
    return keepSpawnLoaded;
  }

  public void setKeepSpawnLoaded(Boolean keepSpawnLoaded) {
    this.keepSpawnLoaded = keepSpawnLoaded;
  }

  public WorldRequest allowCommands(Boolean allowCommands) {
    this.allowCommands = allowCommands;
    return this;
  }

   /**
   * True if executing commands is allowed in the world.
   * @return allowCommands
  **/
  @ApiModelProperty(value = "True if executing commands is allowed in the world.")
  public Boolean getAllowCommands() {
    return allowCommands;
  }

  public void setAllowCommands(Boolean allowCommands) {
    this.allowCommands = allowCommands;
  }

  public WorldRequest usesMapFeatures(Boolean usesMapFeatures) {
    this.usesMapFeatures = usesMapFeatures;
    return this;
  }

   /**
   * True to use map features of the generator (such as villages).
   * @return usesMapFeatures
  **/
  @ApiModelProperty(value = "True to use map features of the generator (such as villages).")
  public Boolean getUsesMapFeatures() {
    return usesMapFeatures;
  }

  public void setUsesMapFeatures(Boolean usesMapFeatures) {
    this.usesMapFeatures = usesMapFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldRequest worldRequest = (WorldRequest) o;
    return Objects.equals(this.name, worldRequest.name) &&
        Objects.equals(this.seed, worldRequest.seed) &&
        Objects.equals(this.generator, worldRequest.generator) &&
        Objects.equals(this.gameMode, worldRequest.gameMode) &&
        Objects.equals(this.difficulty, worldRequest.difficulty) &&
        Objects.equals(this.loadOnStartup, worldRequest.loadOnStartup) &&
        Objects.equals(this.keepSpawnLoaded, worldRequest.keepSpawnLoaded) &&
        Objects.equals(this.allowCommands, worldRequest.allowCommands) &&
        Objects.equals(this.usesMapFeatures, worldRequest.usesMapFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seed, generator, gameMode, difficulty, loadOnStartup, keepSpawnLoaded, allowCommands, usesMapFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    loadOnStartup: ").append(toIndentedString(loadOnStartup)).append("\n");
    sb.append("    keepSpawnLoaded: ").append(toIndentedString(keepSpawnLoaded)).append("\n");
    sb.append("    allowCommands: ").append(toIndentedString(allowCommands)).append("\n");
    sb.append("    usesMapFeatures: ").append(toIndentedString(usesMapFeatures)).append("\n");
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

