# WebBooksApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBook**](WebBooksApi.md#createBook) | **POST** /webbooks/book | Create web book
[**deleteBook**](WebBooksApi.md#deleteBook) | **DELETE** /webbooks/book/{id} | Delete a web book
[**getBook**](WebBooksApi.md#getBook) | **GET** /webbooks/book/{id} | Detailed web book info
[**getBookHtml**](WebBooksApi.md#getBookHtml) | **GET** /webbooks/book/{id}/html | Web Book HTML
[**getBookHtmlPost**](WebBooksApi.md#getBookHtmlPost) | **POST** /webbooks/book/{id}/html | Web Book HTML
[**getBooks**](WebBooksApi.md#getBooks) | **GET** /webbooks/book | Books list


<a name="createBook"></a>
# **createBook**
> WebBooksResponse1 createBook(createWebBookRequest)

Create web book

Create a new web book from the specified data.  &gt; Required permission: webbooks.book.create 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
CreateWebBookRequest createWebBookRequest = new CreateWebBookRequest(); // CreateWebBookRequest | 
try {
    WebBooksResponse1 result = apiInstance.createBook(createWebBookRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#createBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebBookRequest** | [**CreateWebBookRequest**](CreateWebBookRequest.md)|  |

### Return type

[**WebBooksResponse1**](WebBooksResponse1.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteBook"></a>
# **deleteBook**
> deleteBook(id)

Delete a web book

Delete a web book.  &gt; Required permission: webbooks.book.delete 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | The id of the web book to delete.
try {
    apiInstance.deleteBook(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#deleteBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the web book to delete. |

### Return type

null (empty response body)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBook"></a>
# **getBook**
> WebBooksResponse1 getBook(id)

Detailed web book info

Get detailed information about a web book.  &gt; Required permission: webbooks.book.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | The id of the web book to get detailed information about.
try {
    WebBooksResponse1 result = apiInstance.getBook(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the web book to get detailed information about. |

### Return type

[**WebBooksResponse1**](WebBooksResponse1.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBookHtml"></a>
# **getBookHtml**
> String getBookHtml(id)

Web Book HTML

Get the web book content as HTML.  &gt; Required permission: webbooks.book.html 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | The id of the web book to get the html for.
try {
    String result = apiInstance.getBookHtml(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getBookHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the web book to get the html for. |

### Return type

**String**

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBookHtmlPost"></a>
# **getBookHtmlPost**
> String getBookHtmlPost(id)

Web Book HTML

Get the web book content as HTML.  &gt; Required permission: webbooks.book.html 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | The id of the web book to get the html for.
try {
    String result = apiInstance.getBookHtmlPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getBookHtmlPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the web book to get the html for. |

### Return type

**String**

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBooks"></a>
# **getBooks**
> WebBooksResponse getBooks(details)

Books list

Get a list of all the web books on the server.  &gt; Required permission: webbooks.book.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each web book.
try {
    WebBooksResponse result = apiInstance.getBooks(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getBooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each web book. | [optional]

### Return type

[**WebBooksResponse**](WebBooksResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

