# MMCTicketsApi

All URIs are relative to *http://&lt;host&gt;/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeTicket**](MMCTicketsApi.md#changeTicket) | **PUT** /mmctickets/ticket/{id} | Edit ticket
[**getTicket**](MMCTicketsApi.md#getTicket) | **GET** /mmctickets/ticket/{id} | Detailed ticket info
[**getTickets**](MMCTicketsApi.md#getTickets) | **GET** /mmctickets/ticket | Ticket list


<a name="changeTicket"></a>
# **changeTicket**
> MMCTicketsTicketResponse changeTicket(id, updateTicketRequest)

Edit ticket

Update the properties of an existing ticket.  &gt; Required permission: mmctickets.ticket.change 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MMCTicketsApi;

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

MMCTicketsApi apiInstance = new MMCTicketsApi();
String id = "id_example"; // String | The id of the ticket.
MMCUpdateTicketRequest updateTicketRequest = new MMCUpdateTicketRequest(); // MMCUpdateTicketRequest | The new properties of the ticket
try {
    MMCTicketsTicketResponse result = apiInstance.changeTicket(id, updateTicketRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MMCTicketsApi#changeTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the ticket. |
 **updateTicketRequest** | [**MMCUpdateTicketRequest**](MMCUpdateTicketRequest.md)| The new properties of the ticket |

### Return type

[**MMCTicketsTicketResponse**](MMCTicketsTicketResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getTicket"></a>
# **getTicket**
> MMCTicketsTicketResponse getTicket(id)

Detailed ticket info

Get detailed information about a ticket.  &gt; Required permission: mmctickets.ticket.one 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MMCTicketsApi;

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

MMCTicketsApi apiInstance = new MMCTicketsApi();
String id = "id_example"; // String | The id of the ticket to get detailed information about.
try {
    MMCTicketsTicketResponse result = apiInstance.getTicket(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MMCTicketsApi#getTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the ticket to get detailed information about. |

### Return type

[**MMCTicketsTicketResponse**](MMCTicketsTicketResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getTickets"></a>
# **getTickets**
> MMCTicketsTicketsResponse getTickets(details)

Ticket list

Get a list of all the tickets on the server.  &gt; Required permission: mmtickets.ticket.list 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MMCTicketsApi;

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

MMCTicketsApi apiInstance = new MMCTicketsApi();
String details = "details_example"; // String | Pass this parameter to receive the full details for each ticket.
try {
    MMCTicketsTicketsResponse result = apiInstance.getTickets(details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MMCTicketsApi#getTickets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details** | **String**| Pass this parameter to receive the full details for each ticket. | [optional]

### Return type

[**MMCTicketsTicketsResponse**](MMCTicketsTicketsResponse.md)

### Authorization

[headerKey](../README.md#headerKey), [queryKey](../README.md#queryKey)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

