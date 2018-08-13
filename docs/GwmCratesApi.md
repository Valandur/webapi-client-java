# GwmCratesApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCrates**](GwmCratesApi.md#listCrates) | **GET** /gwm-crates/manager | List managers


<a name="listCrates"></a>
# **listCrates**
> List&lt;CachedObject&gt; listCrates(details, accept, pretty)

List managers

Get a list of all the managers on the server.     **Required permissions:**    - **gwm-crates.manager.list**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GwmCratesApi;

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

GwmCratesApi apiInstance = new GwmCratesApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    List<CachedObject> result = apiInstance.listCrates(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GwmCratesApi#listCrates");
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

[**List&lt;CachedObject&gt;**](CachedObject.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

