
# Advancement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique id of the advancement | 
**name** | **String** | The name of the advancement | 
**title** | **String** | The title of the advancement | 
**announceToChat** | **Boolean** | True if the achieving of this advancement is announced in chat, false otherwise |  [optional]
**description** | **String** | The description of the advancement |  [optional]
**hidden** | **Boolean** | True if this is a hidden advancement |  [optional]
**parent** | [**Advancement**](Advancement.md) | The parent advancement, which must be unlocked prior to this advancement |  [optional]
**showToast** | **Boolean** | True if achieving this advancement shows the player a toast message, false otherwise |  [optional]
**tree** | [**CatalogTypeAdvancementTree**](CatalogTypeAdvancementTree.md) | The advancement tree that this advancement belongs to |  [optional]



