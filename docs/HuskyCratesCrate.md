
# HuskyCratesCrate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**free** | **Boolean** | True if this crate is free to open, false otherwise | 
**freeDelay** | **Integer** | In case this crate is free, this interval specifies the time (in seconds) after which this crate can be opened again | 
**id** | **String** | The unique id of this crate | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**name** | **String** | The name of the crate | 
**rewards** | [**List&lt;HuskyCratesCrateReward&gt;**](HuskyCratesCrateReward.md) | The possible rewards awarded for opening this crate | 
**scrambleRewards** | **Boolean** | True if the rewards are scrambled, false otherwise | 
**type** | [**TypeEnum**](#TypeEnum) | The type of crate | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SPINNER | &quot;Spinner&quot;
ROULETTE | &quot;Roulette&quot;
INSTANT | &quot;Instant&quot;
SIMPLE | &quot;Simple&quot;



