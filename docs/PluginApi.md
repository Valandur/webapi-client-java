# PluginApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePluginConfig**](PluginApi.md#changePluginConfig) | **POST** /plugin/{plugin}/config | Change plugin configs
[**getPlugin**](PluginApi.md#getPlugin) | **GET** /plugin/{plugin} | Get a plugin
[**getPluginConfig**](PluginApi.md#getPluginConfig) | **GET** /plugin/{plugin}/config | Get plugin configs
[**listPlugins**](PluginApi.md#listPlugins) | **GET** /plugin | List plugins
[**togglePlugin**](PluginApi.md#togglePlugin) | **PUT** /plugin/{plugin} | Toggle a plugin


<a name="changePluginConfig"></a>
# **changePluginConfig**
> Map&lt;String, Object&gt; changePluginConfig(plugin, body, details, accept, pretty)

Change plugin configs

Allows changing the config files of plugin. Send a map from config filename to file contents. **This does not reload the plugin**, you can do that with &#x60;sponge plugins reload&#x60;, but not all plugins implement the reload event.     **Required permissions:**    - **plugin.config.modify**   - **plugin.config.modify.[plugin]**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
String plugin = "plugin_example"; // String | The id of the plugin
Object body = null; // Object | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    Map<String, Object> result = apiInstance.changePluginConfig(plugin, body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#changePluginConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **String**| The id of the plugin |
 **body** | **Object**|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPlugin"></a>
# **getPlugin**
> PluginContainer getPlugin(plugin, details, accept, pretty)

Get a plugin

Gets detailed information about a plugin.     **Required permissions:**    - **plugin.one**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
String plugin = "plugin_example"; // String | The id of the plugin
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    PluginContainer result = apiInstance.getPlugin(plugin, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#getPlugin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **String**| The id of the plugin |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**PluginContainer**](PluginContainer.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPluginConfig"></a>
# **getPluginConfig**
> Map&lt;String, Object&gt; getPluginConfig(plugin, details, accept, pretty)

Get plugin configs

Gets a map containing the plugin config file names as keys, and their config file contents as their values.     **Required permissions:**    - **plugin.config.get**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
String plugin = "plugin_example"; // String | The id of the plugin
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    Map<String, Object> result = apiInstance.getPluginConfig(plugin, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#getPluginConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **String**| The id of the plugin |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="listPlugins"></a>
# **listPlugins**
> List&lt;PluginContainer&gt; listPlugins(details, accept, pretty)

List plugins

Get a list of all the plugins running on the server.     **Required permissions:**    - **plugin.list**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    List<PluginContainer> result = apiInstance.listPlugins(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#listPlugins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**List&lt;PluginContainer&gt;**](PluginContainer.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="togglePlugin"></a>
# **togglePlugin**
> PluginContainer togglePlugin(plugin, details, accept, pretty)

Toggle a plugin

Allows enabling/disabling a plugin/mod. Requires a server restart.     **Required permissions:**    - **plugin.toggle**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PluginApi;

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

PluginApi apiInstance = new PluginApi();
String plugin = "plugin_example"; // String | The id of the plugin
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    PluginContainer result = apiInstance.togglePlugin(plugin, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginApi#togglePlugin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plugin** | **String**| The id of the plugin |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**PluginContainer**](PluginContainer.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

