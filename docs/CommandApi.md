# CommandApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeCommand**](CommandApi.md#executeCommand) | **POST** /cmd | Execute command
[**getCommand**](CommandApi.md#getCommand) | **GET** /cmd/{name} | Detailed command info
[**getCommands**](CommandApi.md#getCommands) | **GET** /cmd | Command list


<a name="executeCommand"></a>
# **executeCommand**
> ExecuteCommandResponse executeCommand(request)

Execute command

Execute a command on the server. (Almost the same as running it from the console). Pass a list of commands to execute them in succession, if only passing one command the array is not required.  &gt; Required permission: cmd.run &gt; Required permission: cmd.run.[command] 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommandApi;

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

CommandApi apiInstance = new CommandApi();
List<CommandRequest> request = Arrays.asList(new CommandRequest()); // List<CommandRequest> | The command and arguments sent to the server
try {
    ExecuteCommandResponse result = apiInstance.executeCommand(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#executeCommand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**List&lt;CommandRequest&gt;**](CommandRequest.md)| The command and arguments sent to the server |

### Return type

[**ExecuteCommandResponse**](ExecuteCommandResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommand"></a>
# **getCommand**
> CommandResponse1 getCommand(name)

Detailed command info

Get detailed information about a command.  &gt; Required permission: cmd.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommandApi;

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

CommandApi apiInstance = new CommandApi();
String name = "name_example"; // String | The name (main alias) of the command
try {
    CommandResponse1 result = apiInstance.getCommand(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#getCommand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name (main alias) of the command |

### Return type

[**CommandResponse1**](CommandResponse1.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommands"></a>
# **getCommands**
> CommandsResponse getCommands()

Command list

Gets a list of all the commands available on the server.  &gt; Required permission: cmd.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommandApi;

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

CommandApi apiInstance = new CommandApi();
try {
    CommandsResponse result = apiInstance.getCommands();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandApi#getCommands");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CommandsResponse**](CommandsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

