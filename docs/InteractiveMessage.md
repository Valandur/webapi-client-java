
# InteractiveMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the message. Used for sender of the message to identify responses. | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**target** | **String** | The target of the message, usually this is a player UUID. Can be set to \&quot;server\&quot; to send to all online players. | 
**uuid** | [**UUID**](UUID.md) | The unique UUID of this message | 
**message** | **String** | The actual content of the message |  [optional]
**once** | **Boolean** | True if this message can only be replied to once per target, false otherwise |  [optional]
**options** | [**List&lt;InteractiveMessageOption&gt;**](InteractiveMessageOption.md) | Clickable options that the player can select from |  [optional]
**targets** | **List&lt;String&gt;** | A list of targets that will receive the message. Usually a list of player UUIDs |  [optional]



