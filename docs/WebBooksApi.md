# WebBooksApi

All URIs are relative to *https://localhost/api/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebBook**](WebBooksApi.md#createWebBook) | **POST** /web-books/book | Create a book
[**deleteWebBook**](WebBooksApi.md#deleteWebBook) | **DELETE** /web-books/book/{id} | Delete a book
[**getWebBook**](WebBooksApi.md#getWebBook) | **GET** /web-books/book/{id} | Get a book
[**getWebBookContent**](WebBooksApi.md#getWebBookContent) | **GET** /web-books/book/{id}/html | Book HTML
[**getWebBookContentPost**](WebBooksApi.md#getWebBookContentPost) | **POST** /web-books/book/{id}/html | Book HTML
[**listWebBooks**](WebBooksApi.md#listWebBooks) | **GET** /web-books/book | List books
[**modifyWebBook**](WebBooksApi.md#modifyWebBook) | **PUT** /web-books/book/{id} | Modify a book


<a name="createWebBook"></a>
# **createWebBook**
> WebBooksBook createWebBook(body, details, accept, pretty)

Create a book

Create a new web book from the specified data.     **Required permissions:**    - **web-books.book.create**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
WebBooksBook body = new WebBooksBook(); // WebBooksBook | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    WebBooksBook result = apiInstance.createWebBook(body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#createWebBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebBooksBook**](WebBooksBook.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**WebBooksBook**](WebBooksBook.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deleteWebBook"></a>
# **deleteWebBook**
> WebBooksBook deleteWebBook(id, details, accept, pretty)

Delete a book

Delete a web book.     **Required permissions:**    - **web-books.book.delete**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    WebBooksBook result = apiInstance.deleteWebBook(id, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#deleteWebBook");
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

[**WebBooksBook**](WebBooksBook.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getWebBook"></a>
# **getWebBook**
> WebBooksBook getWebBook(id, details, accept, pretty)

Get a book

Get detailed information about a web book.     **Required permissions:**    - **web-books.book.one**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    WebBooksBook result = apiInstance.getWebBook(id, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getWebBook");
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

[**WebBooksBook**](WebBooksBook.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getWebBookContent"></a>
# **getWebBookContent**
> String getWebBookContent(id, details, accept, pretty)

Book HTML

Get the web book content as HTML.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebBooksApi;


WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    String result = apiInstance.getWebBookContent(id, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getWebBookContent");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/xml, application/json
 - **Accept**: text/html

<a name="getWebBookContentPost"></a>
# **getWebBookContentPost**
> String getWebBookContentPost(id, details, accept, pretty)

Book HTML

Get the web book content as HTML.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebBooksApi;


WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    String result = apiInstance.getWebBookContentPost(id, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#getWebBookContentPost");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/xml, application/json
 - **Accept**: text/html

<a name="listWebBooks"></a>
# **listWebBooks**
> List&lt;WebBooksBook&gt; listWebBooks(details, accept, pretty)

List books

Get a list of all the web books on the server.     **Required permissions:**    - **web-books.book.list**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    List<WebBooksBook> result = apiInstance.listWebBooks(details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#listWebBooks");
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

[**List&lt;WebBooksBook&gt;**](WebBooksBook.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="modifyWebBook"></a>
# **modifyWebBook**
> WebBooksBook modifyWebBook(id, body, details, accept, pretty)

Modify a book

Modify an existing book.     **Required permissions:**    - **web-books.book.modify**   

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebBooksApi;

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

WebBooksApi apiInstance = new WebBooksApi();
String id = "id_example"; // String | 
WebBooksBook body = new WebBooksBook(); // WebBooksBook | 
Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
try {
    WebBooksBook result = apiInstance.modifyWebBook(id, body, details, accept, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebBooksApi#modifyWebBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**WebBooksBook**](WebBooksBook.md)|  | [optional]
 **details** | **Boolean**| Add to include additional details, omit or false otherwise | [optional]
 **accept** | **String**| Override the &#39;Accept&#39; request header (useful for debugging your requests) | [optional] [enum: json, xml]
 **pretty** | **Boolean**| Add to make the Web-API pretty print the response (useful for debugging your requests) | [optional]

### Return type

[**WebBooksBook**](WebBooksBook.md)

### Authorization

[ApiKeyHeader](../README.md#ApiKeyHeader), [ApiKeyQuery](../README.md#ApiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

