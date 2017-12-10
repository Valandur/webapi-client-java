# MessageApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessage**](MessageApi.md#getMessage) | **GET** /message/{uuid} | Detailed message info
[**getMessages**](MessageApi.md#getMessages) | **GET** /message | Message list
[**sendMessage**](MessageApi.md#sendMessage) | **POST** /message | Send an interactive message


<a name="getMessage"></a>
# **getMessage**
> getMessage(uuid)

Detailed message info

Get detailed information about a message.  &gt; Required permission: message.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

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

MessageApi apiInstance = new MessageApi();
String uuid = "uuid_example"; // String | The uuid of the message to get detailed information about.
try {
    apiInstance.getMessage(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#getMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the message to get detailed information about. |

### Return type

null (empty response body)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getMessages"></a>
# **getMessages**
> MessagesResponse getMessages(details)

Message list

Get a list of all the messages that were sent through the message endpoint since the server started.  &gt; Required permission: message.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageApi;

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

MessageApi apiInstance = new MessageApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each message.
try {
    MessagesResponse result = apiInstance.getMessages(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each message. | [optional]

### Return type

[**MessagesResponse**](MessagesResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

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

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

