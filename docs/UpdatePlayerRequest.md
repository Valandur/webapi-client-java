
# UpdatePlayerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**world** | **String** | The UUID or name of the world that the player is moved to. |  [optional]
**position** | [**Vector3**](Vector3.md) |  |  [optional]
**velocity** | [**Vector3**](Vector3.md) |  |  [optional]
**rotation** | [**Vector3**](Vector3.md) |  |  [optional]
**scale** | [**Vector3**](Vector3.md) |  |  [optional]
**foodLevel** | [**BigDecimal**](BigDecimal.md) | The new food level of the player. |  [optional]
**exhaustion** | **Double** | The new exhaustion level of the player. |  [optional]
**saturation** | **Double** | The new saturation level of the player. |  [optional]
**totalExperience** | [**BigDecimal**](BigDecimal.md) | The total amount of experience the player has. This implicitly also sets the level. |  [optional]
**level** | [**BigDecimal**](BigDecimal.md) | The current level of the player. This is also defined by the total amount of experience the player has. |  [optional]
**experienceSinceLevel** | [**BigDecimal**](BigDecimal.md) | The amount of experience since the last level up that the player has collected. |  [optional]
**health** | **Double** | The current amount of health the player has. |  [optional]
**maxHealth** | **Double** | The total amount of health the player can have at maximum. |  [optional]
**damage** | [**DamageRequest1**](DamageRequest1.md) |  |  [optional]



