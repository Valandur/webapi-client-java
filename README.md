# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ActiveTimeApi;

import java.io.File;
import java.util.*;

public class ActiveTimeApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: ApiKeyHeader
        ApiKeyAuth ApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyHeader");
        ApiKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyHeader.setApiKeyPrefix("Token");

        // Configure API key authorization: ApiKeyQuery
        ApiKeyAuth ApiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyQuery");
        ApiKeyQuery.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyQuery.setApiKeyPrefix("Token");

        ActiveTimeApi apiInstance = new ActiveTimeApi();
        Boolean details = true; // Boolean | Add to include additional details, omit or false otherwise
        String accept = "accept_example"; // String | Override the 'Accept' request header (useful for debugging your requests)
        Boolean pretty = true; // Boolean | Add to make the Web-API pretty print the response (useful for debugging your requests)
        try {
            ServerReport result = apiInstance.getServerReport(details, accept, pretty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveTimeApi#getServerReport");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api/v5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActiveTimeApi* | [**getServerReport**](docs/ActiveTimeApi.md#getServerReport) | **GET** /active-time | Server report
*ActiveTimeApi* | [**getUserReport**](docs/ActiveTimeApi.md#getUserReport) | **GET** /active-time/user/{uuid} | User report
*BlockApi* | [**createBlockOperation**](docs/BlockApi.md#createBlockOperation) | **POST** /block/op | Create a block operation
*BlockApi* | [**deleteBlockOperation**](docs/BlockApi.md#deleteBlockOperation) | **DELETE** /block/op/{uuid} | Stop a block operation
*BlockApi* | [**getBlock**](docs/BlockApi.md#getBlock) | **GET** /block/{world}/{x}/{y}/{z} | Get a block
*BlockApi* | [**getBlockOperation**](docs/BlockApi.md#getBlockOperation) | **GET** /block/op/{uuid} | Get a block operation
*BlockApi* | [**listBlockOperations**](docs/BlockApi.md#listBlockOperations) | **GET** /block/op | List block operations
*BlockApi* | [**modifyBlockOperation**](docs/BlockApi.md#modifyBlockOperation) | **PUT** /block/op/{uuid} | Modify a block operation
*ChunkApi* | [**createChunkAt**](docs/ChunkApi.md#createChunkAt) | **POST** /chunk/{world}/{x}/{z} | Load &amp; Generate a chunk
*ChunkApi* | [**getChunkAt**](docs/ChunkApi.md#getChunkAt) | **GET** /chunk/{world}/{x}/{z} | Get a chunk
*ChunkApi* | [**listChunks**](docs/ChunkApi.md#listChunks) | **GET** /chunk/{world} | List chunks
*CmdSchedulerApi* | [**deleteTask**](docs/CmdSchedulerApi.md#deleteTask) | **DELETE** /cmd-scheduler/{name} | Delete a task
*CmdSchedulerApi* | [**listTasks**](docs/CmdSchedulerApi.md#listTasks) | **GET** /cmd-scheduler | List tasks
*CommandApi* | [**getCommand**](docs/CommandApi.md#getCommand) | **GET** /cmd/{cmd} | Get a command
*CommandApi* | [**listCommands**](docs/CommandApi.md#listCommands) | **GET** /cmd | List commands
*CommandApi* | [**runCommands**](docs/CommandApi.md#runCommands) | **POST** /cmd | Execute a command
*EconomyApi* | [**getAccount**](docs/EconomyApi.md#getAccount) | **GET** /economy/account/{id} | List currencies
*EconomyApi* | [**getCurrencies**](docs/EconomyApi.md#getCurrencies) | **GET** /economy/currency | List currencies
*EntityApi* | [**createEntity**](docs/EntityApi.md#createEntity) | **POST** /entity | Spawn an entity
*EntityApi* | [**executeMethod**](docs/EntityApi.md#executeMethod) | **POST** /entity/{entity}/method | Execute a method
*EntityApi* | [**getEntity**](docs/EntityApi.md#getEntity) | **GET** /entity/{entity} | Get entity
*EntityApi* | [**listEntities**](docs/EntityApi.md#listEntities) | **GET** /entity | List entities
*EntityApi* | [**modifyEntity**](docs/EntityApi.md#modifyEntity) | **PUT** /entity/{entity} | Modify an entity
*EntityApi* | [**removeEntity**](docs/EntityApi.md#removeEntity) | **DELETE** /entity/{entity} | Destroy an entity
*GwmCratesApi* | [**listCrates**](docs/GwmCratesApi.md#listCrates) | **GET** /gwm-crates/manager | List managers
*HistoryApi* | [**getChat**](docs/HistoryApi.md#getChat) | **GET** /history/message | Get message history
*HistoryApi* | [**getCommands**](docs/HistoryApi.md#getCommands) | **GET** /history/cmd | Get command history
*HuskyCratesApi* | [**createCrate**](docs/HuskyCratesApi.md#createCrate) | **POST** /husky-crates/crate | Create a crate
*HuskyCratesApi* | [**deleteCrate**](docs/HuskyCratesApi.md#deleteCrate) | **DELETE** /husky-crates/crate/{id} | Delete a crate
*HuskyCratesApi* | [**getCrate**](docs/HuskyCratesApi.md#getCrate) | **GET** /husky-crates/crate/{id} | Get a crate
*HuskyCratesApi* | [**listCrates**](docs/HuskyCratesApi.md#listCrates) | **GET** /husky-crates/crate | List crates
*HuskyCratesApi* | [**modifyCrate**](docs/HuskyCratesApi.md#modifyCrate) | **PUT** /husky-crates/crate/{id} | Change a crate
*InfoApi* | [**getInfo**](docs/InfoApi.md#getInfo) | **GET** /info | Server info
*InfoApi* | [**getStats**](docs/InfoApi.md#getStats) | **GET** /info/stats | Server stats
*InfoApi* | [**listServlets**](docs/InfoApi.md#listServlets) | **GET** /info/servlets | List servlets
*InteractiveMessageApi* | [**getMessage**](docs/InteractiveMessageApi.md#getMessage) | **GET** /interactive-message/{uuid} | Get a message
*InteractiveMessageApi* | [**listMessages**](docs/InteractiveMessageApi.md#listMessages) | **GET** /interactive-message | List messages
*InteractiveMessageApi* | [**sendMessage**](docs/InteractiveMessageApi.md#sendMessage) | **POST** /interactive-message | Send a message
*MapApi* | [**getMap**](docs/MapApi.md#getMap) | **GET** /map/{world}/{x}/{z} | Get a map tile
*MmcRestrictApi* | [**addItem**](docs/MmcRestrictApi.md#addItem) | **POST** /mmc-restrict/item | Add an item
*MmcRestrictApi* | [**deleteItem**](docs/MmcRestrictApi.md#deleteItem) | **DELETE** /mmc-restrict/item/{id} | Delete an item
*MmcRestrictApi* | [**listItems**](docs/MmcRestrictApi.md#listItems) | **GET** /mmc-restrict/item | List items
*MmcRestrictApi* | [**modifyItem**](docs/MmcRestrictApi.md#modifyItem) | **PUT** /mmc-restrict/item/{id} | Modify an item
*MmcTicketsApi* | [**getTicket**](docs/MmcTicketsApi.md#getTicket) | **GET** /mmc-tickets/ticket/{id} | Get a ticket
*MmcTicketsApi* | [**listTickets**](docs/MmcTicketsApi.md#listTickets) | **GET** /mmc-tickets/ticket | List tickets
*MmcTicketsApi* | [**modifyTicket**](docs/MmcTicketsApi.md#modifyTicket) | **PUT** /mmc-tickets/ticket/{id} | Modify a ticket
*NucleusApi* | [**createJail**](docs/NucleusApi.md#createJail) | **POST** /nucleus/jail | Create a jail
*NucleusApi* | [**createKit**](docs/NucleusApi.md#createKit) | **POST** /nucleus/kit | Create a kit
*NucleusApi* | [**deleteJail**](docs/NucleusApi.md#deleteJail) | **DELETE** /nucleus/jail/{name} | Delete a jail
*NucleusApi* | [**deleteKit**](docs/NucleusApi.md#deleteKit) | **DELETE** /nucleus/kit/{name} | Delete a kit
*NucleusApi* | [**getJail**](docs/NucleusApi.md#getJail) | **GET** /nucleus/jail/{name} | Get a jail
*NucleusApi* | [**getKit**](docs/NucleusApi.md#getKit) | **GET** /nucleus/kit/{name} | Get a kit
*NucleusApi* | [**listHomes**](docs/NucleusApi.md#listHomes) | **GET** /nucleus/home/{player} | List homes
*NucleusApi* | [**listJails**](docs/NucleusApi.md#listJails) | **GET** /nucleus/jail | List jails
*NucleusApi* | [**listKits**](docs/NucleusApi.md#listKits) | **GET** /nucleus/kit | List kits
*NucleusApi* | [**listMail**](docs/NucleusApi.md#listMail) | **GET** /nucleus/mail/{player} | List mail
*NucleusApi* | [**listMail_0**](docs/NucleusApi.md#listMail_0) | **GET** /nucleus/module | List modules
*NucleusApi* | [**modifyJail**](docs/NucleusApi.md#modifyJail) | **PUT** /nucleus/jail/{name} | Modify a jail
*NucleusApi* | [**modifyKit**](docs/NucleusApi.md#modifyKit) | **PUT** /nucleus/kit/{name} | Modify a kit
*PermissionApi* | [**getCollection**](docs/PermissionApi.md#getCollection) | **GET** /permission/collection/{id} | Get collection
*PermissionApi* | [**getSubject**](docs/PermissionApi.md#getSubject) | **GET** /permission/collection/{id}/subject/{subId} | Get subject
*PermissionApi* | [**listCollections**](docs/PermissionApi.md#listCollections) | **GET** /permission/collection | List collections
*PermissionApi* | [**listSubjects**](docs/PermissionApi.md#listSubjects) | **GET** /permission/collection/{id}/subject | List subjects
*PlayerApi* | [**executeMethod**](docs/PlayerApi.md#executeMethod) | **POST** /player/{player}/method | Execute a method
*PlayerApi* | [**getPlayer**](docs/PlayerApi.md#getPlayer) | **GET** /player/{player} | Get a player
*PlayerApi* | [**listPlayers**](docs/PlayerApi.md#listPlayers) | **GET** /player | List players
*PlayerApi* | [**modifyPlayer**](docs/PlayerApi.md#modifyPlayer) | **PUT** /player/{player} | Modify a player
*PluginApi* | [**changePluginConfig**](docs/PluginApi.md#changePluginConfig) | **POST** /plugin/{plugin}/config | Change plugin configs
*PluginApi* | [**getPlugin**](docs/PluginApi.md#getPlugin) | **GET** /plugin/{plugin} | Get a plugin
*PluginApi* | [**getPluginConfig**](docs/PluginApi.md#getPluginConfig) | **GET** /plugin/{plugin}/config | Get plugin configs
*PluginApi* | [**listPlugins**](docs/PluginApi.md#listPlugins) | **GET** /plugin | List plugins
*PluginApi* | [**togglePlugin**](docs/PluginApi.md#togglePlugin) | **PUT** /plugin/{plugin} | Toggle a plugin
*RecipeApi* | [**listRecipes**](docs/RecipeApi.md#listRecipes) | **GET** /recipe | List recipes
*RedProtectApi* | [**createRegion**](docs/RedProtectApi.md#createRegion) | **POST** /red-protect/region | Create a region
*RedProtectApi* | [**deleteRegion**](docs/RedProtectApi.md#deleteRegion) | **DELETE** /red-protect/region/{id} | Delete a region
*RedProtectApi* | [**getRegion**](docs/RedProtectApi.md#getRegion) | **GET** /red-protect/region/{id} | Get a region
*RedProtectApi* | [**listRegions**](docs/RedProtectApi.md#listRegions) | **GET** /red-protect/region | List regions
*RedProtectApi* | [**modifyRegion**](docs/RedProtectApi.md#modifyRegion) | **PUT** /red-protect/region/{id} | Modify a region
*RegistryApi* | [**getRegistry**](docs/RegistryApi.md#getRegistry) | **GET** /registry/{class} | Get a catalog type
*ServerApi* | [**listProperties**](docs/ServerApi.md#listProperties) | **GET** /server/properties | List server properties
*ServerApi* | [**modifyProperties**](docs/ServerApi.md#modifyProperties) | **PUT** /server/properties | Modify server properties
*TileEntityApi* | [**executeMethod**](docs/TileEntityApi.md#executeMethod) | **POST** /tile-entity/{world}/{x}/{y}/{z}/method | Execute a method
*TileEntityApi* | [**getTileEntity**](docs/TileEntityApi.md#getTileEntity) | **GET** /tile-entity/{world}/{x}/{y}/{z} | Get tile entity
*TileEntityApi* | [**listTileEntities**](docs/TileEntityApi.md#listTileEntities) | **GET** /tile-entity | List tile entities
*TileEntityApi* | [**modifyTileEntity**](docs/TileEntityApi.md#modifyTileEntity) | **PUT** /tile-entity/{world}/{x}/{y}/{z} | Modify tile entity
*UniversalMarketApi* | [**listMarketItems**](docs/UniversalMarketApi.md#listMarketItems) | **GET** /universal-market/item | List items
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /user | Create a user
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /user/{name} | Delete a user
*UserApi* | [**getMe**](docs/UserApi.md#getMe) | **GET** /user/me | Check info
*UserApi* | [**getUsers**](docs/UserApi.md#getUsers) | **GET** /user | List users
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /user/login | Login
*UserApi* | [**logout**](docs/UserApi.md#logout) | **POST** /user/logout | Logout
*UserApi* | [**logoutRedirect**](docs/UserApi.md#logoutRedirect) | **GET** /user/logout | 
*UserApi* | [**modifyUser**](docs/UserApi.md#modifyUser) | **PUT** /user/{name} | Update a user
*WebBooksApi* | [**createWebBook**](docs/WebBooksApi.md#createWebBook) | **POST** /web-books/book | Create a book
*WebBooksApi* | [**deleteWebBook**](docs/WebBooksApi.md#deleteWebBook) | **DELETE** /web-books/book/{id} | Delete a book
*WebBooksApi* | [**getWebBook**](docs/WebBooksApi.md#getWebBook) | **GET** /web-books/book/{id} | Get a book
*WebBooksApi* | [**getWebBookContent**](docs/WebBooksApi.md#getWebBookContent) | **GET** /web-books/book/{id}/html | Book HTML
*WebBooksApi* | [**getWebBookContentPost**](docs/WebBooksApi.md#getWebBookContentPost) | **POST** /web-books/book/{id}/html | Book HTML
*WebBooksApi* | [**listWebBooks**](docs/WebBooksApi.md#listWebBooks) | **GET** /web-books/book | List books
*WebBooksApi* | [**modifyWebBook**](docs/WebBooksApi.md#modifyWebBook) | **PUT** /web-books/book/{id} | Modify a book
*WorldApi* | [**createWorld**](docs/WorldApi.md#createWorld) | **POST** /world | Create a world
*WorldApi* | [**deleteWorld**](docs/WorldApi.md#deleteWorld) | **DELETE** /world/{world} | Delete a world
*WorldApi* | [**executeMethod**](docs/WorldApi.md#executeMethod) | **POST** /world/{world}/method | Execute a method
*WorldApi* | [**getWorld**](docs/WorldApi.md#getWorld) | **GET** /world/{world} | Get a world
*WorldApi* | [**listWorlds**](docs/WorldApi.md#listWorlds) | **GET** /world | List worlds
*WorldApi* | [**modifyWorld**](docs/WorldApi.md#modifyWorld) | **PUT** /world/{world} | Modify a world


## Documentation for Models

 - [AcceptsItems](docs/AcceptsItems.md)
 - [Account](docs/Account.md)
 - [Advancement](docs/Advancement.md)
 - [AgeableData](docs/AgeableData.md)
 - [ArmorSlotType](docs/ArmorSlotType.md)
 - [ArmorStandData](docs/ArmorStandData.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [BannerData](docs/BannerData.md)
 - [BeaconData](docs/BeaconData.md)
 - [BlockOperation](docs/BlockOperation.md)
 - [BlockState](docs/BlockState.md)
 - [BreathingData](docs/BreathingData.md)
 - [BrewingStandData](docs/BrewingStandData.md)
 - [CachedObject](docs/CachedObject.md)
 - [Career](docs/Career.md)
 - [CatalogType](docs/CatalogType.md)
 - [CatalogTypeAdvancementTree](docs/CatalogTypeAdvancementTree.md)
 - [CatalogTypeDifficulty](docs/CatalogTypeDifficulty.md)
 - [CatalogTypeDimensionType](docs/CatalogTypeDimensionType.md)
 - [CatalogTypeGameMode](docs/CatalogTypeGameMode.md)
 - [CatalogTypeGeneratorType](docs/CatalogTypeGeneratorType.md)
 - [CatalogTypeInventoryArchetype](docs/CatalogTypeInventoryArchetype.md)
 - [CatalogTypeItemType](docs/CatalogTypeItemType.md)
 - [CatalogTypeSoundType](docs/CatalogTypeSoundType.md)
 - [CatalogTypeWeather](docs/CatalogTypeWeather.md)
 - [Cause](docs/Cause.md)
 - [Chunk](docs/Chunk.md)
 - [Color](docs/Color.md)
 - [Command](docs/Command.md)
 - [CommandCall](docs/CommandCall.md)
 - [CommandData](docs/CommandData.md)
 - [CommandResult](docs/CommandResult.md)
 - [CommandTask](docs/CommandTask.md)
 - [CreateBlockOperationRequest](docs/CreateBlockOperationRequest.md)
 - [CreateEntityRequest](docs/CreateEntityRequest.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [CreateWorldRequest](docs/CreateWorldRequest.md)
 - [Currency](docs/Currency.md)
 - [DamageRequest](docs/DamageRequest.md)
 - [DamageableData](docs/DamageableData.md)
 - [DespawnDelayData](docs/DespawnDelayData.md)
 - [DurabilityData](docs/DurabilityData.md)
 - [DyeColor](docs/DyeColor.md)
 - [Enchantment](docs/Enchantment.md)
 - [EndGatewayData](docs/EndGatewayData.md)
 - [Entity](docs/Entity.md)
 - [EntityArchtype](docs/EntityArchtype.md)
 - [EntitySnapshot](docs/EntitySnapshot.md)
 - [EquipmentSlotType](docs/EquipmentSlotType.md)
 - [ExecuteCommandRequest](docs/ExecuteCommandRequest.md)
 - [ExecuteCommandResponse](docs/ExecuteCommandResponse.md)
 - [ExecuteMethodParam](docs/ExecuteMethodParam.md)
 - [ExecuteMethodRequest](docs/ExecuteMethodRequest.md)
 - [ExecuteMethodResponse](docs/ExecuteMethodResponse.md)
 - [ExperienceHolderData](docs/ExperienceHolderData.md)
 - [FallingBlockData](docs/FallingBlockData.md)
 - [FireworkEffect](docs/FireworkEffect.md)
 - [FireworkRocketData](docs/FireworkRocketData.md)
 - [FluidStack](docs/FluidStack.md)
 - [FoodData](docs/FoodData.md)
 - [FurnaceData](docs/FurnaceData.md)
 - [FuseData](docs/FuseData.md)
 - [GameMode](docs/GameMode.md)
 - [GrowthData](docs/GrowthData.md)
 - [GuiIdProperty](docs/GuiIdProperty.md)
 - [HealthData](docs/HealthData.md)
 - [HideData](docs/HideData.md)
 - [HorseData](docs/HorseData.md)
 - [HuskyCratesCrate](docs/HuskyCratesCrate.md)
 - [HuskyCratesCrateReward](docs/HuskyCratesCrateReward.md)
 - [HuskyCratesCrateRewardObject](docs/HuskyCratesCrateRewardObject.md)
 - [Identifiable](docs/Identifiable.md)
 - [IgniteableData](docs/IgniteableData.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [InlineResponse403](docs/InlineResponse403.md)
 - [InlineResponse404](docs/InlineResponse404.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [InlineResponse501](docs/InlineResponse501.md)
 - [InteractiveMessage](docs/InteractiveMessage.md)
 - [InteractiveMessageOption](docs/InteractiveMessageOption.md)
 - [Inventory](docs/Inventory.md)
 - [InventoryCapacity](docs/InventoryCapacity.md)
 - [InventoryDimension](docs/InventoryDimension.md)
 - [InventoryTitle](docs/InventoryTitle.md)
 - [InvisibilityData](docs/InvisibilityData.md)
 - [InvulnerabilityData](docs/InvulnerabilityData.md)
 - [ItemStack](docs/ItemStack.md)
 - [JoinData](docs/JoinData.md)
 - [LeashData](docs/LeashData.md)
 - [Location](docs/Location.md)
 - [MMCRestrictItem](docs/MMCRestrictItem.md)
 - [MMCTicketsTicket](docs/MMCTicketsTicket.md)
 - [Message](docs/Message.md)
 - [MinecartBlockData](docs/MinecartBlockData.md)
 - [MobSpawnerData](docs/MobSpawnerData.md)
 - [ModifyBlockOperationRequest](docs/ModifyBlockOperationRequest.md)
 - [ModifyUserRequest](docs/ModifyUserRequest.md)
 - [NucleusKit](docs/NucleusKit.md)
 - [NucleusMailMessage](docs/NucleusMailMessage.md)
 - [NucleusNamedLocation](docs/NucleusNamedLocation.md)
 - [PatternLayer](docs/PatternLayer.md)
 - [PermissionStruct](docs/PermissionStruct.md)
 - [PickupDelayData](docs/PickupDelayData.md)
 - [Player](docs/Player.md)
 - [PluginContainer](docs/PluginContainer.md)
 - [PluginDependency](docs/PluginDependency.md)
 - [PotionEffect](docs/PotionEffect.md)
 - [RedProtectRegion](docs/RedProtectRegion.md)
 - [Schedule](docs/Schedule.md)
 - [ServerInfo](docs/ServerInfo.md)
 - [ServerProperty](docs/ServerProperty.md)
 - [ServerReport](docs/ServerReport.md)
 - [ServerStat](docs/ServerStat.md)
 - [ServerStatDouble](docs/ServerStatDouble.md)
 - [ServerStatInteger](docs/ServerStatInteger.md)
 - [ServerStats](docs/ServerStats.md)
 - [SlimeData](docs/SlimeData.md)
 - [Slot](docs/Slot.md)
 - [SlotIndex](docs/SlotIndex.md)
 - [SlotPos](docs/SlotPos.md)
 - [SlotRequest](docs/SlotRequest.md)
 - [SlotSide](docs/SlotSide.md)
 - [Stat](docs/Stat.md)
 - [StructureData](docs/StructureData.md)
 - [Subject](docs/Subject.md)
 - [SubjectCollection](docs/SubjectCollection.md)
 - [TableEntry](docs/TableEntry.md)
 - [TableEntryEntityArchetype](docs/TableEntryEntityArchetype.md)
 - [TameableData](docs/TameableData.md)
 - [TileEntity](docs/TileEntity.md)
 - [TimeHolder](docs/TimeHolder.md)
 - [TradeOffer](docs/TradeOffer.md)
 - [Transform](docs/Transform.md)
 - [UniversalMarketItem](docs/UniversalMarketItem.md)
 - [UpdateEntityRequest](docs/UpdateEntityRequest.md)
 - [UpdatePlayerRequest](docs/UpdatePlayerRequest.md)
 - [UpdateTileEntityRequest](docs/UpdateTileEntityRequest.md)
 - [UpdateWorldRequest](docs/UpdateWorldRequest.md)
 - [UserPermissionStruct](docs/UserPermissionStruct.md)
 - [UserReport](docs/UserReport.md)
 - [Vector2i](docs/Vector2i.md)
 - [Vector3d](docs/Vector3d.md)
 - [Vector3i](docs/Vector3i.md)
 - [VehicleData](docs/VehicleData.md)
 - [WebBooksBook](docs/WebBooksBook.md)
 - [WireAttachmentData](docs/WireAttachmentData.md)
 - [World](docs/World.md)
 - [WorldBorder](docs/WorldBorder.md)
 - [BlockChangeOperation](docs/BlockChangeOperation.md)
 - [BlockGetOperation](docs/BlockGetOperation.md)
 - [ChatMessage](docs/ChatMessage.md)
 - [HuskyCratesCommandReward](docs/HuskyCratesCommandReward.md)
 - [HuskyCratesItemReward](docs/HuskyCratesItemReward.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyHeader

- **Type**: API key
- **API key parameter name**: X-WebAPI-Key
- **Location**: HTTP header

### ApiKeyQuery

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

inithilian@gmail.com

