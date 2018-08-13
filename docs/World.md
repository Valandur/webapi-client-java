
# World

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowCommands** | **Boolean** | True if commands are allowed to be executed in this world, false otherwise | 
**border** | [**WorldBorder**](WorldBorder.md) | The border of the world | 
**difficulty** | [**CatalogTypeDifficulty**](CatalogTypeDifficulty.md) | The difficulty of the world | 
**dimensionType** | [**CatalogTypeDimensionType**](CatalogTypeDimensionType.md) | The dimension of the world | 
**gameMode** | [**GameMode**](GameMode.md) |  |  [optional]
**gameRules** | **Map&lt;String, String&gt;** | A map of world rule names to values | 
**generateBonusChests** | **Boolean** | True if bonus chests are generated for this world, false otherwise | 
**generatorType** | [**CatalogTypeGeneratorType**](CatalogTypeGeneratorType.md) | The generator type used for this world | 
**keepSpawnLoaded** | **Boolean** | True if the spawn of this world is always kept loaded, false otherwise | 
**link** | **String** | The API link that can be used to obtain more information about this object | 
**loadOnStartup** | **Boolean** | True if this world is loaded when the server starts, false otherwise | 
**loaded** | **Boolean** | True if the world is loaded, false otherwise | 
**mapFeaturesEnabled** | **Boolean** | True if map specific features are enabled for this world, false otherwise | 
**name** | **String** | The name of this world | 
**seed** | **Long** | The seed of the world | 
**spawn** | [**CatalogType**](CatalogType.md) |  |  [optional]
**time** | **Long** | The current time in the world | 
**uuid** | [**UUID**](UUID.md) | The unique UUID that identifies this world | 
**weather** | [**CatalogTypeWeather**](CatalogTypeWeather.md) | The current weather in the world | 
**absorption** | **Double** |  |  [optional]
**age** | [**AgeableData**](AgeableData.md) |  |  [optional]
**aggressive** | **Boolean** |  |  [optional]
**aiEnabled** | **Boolean** |  |  [optional]
**angerLevel** | **Integer** |  |  [optional]
**armorStand** | [**ArmorStandData**](ArmorStandData.md) |  |  [optional]
**art** | [**CatalogType**](CatalogType.md) |  |  [optional]
**attached** | **Boolean** |  |  [optional]
**author** | **String** |  |  [optional]
**axis** | [**AxisEnum**](#AxisEnum) |  |  [optional]
**banner** | [**BannerData**](BannerData.md) |  |  [optional]
**beacon** | [**BeaconData**](BeaconData.md) |  |  [optional]
**bigMushroom** | [**CatalogType**](CatalogType.md) |  |  [optional]
**block** | [**BlockState**](BlockState.md) |  |  [optional]
**breathing** | [**BreathingData**](BreathingData.md) |  |  [optional]
**breedable** | **Boolean** |  |  [optional]
**brewingStand** | [**BrewingStandData**](BrewingStandData.md) |  |  [optional]
**brick** | [**CatalogType**](CatalogType.md) |  |  [optional]
**career** | [**Career**](Career.md) |  |  [optional]
**charged** | **Boolean** |  |  [optional]
**coal** | [**CatalogType**](CatalogType.md) |  |  [optional]
**color** | [**Color**](Color.md) |  |  [optional]
**command** | [**CommandData**](CommandData.md) |  |  [optional]
**comparator** | [**CatalogType**](CatalogType.md) |  |  [optional]
**connectedDirection** | [**List&lt;ConnectedDirectionEnum&gt;**](#List&lt;ConnectedDirectionEnum&gt;) |  |  [optional]
**cookedFish** | [**CatalogType**](CatalogType.md) |  |  [optional]
**cooldown** | **Integer** |  |  [optional]
**criticalHit** | **Boolean** |  |  [optional]
**customName** | **Boolean** |  |  [optional]
**damage** | **Double** |  |  [optional]
**damageable** | [**DamageableData**](DamageableData.md) |  |  [optional]
**decayable** | **Boolean** |  |  [optional]
**delay** | **Integer** |  |  [optional]
**despawnDelay** | [**DespawnDelayData**](DespawnDelayData.md) |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**dirt** | [**CatalogType**](CatalogType.md) |  |  [optional]
**disarmed** | **Boolean** |  |  [optional]
**disguisedBlock** | [**CatalogType**](CatalogType.md) |  |  [optional]
**displayName** | **String** |  |  [optional]
**dominantHand** | [**CatalogType**](CatalogType.md) |  |  [optional]
**doublePlant** | [**CatalogType**](CatalogType.md) |  |  [optional]
**drops** | **Boolean** |  |  [optional]
**durability** | [**DurabilityData**](DurabilityData.md) |  |  [optional]
**dye** | [**DyeColor**](DyeColor.md) |  |  [optional]
**enchantments** | [**List&lt;Enchantment&gt;**](Enchantment.md) |  |  [optional]
**endGateway** | [**EndGatewayData**](EndGatewayData.md) |  |  [optional]
**expOrb** | **Integer** |  |  [optional]
**experience** | [**ExperienceHolderData**](ExperienceHolderData.md) |  |  [optional]
**expireTicks** | **Integer** |  |  [optional]
**explosionRadius** | **Integer** |  |  [optional]
**extended** | **Boolean** |  |  [optional]
**fallDistance** | **Float** |  |  [optional]
**fallingBlock** | [**FallingBlockData**](FallingBlockData.md) |  |  [optional]
**filled** | **Boolean** |  |  [optional]
**fireworkEffects** | [**List&lt;FireworkEffect&gt;**](FireworkEffect.md) |  |  [optional]
**fireworkRocket** | [**FireworkRocketData**](FireworkRocketData.md) |  |  [optional]
**fish** | [**CatalogType**](CatalogType.md) |  |  [optional]
**flammable** | **Boolean** |  |  [optional]
**fluid** | [**FluidStack**](FluidStack.md) |  |  [optional]
**fluidLevel** | **Integer** |  |  [optional]
**fluidTanks** | [**Map&lt;String, List&lt;FluidStack&gt;&gt;**](List.md) |  |  [optional]
**flying** | **Boolean** |  |  [optional]
**flyingAbility** | **Boolean** |  |  [optional]
**food** | [**FoodData**](FoodData.md) |  |  [optional]
**furnace** | [**FurnaceData**](FurnaceData.md) |  |  [optional]
**fuse** | [**FuseData**](FuseData.md) |  |  [optional]
**generation** | **Integer** |  |  [optional]
**glowing** | **Boolean** |  |  [optional]
**goldenApple** | [**CatalogType**](CatalogType.md) |  |  [optional]
**griefs** | **Boolean** |  |  [optional]
**growth** | [**GrowthData**](GrowthData.md) |  |  [optional]
**health** | [**HealthData**](HealthData.md) |  |  [optional]
**hide** | [**HideData**](HideData.md) |  |  [optional]
**hinge** | [**CatalogType**](CatalogType.md) |  |  [optional]
**horse** | [**HorseData**](HorseData.md) |  |  [optional]
**igniteable** | [**IgniteableData**](IgniteableData.md) |  |  [optional]
**inWall** | **Boolean** |  |  [optional]
**inventory** | [**Inventory**](Inventory.md) |  |  [optional]
**invisibility** | [**InvisibilityData**](InvisibilityData.md) |  |  [optional]
**invulnerability** | [**InvulnerabilityData**](InvulnerabilityData.md) |  |  [optional]
**joined** | [**JoinData**](JoinData.md) |  |  [optional]
**knockback** | **Integer** |  |  [optional]
**layer** | **Integer** |  |  [optional]
**leash** | [**LeashData**](LeashData.md) |  |  [optional]
**lockToken** | **String** |  |  [optional]
**logAxis** | [**CatalogType**](CatalogType.md) |  |  [optional]
**lore** | **List&lt;String&gt;** |  |  [optional]
**minecartBlock** | [**MinecartBlockData**](MinecartBlockData.md) |  |  [optional]
**mobSpawner** | [**MobSpawnerData**](MobSpawnerData.md) |  |  [optional]
**moisture** | **Integer** |  |  [optional]
**note** | [**CatalogType**](CatalogType.md) |  |  [optional]
**occupied** | **Boolean** |  |  [optional]
**ocelot** | [**CatalogType**](CatalogType.md) |  |  [optional]
**open** | **Boolean** |  |  [optional]
**pages** | **List&lt;String&gt;** |  |  [optional]
**passengers** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**persists** | **Boolean** |  |  [optional]
**pickupDelay** | [**PickupDelayData**](PickupDelayData.md) |  |  [optional]
**pickupRule** | [**CatalogType**](CatalogType.md) |  |  [optional]
**pigSaddle** | **Boolean** |  |  [optional]
**piston** | [**CatalogType**](CatalogType.md) |  |  [optional]
**placeableOn** | [**List&lt;CatalogType&gt;**](CatalogType.md) |  |  [optional]
**plant** | [**CatalogType**](CatalogType.md) |  |  [optional]
**playerCreated** | **Boolean** |  |  [optional]
**playing** | **Boolean** |  |  [optional]
**portion** | [**CatalogType**](CatalogType.md) |  |  [optional]
**potionEffects** | [**List&lt;PotionEffect&gt;**](PotionEffect.md) |  |  [optional]
**powered** | **Boolean** |  |  [optional]
**prismarine** | [**CatalogType**](CatalogType.md) |  |  [optional]
**quartz** | [**CatalogType**](CatalogType.md) |  |  [optional]
**rabbit** | [**CatalogType**](CatalogType.md) |  |  [optional]
**railDirection** | [**CatalogType**](CatalogType.md) |  |  [optional]
**redstonePower** | **Integer** |  |  [optional]
**representedItem** | [**ItemStack**](ItemStack.md) |  |  [optional]
**representedPlayer** | **String** |  |  [optional]
**respawnLocations** | [**Map&lt;String, Location&gt;**](Location.md) |  |  [optional]
**sand** | [**CatalogType**](CatalogType.md) |  |  [optional]
**sandStone** | [**CatalogType**](CatalogType.md) |  |  [optional]
**screaming** | **Boolean** |  |  [optional]
**seamless** | **Boolean** |  |  [optional]
**shatters** | **Boolean** |  |  [optional]
**sheared** | **Boolean** |  |  [optional]
**shrub** | [**CatalogType**](CatalogType.md) |  |  [optional]
**sign** | **List&lt;String&gt;** |  |  [optional]
**silent** | **Boolean** |  |  [optional]
**sitting** | **Boolean** |  |  [optional]
**skin** | [**UUID**](UUID.md) |  |  [optional]
**skull** | [**CatalogType**](CatalogType.md) |  |  [optional]
**slab** | [**CatalogType**](CatalogType.md) |  |  [optional]
**sleeping** | **Boolean** |  |  [optional]
**slime** | [**SlimeData**](SlimeData.md) |  |  [optional]
**sneaking** | **Boolean** |  |  [optional]
**snow** | **Boolean** |  |  [optional]
**sprinting** | **Boolean** |  |  [optional]
**stairShape** | [**CatalogType**](CatalogType.md) |  |  [optional]
**statistics** | [**List&lt;Stat&gt;**](Stat.md) |  |  [optional]
**stone** | [**CatalogType**](CatalogType.md) |  |  [optional]
**storedEnchantments** | [**List&lt;Enchantment&gt;**](Enchantment.md) |  |  [optional]
**structure** | [**StructureData**](StructureData.md) |  |  [optional]
**stuckArrows** | **Integer** |  |  [optional]
**tamed** | [**TameableData**](TameableData.md) |  |  [optional]
**target** | [**Vector3d**](Vector3d.md) |  |  [optional]
**trades** | [**List&lt;TradeOffer&gt;**](TradeOffer.md) |  |  [optional]
**tree** | [**CatalogType**](CatalogType.md) |  |  [optional]
**vehicle** | [**VehicleData**](VehicleData.md) |  |  [optional]
**wall** | [**CatalogType**](CatalogType.md) |  |  [optional]
**wet** | **Boolean** |  |  [optional]
**wires** | [**WireAttachmentData**](WireAttachmentData.md) |  |  [optional]
**acceptsItems** | [**AcceptsItems**](AcceptsItems.md) |  |  [optional]
**applicableEffect** | [**List&lt;PotionEffect&gt;**](PotionEffect.md) |  |  [optional]
**armorSlotType** | [**ArmorSlotType**](ArmorSlotType.md) |  |  [optional]
**armorType** | [**CatalogType**](CatalogType.md) |  |  [optional]
**blastResistance** | **Double** |  |  [optional]
**burningFuel** | **Integer** |  |  [optional]
**damageAbsorption** | **Integer** |  |  [optional]
**efficiency** | **Double** |  |  [optional]
**equipmentType** | [**CatalogType**](CatalogType.md) |  |  [optional]
**equiptmentSlotType** | [**EquipmentSlotType**](EquipmentSlotType.md) |  |  [optional]
**eyeHeight** | **Double** |  |  [optional]
**eyeLocation** | [**Vector3d**](Vector3d.md) |  |  [optional]
**fluidTemperature** | **Integer** |  |  [optional]
**fluidViscosity** | **Integer** |  |  [optional]
**foodRestoration** | **Integer** |  |  [optional]
**fullBlockSelectionBox** | **Boolean** |  |  [optional]
**gravityAffected** | **Boolean** |  |  [optional]
**groundLuminance** | **Double** |  |  [optional]
**guiId** | [**GuiIdProperty**](GuiIdProperty.md) |  |  [optional]
**hardness** | **Double** |  |  [optional]
**heldItem** | [**CatalogType**](CatalogType.md) |  |  [optional]
**identifiable** | [**Identifiable**](Identifiable.md) |  |  [optional]
**indirectlyPowered** | **Boolean** |  |  [optional]
**instrument** | [**CatalogType**](CatalogType.md) |  |  [optional]
**inventoryCapacity** | [**InventoryCapacity**](InventoryCapacity.md) |  |  [optional]
**inventoryDimension** | [**InventoryDimension**](InventoryDimension.md) |  |  [optional]
**inventoryTitle** | [**InventoryTitle**](InventoryTitle.md) |  |  [optional]
**lightEmission** | **Integer** |  |  [optional]
**matter** | [**MatterEnum**](#MatterEnum) |  |  [optional]
**passable** | **Boolean** |  |  [optional]
**record** | [**CatalogType**](CatalogType.md) |  |  [optional]
**replaceable** | **Boolean** |  |  [optional]
**saturationProperty** | **Double** |  |  [optional]
**skyLuminance** | **Double** |  |  [optional]
**slotIndex** | [**SlotIndex**](SlotIndex.md) |  |  [optional]
**slotPos** | [**SlotPos**](SlotPos.md) |  |  [optional]
**slotSide** | [**SlotSide**](SlotSide.md) |  |  [optional]
**smeltable** | **Boolean** |  |  [optional]
**solidCube** | **Boolean** |  |  [optional]
**statisticsTracked** | **Boolean** |  |  [optional]
**surrogateBlock** | **Boolean** |  |  [optional]
**temperature** | **Double** |  |  [optional]
**toolType** | [**CatalogType**](CatalogType.md) |  |  [optional]
**unbreakable** | **Boolean** |  |  [optional]
**useLimit** | **Integer** |  |  [optional]


<a name="AxisEnum"></a>
## Enum: AxisEnum
Name | Value
---- | -----
X | &quot;X&quot;
Y | &quot;Y&quot;
Z | &quot;Z&quot;


<a name="List<ConnectedDirectionEnum>"></a>
## Enum: List&lt;ConnectedDirectionEnum&gt;
Name | Value
---- | -----
NORTH | &quot;NORTH&quot;
NORTH_NORTHEAST | &quot;NORTH_NORTHEAST&quot;
NORTHEAST | &quot;NORTHEAST&quot;
EAST_NORTHEAST | &quot;EAST_NORTHEAST&quot;
EAST | &quot;EAST&quot;
EAST_SOUTHEAST | &quot;EAST_SOUTHEAST&quot;
SOUTHEAST | &quot;SOUTHEAST&quot;
SOUTH_SOUTHEAST | &quot;SOUTH_SOUTHEAST&quot;
SOUTH | &quot;SOUTH&quot;
SOUTH_SOUTHWEST | &quot;SOUTH_SOUTHWEST&quot;
SOUTHWEST | &quot;SOUTHWEST&quot;
WEST_SOUTHWEST | &quot;WEST_SOUTHWEST&quot;
WEST | &quot;WEST&quot;
WEST_NORTHWEST | &quot;WEST_NORTHWEST&quot;
NORTHWEST | &quot;NORTHWEST&quot;
NORTH_NORTHWEST | &quot;NORTH_NORTHWEST&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
NONE | &quot;NONE&quot;


<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
NORTH | &quot;NORTH&quot;
NORTH_NORTHEAST | &quot;NORTH_NORTHEAST&quot;
NORTHEAST | &quot;NORTHEAST&quot;
EAST_NORTHEAST | &quot;EAST_NORTHEAST&quot;
EAST | &quot;EAST&quot;
EAST_SOUTHEAST | &quot;EAST_SOUTHEAST&quot;
SOUTHEAST | &quot;SOUTHEAST&quot;
SOUTH_SOUTHEAST | &quot;SOUTH_SOUTHEAST&quot;
SOUTH | &quot;SOUTH&quot;
SOUTH_SOUTHWEST | &quot;SOUTH_SOUTHWEST&quot;
SOUTHWEST | &quot;SOUTHWEST&quot;
WEST_SOUTHWEST | &quot;WEST_SOUTHWEST&quot;
WEST | &quot;WEST&quot;
WEST_NORTHWEST | &quot;WEST_NORTHWEST&quot;
NORTHWEST | &quot;NORTHWEST&quot;
NORTH_NORTHWEST | &quot;NORTH_NORTHWEST&quot;
UP | &quot;UP&quot;
DOWN | &quot;DOWN&quot;
NONE | &quot;NONE&quot;


<a name="MatterEnum"></a>
## Enum: MatterEnum
Name | Value
---- | -----
SOLID | &quot;SOLID&quot;
LIQUID | &quot;LIQUID&quot;
GAS | &quot;GAS&quot;



