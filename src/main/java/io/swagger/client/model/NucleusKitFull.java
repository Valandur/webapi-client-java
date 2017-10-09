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
import io.swagger.client.model.ItemStack;
import io.swagger.client.model.NucleusKit;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * NucleusKitFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class NucleusKitFull {
  @SerializedName("name")
  private String name = null;

  @SerializedName("cost")
  private Double cost = null;

  @SerializedName("cooldown")
  private BigDecimal cooldown = null;

  @SerializedName("firstJoinKit")
  private Boolean firstJoinKit = null;

  @SerializedName("oneTime")
  private Boolean oneTime = null;

  @SerializedName("commands")
  private List<String> commands = null;

  @SerializedName("stacks")
  private List<ItemStack> stacks = null;

  public NucleusKitFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the kit.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the kit.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NucleusKitFull cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost to buy this kit.
   * @return cost
  **/
  @ApiModelProperty(value = "The cost to buy this kit.")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public NucleusKitFull cooldown(BigDecimal cooldown) {
    this.cooldown = cooldown;
    return this;
  }

   /**
   * The cooldown for this kit in milliseconds.
   * @return cooldown
  **/
  @ApiModelProperty(value = "The cooldown for this kit in milliseconds.")
  public BigDecimal getCooldown() {
    return cooldown;
  }

  public void setCooldown(BigDecimal cooldown) {
    this.cooldown = cooldown;
  }

  public NucleusKitFull firstJoinKit(Boolean firstJoinKit) {
    this.firstJoinKit = firstJoinKit;
    return this;
  }

   /**
   * True if players receive this kit when joining the server for the first time, false otherwise.
   * @return firstJoinKit
  **/
  @ApiModelProperty(value = "True if players receive this kit when joining the server for the first time, false otherwise.")
  public Boolean getFirstJoinKit() {
    return firstJoinKit;
  }

  public void setFirstJoinKit(Boolean firstJoinKit) {
    this.firstJoinKit = firstJoinKit;
  }

  public NucleusKitFull oneTime(Boolean oneTime) {
    this.oneTime = oneTime;
    return this;
  }

   /**
   * True if this kit can only be received one, false otherwise.
   * @return oneTime
  **/
  @ApiModelProperty(value = "True if this kit can only be received one, false otherwise.")
  public Boolean getOneTime() {
    return oneTime;
  }

  public void setOneTime(Boolean oneTime) {
    this.oneTime = oneTime;
  }

  public NucleusKitFull commands(List<String> commands) {
    this.commands = commands;
    return this;
  }

  public NucleusKitFull addCommandsItem(String commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<String>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * The commands that are executed for the player when receiving this kit.
   * @return commands
  **/
  @ApiModelProperty(value = "The commands that are executed for the player when receiving this kit.")
  public List<String> getCommands() {
    return commands;
  }

  public void setCommands(List<String> commands) {
    this.commands = commands;
  }

  public NucleusKitFull stacks(List<ItemStack> stacks) {
    this.stacks = stacks;
    return this;
  }

  public NucleusKitFull addStacksItem(ItemStack stacksItem) {
    if (this.stacks == null) {
      this.stacks = new ArrayList<ItemStack>();
    }
    this.stacks.add(stacksItem);
    return this;
  }

   /**
   * The items that the player receives when aquiring this kit.
   * @return stacks
  **/
  @ApiModelProperty(value = "The items that the player receives when aquiring this kit.")
  public List<ItemStack> getStacks() {
    return stacks;
  }

  public void setStacks(List<ItemStack> stacks) {
    this.stacks = stacks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NucleusKitFull nucleusKitFull = (NucleusKitFull) o;
    return Objects.equals(this.name, nucleusKitFull.name) &&
        Objects.equals(this.cost, nucleusKitFull.cost) &&
        Objects.equals(this.cooldown, nucleusKitFull.cooldown) &&
        Objects.equals(this.firstJoinKit, nucleusKitFull.firstJoinKit) &&
        Objects.equals(this.oneTime, nucleusKitFull.oneTime) &&
        Objects.equals(this.commands, nucleusKitFull.commands) &&
        Objects.equals(this.stacks, nucleusKitFull.stacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cost, cooldown, firstJoinKit, oneTime, commands, stacks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NucleusKitFull {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cooldown: ").append(toIndentedString(cooldown)).append("\n");
    sb.append("    firstJoinKit: ").append(toIndentedString(firstJoinKit)).append("\n");
    sb.append("    oneTime: ").append(toIndentedString(oneTime)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
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

