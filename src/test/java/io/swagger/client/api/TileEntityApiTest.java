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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ExecuteMethodRequest;
import io.swagger.client.model.ExecuteMethodResponse;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.TileEntity;
import io.swagger.client.model.UpdateTileEntityRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TileEntityApi
 */
@Ignore
public class TileEntityApiTest {

    private final TileEntityApi api = new TileEntityApi();

    
    /**
     * Execute a method
     *
     * Provides direct access to the underlaying tile entity object and can execute any method on it.     **Required permissions:**    - **tile-entity.method**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeMethodTest() throws ApiException {
        String world = null;
        Integer x = null;
        Integer y = null;
        Integer z = null;
        ExecuteMethodRequest body = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        ExecuteMethodResponse response = api.executeMethod(world, x, y, z, body, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Get tile entity
     *
     * Get detailed information about a tile entity.     **Required permissions:**    - **tile-entity.one**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTileEntityTest() throws ApiException {
        String world = null;
        Integer x = null;
        Integer y = null;
        Integer z = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        TileEntity response = api.getTileEntity(world, x, y, z, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * List tile entities
     *
     * Get a list of all tile entities on the server (in all worlds, unless specified).     **Required permissions:**    - **tile-entity.list**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTileEntitiesTest() throws ApiException {
        String world = null;
        String type = null;
        String min = null;
        String max = null;
        Integer limit = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        List<TileEntity> response = api.listTileEntities(world, type, min, max, limit, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Modify tile entity
     *
     * Modify the properties of an existing tile entity.     **Required permissions:**    - **tile-entity.modify**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyTileEntityTest() throws ApiException {
        String world = null;
        Integer x = null;
        Integer y = null;
        Integer z = null;
        UpdateTileEntityRequest body = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        TileEntity response = api.modifyTileEntity(world, x, y, z, body, details, accept, pretty);

        // TODO: test validations
    }
    
}
