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

/**
 * PlayerFullArmour
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class PlayerFullArmour {
  @SerializedName("helmet")
  private ItemStack helmet = null;

  @SerializedName("chestplate")
  private ItemStack chestplate = null;

  @SerializedName("leggings")
  private ItemStack leggings = null;

  @SerializedName("boots")
  private ItemStack boots = null;

  public PlayerFullArmour helmet(ItemStack helmet) {
    this.helmet = helmet;
    return this;
  }

   /**
   * Get helmet
   * @return helmet
  **/
  @ApiModelProperty(value = "")
  public ItemStack getHelmet() {
    return helmet;
  }

  public void setHelmet(ItemStack helmet) {
    this.helmet = helmet;
  }

  public PlayerFullArmour chestplate(ItemStack chestplate) {
    this.chestplate = chestplate;
    return this;
  }

   /**
   * Get chestplate
   * @return chestplate
  **/
  @ApiModelProperty(value = "")
  public ItemStack getChestplate() {
    return chestplate;
  }

  public void setChestplate(ItemStack chestplate) {
    this.chestplate = chestplate;
  }

  public PlayerFullArmour leggings(ItemStack leggings) {
    this.leggings = leggings;
    return this;
  }

   /**
   * Get leggings
   * @return leggings
  **/
  @ApiModelProperty(value = "")
  public ItemStack getLeggings() {
    return leggings;
  }

  public void setLeggings(ItemStack leggings) {
    this.leggings = leggings;
  }

  public PlayerFullArmour boots(ItemStack boots) {
    this.boots = boots;
    return this;
  }

   /**
   * Get boots
   * @return boots
  **/
  @ApiModelProperty(value = "")
  public ItemStack getBoots() {
    return boots;
  }

  public void setBoots(ItemStack boots) {
    this.boots = boots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerFullArmour playerFullArmour = (PlayerFullArmour) o;
    return Objects.equals(this.helmet, playerFullArmour.helmet) &&
        Objects.equals(this.chestplate, playerFullArmour.chestplate) &&
        Objects.equals(this.leggings, playerFullArmour.leggings) &&
        Objects.equals(this.boots, playerFullArmour.boots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helmet, chestplate, leggings, boots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerFullArmour {\n");
    
    sb.append("    helmet: ").append(toIndentedString(helmet)).append("\n");
    sb.append("    chestplate: ").append(toIndentedString(chestplate)).append("\n");
    sb.append("    leggings: ").append(toIndentedString(leggings)).append("\n");
    sb.append("    boots: ").append(toIndentedString(boots)).append("\n");
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

