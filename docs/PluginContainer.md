
# PluginContainer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authors** | **List&lt;String&gt;** | A list of authors that created this plugin | 
**dependencies** | [**List&lt;PluginDependency&gt;**](PluginDependency.md) | Other plugins that this plugin depends on | 
**id** | **String** | The unique id of this plugin | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**name** | **String** | The name of this plugin | 
**state** | [**StateEnum**](#StateEnum) | The current loaded state of the plugin | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the plugin | 
**description** | **String** | A description describing what this plugin does (hopefully) |  [optional]
**source** | **String** | The file source where the plugin was loaded from. |  [optional]
**url** | **String** | The url that was added to the plugin (probably the homepage) |  [optional]
**version** | **String** | The current version of the plugin |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
LOADED | &quot;Loaded&quot;
UNLOADED | &quot;Unloaded&quot;
WILLBELOADED | &quot;WillBeLoaded&quot;
WILLBEUNLOADED | &quot;WillBeUnloaded&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
SPONGE | &quot;Sponge&quot;
FORGE | &quot;Forge&quot;
MINECRAFT | &quot;Minecraft&quot;



