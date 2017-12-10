# EntityApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeEntity**](EntityApi.md#changeEntity) | **PUT** /entity/{uuid} | Edit entity
[**createEntity**](EntityApi.md#createEntity) | **POST** /entity | Create an entity
[**destroyEntity**](EntityApi.md#destroyEntity) | **DELETE** /entity/{uuid} | Destroy an entity
[**executeEntityMethod**](EntityApi.md#executeEntityMethod) | **POST** /entity/{uuid} | Execute entity method
[**getEntities**](EntityApi.md#getEntities) | **GET** /entity | Entities list
[**getEntity**](EntityApi.md#getEntity) | **GET** /entity/{uuid} | Detailed entity info


<a name="changeEntity"></a>
# **changeEntity**
> EntityResponse changeEntity(uuid, updateEntityRequest)

Edit entity

Update the properties of an existing entity.  &gt; Required permission: entity.change 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
String uuid = "uuid_example"; // String | The uuid of the entity.
UpdateEntityRequest updateEntityRequest = new UpdateEntityRequest(); // UpdateEntityRequest | The new properties of the entity
try {
    EntityResponse result = apiInstance.changeEntity(uuid, updateEntityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#changeEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the entity. |
 **updateEntityRequest** | [**UpdateEntityRequest**](UpdateEntityRequest.md)| The new properties of the entity |

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="createEntity"></a>
# **createEntity**
> EntityResponse createEntity(createEntityRequest)

Create an entity

Creates &amp; Spawns a new entity with the specified properties.  &gt; Required permission: entity.create 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
CreateEntityRequest createEntityRequest = new CreateEntityRequest(); // CreateEntityRequest | 
try {
    EntityResponse result = apiInstance.createEntity(createEntityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#createEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEntityRequest** | [**CreateEntityRequest**](CreateEntityRequest.md)|  |

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="destroyEntity"></a>
# **destroyEntity**
> EntityResponse destroyEntity(uuid)

Destroy an entity

Destroys an entity.  &gt; Required permission: entity.delete 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
String uuid = "uuid_example"; // String | The uuid of the entity.
try {
    EntityResponse result = apiInstance.destroyEntity(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#destroyEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the entity. |

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="executeEntityMethod"></a>
# **executeEntityMethod**
> EntityMethodResult executeEntityMethod(uuid, request)

Execute entity method

Provides direct access to the underlaying entity object and can execute any method on it.  &gt; Required permission: entity.method 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
String uuid = "uuid_example"; // String | The uuid of the entity.
RawRequest request = new RawRequest(); // RawRequest | Information about which method to execute.
try {
    EntityMethodResult result = apiInstance.executeEntityMethod(uuid, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#executeEntityMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the entity. |
 **request** | [**RawRequest**](RawRequest.md)| Information about which method to execute. |

### Return type

[**EntityMethodResult**](EntityMethodResult.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getEntities"></a>
# **getEntities**
> EntitiesList getEntities(details)

Entities list

Get a list of all entities on the server (in all worlds).  &gt; Required permission: entity.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each entity.
try {
    EntitiesList result = apiInstance.getEntities(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#getEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each entity. | [optional]

### Return type

[**EntitiesList**](EntitiesList.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getEntity"></a>
# **getEntity**
> EntityResponse getEntity(uuid, fields, methods)

Detailed entity info

Get detailed information about an entity.  &gt; Required permission: entity.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityApi;

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

EntityApi apiInstance = new EntityApi();
String uuid = "uuid_example"; // String | The uuid of the entity to get detailed information about.
String fields = "fields_example"; // String | An optional list of additional fields to get.
String methods = "methods_example"; // String | An optional list of additional methods to get.
try {
    EntityResponse result = apiInstance.getEntity(uuid, fields, methods);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityApi#getEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the entity to get detailed information about. |
 **fields** | **String**| An optional list of additional fields to get. | [optional]
 **methods** | **String**| An optional list of additional methods to get. | [optional]

### Return type

[**EntityResponse**](EntityResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

