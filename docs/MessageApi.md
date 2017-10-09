# MessageApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessage**](MessageApi.md#sendMessage) | **POST** /message | Send an interactive message


<a name="sendMessage"></a>
# **sendMessage**
> MessageResponse sendMessage(request)

Send an interactive message

Send an interactive message to a player. Make sure to have an event hook for \&quot;custom_message\&quot; to receive the response.  &gt; Required permission: message.create 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: queryKey
ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
queryKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//queryKey.setApiKeyPrefix("Token");

// Configure API key authorization: headerKey
ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
headerKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//headerKey.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
MessageRequest request = new MessageRequest(); // MessageRequest | Details of the message sent to the player
try {
    MessageResponse result = apiInstance.sendMessage(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MessageRequest**](MessageRequest.md)| Details of the message sent to the player |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

