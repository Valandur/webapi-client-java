# HistoryApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChatHistory**](HistoryApi.md#getChatHistory) | **GET** /history/chat | Chat History
[**getCommandHistory**](HistoryApi.md#getCommandHistory) | **GET** /history/cmd | Command History


<a name="getChatHistory"></a>
# **getChatHistory**
> ChatHistoryResponse getChatHistory()

Chat History

View a history of the server chat.  &gt; Required permission: history.chat 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HistoryApi;

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

HistoryApi apiInstance = new HistoryApi();
try {
    ChatHistoryResponse result = apiInstance.getChatHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getChatHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChatHistoryResponse**](ChatHistoryResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommandHistory"></a>
# **getCommandHistory**
> CommandHistoryResponse getCommandHistory()

Command History

View a history of the server commands.  &gt; Required permission: history.cmd 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HistoryApi;

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

HistoryApi apiInstance = new HistoryApi();
try {
    CommandHistoryResponse result = apiInstance.getCommandHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getCommandHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommandHistoryResponse**](CommandHistoryResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

