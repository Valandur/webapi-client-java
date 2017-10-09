# ServletApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoadedServlets**](ServletApi.md#getLoadedServlets) | **GET** /servlet | Loaded servlets


<a name="getLoadedServlets"></a>
# **getLoadedServlets**
> ServletsResponse getLoadedServlets()

Loaded servlets

Get a map of all the servlets loaded on the server. The key is the path under which the servlet is available, and the value is the class name of the implementing class of the servlet.  &gt; Required permission: servlet.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServletApi;

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

ServletApi apiInstance = new ServletApi();
try {
    ServletsResponse result = apiInstance.getLoadedServlets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServletApi#getLoadedServlets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServletsResponse**](ServletsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

