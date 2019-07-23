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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ExecuteMethodRequest;
import io.swagger.client.model.ExecuteMethodResponse;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.Player;
import io.swagger.client.model.UpdatePlayerRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerApi {
    private ApiClient apiClient;

    public PlayerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlayerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for executeMethod
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call executeMethodCall(String player, ExecuteMethodRequest body, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/player/{player}/method"
            .replaceAll("\\{" + "player" + "\\}", apiClient.escapeString(player.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));
        if (accept != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accept", accept));
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyHeader", "ApiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call executeMethodValidateBeforeCall(String player, ExecuteMethodRequest body, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new ApiException("Missing the required parameter 'player' when calling executeMethod(Async)");
        }
        

        com.squareup.okhttp.Call call = executeMethodCall(player, body, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Execute a method
     * Provides direct access to the underlying player object and can execute any method on it.     **Required permissions:**    - **player.method**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ExecuteMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExecuteMethodResponse executeMethod(String player, ExecuteMethodRequest body, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<ExecuteMethodResponse> resp = executeMethodWithHttpInfo(player, body, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Execute a method
     * Provides direct access to the underlying player object and can execute any method on it.     **Required permissions:**    - **player.method**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;ExecuteMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExecuteMethodResponse> executeMethodWithHttpInfo(String player, ExecuteMethodRequest body, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = executeMethodValidateBeforeCall(player, body, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<ExecuteMethodResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute a method (asynchronously)
     * Provides direct access to the underlying player object and can execute any method on it.     **Required permissions:**    - **player.method**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executeMethodAsync(String player, ExecuteMethodRequest body, Boolean details, String accept, Boolean pretty, final ApiCallback<ExecuteMethodResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = executeMethodValidateBeforeCall(player, body, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExecuteMethodResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlayer
     * @param player The uuid of the player (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlayerCall(String player, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/player/{player}"
            .replaceAll("\\{" + "player" + "\\}", apiClient.escapeString(player.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));
        if (accept != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accept", accept));
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyHeader", "ApiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPlayerValidateBeforeCall(String player, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new ApiException("Missing the required parameter 'player' when calling getPlayer(Async)");
        }
        

        com.squareup.okhttp.Call call = getPlayerCall(player, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a player
     * Get detailed information about a player.     **Required permissions:**    - **player.one**   
     * @param player The uuid of the player (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return Player
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Player getPlayer(String player, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<Player> resp = getPlayerWithHttpInfo(player, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get a player
     * Get detailed information about a player.     **Required permissions:**    - **player.one**   
     * @param player The uuid of the player (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;Player&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Player> getPlayerWithHttpInfo(String player, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getPlayerValidateBeforeCall(player, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<Player>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a player (asynchronously)
     * Get detailed information about a player.     **Required permissions:**    - **player.one**   
     * @param player The uuid of the player (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlayerAsync(String player, Boolean details, String accept, Boolean pretty, final ApiCallback<Player> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPlayerValidateBeforeCall(player, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Player>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listPlayers
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listPlayersCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/player";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));
        if (accept != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accept", accept));
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyHeader", "ApiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listPlayersValidateBeforeCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listPlayersCall(details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List players
     * Get a list of all the players on the server.     **Required permissions:**    - **player.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;Player&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Player> listPlayers(Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<Player>> resp = listPlayersWithHttpInfo(details, accept, pretty);
        return resp.getData();
    }

    /**
     * List players
     * Get a list of all the players on the server.     **Required permissions:**    - **player.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;Player&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Player>> listPlayersWithHttpInfo(Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = listPlayersValidateBeforeCall(details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<Player>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List players (asynchronously)
     * Get a list of all the players on the server.     **Required permissions:**    - **player.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listPlayersAsync(Boolean details, String accept, Boolean pretty, final ApiCallback<List<Player>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listPlayersValidateBeforeCall(details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Player>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyPlayer
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyPlayerCall(String player, UpdatePlayerRequest body, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/player/{player}"
            .replaceAll("\\{" + "player" + "\\}", apiClient.escapeString(player.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));
        if (accept != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accept", accept));
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyHeader", "ApiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modifyPlayerValidateBeforeCall(String player, UpdatePlayerRequest body, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new ApiException("Missing the required parameter 'player' when calling modifyPlayer(Async)");
        }
        

        com.squareup.okhttp.Call call = modifyPlayerCall(player, body, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Modify a player
     * Modify the properties of an existing player.     **Required permissions:**    - **player.modify**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return Player
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Player modifyPlayer(String player, UpdatePlayerRequest body, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<Player> resp = modifyPlayerWithHttpInfo(player, body, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Modify a player
     * Modify the properties of an existing player.     **Required permissions:**    - **player.modify**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;Player&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Player> modifyPlayerWithHttpInfo(String player, UpdatePlayerRequest body, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = modifyPlayerValidateBeforeCall(player, body, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<Player>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify a player (asynchronously)
     * Modify the properties of an existing player.     **Required permissions:**    - **player.modify**   
     * @param player The uuid of the player (required)
     * @param body  (optional)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyPlayerAsync(String player, UpdatePlayerRequest body, Boolean details, String accept, Boolean pretty, final ApiCallback<Player> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modifyPlayerValidateBeforeCall(player, body, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Player>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
