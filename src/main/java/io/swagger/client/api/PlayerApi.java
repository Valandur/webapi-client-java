/*
 * WebAPI
 * Access Sponge powered Minecraft servers through a WebAPI  #/ Introduction This is the documentation of the various API routes offered by the WebAPI plugin.  This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/...  As a quick test try reaching the route http:/localhost:8080/api/info (remember that you can only access \"localhost\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  #/ Additional data Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md) 
 *
 * OpenAPI spec version: <version>
 * 
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


import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.PlayerMethodResult;
import io.swagger.client.model.PlayerResponse;
import io.swagger.client.model.PlayersList;
import io.swagger.client.model.RawRequest;
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
     * Build call for changePlayer
     * @param uuid The uuid of the player. (required)
     * @param updatePlayerRequest The new properties of the player (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call changePlayerCall(String uuid, UpdatePlayerRequest updatePlayerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updatePlayerRequest;
        
        // create path and map variables
        String localVarPath = "/player/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "headerKey", "queryKey" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call changePlayerValidateBeforeCall(String uuid, UpdatePlayerRequest updatePlayerRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling changePlayer(Async)");
        }
        
        // verify the required parameter 'updatePlayerRequest' is set
        if (updatePlayerRequest == null) {
            throw new ApiException("Missing the required parameter 'updatePlayerRequest' when calling changePlayer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = changePlayerCall(uuid, updatePlayerRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit player
     * Update the properties of an existing player.  &gt; Required permission: player.change 
     * @param uuid The uuid of the player. (required)
     * @param updatePlayerRequest The new properties of the player (required)
     * @return PlayerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlayerResponse changePlayer(String uuid, UpdatePlayerRequest updatePlayerRequest) throws ApiException {
        ApiResponse<PlayerResponse> resp = changePlayerWithHttpInfo(uuid, updatePlayerRequest);
        return resp.getData();
    }

    /**
     * Edit player
     * Update the properties of an existing player.  &gt; Required permission: player.change 
     * @param uuid The uuid of the player. (required)
     * @param updatePlayerRequest The new properties of the player (required)
     * @return ApiResponse&lt;PlayerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlayerResponse> changePlayerWithHttpInfo(String uuid, UpdatePlayerRequest updatePlayerRequest) throws ApiException {
        com.squareup.okhttp.Call call = changePlayerValidateBeforeCall(uuid, updatePlayerRequest, null, null);
        Type localVarReturnType = new TypeToken<PlayerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit player (asynchronously)
     * Update the properties of an existing player.  &gt; Required permission: player.change 
     * @param uuid The uuid of the player. (required)
     * @param updatePlayerRequest The new properties of the player (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call changePlayerAsync(String uuid, UpdatePlayerRequest updatePlayerRequest, final ApiCallback<PlayerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = changePlayerValidateBeforeCall(uuid, updatePlayerRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlayerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for executePlayerMethod
     * @param uuid The uuid of the player. (required)
     * @param request Information about which method to execute. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call executePlayerMethodCall(String uuid, RawRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/player/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "headerKey", "queryKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call executePlayerMethodValidateBeforeCall(String uuid, RawRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling executePlayerMethod(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling executePlayerMethod(Async)");
        }
        
        
        com.squareup.okhttp.Call call = executePlayerMethodCall(uuid, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Execute player method
     * Provides direct access to the underlaying player object and can execute any method on it.  &gt; Required permission: player.method 
     * @param uuid The uuid of the player. (required)
     * @param request Information about which method to execute. (required)
     * @return PlayerMethodResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlayerMethodResult executePlayerMethod(String uuid, RawRequest request) throws ApiException {
        ApiResponse<PlayerMethodResult> resp = executePlayerMethodWithHttpInfo(uuid, request);
        return resp.getData();
    }

    /**
     * Execute player method
     * Provides direct access to the underlaying player object and can execute any method on it.  &gt; Required permission: player.method 
     * @param uuid The uuid of the player. (required)
     * @param request Information about which method to execute. (required)
     * @return ApiResponse&lt;PlayerMethodResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlayerMethodResult> executePlayerMethodWithHttpInfo(String uuid, RawRequest request) throws ApiException {
        com.squareup.okhttp.Call call = executePlayerMethodValidateBeforeCall(uuid, request, null, null);
        Type localVarReturnType = new TypeToken<PlayerMethodResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute player method (asynchronously)
     * Provides direct access to the underlaying player object and can execute any method on it.  &gt; Required permission: player.method 
     * @param uuid The uuid of the player. (required)
     * @param request Information about which method to execute. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call executePlayerMethodAsync(String uuid, RawRequest request, final ApiCallback<PlayerMethodResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executePlayerMethodValidateBeforeCall(uuid, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlayerMethodResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlayer
     * @param uuid The uuid of the player to get detailed information about. (required)
     * @param fields An optional list of additional fields to get. (optional)
     * @param methods An optional list of additional methods to get. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlayerCall(String uuid, String fields, String methods, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/player/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
        if (methods != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "methods", methods));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "headerKey", "queryKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPlayerValidateBeforeCall(String uuid, String fields, String methods, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getPlayer(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getPlayerCall(uuid, fields, methods, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Detailed player info
     * Get detailed information about a player.  &gt; Required permission: player.one 
     * @param uuid The uuid of the player to get detailed information about. (required)
     * @param fields An optional list of additional fields to get. (optional)
     * @param methods An optional list of additional methods to get. (optional)
     * @return PlayerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlayerResponse getPlayer(String uuid, String fields, String methods) throws ApiException {
        ApiResponse<PlayerResponse> resp = getPlayerWithHttpInfo(uuid, fields, methods);
        return resp.getData();
    }

    /**
     * Detailed player info
     * Get detailed information about a player.  &gt; Required permission: player.one 
     * @param uuid The uuid of the player to get detailed information about. (required)
     * @param fields An optional list of additional fields to get. (optional)
     * @param methods An optional list of additional methods to get. (optional)
     * @return ApiResponse&lt;PlayerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlayerResponse> getPlayerWithHttpInfo(String uuid, String fields, String methods) throws ApiException {
        com.squareup.okhttp.Call call = getPlayerValidateBeforeCall(uuid, fields, methods, null, null);
        Type localVarReturnType = new TypeToken<PlayerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detailed player info (asynchronously)
     * Get detailed information about a player.  &gt; Required permission: player.one 
     * @param uuid The uuid of the player to get detailed information about. (required)
     * @param fields An optional list of additional fields to get. (optional)
     * @param methods An optional list of additional methods to get. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlayerAsync(String uuid, String fields, String methods, final ApiCallback<PlayerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlayerValidateBeforeCall(uuid, fields, methods, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlayerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlayers
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlayersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/player";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "headerKey", "queryKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPlayersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getPlayersCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Player list
     * Get a list of all the players on the server.  &gt; Required permission: player.list 
     * @return PlayersList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlayersList getPlayers() throws ApiException {
        ApiResponse<PlayersList> resp = getPlayersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Player list
     * Get a list of all the players on the server.  &gt; Required permission: player.list 
     * @return ApiResponse&lt;PlayersList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlayersList> getPlayersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getPlayersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<PlayersList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Player list (asynchronously)
     * Get a list of all the players on the server.  &gt; Required permission: player.list 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlayersAsync(final ApiCallback<PlayersList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlayersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlayersList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
