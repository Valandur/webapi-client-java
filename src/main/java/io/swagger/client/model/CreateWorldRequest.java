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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CreateWorldRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-10T13:08:53.752+01:00")
public class CreateWorldRequest {
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

  @SerializedName("dimension")
  private String dimension = null;

  @SerializedName("generateBonusChest")
  private Boolean generateBonusChest = null;

  public CreateWorldRequest name(String name) {
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

  public CreateWorldRequest seed(BigDecimal seed) {
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

  public CreateWorldRequest generator(String generator) {
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

  public CreateWorldRequest gameMode(String gameMode) {
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

  public CreateWorldRequest difficulty(String difficulty) {
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

  public CreateWorldRequest loadOnStartup(Boolean loadOnStartup) {
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

  public CreateWorldRequest keepSpawnLoaded(Boolean keepSpawnLoaded) {
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

  public CreateWorldRequest allowCommands(Boolean allowCommands) {
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

  public CreateWorldRequest usesMapFeatures(Boolean usesMapFeatures) {
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

  public CreateWorldRequest dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * The dimension of the world to use. Check &#x60;/registry/org.spongepowered.api.world.DimensionType&#x60;.
   * @return dimension
  **/
  @ApiModelProperty(value = "The dimension of the world to use. Check `/registry/org.spongepowered.api.world.DimensionType`.")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public CreateWorldRequest generateBonusChest(Boolean generateBonusChest) {
    this.generateBonusChest = generateBonusChest;
    return this;
  }

   /**
   * True to generate bonus chests, false otherwise.
   * @return generateBonusChest
  **/
  @ApiModelProperty(value = "True to generate bonus chests, false otherwise.")
  public Boolean getGenerateBonusChest() {
    return generateBonusChest;
  }

  public void setGenerateBonusChest(Boolean generateBonusChest) {
    this.generateBonusChest = generateBonusChest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorldRequest createWorldRequest = (CreateWorldRequest) o;
    return Objects.equals(this.name, createWorldRequest.name) &&
        Objects.equals(this.seed, createWorldRequest.seed) &&
        Objects.equals(this.generator, createWorldRequest.generator) &&
        Objects.equals(this.gameMode, createWorldRequest.gameMode) &&
        Objects.equals(this.difficulty, createWorldRequest.difficulty) &&
        Objects.equals(this.loadOnStartup, createWorldRequest.loadOnStartup) &&
        Objects.equals(this.keepSpawnLoaded, createWorldRequest.keepSpawnLoaded) &&
        Objects.equals(this.allowCommands, createWorldRequest.allowCommands) &&
        Objects.equals(this.usesMapFeatures, createWorldRequest.usesMapFeatures) &&
        Objects.equals(this.dimension, createWorldRequest.dimension) &&
        Objects.equals(this.generateBonusChest, createWorldRequest.generateBonusChest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seed, generator, gameMode, difficulty, loadOnStartup, keepSpawnLoaded, allowCommands, usesMapFeatures, dimension, generateBonusChest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorldRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    gameMode: ").append(toIndentedString(gameMode)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    loadOnStartup: ").append(toIndentedString(loadOnStartup)).append("\n");
    sb.append("    keepSpawnLoaded: ").append(toIndentedString(keepSpawnLoaded)).append("\n");
    sb.append("    allowCommands: ").append(toIndentedString(allowCommands)).append("\n");
    sb.append("    usesMapFeatures: ").append(toIndentedString(usesMapFeatures)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    generateBonusChest: ").append(toIndentedString(generateBonusChest)).append("\n");
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

