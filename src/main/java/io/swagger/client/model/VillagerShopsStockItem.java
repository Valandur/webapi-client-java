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
import io.swagger.client.model.CatalogTypeCurrency;
import io.swagger.client.model.ItemStack;
import java.io.IOException;
import java.util.UUID;

/**
 * VillagerShopsStockItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T13:32:53.543+02:00")
public class VillagerShopsStockItem {
  @SerializedName("buyPrice")
  private Double buyPrice = null;

  @SerializedName("currency")
  private CatalogTypeCurrency currency = null;

  @SerializedName("hasStock")
  private Boolean hasStock = null;

  @SerializedName("item")
  private ItemStack item = null;

  @SerializedName("maxStock")
  private Integer maxStock = null;

  @SerializedName("sellPrice")
  private Double sellPrice = null;

  @SerializedName("shopId")
  private UUID shopId = null;

  @SerializedName("stock")
  private Integer stock = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("link")
  private String link = null;

   /**
   * The amount of money this stack consts to buy as player
   * @return buyPrice
  **/
  @ApiModelProperty(required = true, value = "The amount of money this stack consts to buy as player")
  public Double getBuyPrice() {
    return buyPrice;
  }

   /**
   * The currency for this item listing
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The currency for this item listing")
  public CatalogTypeCurrency getCurrency() {
    return currency;
  }

   /**
   * Returns wether this shop has a limited stock
   * @return hasStock
  **/
  @ApiModelProperty(required = true, value = "Returns wether this shop has a limited stock")
  public Boolean isHasStock() {
    return hasStock;
  }

   /**
   * The raw ItemStack data for this shop listing
   * @return item
  **/
  @ApiModelProperty(required = true, value = "The raw ItemStack data for this shop listing")
  public ItemStack getItem() {
    return item;
  }

   /**
   * If this shop has a limited stock, returns how many of these items can be stocked, 0 is unlimited
   * @return maxStock
  **/
  @ApiModelProperty(required = true, value = "If this shop has a limited stock, returns how many of these items can be stocked, 0 is unlimited")
  public Integer getMaxStock() {
    return maxStock;
  }

   /**
   * The amount of money this stack earns the player when selling
   * @return sellPrice
  **/
  @ApiModelProperty(required = true, value = "The amount of money this stack earns the player when selling")
  public Double getSellPrice() {
    return sellPrice;
  }

  public VillagerShopsStockItem shopId(UUID shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * The shop uuid offering this item listing
   * @return shopId
  **/
  @ApiModelProperty(required = true, value = "The shop uuid offering this item listing")
  public UUID getShopId() {
    return shopId;
  }

  public void setShopId(UUID shopId) {
    this.shopId = shopId;
  }

   /**
   * If this shop has a limited stock, returns how many items are stocked, otherwise returns items stack size
   * @return stock
  **/
  @ApiModelProperty(required = true, value = "If this shop has a limited stock, returns how many items are stocked, otherwise returns items stack size")
  public Integer getStock() {
    return stock;
  }

  public VillagerShopsStockItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The index of this item withing the shops inventory
   * @return id
  **/
  @ApiModelProperty(value = "The index of this item withing the shops inventory")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VillagerShopsStockItem link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VillagerShopsStockItem villagerShopsStockItem = (VillagerShopsStockItem) o;
    return Objects.equals(this.buyPrice, villagerShopsStockItem.buyPrice) &&
        Objects.equals(this.currency, villagerShopsStockItem.currency) &&
        Objects.equals(this.hasStock, villagerShopsStockItem.hasStock) &&
        Objects.equals(this.item, villagerShopsStockItem.item) &&
        Objects.equals(this.maxStock, villagerShopsStockItem.maxStock) &&
        Objects.equals(this.sellPrice, villagerShopsStockItem.sellPrice) &&
        Objects.equals(this.shopId, villagerShopsStockItem.shopId) &&
        Objects.equals(this.stock, villagerShopsStockItem.stock) &&
        Objects.equals(this.id, villagerShopsStockItem.id) &&
        Objects.equals(this.link, villagerShopsStockItem.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyPrice, currency, hasStock, item, maxStock, sellPrice, shopId, stock, id, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VillagerShopsStockItem {\n");
    
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hasStock: ").append(toIndentedString(hasStock)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    maxStock: ").append(toIndentedString(maxStock)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
