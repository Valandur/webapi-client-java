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
import io.swagger.client.model.HuskyCrate;
import io.swagger.client.model.HuskyCrateFullRewards;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HuskyCrateFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class HuskyCrateFull {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("isFree")
  private Boolean isFree = null;

  @SerializedName("keys")
  private Object keys = null;

  @SerializedName("rewards")
  private List<HuskyCrateFullRewards> rewards = null;

  public HuskyCrateFull id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the crate.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the crate.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HuskyCrateFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the crate.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the crate.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HuskyCrateFull type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the crate.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the crate.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HuskyCrateFull isFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

   /**
   * True if the crate can be aquired for free, false otherwise.
   * @return isFree
  **/
  @ApiModelProperty(value = "True if the crate can be aquired for free, false otherwise.")
  public Boolean getIsFree() {
    return isFree;
  }

  public void setIsFree(Boolean isFree) {
    this.isFree = isFree;
  }

  public HuskyCrateFull keys(Object keys) {
    this.keys = keys;
    return this;
  }

   /**
   * A mapping of crate keys to integers.
   * @return keys
  **/
  @ApiModelProperty(value = "A mapping of crate keys to integers.")
  public Object getKeys() {
    return keys;
  }

  public void setKeys(Object keys) {
    this.keys = keys;
  }

  public HuskyCrateFull rewards(List<HuskyCrateFullRewards> rewards) {
    this.rewards = rewards;
    return this;
  }

  public HuskyCrateFull addRewardsItem(HuskyCrateFullRewards rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<HuskyCrateFullRewards>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * Get rewards
   * @return rewards
  **/
  @ApiModelProperty(value = "")
  public List<HuskyCrateFullRewards> getRewards() {
    return rewards;
  }

  public void setRewards(List<HuskyCrateFullRewards> rewards) {
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
    HuskyCrateFull huskyCrateFull = (HuskyCrateFull) o;
    return Objects.equals(this.id, huskyCrateFull.id) &&
        Objects.equals(this.name, huskyCrateFull.name) &&
        Objects.equals(this.type, huskyCrateFull.type) &&
        Objects.equals(this.isFree, huskyCrateFull.isFree) &&
        Objects.equals(this.keys, huskyCrateFull.keys) &&
        Objects.equals(this.rewards, huskyCrateFull.rewards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, isFree, keys, rewards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuskyCrateFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

