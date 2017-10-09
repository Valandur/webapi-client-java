
# MMCTicketFull

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the crate. |  [optional]
**timestamp** | [**BigDecimal**](BigDecimal.md) | The name of the crate. |  [optional]
**sender** | [**Player**](Player.md) |  |  [optional]
**message** | **String** | The message that the player sent in the ticket. |  [optional]
**comment** | **String** | The comment added by staff. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current state of the ticket. |  [optional]
**staff** | [**Player**](Player.md) |  |  [optional]
**notified** | [**BigDecimal**](BigDecimal.md) | 0 if the assigned member has not been notified yet, 1 otherwise. |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLAIMED | &quot;Claimed&quot;
HELD | &quot;Held&quot;
CLOSED | &quot;Closed&quot;



