# UserApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserDetails**](UserApi.md#getUserDetails) | **GET** /user | Check info
[**login**](UserApi.md#login) | **POST** /user | Login
[**logout**](UserApi.md#logout) | **POST** /user/logout | Logout


<a name="getUserDetails"></a>
# **getUserDetails**
> PermissionStruct getUserDetails(details, accept, pretty)

Check info

Checks to see if the passed api key is still valid and retrieves the user info and permissions associated with this key     **Required permissions:**    - **user.user**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

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

UserApi apiInstance = new UserApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    PermissionStruct result = apiInstance.getUserDetails(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserDetails");
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

[**PermissionStruct**](PermissionStruct.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="login"></a>
# **login**
> PermissionStruct login(body, details, accept, pretty)

Login

Tries to acquire an api key with the passed credentials.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
AuthenticationRequest body = new AuthenticationRequest(); // AuthenticationRequest | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    PermissionStruct result = apiInstance.login(body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**PermissionStruct**](PermissionStruct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="logout"></a>
# **logout**
> PermissionStruct logout(details, accept, pretty)

Logout

Invalidate the current API key, logging out the active user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    PermissionStruct result = apiInstance.logout(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#logout");
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

[**PermissionStruct**](PermissionStruct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

