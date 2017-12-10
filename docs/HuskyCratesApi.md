# HuskyCratesApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrate**](HuskyCratesApi.md#getCrate) | **GET** /husky/crate/{id} | Detailed crate info
[**getCrates**](HuskyCratesApi.md#getCrates) | **GET** /husky/crate | Crate list


<a name="getCrate"></a>
# **getCrate**
> HuskyCrateResponse getCrate(id)

Detailed crate info

Get detailed information about a crate.  &gt; Required permission: husky.crate.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HuskyCratesApi;

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

HuskyCratesApi apiInstance = new HuskyCratesApi();
String id = "id_example"; // String | The id of the crate to get detailed information about.
try {
    HuskyCrateResponse result = apiInstance.getCrate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HuskyCratesApi#getCrate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the crate to get detailed information about. |

### Return type

[**HuskyCrateResponse**](HuskyCrateResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getCrates"></a>
# **getCrates**
> HuskyCratesResponse getCrates(details)

Crate list

Get a list of all the crates on the server.  &gt; Required permission: husky.crate.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HuskyCratesApi;

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

HuskyCratesApi apiInstance = new HuskyCratesApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each crate.
try {
    HuskyCratesResponse result = apiInstance.getCrates(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HuskyCratesApi#getCrates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each crate. | [optional]

### Return type

[**HuskyCratesResponse**](HuskyCratesResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

