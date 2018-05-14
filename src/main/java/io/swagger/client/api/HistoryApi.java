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


import io.swagger.client.model.CommandCall;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.Message;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryApi {
    private ApiClient apiClient;

    public HistoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getChat
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getChatCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/history/message";

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
    private com.squareup.okhttp.Call getChatValidateBeforeCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getChatCall(details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get message history
     * View a history of the server messages.     **Required permissions:**    - **history.message**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;Message&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Message> getChat(Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<Message>> resp = getChatWithHttpInfo(details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get message history
     * View a history of the server messages.     **Required permissions:**    - **history.message**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;Message&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Message>> getChatWithHttpInfo(Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getChatValidateBeforeCall(details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<Message>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get message history (asynchronously)
     * View a history of the server messages.     **Required permissions:**    - **history.message**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChatAsync(Boolean details, String accept, Boolean pretty, final ApiCallback<List<Message>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChatValidateBeforeCall(details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Message>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCommands
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommandsCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/history/cmd";

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
    private com.squareup.okhttp.Call getCommandsValidateBeforeCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCommandsCall(details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get command history
     * View a history of the server commands.     **Required permissions:**    - **history.cmd**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;CommandCall&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CommandCall> getCommands(Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<CommandCall>> resp = getCommandsWithHttpInfo(details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get command history
     * View a history of the server commands.     **Required permissions:**    - **history.cmd**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;CommandCall&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CommandCall>> getCommandsWithHttpInfo(Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getCommandsValidateBeforeCall(details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<CommandCall>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get command history (asynchronously)
     * View a history of the server commands.     **Required permissions:**    - **history.cmd**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommandsAsync(Boolean details, String accept, Boolean pretty, final ApiCallback<List<CommandCall>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommandsValidateBeforeCall(details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CommandCall>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
