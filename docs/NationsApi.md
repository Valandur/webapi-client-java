# NationsApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNation**](NationsApi.md#getNation) | **GET** /nations/nation/{id} | Detailed nation info
[**getNations**](NationsApi.md#getNations) | **GET** /nations/nation | Nations list


<a name="getNation"></a>
# **getNation**
> NationsNationResponse getNation(id)

Detailed nation info

Get detailed information about a nation.  &gt; Required permission: nations.nation.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NationsApi;

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

NationsApi apiInstance = new NationsApi();
String id = "id_example"; // String | The id of the nation to get detailed information about.
try {
    NationsNationResponse result = apiInstance.getNation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationsApi#getNation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the nation to get detailed information about. |

### Return type

[**NationsNationResponse**](NationsNationResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getNations"></a>
# **getNations**
> NationsNationsResponse getNations(details)

Nations list

Get a list of all the nations on the server.  &gt; Required permission: nations.nation.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NationsApi;

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

NationsApi apiInstance = new NationsApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each nation.
try {
    NationsNationsResponse result = apiInstance.getNations(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NationsApi#getNations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each nation. | [optional]

### Return type

[**NationsNationsResponse**](NationsNationsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

