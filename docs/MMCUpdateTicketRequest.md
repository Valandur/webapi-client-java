
# MMCUpdateTicketRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** | The comment added by staff. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current state of the ticket. |  [optional]
**notified** | [**BigDecimal**](BigDecimal.md) | 0 if the assigned member has not been notified yet, 1 otherwise. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLAIMED | &quot;Claimed&quot;
HELD | &quot;Held&quot;
CLOSED | &quot;Closed&quot;



