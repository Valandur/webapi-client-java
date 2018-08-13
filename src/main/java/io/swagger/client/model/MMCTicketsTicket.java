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
import io.swagger.client.model.Location;
import io.swagger.client.model.Player;
import java.io.IOException;

/**
 * MMCTicketsTicket
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:26:34.036+02:00")
public class MMCTicketsTicket {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("message")
  private String message = null;

  /**
   * The current status of the ticket
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("Open"),
    
    CLAIMED("Claimed"),
    
    HELD("Held"),
    
    CLOSED("Closed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("notified")
  private Integer notified = null;

  @SerializedName("sender")
  private Player sender = null;

  @SerializedName("staff")
  private Player staff = null;

  public MMCTicketsTicket id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of this ticket
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of this ticket")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

  public MMCTicketsTicket message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message sent along with this ticket
   * @return message
  **/
  @ApiModelProperty(required = true, value = "The message sent along with this ticket")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MMCTicketsTicket status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the ticket
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the ticket")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MMCTicketsTicket timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The unix timestamp (in seconds) when this ticket was submitted
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The unix timestamp (in seconds) when this ticket was submitted")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public MMCTicketsTicket comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The comment added by staff to this ticket
   * @return comment
  **/
  @ApiModelProperty(value = "The comment added by staff to this ticket")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MMCTicketsTicket location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * The location at which this ticket was submitted
   * @return location
  **/
  @ApiModelProperty(value = "The location at which this ticket was submitted")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public MMCTicketsTicket notified(Integer notified) {
    this.notified = notified;
    return this;
  }

   /**
   * True if staff has been notified about this ticket, false otherwise
   * @return notified
  **/
  @ApiModelProperty(value = "True if staff has been notified about this ticket, false otherwise")
  public Integer getNotified() {
    return notified;
  }

  public void setNotified(Integer notified) {
    this.notified = notified;
  }

  public MMCTicketsTicket sender(Player sender) {
    this.sender = sender;
    return this;
  }

   /**
   * The sender of this ticket
   * @return sender
  **/
  @ApiModelProperty(value = "The sender of this ticket")
  public Player getSender() {
    return sender;
  }

  public void setSender(Player sender) {
    this.sender = sender;
  }

  public MMCTicketsTicket staff(Player staff) {
    this.staff = staff;
    return this;
  }

   /**
   * The staff member that was assigned to this ticket
   * @return staff
  **/
  @ApiModelProperty(value = "The staff member that was assigned to this ticket")
  public Player getStaff() {
    return staff;
  }

  public void setStaff(Player staff) {
    this.staff = staff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MMCTicketsTicket mmCTicketsTicket = (MMCTicketsTicket) o;
    return Objects.equals(this.id, mmCTicketsTicket.id) &&
        Objects.equals(this.link, mmCTicketsTicket.link) &&
        Objects.equals(this.message, mmCTicketsTicket.message) &&
        Objects.equals(this.status, mmCTicketsTicket.status) &&
        Objects.equals(this.timestamp, mmCTicketsTicket.timestamp) &&
        Objects.equals(this.comment, mmCTicketsTicket.comment) &&
        Objects.equals(this.location, mmCTicketsTicket.location) &&
        Objects.equals(this.notified, mmCTicketsTicket.notified) &&
        Objects.equals(this.sender, mmCTicketsTicket.sender) &&
        Objects.equals(this.staff, mmCTicketsTicket.staff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, message, status, timestamp, comment, location, notified, sender, staff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MMCTicketsTicket {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notified: ").append(toIndentedString(notified)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
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

