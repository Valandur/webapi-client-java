
# PlayerFull

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of player, usually &#x60;minecraft:player&#x60; |  [optional]
**uuid** | **String** | The unique identifier of the player. |  [optional]
**online** | **Boolean** | True if the player is currently online, false otherwise. |  [optional]
**location** | [**Location**](Location.md) |  |  [optional]
**name** | **String** | The name of the player. |  [optional]
**link** | **String** | The API URL which contains detailed information about this player. |  [optional]
**propertyClass** | **String** | The fully qualified class name of the object representing the player. Usually &#x60;net.minecraft.entity.player.EntityPlayerMP&#x60;. |  [optional]
**velocity** | [**Vector3**](Vector3.md) |  |  [optional]
**rotation** | [**Vector3**](Vector3.md) |  |  [optional]
**scale** | [**Vector3**](Vector3.md) |  |  [optional]
**inventory** | [**Inventory**](Inventory.md) |  |  [optional]
**connection** | [**PlayerFullConnection**](PlayerFullConnection.md) |  |  [optional]
**armour** | [**PlayerFullArmour**](PlayerFullArmour.md) |  |  [optional]
**achievements** | [**List&lt;PlayerFullAchievements&gt;**](PlayerFullAchievements.md) | An array of achievements the player has been awarded. |  [optional]
**experience** | [**PlayerFullExperience**](PlayerFullExperience.md) |  |  [optional]
**gameMode** | **String** | The current game mode the player is in. |  [optional]
**joined** | [**PlayerFullJoined**](PlayerFullJoined.md) |  |  [optional]
**health** | [**PlayerFullHealth**](PlayerFullHealth.md) |  |  [optional]
**food** | [**PlayerFullFood**](PlayerFullFood.md) |  |  [optional]
**statistics** | **Object** | A map from statistics id to value, keeping track of the players actions. |  [optional]



