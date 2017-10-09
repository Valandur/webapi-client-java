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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.PluginResponse;
import io.swagger.client.model.PluginsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PluginApi
 */
@Ignore
public class PluginApiTest {

    private final PluginApi api = new PluginApi();

    
    /**
     * Detailed plugin info
     *
     * Gets detailed information about a plugin.  &gt; Required permission: plugin.one 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPluginTest() throws ApiException {
        String id = null;
        PluginResponse response = api.getPlugin(id);

        // TODO: test validations
    }
    
    /**
     * Plugin list
     *
     * Get a list of all the plugins running on the server.  &gt; Required permission: plugin.list 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPluginsTest() throws ApiException {
        PluginsResponse response = api.getPlugins();

        // TODO: test validations
    }
    
}
