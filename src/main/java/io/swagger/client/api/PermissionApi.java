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


import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.InlineResponse403;
import io.swagger.client.model.InlineResponse404;
import io.swagger.client.model.InlineResponse500;
import io.swagger.client.model.Subject;
import io.swagger.client.model.SubjectCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermissionApi {
    private ApiClient apiClient;

    public PermissionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PermissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCollection
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCollectionCall(String id, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/permission/collection/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getCollectionValidateBeforeCall(String id, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getCollection(Async)");
        }
        

        com.squareup.okhttp.Call call = getCollectionCall(id, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get collection
     * Gets a specific subject collection     **Required permissions:**    - **permission.collection.one**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return SubjectCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubjectCollection getCollection(String id, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<SubjectCollection> resp = getCollectionWithHttpInfo(id, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get collection
     * Gets a specific subject collection     **Required permissions:**    - **permission.collection.one**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;SubjectCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubjectCollection> getCollectionWithHttpInfo(String id, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getCollectionValidateBeforeCall(id, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<SubjectCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get collection (asynchronously)
     * Gets a specific subject collection     **Required permissions:**    - **permission.collection.one**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCollectionAsync(String id, Boolean details, String accept, Boolean pretty, final ApiCallback<SubjectCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCollectionValidateBeforeCall(id, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubjectCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSubject
     * @param id  (required)
     * @param subId  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSubjectCall(String id, String subId, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/permission/collection/{id}/subject/{subId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "subId" + "\\}", apiClient.escapeString(subId.toString()));

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
    private com.squareup.okhttp.Call getSubjectValidateBeforeCall(String id, String subId, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSubject(Async)");
        }
        
        // verify the required parameter 'subId' is set
        if (subId == null) {
            throw new ApiException("Missing the required parameter 'subId' when calling getSubject(Async)");
        }
        

        com.squareup.okhttp.Call call = getSubjectCall(id, subId, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get subject
     * Gets one specific subject belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param subId  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return Subject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Subject getSubject(String id, String subId, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<Subject> resp = getSubjectWithHttpInfo(id, subId, details, accept, pretty);
        return resp.getData();
    }

    /**
     * Get subject
     * Gets one specific subject belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param subId  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;Subject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Subject> getSubjectWithHttpInfo(String id, String subId, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = getSubjectValidateBeforeCall(id, subId, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<Subject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get subject (asynchronously)
     * Gets one specific subject belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param subId  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSubjectAsync(String id, String subId, Boolean details, String accept, Boolean pretty, final ApiCallback<Subject> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSubjectValidateBeforeCall(id, subId, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Subject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listCollections
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCollectionsCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/permission/collection";

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
    private com.squareup.okhttp.Call listCollectionsValidateBeforeCall(Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listCollectionsCall(details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List collections
     * Gets a list of all the subject collections, for example groups, users, etc.     **Required permissions:**    - **permission.collection.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;SubjectCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SubjectCollection> listCollections(Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<SubjectCollection>> resp = listCollectionsWithHttpInfo(details, accept, pretty);
        return resp.getData();
    }

    /**
     * List collections
     * Gets a list of all the subject collections, for example groups, users, etc.     **Required permissions:**    - **permission.collection.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;SubjectCollection&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SubjectCollection>> listCollectionsWithHttpInfo(Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = listCollectionsValidateBeforeCall(details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<SubjectCollection>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List collections (asynchronously)
     * Gets a list of all the subject collections, for example groups, users, etc.     **Required permissions:**    - **permission.collection.list**   
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCollectionsAsync(Boolean details, String accept, Boolean pretty, final ApiCallback<List<SubjectCollection>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCollectionsValidateBeforeCall(details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SubjectCollection>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listSubjects
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listSubjectsCall(String id, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/permission/collection/{id}/subject"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call listSubjectsValidateBeforeCall(String id, Boolean details, String accept, Boolean pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling listSubjects(Async)");
        }
        

        com.squareup.okhttp.Call call = listSubjectsCall(id, details, accept, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List subjects
     * List all subjects belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return List&lt;Subject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Subject> listSubjects(String id, Boolean details, String accept, Boolean pretty) throws ApiException {
        ApiResponse<List<Subject>> resp = listSubjectsWithHttpInfo(id, details, accept, pretty);
        return resp.getData();
    }

    /**
     * List subjects
     * List all subjects belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @return ApiResponse&lt;List&lt;Subject&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Subject>> listSubjectsWithHttpInfo(String id, Boolean details, String accept, Boolean pretty) throws ApiException {
        com.squareup.okhttp.Call call = listSubjectsValidateBeforeCall(id, details, accept, pretty, null, null);
        Type localVarReturnType = new TypeToken<List<Subject>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List subjects (asynchronously)
     * List all subjects belonging to a certain collection     **Required permissions:**    - **permission.collection.subject.list**   
     * @param id  (required)
     * @param details Add to include additional details, omit or false otherwise (optional)
     * @param accept Override the &#39;Accept&#39; request header (useful for debugging your requests) (optional)
     * @param pretty Add to make the Web-API pretty print the response (useful for debugging your requests) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSubjectsAsync(String id, Boolean details, String accept, Boolean pretty, final ApiCallback<List<Subject>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSubjectsValidateBeforeCall(id, details, accept, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Subject>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
