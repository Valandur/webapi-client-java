# RegistryApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalogValues**](RegistryApi.md#getCatalogValues) | **GET** /registry/{className} | List catalog values


<a name="getCatalogValues"></a>
# **getCatalogValues**
> CatalogTypesResponse getCatalogValues(className)

List catalog values

Lists all the catalog values of a specified CatalogType.  &gt; Required permission: registry.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistryApi;

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

RegistryApi apiInstance = new RegistryApi();
String className = "className_example"; // String | The fully qualified class name of the CatalogType to get.
try {
    CatalogTypesResponse result = apiInstance.getCatalogValues(className);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryApi#getCatalogValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**| The fully qualified class name of the CatalogType to get. |

### Return type

[**CatalogTypesResponse**](CatalogTypesResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

