/*
 * Web-API
 * Access Sponge powered Minecraft servers through a WebAPI  # Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  # List endpoints Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  > Remember that in this case the data returned by the endpoint might be quite large.  # Debugging endpoints Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  `details`: Includes details for list endpoints  `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  `pretty`: Pretty prints the data, also good for debugging in the browser.  An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  # Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)
 *
 * OpenAPI spec version: 5.4.2-S7.1.0
 * Contact: inithilian@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BlockOperation;
import io.swagger.client.model.BlockState;
import io.swagger.client.model.CreateBlockOperationRequest;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.ModifyBlockOperationRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Ignore
public class BlockApiTest {

    private final BlockApi api = new BlockApi();

    
    /**
     * Create a block operation
     *
     * Start a request to get or change blocks on the server.     **Required permissions:**    - **block.op.create**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBlockOperationTest() throws ApiException {
        CreateBlockOperationRequest body = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        BlockOperation response = api.createBlockOperation(body, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Stop a block operation
     *
     * Cancel a pending or running block operation. **THIS DOES NOT UNDO THE BLOCK CHANGES**     **Required permissions:**    - **block.op.delete**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBlockOperationTest() throws ApiException {
        UUID uuid = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        BlockOperation response = api.deleteBlockOperation(uuid, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Get a block
     *
     * Gets information about one block in the world.     **Required permissions:**    - **block.one**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlockTest() throws ApiException {
        String world = null;
        Integer x = null;
        Integer y = null;
        Integer z = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        BlockState response = api.getBlock(world, x, y, z, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Get a block operation
     *
     * Gets details about a specific block operation     **Required permissions:**    - **block.op.one**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlockOperationTest() throws ApiException {
        UUID uuid = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        BlockOperation response = api.getBlockOperation(uuid, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * List block operations
     *
     * Returns a list of all the currently running block operations.     **Required permissions:**    - **block.op.list**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBlockOperationsTest() throws ApiException {
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        List<BlockOperation> response = api.listBlockOperations(details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Modify a block operation
     *
     * Modify an existing block operation to either pause or continue it.     **Required permissions:**    - **block.op.modify**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyBlockOperationTest() throws ApiException {
        UUID uuid = null;
        ModifyBlockOperationRequest body = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        BlockOperation response = api.modifyBlockOperation(uuid, body, details, accept, pretty);

        // TODO: test validations
    }
    
}
