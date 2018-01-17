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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HuskyCrateFullRewards
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class HuskyCrateFullRewards {
  @SerializedName("name")
  private String name = null;

  @SerializedName("chance")
  private Double chance = null;

  @SerializedName("displayItem")
  private ItemStack displayItem = null;

  @SerializedName("announce")
  private Boolean announce = null;

  @SerializedName("rewards")
  private List<Object> rewards = null;

  public HuskyCrateFullRewards name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the reward.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the reward.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HuskyCrateFullRewards chance(Double chance) {
    this.chance = chance;
    return this;
  }

   /**
   * The chance to get this reward.
   * @return chance
  **/
  @ApiModelProperty(value = "The chance to get this reward.")
  public Double getChance() {
    return chance;
  }

  public void setChance(Double chance) {
    this.chance = chance;
  }

  public HuskyCrateFullRewards displayItem(ItemStack displayItem) {
    this.displayItem = displayItem;
    return this;
  }

   /**
   * Get displayItem
   * @return displayItem
  **/
  @ApiModelProperty(value = "")
  public ItemStack getDisplayItem() {
    return displayItem;
  }

  public void setDisplayItem(ItemStack displayItem) {
    this.displayItem = displayItem;
  }

  public HuskyCrateFullRewards announce(Boolean announce) {
    this.announce = announce;
    return this;
  }

   /**
   * True if this reward should be announced in chat, false otherwise.
   * @return announce
  **/
  @ApiModelProperty(value = "True if this reward should be announced in chat, false otherwise.")
  public Boolean getAnnounce() {
    return announce;
  }

  public void setAnnounce(Boolean announce) {
    this.announce = announce;
  }

  public HuskyCrateFullRewards rewards(List<Object> rewards) {
    this.rewards = rewards;
    return this;
  }

  public HuskyCrateFullRewards addRewardsItem(Object rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<Object>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * Get rewards
   * @return rewards
  **/
  @ApiModelProperty(value = "")
  public List<Object> getRewards() {
    return rewards;
  }

  public void setRewards(List<Object> rewards) {
    this.rewards = rewards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HuskyCrateFullRewards huskyCrateFullRewards = (HuskyCrateFullRewards) o;
    return Objects.equals(this.name, huskyCrateFullRewards.name) &&
        Objects.equals(this.chance, huskyCrateFullRewards.chance) &&
        Objects.equals(this.displayItem, huskyCrateFullRewards.displayItem) &&
        Objects.equals(this.announce, huskyCrateFullRewards.announce) &&
        Objects.equals(this.rewards, huskyCrateFullRewards.rewards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, chance, displayItem, announce, rewards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuskyCrateFullRewards {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
    sb.append("    displayItem: ").append(toIndentedString(displayItem)).append("\n");
    sb.append("    announce: ").append(toIndentedString(announce)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
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

