
# Chunk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **String** | The API link that can be used to obtain more information about this object | 
**loaded** | **Boolean** | True if this chunk is currently loaded, false otherwise | 
**position** | [**Vector3i**](Vector3i.md) | The position of this chunk (in chunk coordinates) | 
**uuid** | [**UUID**](UUID.md) | The unique id of this chunk | 
**blockMax** | [**Vector3i**](Vector3i.md) | The bock with the largest coordinates that is still part of this chunk |  [optional]
**blockMin** | [**Vector3i**](Vector3i.md) | The bock with the smallest coordinates that is still part of this chunk |  [optional]
**inhabitedTime** | **Integer** | The total amount of time (in server ticks) this chunk has been inhabited by players. |  [optional]
**regionalDifficultyFactor** | **Double** | The increase in difficulty due to the presence of players in the chunk |  [optional]
**regionalDifficultyPercentage** | **Double** | The increase in difficulty due to the presence of players in the chunk as a percentage |  [optional]
**world** | [**World**](World.md) | The world the chunk is in |  [optional]



