
# VillagerShopsStockItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyPrice** | **Double** | The amount of money this stack consts to buy as player | 
**currency** | [**CatalogTypeCurrency**](CatalogTypeCurrency.md) | The currency for this item listing | 
**hasStock** | **Boolean** | Returns wether this shop has a limited stock | 
**item** | [**ItemStack**](ItemStack.md) | The raw ItemStack data for this shop listing | 
**maxStock** | **Integer** | If this shop has a limited stock, returns how many of these items can be stocked, 0 is unlimited | 
**sellPrice** | **Double** | The amount of money this stack earns the player when selling | 
**shopId** | [**UUID**](UUID.md) | The shop uuid offering this item listing | 
**stock** | **Integer** | If this shop has a limited stock, returns how many items are stocked, otherwise returns items stack size | 
**id** | **Integer** | The index of this item withing the shops inventory |  [optional]
**link** | **String** |  |  [optional]



