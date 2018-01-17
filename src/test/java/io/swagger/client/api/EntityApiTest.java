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
import io.swagger.client.model.CreateEntityRequest;
import io.swagger.client.model.EntitiesList;
import io.swagger.client.model.EntityMethodResult;
import io.swagger.client.model.EntityResponse;
import io.swagger.client.model.Error400;
import io.swagger.client.model.RawRequest;
import io.swagger.client.model.UpdateEntityRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntityApi
 */
@Ignore
public class EntityApiTest {

    private final EntityApi api = new EntityApi();

    
    /**
     * Edit entity
     *
     * Update the properties of an existing entity.  &gt; Required permission: entity.change 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeEntityTest() throws ApiException {
        String uuid = null;
        UpdateEntityRequest updateEntityRequest = null;
        EntityResponse response = api.changeEntity(uuid, updateEntityRequest);

        // TODO: test validations
    }
    
    /**
     * Create an entity
     *
     * Creates &amp; Spawns a new entity with the specified properties.  &gt; Required permission: entity.create 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEntityTest() throws ApiException {
        CreateEntityRequest createEntityRequest = null;
        EntityResponse response = api.createEntity(createEntityRequest);

        // TODO: test validations
    }
    
    /**
     * Destroy an entity
     *
     * Destroys an entity.  &gt; Required permission: entity.delete 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyEntityTest() throws ApiException {
        String uuid = null;
        EntityResponse response = api.destroyEntity(uuid);

        // TODO: test validations
    }
    
    /**
     * Execute entity method
     *
     * Provides direct access to the underlaying entity object and can execute any method on it.  &gt; Required permission: entity.method 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeEntityMethodTest() throws ApiException {
        String uuid = null;
        RawRequest request = null;
        EntityMethodResult response = api.executeEntityMethod(uuid, request);

        // TODO: test validations
    }
    
    /**
     * Entities list
     *
     * Get a list of all entities on the server (in all worlds).  &gt; Required permission: entity.list 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntitiesTest() throws ApiException {
        String details = null;
        EntitiesList response = api.getEntities(details);

        // TODO: test validations
    }
    
    /**
     * Detailed entity info
     *
     * Get detailed information about an entity.  &gt; Required permission: entity.one 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntityTest() throws ApiException {
        String uuid = null;
        String fields = null;
        String methods = null;
        EntityResponse response = api.getEntity(uuid, fields, methods);

        // TODO: test validations
    }
    
}
