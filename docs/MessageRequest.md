
# MessageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the message. This will be sent back in the reply, so you can identify the request. |  [optional]
**target** | **String** | The UUID of the player this message is sent to. |  [optional]
**message** | **String** | The message sent to the player. Text formatting can be applied with ampersand formatting. |  [optional]
**once** | **Boolean** | True if the target can only select one response for this message (further responses are not sent to the webhook endpoint)  |  [optional]
**options** | **Object** | These are the options the player can choose from. The key is sent back to the server, the value is displayed to the player.  |  [optional]


