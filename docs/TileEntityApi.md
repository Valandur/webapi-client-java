# TileEntityApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeMethod**](TileEntityApi.md#executeMethod) | **POST** /tile-entity/{world}/{x}/{y}/{z}/method | Execute a method
[**getTileEntity**](TileEntityApi.md#getTileEntity) | **GET** /tile-entity/{world}/{x}/{y}/{z} | Get tile entity
[**listTileEntities**](TileEntityApi.md#listTileEntities) | **GET** /tile-entity | List tile entities


<a name="executeMethod"></a>
# **executeMethod**
> ExecuteMethodResponse executeMethod(world, x, y, z, body, details, accept, pretty)

Execute a method

Provides direct access to the underlaying tile entity object and can execute any method on it.     **Required permissions:**    - **tile-entity.method**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyHeader
ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
ApiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: ApiKeyQuery
ApiKeyAuth ApiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyQuery");
ApiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyQuery.setApiKeyPrefix("Token");

TileEntityApi apiInstance = new TileEntityApi();
String world = "world_example"; // String | The world the tile entity is in
Integer x = 56; // Integer | The x-coordinate of the tile-entity
Integer y = 56; // Integer | The x-coordinate of the tile-entity
Integer z = 56; // Integer | The x-coordinate of the tile-entity
ExecuteMethodRequest body = new ExecuteMethodRequest(); // ExecuteMethodRequest | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    ExecuteMethodResponse result = apiInstance.executeMethod(world, x, y, z, body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#executeMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The world the tile entity is in |
 **x** | **Integer**| The x-coordinate of the tile-entity |
 **y** | **Integer**| The x-coordinate of the tile-entity |
 **z** | **Integer**| The x-coordinate of the tile-entity |
 **body** | [**ExecuteMethodRequest**](ExecuteMethodRequest.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**ExecuteMethodResponse**](ExecuteMethodResponse.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getTileEntity"></a>
# **getTileEntity**
> TileEntity getTileEntity(world, x, y, z, details, accept, pretty)

Get tile entity

Get detailed information about a tile entity.     **Required permissions:**    - **tile-entity.one**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyHeader
ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
ApiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: ApiKeyQuery
ApiKeyAuth ApiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyQuery");
ApiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyQuery.setApiKeyPrefix("Token");

TileEntityApi apiInstance = new TileEntityApi();
String world = "world_example"; // String | The world the tile entity is in
Integer x = 56; // Integer | The x-coordinate of the tile-entity
Integer y = 56; // Integer | The y-coordinate of the tile-entity
Integer z = 56; // Integer | The z-coordinate of the tile-entity
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    TileEntity result = apiInstance.getTileEntity(world, x, y, z, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#getTileEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The world the tile entity is in |
 **x** | **Integer**| The x-coordinate of the tile-entity |
 **y** | **Integer**| The y-coordinate of the tile-entity |
 **z** | **Integer**| The z-coordinate of the tile-entity |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**TileEntity**](TileEntity.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="listTileEntities"></a>
# **listTileEntities**
> List&lt;TileEntity&gt; listTileEntities(world, type, min, max, limit, details, accept, pretty)

List tile entities

Get a list of all tile entities on the server (in all worlds, unless specified).     **Required permissions:**    - **tile-entity.list**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TileEntityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyHeader
ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
ApiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: ApiKeyQuery
ApiKeyAuth ApiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyQuery");
ApiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyQuery.setApiKeyPrefix("Token");

TileEntityApi apiInstance = new TileEntityApi();
String world = "world_example"; // String | The world to filter tile entities by
String type = "type_example"; // String | The type if of tile entities to filter by
String min = "min_example"; // String | The minimum coordinates at which the tile entity must be, min=x|y|z
String max = "max_example"; // String | The maximum coordinates at which the tile entity must be, max=x|y|z
Integer limit = 56; // Integer | The maximum amount of tile entities returned
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    List<TileEntity> result = apiInstance.listTileEntities(world, type, min, max, limit, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TileEntityApi#listTileEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The world to filter tile entities by | [optional]
 **type** | **String**| The type if of tile entities to filter by | [optional]
 **min** | **String**| The minimum coordinates at which the tile entity must be, min&#x3D;x|y|z | [optional]
 **max** | **String**| The maximum coordinates at which the tile entity must be, max&#x3D;x|y|z | [optional]
 **limit** | **Integer**| The maximum amount of tile entities returned | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**List&lt;TileEntity&gt;**](TileEntity.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

