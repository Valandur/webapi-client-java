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
import io.swagger.client.model.ServerInfoDetail;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ServerInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class ServerInfo {
  @SerializedName("motd")
  private String motd = null;

  @SerializedName("players")
  private BigDecimal players = null;

  @SerializedName("maxPlayers")
  private BigDecimal maxPlayers = null;

  @SerializedName("uptimeTicks")
  private BigDecimal uptimeTicks = null;

  @SerializedName("tps")
  private BigDecimal tps = null;

  @SerializedName("hasWhitelist")
  private Boolean hasWhitelist = null;

  @SerializedName("minecraftVersion")
  private String minecraftVersion = null;

  @SerializedName("game")
  private ServerInfoDetail game = null;

  @SerializedName("api")
  private ServerInfoDetail api = null;

  @SerializedName("implementation")
  private ServerInfoDetail implementation = null;

  public ServerInfo motd(String motd) {
    this.motd = motd;
    return this;
  }

   /**
   * The message of the day set on the server.
   * @return motd
  **/
  @ApiModelProperty(value = "The message of the day set on the server.")
  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }

  public ServerInfo players(BigDecimal players) {
    this.players = players;
    return this;
  }

   /**
   * The amount of players currently playing on the server
   * @return players
  **/
  @ApiModelProperty(value = "The amount of players currently playing on the server")
  public BigDecimal getPlayers() {
    return players;
  }

  public void setPlayers(BigDecimal players) {
    this.players = players;
  }

  public ServerInfo maxPlayers(BigDecimal maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * The maximum amount of players allowed on the server
   * @return maxPlayers
  **/
  @ApiModelProperty(value = "The maximum amount of players allowed on the server")
  public BigDecimal getMaxPlayers() {
    return maxPlayers;
  }

  public void setMaxPlayers(BigDecimal maxPlayers) {
    this.maxPlayers = maxPlayers;
  }

  public ServerInfo uptimeTicks(BigDecimal uptimeTicks) {
    this.uptimeTicks = uptimeTicks;
    return this;
  }

   /**
   * The number of ticks the server has been running
   * @return uptimeTicks
  **/
  @ApiModelProperty(value = "The number of ticks the server has been running")
  public BigDecimal getUptimeTicks() {
    return uptimeTicks;
  }

  public void setUptimeTicks(BigDecimal uptimeTicks) {
    this.uptimeTicks = uptimeTicks;
  }

  public ServerInfo tps(BigDecimal tps) {
    this.tps = tps;
    return this;
  }

   /**
   * The average ticks per second the server is running with. 20 is ideal.
   * @return tps
  **/
  @ApiModelProperty(value = "The average ticks per second the server is running with. 20 is ideal.")
  public BigDecimal getTps() {
    return tps;
  }

  public void setTps(BigDecimal tps) {
    this.tps = tps;
  }

  public ServerInfo hasWhitelist(Boolean hasWhitelist) {
    this.hasWhitelist = hasWhitelist;
    return this;
  }

   /**
   * True if the server has a whitelist, false otherwise.
   * @return hasWhitelist
  **/
  @ApiModelProperty(value = "True if the server has a whitelist, false otherwise.")
  public Boolean getHasWhitelist() {
    return hasWhitelist;
  }

  public void setHasWhitelist(Boolean hasWhitelist) {
    this.hasWhitelist = hasWhitelist;
  }

  public ServerInfo minecraftVersion(String minecraftVersion) {
    this.minecraftVersion = minecraftVersion;
    return this;
  }

   /**
   * The minecraft version running on the server.
   * @return minecraftVersion
  **/
  @ApiModelProperty(value = "The minecraft version running on the server.")
  public String getMinecraftVersion() {
    return minecraftVersion;
  }

  public void setMinecraftVersion(String minecraftVersion) {
    this.minecraftVersion = minecraftVersion;
  }

  public ServerInfo game(ServerInfoDetail game) {
    this.game = game;
    return this;
  }

   /**
   * Get game
   * @return game
  **/
  @ApiModelProperty(value = "")
  public ServerInfoDetail getGame() {
    return game;
  }

  public void setGame(ServerInfoDetail game) {
    this.game = game;
  }

  public ServerInfo api(ServerInfoDetail api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @ApiModelProperty(value = "")
  public ServerInfoDetail getApi() {
    return api;
  }

  public void setApi(ServerInfoDetail api) {
    this.api = api;
  }

  public ServerInfo implementation(ServerInfoDetail implementation) {
    this.implementation = implementation;
    return this;
  }

   /**
   * Get implementation
   * @return implementation
  **/
  @ApiModelProperty(value = "")
  public ServerInfoDetail getImplementation() {
    return implementation;
  }

  public void setImplementation(ServerInfoDetail implementation) {
    this.implementation = implementation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInfo serverInfo = (ServerInfo) o;
    return Objects.equals(this.motd, serverInfo.motd) &&
        Objects.equals(this.players, serverInfo.players) &&
        Objects.equals(this.maxPlayers, serverInfo.maxPlayers) &&
        Objects.equals(this.uptimeTicks, serverInfo.uptimeTicks) &&
        Objects.equals(this.tps, serverInfo.tps) &&
        Objects.equals(this.hasWhitelist, serverInfo.hasWhitelist) &&
        Objects.equals(this.minecraftVersion, serverInfo.minecraftVersion) &&
        Objects.equals(this.game, serverInfo.game) &&
        Objects.equals(this.api, serverInfo.api) &&
        Objects.equals(this.implementation, serverInfo.implementation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motd, players, maxPlayers, uptimeTicks, tps, hasWhitelist, minecraftVersion, game, api, implementation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInfo {\n");
    
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    uptimeTicks: ").append(toIndentedString(uptimeTicks)).append("\n");
    sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
    sb.append("    hasWhitelist: ").append(toIndentedString(hasWhitelist)).append("\n");
    sb.append("    minecraftVersion: ").append(toIndentedString(minecraftVersion)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
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

