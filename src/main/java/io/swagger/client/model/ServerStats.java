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
import io.swagger.client.model.ServerStatDouble;
import io.swagger.client.model.ServerStatInteger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T13:32:53.543+02:00")
public class ServerStats {
  @SerializedName("cpu")
  private List<ServerStatDouble> cpu = new ArrayList<ServerStatDouble>();

  @SerializedName("disk")
  private List<ServerStatDouble> disk = new ArrayList<ServerStatDouble>();

  @SerializedName("memory")
  private List<ServerStatDouble> memory = new ArrayList<ServerStatDouble>();

  @SerializedName("players")
  private List<ServerStatInteger> players = new ArrayList<ServerStatInteger>();

  @SerializedName("tps")
  private List<ServerStatDouble> tps = new ArrayList<ServerStatDouble>();

  public ServerStats cpu(List<ServerStatDouble> cpu) {
    this.cpu = cpu;
    return this;
  }

  public ServerStats addCpuItem(ServerStatDouble cpuItem) {
    this.cpu.add(cpuItem);
    return this;
  }

   /**
   * Historic values for the cpu load
   * @return cpu
  **/
  @ApiModelProperty(required = true, value = "Historic values for the cpu load")
  public List<ServerStatDouble> getCpu() {
    return cpu;
  }

  public void setCpu(List<ServerStatDouble> cpu) {
    this.cpu = cpu;
  }

  public ServerStats disk(List<ServerStatDouble> disk) {
    this.disk = disk;
    return this;
  }

  public ServerStats addDiskItem(ServerStatDouble diskItem) {
    this.disk.add(diskItem);
    return this;
  }

   /**
   * Historic values for the disk usage
   * @return disk
  **/
  @ApiModelProperty(required = true, value = "Historic values for the disk usage")
  public List<ServerStatDouble> getDisk() {
    return disk;
  }

  public void setDisk(List<ServerStatDouble> disk) {
    this.disk = disk;
  }

  public ServerStats memory(List<ServerStatDouble> memory) {
    this.memory = memory;
    return this;
  }

  public ServerStats addMemoryItem(ServerStatDouble memoryItem) {
    this.memory.add(memoryItem);
    return this;
  }

   /**
   * Historic values for the memory load
   * @return memory
  **/
  @ApiModelProperty(required = true, value = "Historic values for the memory load")
  public List<ServerStatDouble> getMemory() {
    return memory;
  }

  public void setMemory(List<ServerStatDouble> memory) {
    this.memory = memory;
  }

  public ServerStats players(List<ServerStatInteger> players) {
    this.players = players;
    return this;
  }

  public ServerStats addPlayersItem(ServerStatInteger playersItem) {
    this.players.add(playersItem);
    return this;
  }

   /**
   * Historic values for the number of online players
   * @return players
  **/
  @ApiModelProperty(required = true, value = "Historic values for the number of online players")
  public List<ServerStatInteger> getPlayers() {
    return players;
  }

  public void setPlayers(List<ServerStatInteger> players) {
    this.players = players;
  }

  public ServerStats tps(List<ServerStatDouble> tps) {
    this.tps = tps;
    return this;
  }

  public ServerStats addTpsItem(ServerStatDouble tpsItem) {
    this.tps.add(tpsItem);
    return this;
  }

   /**
   * Historic values for the average ticks per second
   * @return tps
  **/
  @ApiModelProperty(required = true, value = "Historic values for the average ticks per second")
  public List<ServerStatDouble> getTps() {
    return tps;
  }

  public void setTps(List<ServerStatDouble> tps) {
    this.tps = tps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerStats serverStats = (ServerStats) o;
    return Objects.equals(this.cpu, serverStats.cpu) &&
        Objects.equals(this.disk, serverStats.disk) &&
        Objects.equals(this.memory, serverStats.memory) &&
        Objects.equals(this.players, serverStats.players) &&
        Objects.equals(this.tps, serverStats.tps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, disk, memory, players, tps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerStats {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
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

