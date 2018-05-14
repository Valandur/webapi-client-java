
# PluginDependency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the plugin that the original plugin depends on | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**loadOrder** | [**LoadOrderEnum**](#LoadOrderEnum) | The load order of the original plugin in relation to the dependency | 
**optional** | **Boolean** | True if this is an optional dependency, false otherwise | 
**version** | **String** | The version of the plugin that the original plugin depends on | 


<a name="LoadOrderEnum"></a>
## Enum: LoadOrderEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
BEFORE | &quot;BEFORE&quot;
AFTER | &quot;AFTER&quot;



