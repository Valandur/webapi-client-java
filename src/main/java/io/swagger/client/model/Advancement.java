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
import io.swagger.client.model.Advancement;
import io.swagger.client.model.CatalogTypeAdvancementTree;
import java.io.IOException;

/**
 * Advancement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T13:42:56.227+02:00")
public class Advancement {
  @SerializedName("id")
  private String id = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("announceToChat")
  private Boolean announceToChat = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("parent")
  private Advancement parent = null;

  @SerializedName("showToast")
  private Boolean showToast = null;

  @SerializedName("tree")
  private CatalogTypeAdvancementTree tree = null;

  public Advancement id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the advancement
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of the advancement")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public Advancement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the advancement
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the advancement")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Advancement title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the advancement
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the advancement")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Advancement announceToChat(Boolean announceToChat) {
    this.announceToChat = announceToChat;
    return this;
  }

   /**
   * True if the achieving of this advancement is announced in chat, false otherwise
   * @return announceToChat
  **/
  @ApiModelProperty(value = "True if the achieving of this advancement is announced in chat, false otherwise")
  public Boolean isAnnounceToChat() {
    return announceToChat;
  }

  public void setAnnounceToChat(Boolean announceToChat) {
    this.announceToChat = announceToChat;
  }

  public Advancement description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the advancement
   * @return description
  **/
  @ApiModelProperty(value = "The description of the advancement")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Advancement hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * True if this is a hidden advancement
   * @return hidden
  **/
  @ApiModelProperty(value = "True if this is a hidden advancement")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Advancement parent(Advancement parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The parent advancement, which must be unlocked prior to this advancement
   * @return parent
  **/
  @ApiModelProperty(value = "The parent advancement, which must be unlocked prior to this advancement")
  public Advancement getParent() {
    return parent;
  }

  public void setParent(Advancement parent) {
    this.parent = parent;
  }

  public Advancement showToast(Boolean showToast) {
    this.showToast = showToast;
    return this;
  }

   /**
   * True if achieving this advancement shows the player a toast message, false otherwise
   * @return showToast
  **/
  @ApiModelProperty(value = "True if achieving this advancement shows the player a toast message, false otherwise")
  public Boolean isShowToast() {
    return showToast;
  }

  public void setShowToast(Boolean showToast) {
    this.showToast = showToast;
  }

  public Advancement tree(CatalogTypeAdvancementTree tree) {
    this.tree = tree;
    return this;
  }

   /**
   * The advancement tree that this advancement belongs to
   * @return tree
  **/
  @ApiModelProperty(value = "The advancement tree that this advancement belongs to")
  public CatalogTypeAdvancementTree getTree() {
    return tree;
  }

  public void setTree(CatalogTypeAdvancementTree tree) {
    this.tree = tree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advancement advancement = (Advancement) o;
    return Objects.equals(this.id, advancement.id) &&
        Objects.equals(this.link, advancement.link) &&
        Objects.equals(this.name, advancement.name) &&
        Objects.equals(this.title, advancement.title) &&
        Objects.equals(this.announceToChat, advancement.announceToChat) &&
        Objects.equals(this.description, advancement.description) &&
        Objects.equals(this.hidden, advancement.hidden) &&
        Objects.equals(this.parent, advancement.parent) &&
        Objects.equals(this.showToast, advancement.showToast) &&
        Objects.equals(this.tree, advancement.tree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, name, title, announceToChat, description, hidden, parent, showToast, tree);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advancement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    announceToChat: ").append(toIndentedString(announceToChat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    showToast: ").append(toIndentedString(showToast)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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
