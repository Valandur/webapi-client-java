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
import io.swagger.client.model.EntityFull;
import io.swagger.client.model.RawResponse;
import java.io.IOException;

/**
 * EntityMethodResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T21:04:49.224+02:00")
public class EntityMethodResult {
  @SerializedName("ok")
  private Boolean ok = null;

  @SerializedName("entity")
  private EntityFull entity = null;

  @SerializedName("result")
  private RawResponse result = null;

  public EntityMethodResult ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @ApiModelProperty(value = "")
  public Boolean getOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }

  public EntityMethodResult entity(EntityFull entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")
  public EntityFull getEntity() {
    return entity;
  }

  public void setEntity(EntityFull entity) {
    this.entity = entity;
  }

  public EntityMethodResult result(RawResponse result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public RawResponse getResult() {
    return result;
  }

  public void setResult(RawResponse result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMethodResult entityMethodResult = (EntityMethodResult) o;
    return Objects.equals(this.ok, entityMethodResult.ok) &&
        Objects.equals(this.entity, entityMethodResult.entity) &&
        Objects.equals(this.result, entityMethodResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, entity, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMethodResult {\n");
    
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

