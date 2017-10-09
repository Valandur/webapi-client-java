
# NationsZone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The unique uuid of this zone. |  [optional]
**name** | **String** | The name of the zone. |  [optional]
**rect** | [**NationsRect**](NationsRect.md) |  |  [optional]
**owner** | [**Player**](Player.md) |  |  [optional]
**coOwners** | [**List&lt;Player&gt;**](Player.md) | The list of co-owners of this zone. |  [optional]
**flags** | **Object** | A map of boolean flags. |  [optional]
**forSale** | **Boolean** | True if this zone is for sale, false otherwise. |  [optional]
**price** | **String** | The price of this zone. **This is a string because this number might be too large to hold in a regular number object.** |  [optional]



