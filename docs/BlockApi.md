# BlockApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBlockOperation**](BlockApi.md#cancelBlockOperation) | **DELETE** /block/op/{uuid} | Cancel block operation
[**changeBlockOperation**](BlockApi.md#changeBlockOperation) | **PUT** /block/op/{uuid} | Modify block operation
[**getBlock**](BlockApi.md#getBlock) | **GET** /block/{world}/{x}/{y}/{z} | Get one block
[**getBlockOperation**](BlockApi.md#getBlockOperation) | **GET** /block/op/{uuid} | Block operation details
[**getBlockOperations**](BlockApi.md#getBlockOperations) | **GET** /block/op | List block operations
[**startBlockOperation**](BlockApi.md#startBlockOperation) | **POST** /block/op | Create block operation


<a name="cancelBlockOperation"></a>
# **cancelBlockOperation**
> BlockOperationResponse cancelBlockOperation(uuid)

Cancel block operation

Cancel a pending or running block operation. **THIS DOES NOT UNDO THE BLOCK CHANGES**  &gt; Required permission: block.op.delete 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
String uuid = "uuid_example"; // String | The uuid of the block operation.
try {
    BlockOperationResponse result = apiInstance.cancelBlockOperation(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#cancelBlockOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the block operation. |

### Return type

[**BlockOperationResponse**](BlockOperationResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeBlockOperation"></a>
# **changeBlockOperation**
> BlockOperationResponse changeBlockOperation(uuid, data)

Modify block operation

Modify an existing block operation to either pause or continue it.  &gt; Required permission: block.op.change 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
String uuid = "uuid_example"; // String | The uuid of the block operation.
Data data = new Data(); // Data | The new data applied to the block operation.
try {
    BlockOperationResponse result = apiInstance.changeBlockOperation(uuid, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#changeBlockOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the block operation. |
 **data** | [**Data**](Data.md)| The new data applied to the block operation. |

### Return type

[**BlockOperationResponse**](BlockOperationResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlock"></a>
# **getBlock**
> SingleBlock getBlock(world, x, y, z)

Get one block

Gets information about one block in the world.  &gt; Required permission: block.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
String world = "world_example"; // String | The uuid of the world the block is in.
String x = "x_example"; // String | The x-coordinate of the block.
String y = "y_example"; // String | The y-coordinate of the block.
String z = "z_example"; // String | The z-coordinate of the block.
try {
    SingleBlock result = apiInstance.getBlock(world, x, y, z);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **world** | **String**| The uuid of the world the block is in. |
 **x** | **String**| The x-coordinate of the block. |
 **y** | **String**| The y-coordinate of the block. |
 **z** | **String**| The z-coordinate of the block. |

### Return type

[**SingleBlock**](SingleBlock.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlockOperation"></a>
# **getBlockOperation**
> BlockOperationResponse getBlockOperation(uuid)

Block operation details

Gets details about a specific block operation  &gt; Required permission: block.op.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
String uuid = "uuid_example"; // String | The uuid of the block operation.
try {
    BlockOperationResponse result = apiInstance.getBlockOperation(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getBlockOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the block operation. |

### Return type

[**BlockOperationResponse**](BlockOperationResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlockOperations"></a>
# **getBlockOperations**
> BlockOperationsList getBlockOperations()

List block operations

Returns a list of all the currently running block operations.  &gt; Required permission: block.op.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
try {
    BlockOperationsList result = apiInstance.getBlockOperations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getBlockOperations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockOperationsList**](BlockOperationsList.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startBlockOperation"></a>
# **startBlockOperation**
> BlockOperationResponse startBlockOperation(request)

Create block operation

Start a request to get or change blocks on the server.  &gt; Required permission: block.op.create 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BlockApi;

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

BlockApi apiInstance = new BlockApi();
List<BlockOperationNew> request = Arrays.asList(new BlockOperationNew()); // List<BlockOperationNew> | The requested changes to blocks
try {
    BlockOperationResponse result = apiInstance.startBlockOperation(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#startBlockOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**List&lt;BlockOperationNew&gt;**](BlockOperationNew.md)| The requested changes to blocks |

### Return type

[**BlockOperationResponse**](BlockOperationResponse.md)

### Authorization

[queryKey](../README.md#queryKey), [headerKey](../README.md#headerKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

