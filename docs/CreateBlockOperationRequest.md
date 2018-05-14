
# CreateBlockOperationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max** | [**Vector3i**](Vector3i.md) | The maximum world coordinates spanning the cube where the operation is run | 
**min** | [**Vector3i**](Vector3i.md) | The minimum world coordinates spanning the cube where the operation is run | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the block operation | 
**world** | **String** | The world that the operation is run in | 
**block** | [**BlockState**](BlockState.md) | The block that we want to change all other blocks into (when using an UPDATE operation |  [optional]
**blocks** | [**List&lt;List&lt;List&lt;BlockState&gt;&gt;&gt;**](List.md) | An array of blocks defining what each block in the spanned cube |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
CHANGE | &quot;CHANGE&quot;



