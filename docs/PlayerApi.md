# PlayerApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayer**](PlayerApi.md#changePlayer) | **PUT** /player/{uuid} | Edit player
[**executePlayerMethod**](PlayerApi.md#executePlayerMethod) | **POST** /player/{uuid} | Execute player method
[**getPlayer**](PlayerApi.md#getPlayer) | **GET** /player/{uuid} | Detailed player info
[**getPlayers**](PlayerApi.md#getPlayers) | **GET** /player | Player list


<a name="changePlayer"></a>
# **changePlayer**
> PlayerResponse changePlayer(uuid, updatePlayerRequest)

Edit player

Update the properties of an existing player.  &gt; Required permission: player.change 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

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

PlayerApi apiInstance = new PlayerApi();
String uuid = "uuid_example"; // String | The uuid of the player.
UpdatePlayerRequest updatePlayerRequest = new UpdatePlayerRequest(); // UpdatePlayerRequest | The new properties of the player
try {
    PlayerResponse result = apiInstance.changePlayer(uuid, updatePlayerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#changePlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the player. |
 **updatePlayerRequest** | [**UpdatePlayerRequest**](UpdatePlayerRequest.md)| The new properties of the player |

### Return type

[**PlayerResponse**](PlayerResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executePlayerMethod"></a>
# **executePlayerMethod**
> ExecutePlayerMethodResponse executePlayerMethod(uuid, request)

Execute player method

Provides direct access to the underlaying player object and can execute any method on it.  &gt; Required permission: player.method 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

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

PlayerApi apiInstance = new PlayerApi();
String uuid = "uuid_example"; // String | The uuid of the player.
RawRequest request = new RawRequest(); // RawRequest | Information about which method to execute.
try {
    ExecutePlayerMethodResponse result = apiInstance.executePlayerMethod(uuid, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#executePlayerMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the player. |
 **request** | [**RawRequest**](RawRequest.md)| Information about which method to execute. |

### Return type

[**ExecutePlayerMethodResponse**](ExecutePlayerMethodResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayer"></a>
# **getPlayer**
> PlayerResponse getPlayer(uuid, fields, methods)

Detailed player info

Get detailed information about a player.  &gt; Required permission: player.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

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

PlayerApi apiInstance = new PlayerApi();
String uuid = "uuid_example"; // String | The uuid of the player to get detailed information about.
String fields = "fields_example"; // String | An optional list of additional fields to get.
String methods = "methods_example"; // String | An optional list of additional methods to get.
try {
    PlayerResponse result = apiInstance.getPlayer(uuid, fields, methods);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the player to get detailed information about. |
 **fields** | **String**| An optional list of additional fields to get. | [optional]
 **methods** | **String**| An optional list of additional methods to get. | [optional]

### Return type

[**PlayerResponse**](PlayerResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayers"></a>
# **getPlayers**
> PlayersList getPlayers()

Player list

Get a list of all the players on the server.  &gt; Required permission: player.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

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

PlayerApi apiInstance = new PlayerApi();
try {
    PlayersList result = apiInstance.getPlayers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlayersList**](PlayersList.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

