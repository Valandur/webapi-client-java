# TileEntityApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeTileEntityMethod**](TileEntityApi.md#executeTileEntityMethod) | **POST** /tile-entity/{worldUuid}/{x}/{y}/{z} | Execute tile entity methods
[**getTileEntities**](TileEntityApi.md#getTileEntities) | **GET** /tile-entity | Tile entities list
[**getTileEntity**](TileEntityApi.md#getTileEntity) | **GET** /tile-entity/{worldUuid}/{x}/{y}/{z} | Detailed tile entity info


<a name="executeTileEntityMethod"></a>
# **executeTileEntityMethod**
> ExecuteTileEntityMethodResponse executeTileEntityMethod(worldUuid, x, y, z, request)

Execute tile entity methods

Provides direct access to the underlaying tile entity object and can execute any method on it.  &gt; Required permission: tile-entity.method 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

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

TileEntityApi apiInstance = new TileEntityApi();
String worldUuid = "worldUuid_example"; // String | The uuid of the world the tile entity is in.
String x = "x_example"; // String | The x-coordinate of the tile entity.
String y = "y_example"; // String | The y-coordinate of the tile entity.
String z = "z_example"; // String | The z-coordinate of the tile entity.
RawRequest request = new RawRequest(); // RawRequest | Information about which method to execute.
try {
    ExecuteTileEntityMethodResponse result = apiInstance.executeTileEntityMethod(worldUuid, x, y, z, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#executeTileEntityMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldUuid** | **String**| The uuid of the world the tile entity is in. |
 **x** | **String**| The x-coordinate of the tile entity. |
 **y** | **String**| The y-coordinate of the tile entity. |
 **z** | **String**| The z-coordinate of the tile entity. |
 **request** | [**RawRequest**](RawRequest.md)| Information about which method to execute. |

### Return type

[**ExecuteTileEntityMethodResponse**](ExecuteTileEntityMethodResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTileEntities"></a>
# **getTileEntities**
> TileEntitiesResponse getTileEntities(world, type, limit)

Tile entities list

Get a list of all tile entities on the server (in all worlds, unless specified).  &gt; Required permission: tile-entity.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

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

TileEntityApi apiInstance = new TileEntityApi();
String world = "world_example"; // String | The uuid of the world to filter entities by.
String type = "type_example"; // String | The TileEntityType id to filter the tile entities by.
String limit = "limit_example"; // String | The maximum amount of tile entities to return.
try {
    TileEntitiesResponse result = apiInstance.getTileEntities(world, type, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#getTileEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The uuid of the world to filter entities by. | [optional]
 **type** | **String**| The TileEntityType id to filter the tile entities by. | [optional]
 **limit** | **String**| The maximum amount of tile entities to return. | [optional]

### Return type

[**TileEntitiesResponse**](TileEntitiesResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTileEntity"></a>
# **getTileEntity**
> TileEntityResponse getTileEntity(worldUuid, x, y, z, fields, methods)

Detailed tile entity info

Get detailed information about a tile entity.  &gt; Required permission: tile-entity.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

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

TileEntityApi apiInstance = new TileEntityApi();
String worldUuid = "worldUuid_example"; // String | The uuid of the world the tile entity is in.
String x = "x_example"; // String | The x-coordinate of the tile entity.
String y = "y_example"; // String | The y-coordinate of the tile entity.
String z = "z_example"; // String | The z-coordinate of the tile entity.
String fields = "fields_example"; // String | An optional list of additional fields to get.
String methods = "methods_example"; // String | An optional list of additional methods to get.
try {
    TileEntityResponse result = apiInstance.getTileEntity(worldUuid, x, y, z, fields, methods);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#getTileEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldUuid** | **String**| The uuid of the world the tile entity is in. |
 **x** | **String**| The x-coordinate of the tile entity. |
 **y** | **String**| The y-coordinate of the tile entity. |
 **z** | **String**| The z-coordinate of the tile entity. |
 **fields** | **String**| An optional list of additional fields to get. | [optional]
 **methods** | **String**| An optional list of additional methods to get. | [optional]

### Return type

[**TileEntityResponse**](TileEntityResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

