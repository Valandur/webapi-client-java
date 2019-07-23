
# VillagerShopsShop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | [**CatalogTypeEntityType**](CatalogTypeEntityType.md) | The minecraft entity type string for this shops visual entity | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**entityVariant** | **String** | A very dynamic variant string for vanilla mobs, most variants as in the minecraft wiki should be supported |  [optional]
**location** | [**Location**](Location.md) | Where the shop is currently located |  [optional]
**name** | **String** | The escaped shop name |  [optional]
**owner** | [**UUID**](UUID.md) | If this shop is a player shop this conatins the UUID of this shops owner. Omitting this field or setting it to null will remove the player-shop association. |  [optional]
**rotation** | **Double** | The mobs roations around their up-axis |  [optional]
**stockContainer** | [**Location**](Location.md) | Location where a container should reside for stocking items. Omitting this field or setting it to null will remove the stock container. Having a player-shop without container is undefined behaviour! |  [optional]
**stockItems** | [**List&lt;VillagerShopsStockItem&gt;**](VillagerShopsStockItem.md) | Returns a list of all stock items currently listed. This property is read only. |  [optional]
**uid** | [**UUID**](UUID.md) | The unique shop identifier; this is not the mob uuid |  [optional]



