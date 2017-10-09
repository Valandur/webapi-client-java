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


import io.swagger.client.model.ChunkResponse;
import io.swagger.client.model.ChunksResponse;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChunkApi {
    private ApiClient apiClient;

    public ChunkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChunkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChunk
     * @param uuid The uuid of the world. (required)
     * @param x The x-coordinate of the chunk. (required)
     * @param z The z-coordinate of the chunk. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getChunkCall(String uuid, String x, String z, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/world/{uuid}/chunk/{x}/{z}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "x" + "\\}", apiClient.escapeString(x.toString()))
            .replaceAll("\\{" + "z" + "\\}", apiClient.escapeString(z.toString()));

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
    private com.squareup.okhttp.Call getChunkValidateBeforeCall(String uuid, String x, String z, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getChunk(Async)");
        }
        
        // verify the required parameter 'x' is set
        if (x == null) {
            throw new ApiException("Missing the required parameter 'x' when calling getChunk(Async)");
        }
        
        // verify the required parameter 'z' is set
        if (z == null) {
            throw new ApiException("Missing the required parameter 'z' when calling getChunk(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChunkCall(uuid, x, z, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Detailed chunk info
     * Get detailed information about a chunk  &gt; Required permission: world.chunk.one 
     * @param uuid The uuid of the world. (required)
     * @param x The x-coordinate of the chunk. (required)
     * @param z The z-coordinate of the chunk. (required)
     * @return ChunkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChunkResponse getChunk(String uuid, String x, String z) throws ApiException {
        ApiResponse<ChunkResponse> resp = getChunkWithHttpInfo(uuid, x, z);
        return resp.getData();
    }

    /**
     * Detailed chunk info
     * Get detailed information about a chunk  &gt; Required permission: world.chunk.one 
     * @param uuid The uuid of the world. (required)
     * @param x The x-coordinate of the chunk. (required)
     * @param z The z-coordinate of the chunk. (required)
     * @return ApiResponse&lt;ChunkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChunkResponse> getChunkWithHttpInfo(String uuid, String x, String z) throws ApiException {
        com.squareup.okhttp.Call call = getChunkValidateBeforeCall(uuid, x, z, null, null);
        Type localVarReturnType = new TypeToken<ChunkResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detailed chunk info (asynchronously)
     * Get detailed information about a chunk  &gt; Required permission: world.chunk.one 
     * @param uuid The uuid of the world. (required)
     * @param x The x-coordinate of the chunk. (required)
     * @param z The z-coordinate of the chunk. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChunkAsync(String uuid, String x, String z, final ApiCallback<ChunkResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChunkValidateBeforeCall(uuid, x, z, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChunkResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getChunks
     * @param uuid The uuid of the world. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getChunksCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/world/{uuid}/chunk"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChunksValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getChunks(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChunksCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Loaded chunk list
     * Gets a list of all the loaded chunks for the specified world.  &gt; Required permission: world.chunk.list 
     * @param uuid The uuid of the world. (required)
     * @return ChunksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChunksResponse getChunks(String uuid) throws ApiException {
        ApiResponse<ChunksResponse> resp = getChunksWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Loaded chunk list
     * Gets a list of all the loaded chunks for the specified world.  &gt; Required permission: world.chunk.list 
     * @param uuid The uuid of the world. (required)
     * @return ApiResponse&lt;ChunksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChunksResponse> getChunksWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = getChunksValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<ChunksResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Loaded chunk list (asynchronously)
     * Gets a list of all the loaded chunks for the specified world.  &gt; Required permission: world.chunk.list 
     * @param uuid The uuid of the world. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChunksAsync(String uuid, final ApiCallback<ChunksResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChunksValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChunksResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
