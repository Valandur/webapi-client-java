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


import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.MMCTicketsTicketResponse;
import io.swagger.client.model.MMCTicketsTicketsResponse;
import io.swagger.client.model.MMCUpdateTicketRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MMCTicketsApi {
    private ApiClient apiClient;

    public MMCTicketsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MMCTicketsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for changeTicket
     * @param id The id of the ticket. (required)
     * @param updateTicketRequest The new properties of the ticket (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call changeTicketCall(String id, MMCUpdateTicketRequest updateTicketRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateTicketRequest;
        
        // create path and map variables
        String localVarPath = "/mmctickets/ticket/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call changeTicketValidateBeforeCall(String id, MMCUpdateTicketRequest updateTicketRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling changeTicket(Async)");
        }
        
        // verify the required parameter 'updateTicketRequest' is set
        if (updateTicketRequest == null) {
            throw new ApiException("Missing the required parameter 'updateTicketRequest' when calling changeTicket(Async)");
        }
        
        
        com.squareup.okhttp.Call call = changeTicketCall(id, updateTicketRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit ticket
     * Update the properties of an existing ticket.  &gt; Required permission: mmctickets.ticket.change 
     * @param id The id of the ticket. (required)
     * @param updateTicketRequest The new properties of the ticket (required)
     * @return MMCTicketsTicketResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MMCTicketsTicketResponse changeTicket(String id, MMCUpdateTicketRequest updateTicketRequest) throws ApiException {
        ApiResponse<MMCTicketsTicketResponse> resp = changeTicketWithHttpInfo(id, updateTicketRequest);
        return resp.getData();
    }

    /**
     * Edit ticket
     * Update the properties of an existing ticket.  &gt; Required permission: mmctickets.ticket.change 
     * @param id The id of the ticket. (required)
     * @param updateTicketRequest The new properties of the ticket (required)
     * @return ApiResponse&lt;MMCTicketsTicketResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MMCTicketsTicketResponse> changeTicketWithHttpInfo(String id, MMCUpdateTicketRequest updateTicketRequest) throws ApiException {
        com.squareup.okhttp.Call call = changeTicketValidateBeforeCall(id, updateTicketRequest, null, null);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit ticket (asynchronously)
     * Update the properties of an existing ticket.  &gt; Required permission: mmctickets.ticket.change 
     * @param id The id of the ticket. (required)
     * @param updateTicketRequest The new properties of the ticket (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call changeTicketAsync(String id, MMCUpdateTicketRequest updateTicketRequest, final ApiCallback<MMCTicketsTicketResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = changeTicketValidateBeforeCall(id, updateTicketRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTicket
     * @param id The id of the ticket to get detailed information about. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTicketCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/mmctickets/ticket/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getTicketValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTicket(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTicketCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Detailed ticket info
     * Get detailed information about a ticket.  &gt; Required permission: mmctickets.ticket.one 
     * @param id The id of the ticket to get detailed information about. (required)
     * @return MMCTicketsTicketResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MMCTicketsTicketResponse getTicket(String id) throws ApiException {
        ApiResponse<MMCTicketsTicketResponse> resp = getTicketWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Detailed ticket info
     * Get detailed information about a ticket.  &gt; Required permission: mmctickets.ticket.one 
     * @param id The id of the ticket to get detailed information about. (required)
     * @return ApiResponse&lt;MMCTicketsTicketResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MMCTicketsTicketResponse> getTicketWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getTicketValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detailed ticket info (asynchronously)
     * Get detailed information about a ticket.  &gt; Required permission: mmctickets.ticket.one 
     * @param id The id of the ticket to get detailed information about. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTicketAsync(String id, final ApiCallback<MMCTicketsTicketResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTicketValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTickets
     * @param details Pass this parameter to receive the full details for each ticket. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTicketsCall(String details, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/mmctickets/ticket";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "details", details));

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
    private com.squareup.okhttp.Call getTicketsValidateBeforeCall(String details, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTicketsCall(details, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Ticket list
     * Get a list of all the tickets on the server.  &gt; Required permission: mmtickets.ticket.list 
     * @param details Pass this parameter to receive the full details for each ticket. (optional)
     * @return MMCTicketsTicketsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MMCTicketsTicketsResponse getTickets(String details) throws ApiException {
        ApiResponse<MMCTicketsTicketsResponse> resp = getTicketsWithHttpInfo(details);
        return resp.getData();
    }

    /**
     * Ticket list
     * Get a list of all the tickets on the server.  &gt; Required permission: mmtickets.ticket.list 
     * @param details Pass this parameter to receive the full details for each ticket. (optional)
     * @return ApiResponse&lt;MMCTicketsTicketsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MMCTicketsTicketsResponse> getTicketsWithHttpInfo(String details) throws ApiException {
        com.squareup.okhttp.Call call = getTicketsValidateBeforeCall(details, null, null);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ticket list (asynchronously)
     * Get a list of all the tickets on the server.  &gt; Required permission: mmtickets.ticket.list 
     * @param details Pass this parameter to receive the full details for each ticket. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTicketsAsync(String details, final ApiCallback<MMCTicketsTicketsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTicketsValidateBeforeCall(details, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MMCTicketsTicketsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
