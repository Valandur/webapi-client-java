
# ServerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**motd** | **String** | The message of the day set on the server. |  [optional]
**players** | [**BigDecimal**](BigDecimal.md) | The amount of players currently playing on the server |  [optional]
**maxPlayers** | [**BigDecimal**](BigDecimal.md) | The maximum amount of players allowed on the server |  [optional]
**uptimeTicks** | [**BigDecimal**](BigDecimal.md) | The number of ticks the server has been running |  [optional]
**tps** | [**BigDecimal**](BigDecimal.md) | The average ticks per second the server is running with. 20 is ideal. |  [optional]
**hasWhitelist** | **Boolean** | True if the server has a whitelist, false otherwise. |  [optional]
**minecraftVersion** | **String** | The minecraft version running on the server. |  [optional]
**game** | [**ServerInfoDetail**](ServerInfoDetail.md) |  |  [optional]
**api** | [**ServerInfoDetail**](ServerInfoDetail.md) |  |  [optional]
**implementation** | [**ServerInfoDetail**](ServerInfoDetail.md) |  |  [optional]



