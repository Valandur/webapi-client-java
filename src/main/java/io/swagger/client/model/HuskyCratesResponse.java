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
import io.swagger.client.model.HuskyCrate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HuskyCratesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-17T22:13:43.947+01:00")
public class HuskyCratesResponse {
  @SerializedName("ok")
  private Boolean ok = null;

  @SerializedName("crates")
  private List<HuskyCrate> crates = null;

  public HuskyCratesResponse ok(Boolean ok) {
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

  public HuskyCratesResponse crates(List<HuskyCrate> crates) {
    this.crates = crates;
    return this;
  }

  public HuskyCratesResponse addCratesItem(HuskyCrate cratesItem) {
    if (this.crates == null) {
      this.crates = new ArrayList<HuskyCrate>();
    }
    this.crates.add(cratesItem);
    return this;
  }

   /**
   * A list of crates.
   * @return crates
  **/
  @ApiModelProperty(value = "A list of crates.")
  public List<HuskyCrate> getCrates() {
    return crates;
  }

  public void setCrates(List<HuskyCrate> crates) {
    this.crates = crates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HuskyCratesResponse huskyCratesResponse = (HuskyCratesResponse) o;
    return Objects.equals(this.ok, huskyCratesResponse.ok) &&
        Objects.equals(this.crates, huskyCratesResponse.crates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, crates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HuskyCratesResponse {\n");
    
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    crates: ").append(toIndentedString(crates)).append("\n");
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

