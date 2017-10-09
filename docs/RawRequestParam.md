
# RawRequestParam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the parameter. This defines how the value is interpreted. |  [optional]
**value** | **Object** | The value of the parameter. Base types (like integer, float, boolean, etc.) are converted to the correct type and then passed to the method. Some parameters are handled differently, they are listed below along with their usage:  - class: Interpreted as the fully qualified classname of a class which is loaded and passed | - vector3(i/d): Converted to a Vector3(i/d) object. Requires the properties \&quot;x\&quot;, \&quot;y\&quot; and \&quot;z\&quot; - text: Converted to a sponge text - world: Assumed to be the UUID of a world which is fetched and passed - player: Assumed to be the UUID of the player which is fetched and passed. - itemstack: Converted to a new item stack. Requires the properties \&quot;itemType\&quot; and \&quot;amount\&quot;  |  [optional]
**optional** | **Boolean** | True if the value should be wrapped into an optional value, false otherwise. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INT | &quot;int&quot;
INTEGER | &quot;integer&quot;
FLOAT | &quot;float&quot;
DOUBLE | &quot;double&quot;
BOOL | &quot;bool&quot;
BOOLEAN | &quot;boolean&quot;
BYTE | &quot;byte&quot;
CHAR | &quot;char&quot;
LONG | &quot;long&quot;
SHORT | &quot;short&quot;
STRING | &quot;string&quot;
ENUM | &quot;enum&quot;
CLASS | &quot;class&quot;
VECTOR3D | &quot;vector3d&quot;
VECTOR3I | &quot;vector3i&quot;
TEXT | &quot;text&quot;
WORLD | &quot;world&quot;
PLAYER | &quot;player&quot;
ITEMSTACK | &quot;itemstack&quot;



