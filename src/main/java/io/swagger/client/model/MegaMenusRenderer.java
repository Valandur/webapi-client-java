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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * MegaMenusRenderer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-23T13:32:53.543+02:00")
public class MegaMenusRenderer {
  @SerializedName("link")
  private String link = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("menu")
  private UUID menu = null;

  @SerializedName("viewer")
  private List<UUID> viewer = null;

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public MegaMenusRenderer height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The rendering height for this menu in inventory rows
   * @return height
  **/
  @ApiModelProperty(value = "The rendering height for this menu in inventory rows")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public MegaMenusRenderer menu(UUID menu) {
    this.menu = menu;
    return this;
  }

   /**
   * The id for the menu this renderer is currently displaying
   * @return menu
  **/
  @ApiModelProperty(value = "The id for the menu this renderer is currently displaying")
  public UUID getMenu() {
    return menu;
  }

  public void setMenu(UUID menu) {
    this.menu = menu;
  }

  public MegaMenusRenderer viewer(List<UUID> viewer) {
    this.viewer = viewer;
    return this;
  }

  public MegaMenusRenderer addViewerItem(UUID viewerItem) {
    if (this.viewer == null) {
      this.viewer = new ArrayList<UUID>();
    }
    this.viewer.add(viewerItem);
    return this;
  }

   /**
   * All players currently observing this menu
   * @return viewer
  **/
  @ApiModelProperty(value = "All players currently observing this menu")
  public List<UUID> getViewer() {
    return viewer;
  }

  public void setViewer(List<UUID> viewer) {
    this.viewer = viewer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegaMenusRenderer megaMenusRenderer = (MegaMenusRenderer) o;
    return Objects.equals(this.link, megaMenusRenderer.link) &&
        Objects.equals(this.height, megaMenusRenderer.height) &&
        Objects.equals(this.menu, megaMenusRenderer.menu) &&
        Objects.equals(this.viewer, megaMenusRenderer.viewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, height, menu, viewer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaMenusRenderer {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
    sb.append("    viewer: ").append(toIndentedString(viewer)).append("\n");
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

