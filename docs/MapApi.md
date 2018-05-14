# MapApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMap**](MapApi.md#getMap) | **GET** /map/{world}/{x}/{z} | Get a map tile


<a name="getMap"></a>
# **getMap**
> getMap(world, x, z, details, accept, pretty)

Get a map tile

Returns an image representing the biomes of the blocks within the specified tile     **Required permissions:**    - **map.map**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MapApi;

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

MapApi apiInstance = new MapApi();
String world = "world_example"; // String | The world to get the map tile from
Integer x = 56; // Integer | The x-coordinate of the tile (is multiplied by the TILE_SIZE)
Integer z = 56; // Integer | The z-coordinate of the tile (is multiplied by the TILE_SIZE)
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    apiInstance.getMap(world, x, z, details, accept, pretty);
} catch (ApiException e) {
    System.err.println("Exception when calling MapApi#getMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The world to get the map tile from |
 **x** | **Integer**| The x-coordinate of the tile (is multiplied by the TILE_SIZE) |
 **z** | **Integer**| The z-coordinate of the tile (is multiplied by the TILE_SIZE) |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: image/png

