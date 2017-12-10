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
import io.swagger.client.model.MessageOption;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MessageRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-10T13:08:53.752+01:00")
public class MessageRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("once")
  private Boolean once = null;

  @SerializedName("options")
  private List<MessageOption> options = null;

  public MessageRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the message. This will be sent back in the reply, so you can identify the request.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the message. This will be sent back in the reply, so you can identify the request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The UUID of the player this message is sent to.
   * @return target
  **/
  @ApiModelProperty(value = "The UUID of the player this message is sent to.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public MessageRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message sent to the player. Text formatting can be applied with ampersand formatting.
   * @return message
  **/
  @ApiModelProperty(value = "The message sent to the player. Text formatting can be applied with ampersand formatting.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MessageRequest once(Boolean once) {
    this.once = once;
    return this;
  }

   /**
   * True if the target can only select one response for this message (further responses are not sent to the webhook endpoint) 
   * @return once
  **/
  @ApiModelProperty(value = "True if the target can only select one response for this message (further responses are not sent to the webhook endpoint) ")
  public Boolean getOnce() {
    return once;
  }

  public void setOnce(Boolean once) {
    this.once = once;
  }

  public MessageRequest options(List<MessageOption> options) {
    this.options = options;
    return this;
  }

  public MessageRequest addOptionsItem(MessageOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<MessageOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * These are the options the player can choose from. The key is sent back to the server, the value is displayed to the player. 
   * @return options
  **/
  @ApiModelProperty(value = "These are the options the player can choose from. The key is sent back to the server, the value is displayed to the player. ")
  public List<MessageOption> getOptions() {
    return options;
  }

  public void setOptions(List<MessageOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(this.id, messageRequest.id) &&
        Objects.equals(this.target, messageRequest.target) &&
        Objects.equals(this.message, messageRequest.message) &&
        Objects.equals(this.once, messageRequest.once) &&
        Objects.equals(this.options, messageRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, target, message, once, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    once: ").append(toIndentedString(once)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

