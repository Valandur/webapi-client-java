
# BlockOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The UUID of the block update operation. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of action that is being performed by this operation. |  [optional]
**status** | **String** | The current status of the operation, one of: INIT, RUNNING, PAUSED, DONE, ERRORED.  |  [optional]
**progress** | **Float** | The update progress of this operation, from 0 (nothing done) to 1 (completely done). |  [optional]
**estTimeRemaining** | [**BigDecimal**](BigDecimal.md) | The estimated amount of seconds remaining before this operation is completed. |  [optional]
**link** | **String** | The Web-API url to access for details about this operation. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
UPDATE | &quot;UPDATE&quot;



