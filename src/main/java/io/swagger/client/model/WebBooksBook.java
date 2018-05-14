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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebBooksBook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T13:42:56.227+02:00")
public class WebBooksBook {
  @SerializedName("html")
  private String html = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lines")
  private List<String> lines = new ArrayList<String>();

  @SerializedName("link")
  private String link = null;

  @SerializedName("title")
  private String title = null;

   /**
   * The HTML representation of this book
   * @return html
  **/
  @ApiModelProperty(required = true, value = "The HTML representation of this book")
  public String getHtml() {
    return html;
  }

   /**
   * The unique id of this book
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of this book")
  public String getId() {
    return id;
  }

  public WebBooksBook lines(List<String> lines) {
    this.lines = lines;
    return this;
  }

  public WebBooksBook addLinesItem(String linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * A list of lines that make up this book
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "A list of lines that make up this book")
  public List<String> getLines() {
    return lines;
  }

  public void setLines(List<String> lines) {
    this.lines = lines;
  }

   /**
   * The API link that can be used to obtain more information about this object
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The API link that can be used to obtain more information about this object")
  public String getLink() {
    return link;
  }

  public WebBooksBook title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of this book
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of this book")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebBooksBook webBooksBook = (WebBooksBook) o;
    return Objects.equals(this.html, webBooksBook.html) &&
        Objects.equals(this.id, webBooksBook.id) &&
        Objects.equals(this.lines, webBooksBook.lines) &&
        Objects.equals(this.link, webBooksBook.link) &&
        Objects.equals(this.title, webBooksBook.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, id, lines, link, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebBooksBook {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
