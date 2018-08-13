/*
 * Web-API
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # List endpoints Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  > Remember that in this case the data returned by the endpoint might be quite large.  # Debugging endpoints Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  `details`: Includes details for list endpoints  `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  `pretty`: Pretty prints the data, also good for debugging in the browser.  An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)
 *
 * OpenAPI spec version: @version@
 * Contact: inithilian@gmail.com
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
 * TradeOffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:26:34.036+02:00")
public class TradeOffer {
  @SerializedName("expired")
  private Boolean expired = null;

  @SerializedName("grantsExp")
  private Boolean grantsExp = null;

  @SerializedName("uses")
  private Integer uses = null;

  @SerializedName("maxUses")
  private Integer maxUses = null;

  @SerializedName("firstBuyingItem")
  private ItemStack firstBuyingItem = null;

  @SerializedName("secondBuyingItem")
  private ItemStack secondBuyingItem = null;

  @SerializedName("sellingItem")
  private ItemStack sellingItem = null;

  public TradeOffer expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * True if this offer is expired, false otherwise
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "True if this offer is expired, false otherwise")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public TradeOffer grantsExp(Boolean grantsExp) {
    this.grantsExp = grantsExp;
    return this;
  }

   /**
   * True if this trade grants experience when completed, false otherwise
   * @return grantsExp
  **/
  @ApiModelProperty(required = true, value = "True if this trade grants experience when completed, false otherwise")
  public Boolean isGrantsExp() {
    return grantsExp;
  }

  public void setGrantsExp(Boolean grantsExp) {
    this.grantsExp = grantsExp;
  }

  public TradeOffer uses(Integer uses) {
    this.uses = uses;
    return this;
  }

   /**
   * The amount of times this trade has been used
   * @return uses
  **/
  @ApiModelProperty(required = true, value = "The amount of times this trade has been used")
  public Integer getUses() {
    return uses;
  }

  public void setUses(Integer uses) {
    this.uses = uses;
  }

  public TradeOffer maxUses(Integer maxUses) {
    this.maxUses = maxUses;
    return this;
  }

   /**
   * The maximum amount of times that this trade can be used
   * @return maxUses
  **/
  @ApiModelProperty(required = true, value = "The maximum amount of times that this trade can be used")
  public Integer getMaxUses() {
    return maxUses;
  }

  public void setMaxUses(Integer maxUses) {
    this.maxUses = maxUses;
  }

  public TradeOffer firstBuyingItem(ItemStack firstBuyingItem) {
    this.firstBuyingItem = firstBuyingItem;
    return this;
  }

   /**
   * The first item that is required for the trade
   * @return firstBuyingItem
  **/
  @ApiModelProperty(required = true, value = "The first item that is required for the trade")
  public ItemStack getFirstBuyingItem() {
    return firstBuyingItem;
  }

  public void setFirstBuyingItem(ItemStack firstBuyingItem) {
    this.firstBuyingItem = firstBuyingItem;
  }

  public TradeOffer secondBuyingItem(ItemStack secondBuyingItem) {
    this.secondBuyingItem = secondBuyingItem;
    return this;
  }

   /**
   * The second item that is required for the trade
   * @return secondBuyingItem
  **/
  @ApiModelProperty(value = "The second item that is required for the trade")
  public ItemStack getSecondBuyingItem() {
    return secondBuyingItem;
  }

  public void setSecondBuyingItem(ItemStack secondBuyingItem) {
    this.secondBuyingItem = secondBuyingItem;
  }

  public TradeOffer sellingItem(ItemStack sellingItem) {
    this.sellingItem = sellingItem;
    return this;
  }

   /**
   * The item that is received when trading
   * @return sellingItem
  **/
  @ApiModelProperty(required = true, value = "The item that is received when trading")
  public ItemStack getSellingItem() {
    return sellingItem;
  }

  public void setSellingItem(ItemStack sellingItem) {
    this.sellingItem = sellingItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeOffer tradeOffer = (TradeOffer) o;
    return Objects.equals(this.expired, tradeOffer.expired) &&
        Objects.equals(this.grantsExp, tradeOffer.grantsExp) &&
        Objects.equals(this.uses, tradeOffer.uses) &&
        Objects.equals(this.maxUses, tradeOffer.maxUses) &&
        Objects.equals(this.firstBuyingItem, tradeOffer.firstBuyingItem) &&
        Objects.equals(this.secondBuyingItem, tradeOffer.secondBuyingItem) &&
        Objects.equals(this.sellingItem, tradeOffer.sellingItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expired, grantsExp, uses, maxUses, firstBuyingItem, secondBuyingItem, sellingItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeOffer {\n");
    
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    grantsExp: ").append(toIndentedString(grantsExp)).append("\n");
    sb.append("    uses: ").append(toIndentedString(uses)).append("\n");
    sb.append("    maxUses: ").append(toIndentedString(maxUses)).append("\n");
    sb.append("    firstBuyingItem: ").append(toIndentedString(firstBuyingItem)).append("\n");
    sb.append("    secondBuyingItem: ").append(toIndentedString(secondBuyingItem)).append("\n");
    sb.append("    sellingItem: ").append(toIndentedString(sellingItem)).append("\n");
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

