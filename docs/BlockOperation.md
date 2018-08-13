
# BlockOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **String** | The error message, if any | 
**estimatedSecondsRemaining** | **Float** | The estimated amount of time remaining until this block operation is complete (in seconds) | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**max** | [**Vector3i**](Vector3i.md) | The maximum block belonging to this operation | 
**min** | [**Vector3i**](Vector3i.md) | The minimum block belonging to this operation | 
**progress** | **Float** | The current progress of the block operation, from 0 (&#x3D;started) to 1 (&#x3D;finished) | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the block operation | 
**type** | [**TypeEnum**](#TypeEnum) | The type of block operation | 
**uuid** | [**UUID**](UUID.md) | The unique UUID identifying this block operation | 
**world** | [**World**](World.md) | The world in which this block operation is running | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INIT | &quot;INIT&quot;
RUNNING | &quot;RUNNING&quot;
PAUSED | &quot;PAUSED&quot;
DONE | &quot;DONE&quot;
ERRORED | &quot;ERRORED&quot;
CANCELED | &quot;CANCELED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
CHANGE | &quot;CHANGE&quot;



