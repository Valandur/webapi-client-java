# PluginApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlugin**](PluginApi.md#getPlugin) | **GET** /plugin/{id} | Detailed plugin info
[**getPlugins**](PluginApi.md#getPlugins) | **GET** /plugin | Plugin list


<a name="getPlugin"></a>
# **getPlugin**
> PluginResponse getPlugin(id)

Detailed plugin info

Gets detailed information about a plugin.  &gt; Required permission: plugin.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
String id = "id_example"; // String | The id of the plugin to get detailed information about.
try {
    PluginResponse result = apiInstance.getPlugin(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#getPlugin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the plugin to get detailed information about. |

### Return type

[**PluginResponse**](PluginResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPlugins"></a>
# **getPlugins**
> PluginsResponse getPlugins()

Plugin list

Get a list of all the plugins running on the server.  &gt; Required permission: plugin.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
try {
    PluginsResponse result = apiInstance.getPlugins();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#getPlugins");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PluginsResponse**](PluginsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

