/**
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  #/ Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  #/ Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
 *
 * OpenAPI spec version: <version>
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Ok;
import io.swagger.client.model.Plugin;
import java.util.ArrayList;
import java.util.List;


/**
 * PluginsResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T12:59:04.867+02:00")
public class PluginsResponse   {
  @SerializedName("ok")
  private Ok ok = null;

  @SerializedName("plugins")
  private List<Plugin> plugins = new ArrayList<Plugin>();

  public PluginsResponse ok(Ok ok) {
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @ApiModelProperty(example = "null", value = "")
  public Ok getOk() {
    return ok;
  }

  public void setOk(Ok ok) {
    this.ok = ok;
  }

  public PluginsResponse plugins(List<Plugin> plugins) {
    this.plugins = plugins;
    return this;
  }

  public PluginsResponse addPluginsItem(Plugin pluginsItem) {
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * A list of plugins.
   * @return plugins
  **/
  @ApiModelProperty(example = "null", value = "A list of plugins.")
  public List<Plugin> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<Plugin> plugins) {
    this.plugins = plugins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsResponse pluginsResponse = (PluginsResponse) o;
    return Objects.equals(this.ok, pluginsResponse.ok) &&
        Objects.equals(this.plugins, pluginsResponse.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsResponse {\n");
    
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

