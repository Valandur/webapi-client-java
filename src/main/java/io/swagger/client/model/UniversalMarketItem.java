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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ItemStack;
import io.swagger.client.model.Player;
import java.io.IOException;

/**
 * UniversalMarketItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T12:56:27.838+02:00")
public class UniversalMarketItem {
  @SerializedName("display")
  private ItemStack display = null;

  @SerializedName("expires")
  private Long expires = null;

  @SerializedName("item")
  private ItemStack item = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("owner")
  private Player owner = null;

  @SerializedName("price")
  private Double price = null;

  public UniversalMarketItem display(ItemStack display) {
    this.display = display;
    return this;
  }

   /**
   * The ItemStack displayed to the users
   * @return display
  **/
  @ApiModelProperty(required = true, value = "The ItemStack displayed to the users")
  public ItemStack getDisplay() {
    return display;
  }

  public void setDisplay(ItemStack display) {
    this.display = display;
  }

  public UniversalMarketItem expires(Long expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The unix timestamp (in seconds) at which this offer will expire
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "The unix timestamp (in seconds) at which this offer will expire")
  public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }

  public UniversalMarketItem item(ItemStack item) {
    this.item = item;
    return this;
  }

   /**
   * The ItemStack that is being sold
   * @return item
  **/
  @ApiModelProperty(required = true, value = "The ItemStack that is being sold")
  public ItemStack getItem() {
    return item;
  }

  public void setItem(ItemStack item) {
    this.item = item;
  }

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public UniversalMarketItem owner(Player owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner that submitted this offer
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "The owner that submitted this offer")
  public Player getOwner() {
    return owner;
  }

  public void setOwner(Player owner) {
    this.owner = owner;
  }

  public UniversalMarketItem price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The price this item is being sold for
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The price this item is being sold for")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniversalMarketItem universalMarketItem = (UniversalMarketItem) o;
    return Objects.equals(this.display, universalMarketItem.display) &&
        Objects.equals(this.expires, universalMarketItem.expires) &&
        Objects.equals(this.item, universalMarketItem.item) &&
        Objects.equals(this.link, universalMarketItem.link) &&
        Objects.equals(this.owner, universalMarketItem.owner) &&
        Objects.equals(this.price, universalMarketItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, expires, item, link, owner, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniversalMarketItem {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

