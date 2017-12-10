# ChunkApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChunk**](ChunkApi.md#getChunk) | **GET** /world/{uuid}/chunk/{x}/{z} | Detailed chunk info
[**getChunks**](ChunkApi.md#getChunks) | **GET** /world/{uuid}/chunk | Loaded chunk list


<a name="getChunk"></a>
# **getChunk**
> ChunkResponse getChunk(uuid, x, z)

Detailed chunk info

Get detailed information about a chunk  &gt; Required permission: world.chunk.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChunkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

ChunkApi apiInstance = new ChunkApi();
String uuid = "uuid_example"; // String | The uuid of the world.
Integer x = 56; // Integer | The x-coordinate of the chunk.
Integer z = 56; // Integer | The z-coordinate of the chunk.
try {
    ChunkResponse result = apiInstance.getChunk(uuid, x, z);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChunkApi#getChunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |
 **x** | **Integer**| The x-coordinate of the chunk. |
 **z** | **Integer**| The z-coordinate of the chunk. |

### Return type

[**ChunkResponse**](ChunkResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getChunks"></a>
# **getChunks**
> ChunksResponse getChunks(uuid)

Loaded chunk list

Gets a list of all the loaded chunks for the specified world.  &gt; Required permission: world.chunk.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChunkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

ChunkApi apiInstance = new ChunkApi();
String uuid = "uuid_example"; // String | The uuid of the world.
try {
    ChunksResponse result = apiInstance.getChunks(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChunkApi#getChunks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |

### Return type

[**ChunksResponse**](ChunksResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

