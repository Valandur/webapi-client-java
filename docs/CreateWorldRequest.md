
# CreateWorldRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the world. |  [optional]
**seed** | [**BigDecimal**](BigDecimal.md) | The seed number. A random seed is generated if not provided. |  [optional]
**generator** | **String** | The id of the generator type to use. Check &#x60;/registry/org.spongepowered.api.world.GeneratorType&#x60;. |  [optional]
**gameMode** | **String** | The id of the game mode to use. Check &#x60;/registry/org.spongepowered.api.entity.living.player.gamemode.GameMode&#x60;. |  [optional]
**difficulty** | **String** | The id of the difficutly to use. Check &#x60;/registry/org.spongepowered.api.world.difficulty.Difficulty&#x60;. |  [optional]
**loadOnStartup** | **Boolean** | True if the world is loaded when the server starts, false otherwise. |  [optional]
**keepSpawnLoaded** | **Boolean** | True to keep the spawn area of the world loaded, even if it is empty. |  [optional]
**allowCommands** | **Boolean** | True if executing commands is allowed in the world. |  [optional]
**usesMapFeatures** | **Boolean** | True to use map features of the generator (such as villages). |  [optional]
**dimension** | **String** | The dimension of the world to use. Check &#x60;/registry/org.spongepowered.api.world.DimensionType&#x60;. |  [optional]
**generateBonusChest** | **Boolean** | True to generate bonus chests, false otherwise. |  [optional]



