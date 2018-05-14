
# RedProtectRegion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique id of this region | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**max** | [**Vector3d**](Vector3d.md) | The maximum coordinates that define the region | 
**min** | [**Vector3d**](Vector3d.md) | The minimum coordinates that define the region | 
**name** | **String** | The name of this region | 
**world** | [**World**](World.md) | The world this region is located in | 
**admins** | [**List&lt;Player&gt;**](Player.md) | A list of players that are admins of this region |  [optional]
**canDelete** | **Boolean** | True if this region can be deleted, false otherwise |  [optional]
**date** | **String** | The date this region was created? |  [optional]
**flags** | **Map&lt;String, Object&gt;** | A map of flags applicable to this region |  [optional]
**leaders** | [**List&lt;Player&gt;**](Player.md) | A list of players that are leaders of this region |  [optional]
**members** | [**List&lt;Player&gt;**](Player.md) | A list of players that are members of this region |  [optional]
**priority** | **Integer** | The priority of this region compared to other regions |  [optional]
**tpPoint** | [**Location**](Location.md) | The teleport point for this region |  [optional]
**welcomeMessage** | **String** | The welcome message displayed to a player when they enter this region |  [optional]



