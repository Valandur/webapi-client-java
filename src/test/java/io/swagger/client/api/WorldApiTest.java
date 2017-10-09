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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.WorldResponse;
import io.swagger.client.model.UpdateWorldRequest;
import io.swagger.client.model.CreateWorldRequest;
import io.swagger.client.model.RawRequest;
import io.swagger.client.model.ExecuteWorldMethodResponse;
import io.swagger.client.model.ChunkResponse;
import io.swagger.client.model.ChunksResponse;
import io.swagger.client.model.WorldsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorldApi
 */
public class WorldApiTest {

    private final WorldApi api = new WorldApi();

    
    /**
     * Edit world
     *
     * Update the properties of an existing world.  &gt; Required permission: world.change 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeWorldTest() throws ApiException {
        String uuid = null;
        UpdateWorldRequest updateWorldRequest = null;
        // WorldResponse response = api.changeWorld(uuid, updateWorldRequest);

        // TODO: test validations
    }
    
    /**
     * Create a world
     *
     * Creates a new world with the specified settings. This does not yet load the world.  &gt; Required permission: world.create 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorldTest() throws ApiException {
        CreateWorldRequest createWorldRequest = null;
        // WorldResponse response = api.createWorld(createWorldRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a world
     *
     * Deletes an existing world. **The world must be unloaded before deleting it**  &gt; Required permission: world.delete 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorldTest() throws ApiException {
        String uuid = null;
        // WorldResponse response = api.deleteWorld(uuid);

        // TODO: test validations
    }
    
    /**
     * Execute world methods
     *
     * Provides direct access to the underlaying world object and can execute any method on it.  &gt; Required permission: world.method 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeWorldMethodTest() throws ApiException {
        String uuid = null;
        RawRequest request = null;
        // ExecuteWorldMethodResponse response = api.executeWorldMethod(uuid, request);

        // TODO: test validations
    }
    
    /**
     * Detailed chunk info
     *
     * Get detailed information about a chunk  &gt; Required permission: world.chunk.one 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChunkTest() throws ApiException {
        String uuid = null;
        String x = null;
        String z = null;
        // ChunkResponse response = api.getChunk(uuid, x, z);

        // TODO: test validations
    }
    
    /**
     * Loaded chunk list
     *
     * Gets a list of all the loaded chunks for the specified world.  &gt; Required permission: world.chunk.list 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChunksTest() throws ApiException {
        String uuid = null;
        // ChunksResponse response = api.getChunks(uuid);

        // TODO: test validations
    }
    
    /**
     * Detailed world info
     *
     * Get detailed information about a world.  &gt; Required permission: world.one 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldTest() throws ApiException {
        String uuid = null;
        String fields = null;
        String methods = null;
        // WorldResponse response = api.getWorld(uuid, fields, methods);

        // TODO: test validations
    }
    
    /**
     * World list
     *
     * Get a list of all the worlds on the server.  &gt; Required permission: world.list 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldsTest() throws ApiException {
        String details = null;
        // WorldsResponse response = api.getWorlds(details);

        // TODO: test validations
    }
    
}
