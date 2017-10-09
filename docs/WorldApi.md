# WorldApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeWorld**](WorldApi.md#changeWorld) | **PUT** /world/{uuid} | Edit world
[**createWorld**](WorldApi.md#createWorld) | **POST** /world | Create a world
[**deleteWorld**](WorldApi.md#deleteWorld) | **DELETE** /world/{uuid} | Delete a world
[**executeWorldMethod**](WorldApi.md#executeWorldMethod) | **POST** /world/{uuid} | Execute world methods
[**getChunk**](WorldApi.md#getChunk) | **GET** /world/{uuid}/chunk/{x}/{z} | Detailed chunk info
[**getChunks**](WorldApi.md#getChunks) | **GET** /world/{uuid}/chunk | Loaded chunk list
[**getWorld**](WorldApi.md#getWorld) | **GET** /world/{uuid} | Detailed world info
[**getWorlds**](WorldApi.md#getWorlds) | **GET** /world | World list


<a name="changeWorld"></a>
# **changeWorld**
> WorldResponse changeWorld(uuid, updateWorldRequest)

Edit world

Update the properties of an existing world.  &gt; Required permission: world.change 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world.
UpdateWorldRequest updateWorldRequest = new UpdateWorldRequest(); // UpdateWorldRequest | The new properties of the world
try {
    WorldResponse result = apiInstance.changeWorld(uuid, updateWorldRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#changeWorld");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |
 **updateWorldRequest** | [**UpdateWorldRequest**](UpdateWorldRequest.md)| The new properties of the world |

### Return type

[**WorldResponse**](WorldResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorld"></a>
# **createWorld**
> WorldResponse createWorld(createWorldRequest)

Create a world

Creates a new world with the specified settings. This does not yet load the world.  &gt; Required permission: world.create 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
CreateWorldRequest createWorldRequest = new CreateWorldRequest(); // CreateWorldRequest | 
try {
    WorldResponse result = apiInstance.createWorld(createWorldRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#createWorld");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldRequest** | [**CreateWorldRequest**](CreateWorldRequest.md)|  |

### Return type

[**WorldResponse**](WorldResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorld"></a>
# **deleteWorld**
> WorldResponse deleteWorld(uuid)

Delete a world

Deletes an existing world. **The world must be unloaded before deleting it**  &gt; Required permission: world.delete 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world.
try {
    WorldResponse result = apiInstance.deleteWorld(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#deleteWorld");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |

### Return type

[**WorldResponse**](WorldResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeWorldMethod"></a>
# **executeWorldMethod**
> ExecuteWorldMethodResponse executeWorldMethod(uuid, request)

Execute world methods

Provides direct access to the underlaying world object and can execute any method on it.  &gt; Required permission: world.method 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world.
RawRequest request = new RawRequest(); // RawRequest | Information about which method to execute.
try {
    ExecuteWorldMethodResponse result = apiInstance.executeWorldMethod(uuid, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#executeWorldMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |
 **request** | [**RawRequest**](RawRequest.md)| Information about which method to execute. |

### Return type

[**ExecuteWorldMethodResponse**](ExecuteWorldMethodResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world.
String x = "x_example"; // String | The x-coordinate of the chunk.
String z = "z_example"; // String | The z-coordinate of the chunk.
try {
    ChunkResponse result = apiInstance.getChunk(uuid, x, z);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#getChunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world. |
 **x** | **String**| The x-coordinate of the chunk. |
 **z** | **String**| The z-coordinate of the chunk. |

### Return type

[**ChunkResponse**](ChunkResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world.
try {
    ChunksResponse result = apiInstance.getChunks(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#getChunks");
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

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorld"></a>
# **getWorld**
> WorldResponse getWorld(uuid, fields, methods)

Detailed world info

Get detailed information about a world.  &gt; Required permission: world.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String uuid = "uuid_example"; // String | The uuid of the world to get detailed information about.
String fields = "fields_example"; // String | An optional list of additional fields to get.
String methods = "methods_example"; // String | An optional list of additional methods to get.
try {
    WorldResponse result = apiInstance.getWorld(uuid, fields, methods);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#getWorld");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the world to get detailed information about. |
 **fields** | **String**| An optional list of additional fields to get. | [optional]
 **methods** | **String**| An optional list of additional methods to get. | [optional]

### Return type

[**WorldResponse**](WorldResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorlds"></a>
# **getWorlds**
> WorldsResponse getWorlds(details)

World list

Get a list of all the worlds on the server.  &gt; Required permission: world.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorldApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

WorldApi apiInstance = new WorldApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each world.
try {
    WorldsResponse result = apiInstance.getWorlds(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorldApi#getWorlds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each world. | [optional]

### Return type

[**WorldsResponse**](WorldsResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

