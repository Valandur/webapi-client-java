
# MMCTicketsTicket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique id of this ticket | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**message** | **String** | The message sent along with this ticket | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the ticket | 
**timestamp** | **Long** | The unix timestamp (in seconds) when this ticket was submitted | 
**comment** | **String** | The comment added by staff to this ticket |  [optional]
**location** | [**Location**](Location.md) | The location at which this ticket was submitted |  [optional]
**notified** | **Integer** | True if staff has been notified about this ticket, false otherwise |  [optional]
**sender** | [**PlayerFull**](PlayerFull.md) | The sender of this ticket |  [optional]
**staff** | [**Player**](Player.md) | The staff member that was assigned to this ticket |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLAIMED | &quot;Claimed&quot;
HELD | &quot;Held&quot;
CLOSED | &quot;Closed&quot;



