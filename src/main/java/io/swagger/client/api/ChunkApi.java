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


import io.swagger.client.model.Chunk;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse500;

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
     * Build call for createChunkAt
     * @param world The uuid of the world in which to create the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createChunkAtCall(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chunk/{world}/{x}/{z}"
            .replaceAll("\\{" + "world" + "\\}", apiClient.escapeString(world.toString()))
            .replaceAll("\\{" + "x" + "\\}", apiClient.escapeString(x.toString()))
            .replaceAll("\\{" + "z" + "\\}", apiClient.escapeString(z.toString()));

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
    private com.squareup.okhttp.Call createChunkAtValidateBeforeCall(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'world' is set
        if (world == null) {
            throw new ApiException("Missing the required parameter 'world' when calling createChunkAt(Async)");
        }
        
        // verify the required parameter 'x' is set
        if (x == null) {
            throw new ApiException("Missing the required parameter 'x' when calling createChunkAt(Async)");
        }
        
        // verify the required parameter 'z' is set
        if (z == null) {
            throw new ApiException("Missing the required parameter 'z' when calling createChunkAt(Async)");
        }
        

        com.squareup.okhttp.Call call = createChunkAtCall(world, x, z, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Load &amp; Generate a chunk
     * Forces a chunk to be loaded into memory, and created if it does not exist.     **Required permissions:**    - **chunk.create**   
     * @param world The uuid of the world in which to create the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return Chunk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Chunk createChunkAt(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<Chunk> resp = createChunkAtWithHttpInfo(world, x, z, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Load &amp; Generate a chunk
     * Forces a chunk to be loaded into memory, and created if it does not exist.     **Required permissions:**    - **chunk.create**   
     * @param world The uuid of the world in which to create the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;Chunk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Chunk> createChunkAtWithHttpInfo(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = createChunkAtValidateBeforeCall(world, x, z, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<Chunk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Load &amp; Generate a chunk (asynchronously)
     * Forces a chunk to be loaded into memory, and created if it does not exist.     **Required permissions:**    - **chunk.create**   
     * @param world The uuid of the world in which to create the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createChunkAtAsync(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ApiCallback<Chunk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createChunkAtValidateBeforeCall(world, x, z, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Chunk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getChunkAt
     * @param world The uuid of the world in which to get the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getChunkAtCall(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chunk/{world}/{x}/{z}"
            .replaceAll("\\{" + "world" + "\\}", apiClient.escapeString(world.toString()))
            .replaceAll("\\{" + "x" + "\\}", apiClient.escapeString(x.toString()))
            .replaceAll("\\{" + "z" + "\\}", apiClient.escapeString(z.toString()));

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
    private com.squareup.okhttp.Call getChunkAtValidateBeforeCall(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'world' is set
        if (world == null) {
            throw new ApiException("Missing the required parameter 'world' when calling getChunkAt(Async)");
        }
        
        // verify the required parameter 'x' is set
        if (x == null) {
            throw new ApiException("Missing the required parameter 'x' when calling getChunkAt(Async)");
        }
        
        // verify the required parameter 'z' is set
        if (z == null) {
            throw new ApiException("Missing the required parameter 'z' when calling getChunkAt(Async)");
        }
        

        com.squareup.okhttp.Call call = getChunkAtCall(world, x, z, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a chunk
     * Get detailed information about a chunk     **Required permissions:**    - **chunk.one**   
     * @param world The uuid of the world in which to get the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return Chunk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Chunk getChunkAt(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<Chunk> resp = getChunkAtWithHttpInfo(world, x, z, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get a chunk
     * Get detailed information about a chunk     **Required permissions:**    - **chunk.one**   
     * @param world The uuid of the world in which to get the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;Chunk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Chunk> getChunkAtWithHttpInfo(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getChunkAtValidateBeforeCall(world, x, z, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<Chunk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a chunk (asynchronously)
     * Get detailed information about a chunk     **Required permissions:**    - **chunk.one**   
     * @param world The uuid of the world in which to get the chunk (required)
     * @param x The x-coordinate of the chunk (in chunk coordinates) (required)
     * @param z The z-coordinate of the chunk (in chunk coordinates) (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChunkAtAsync(String world, Integer x, Integer z, Boolean details, String accept, Boolean pretty, final ApiCallback<Chunk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChunkAtValidateBeforeCall(world, x, z, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Chunk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listChunks
     * @param world The uuid of the for which to get all chunks (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listChunksCall(String world, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chunk/{world}"
            .replaceAll("\\{" + "world" + "\\}", apiClient.escapeString(world.toString()));

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
    private com.squareup.okhttp.Call listChunksValidateBeforeCall(String world, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'world' is set
        if (world == null) {
            throw new ApiException("Missing the required parameter 'world' when calling listChunks(Async)");
        }
        

        com.squareup.okhttp.Call call = listChunksCall(world, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List chunks
     * Gets a list of all the loaded chunks for the specified world.     **Required permissions:**    - **chunk.list**   
     * @param world The uuid of the for which to get all chunks (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;Chunk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Chunk> listChunks(String world, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<Chunk>> resp = listChunksWithHttpInfo(world, details, accept, pretty);
        return resp.getData();
    }

    /**
     * List chunks
     * Gets a list of all the loaded chunks for the specified world.     **Required permissions:**    - **chunk.list**   
     * @param world The uuid of the for which to get all chunks (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;Chunk&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Chunk>> listChunksWithHttpInfo(String world, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = listChunksValidateBeforeCall(world, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<Chunk>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List chunks (asynchronously)
     * Gets a list of all the loaded chunks for the specified world.     **Required permissions:**    - **chunk.list**   
     * @param world The uuid of the for which to get all chunks (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listChunksAsync(String world, Boolean details, String accept, Boolean pretty, final ApiCallback<List<Chunk>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listChunksValidateBeforeCall(world, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Chunk>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
