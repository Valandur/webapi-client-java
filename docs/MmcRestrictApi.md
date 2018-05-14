# MmcRestrictApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItem**](MmcRestrictApi.md#addItem) | **POST** /mmc-restrict/item | Add an item
[**deleteItem**](MmcRestrictApi.md#deleteItem) | **DELETE** /mmc-restrict/item/{id} | Delete an item
[**listItems**](MmcRestrictApi.md#listItems) | **GET** /mmc-restrict/item | List items
[**modifyItem**](MmcRestrictApi.md#modifyItem) | **PUT** /mmc-restrict/item/{id} | Modify an item


<a name="addItem"></a>
# **addItem**
> MMCRestrictItem addItem(body, details, accept, pretty)

Add an item

Adds a new item to the restricted item list.     **Required permissions:**    - **mmc-restrict.item.create**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmcRestrictApi;

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

MmcRestrictApi apiInstance = new MmcRestrictApi();
MMCRestrictItem body = new MMCRestrictItem(); // MMCRestrictItem | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    MMCRestrictItem result = apiInstance.addItem(body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmcRestrictApi#addItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MMCRestrictItem**](MMCRestrictItem.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**MMCRestrictItem**](MMCRestrictItem.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteItem"></a>
# **deleteItem**
> MMCRestrictItem deleteItem(id, details, accept, pretty)

Delete an item

Delete an existing restricted item.     **Required permissions:**    - **mmc-restrict.item.delete**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmcRestrictApi;

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

MmcRestrictApi apiInstance = new MmcRestrictApi();
String id = "id_example"; // String | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    MMCRestrictItem result = apiInstance.deleteItem(id, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmcRestrictApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**MMCRestrictItem**](MMCRestrictItem.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="listItems"></a>
# **listItems**
> List&lt;MMCRestrictItem&gt; listItems(details, accept, pretty)

List items

Gets the list of restricted items on the server.     **Required permissions:**    - **mmc-restrict.item.list**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmcRestrictApi;

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

MmcRestrictApi apiInstance = new MmcRestrictApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    List<MMCRestrictItem> result = apiInstance.listItems(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmcRestrictApi#listItems");
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

[**List&lt;MMCRestrictItem&gt;**](MMCRestrictItem.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="modifyItem"></a>
# **modifyItem**
> MMCRestrictItem modifyItem(id, body, details, accept, pretty)

Modify an item

Modify an existing restricted item.     **Required permissions:**    - **mmc-restrict.item.modify**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MmcRestrictApi;

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

MmcRestrictApi apiInstance = new MmcRestrictApi();
String id = "id_example"; // String | 
MMCRestrictItem body = new MMCRestrictItem(); // MMCRestrictItem | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    MMCRestrictItem result = apiInstance.modifyItem(id, body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MmcRestrictApi#modifyItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MMCRestrictItem**](MMCRestrictItem.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**MMCRestrictItem**](MMCRestrictItem.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

