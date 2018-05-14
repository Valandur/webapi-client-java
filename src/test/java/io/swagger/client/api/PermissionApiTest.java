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
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.Subject;
import io.swagger.client.model.SubjectCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionApi
 */
@Ignore
public class PermissionApiTest {

    private final PermissionApi api = new PermissionApi();

    
    /**
     * Get collection
     *
     * Gets a specific subject collection     **Required permissions:**    - **permission.collection.one**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionTest() throws ApiException {
        String id = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        SubjectCollection response = api.getCollection(id, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * Get subject
     *
     * Gets one specific subject belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubjectTest() throws ApiException {
        String id = null;
        String subId = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        Subject response = api.getSubject(id, subId, details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * List collections
     *
     * Gets a list of all the subject collections, for example groups, users, etc.     **Required permissions:**    - **permission.collection.list**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCollectionsTest() throws ApiException {
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        List<SubjectCollection> response = api.listCollections(details, accept, pretty);

        // TODO: test validations
    }
    
    /**
     * List subjects
     *
     * List all subjects belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSubjectsTest() throws ApiException {
        String id = null;
        Boolean details = null;
        String accept = null;
        Boolean pretty = null;
        List<Subject> response = api.listSubjects(id, details, accept, pretty);

        // TODO: test validations
    }
    
}