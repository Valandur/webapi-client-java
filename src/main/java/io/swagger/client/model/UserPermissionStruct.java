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

/**
 * UserPermissionStruct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:26:34.036+02:00")
public class UserPermissionStruct {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("permissions")
  private Object permissions = null;

  @SerializedName("rateLimit")
  private Integer rateLimit = null;

  public UserPermissionStruct key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key used authorize with the Web-API
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key used authorize with the Web-API")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserPermissionStruct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human readable name of this permssions struct. Only useful for users.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The human readable name of this permssions struct. Only useful for users.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserPermissionStruct permissions(Object permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions tree that this key grants access to
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "The permissions tree that this key grants access to")
  public Object getPermissions() {
    return permissions;
  }

  public void setPermissions(Object permissions) {
    this.permissions = permissions;
  }

  public UserPermissionStruct rateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

   /**
   * The rate limit in requests per second that this key permits (0 &#x3D; unlimited)
   * @return rateLimit
  **/
  @ApiModelProperty(required = true, value = "The rate limit in requests per second that this key permits (0 = unlimited)")
  public Integer getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(Integer rateLimit) {
    this.rateLimit = rateLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermissionStruct userPermissionStruct = (UserPermissionStruct) o;
    return Objects.equals(this.key, userPermissionStruct.key) &&
        Objects.equals(this.name, userPermissionStruct.name) &&
        Objects.equals(this.permissions, userPermissionStruct.permissions) &&
        Objects.equals(this.rateLimit, userPermissionStruct.rateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, permissions, rateLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissionStruct {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
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
