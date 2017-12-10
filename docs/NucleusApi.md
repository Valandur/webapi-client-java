# NucleusApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJail**](NucleusApi.md#getJail) | **GET** /nucleus/jail/{name} | Detailed jail info
[**getJails**](NucleusApi.md#getJails) | **GET** /nucleus/jail | Jail list
[**getKit**](NucleusApi.md#getKit) | **GET** /nucleus/kit/{name} | Detailed kit info
[**getKits**](NucleusApi.md#getKits) | **GET** /nucleus/kit | Kit list


<a name="getJail"></a>
# **getJail**
> NucleusJailResponse getJail(name)

Detailed jail info

Get detailed information about a jail.  &gt; Required permission: nucleus.jail.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NucleusApi;

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

NucleusApi apiInstance = new NucleusApi();
String name = "name_example"; // String | The name of the jail to get detailed information about.
try {
    NucleusJailResponse result = apiInstance.getJail(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleusApi#getJail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the jail to get detailed information about. |

### Return type

[**NucleusJailResponse**](NucleusJailResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getJails"></a>
# **getJails**
> NucleusJailsResponse getJails(details)

Jail list

Get a list of all the jails on the server.  &gt; Required permission: nucleus.jail.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NucleusApi;

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

NucleusApi apiInstance = new NucleusApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each jail.
try {
    NucleusJailsResponse result = apiInstance.getJails(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleusApi#getJails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each jail. | [optional]

### Return type

[**NucleusJailsResponse**](NucleusJailsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getKit"></a>
# **getKit**
> NucleusKitResponse getKit(name)

Detailed kit info

Get detailed information about a kit.  &gt; Required permission: nucleus.kit.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NucleusApi;

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

NucleusApi apiInstance = new NucleusApi();
String name = "name_example"; // String | The name of the kit to get detailed information about.
try {
    NucleusKitResponse result = apiInstance.getKit(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleusApi#getKit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the kit to get detailed information about. |

### Return type

[**NucleusKitResponse**](NucleusKitResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getKits"></a>
# **getKits**
> NucleusKitsResponse getKits(details)

Kit list

Get a list of all the kits on the server.  &gt; Required permission: nucleus.kit.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NucleusApi;

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

NucleusApi apiInstance = new NucleusApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each kit.
try {
    NucleusKitsResponse result = apiInstance.getKits(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NucleusApi#getKits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each kit. | [optional]

### Return type

[**NucleusKitsResponse**](NucleusKitsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

