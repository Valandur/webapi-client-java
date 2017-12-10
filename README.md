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
import io.swagger.client.api.BlockApi;

import java.io.File;
import java.util.*;

public class BlockApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: headerKey
        ApiKeyAuth headerKey = (ApiKeyAuth) defaultClient.getAuthentication("headerKey");
        headerKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //headerKey.setApiKeyPrefix("Token");

        // Configure API key authorization: queryKey
        ApiKeyAuth queryKey = (ApiKeyAuth) defaultClient.getAuthentication("queryKey");
        queryKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //queryKey.setApiKeyPrefix("Token");

        BlockApi apiInstance = new BlockApi();
        String uuid = "uuid_example"; // String | The uuid of the block operation.
        try {
            BlockOperationResponse result = apiInstance.cancelBlockOperation(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockApi#cancelBlockOperation");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://&lt;host&gt;/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlockApi* | [**cancelBlockOperation**](docs/BlockApi.md#cancelBlockOperation) | **DELETE** /block/op/{uuid} | Cancel block operation
*BlockApi* | [**changeBlockOperation**](docs/BlockApi.md#changeBlockOperation) | **PUT** /block/op/{uuid} | Modify block operation
*BlockApi* | [**getBlock**](docs/BlockApi.md#getBlock) | **GET** /block/{world}/{x}/{y}/{z} | Get one block
*BlockApi* | [**getBlockOperation**](docs/BlockApi.md#getBlockOperation) | **GET** /block/op/{uuid} | Block operation details
*BlockApi* | [**getBlockOperations**](docs/BlockApi.md#getBlockOperations) | **GET** /block/op | List block operations
*BlockApi* | [**startBlockOperation**](docs/BlockApi.md#startBlockOperation) | **POST** /block/op | Create block operation
*ChunkApi* | [**getChunk**](docs/ChunkApi.md#getChunk) | **GET** /world/{uuid}/chunk/{x}/{z} | Detailed chunk info
*ChunkApi* | [**getChunks**](docs/ChunkApi.md#getChunks) | **GET** /world/{uuid}/chunk | Loaded chunk list
*CommandApi* | [**executeCommand**](docs/CommandApi.md#executeCommand) | **POST** /cmd | Execute command
*CommandApi* | [**getCommand**](docs/CommandApi.md#getCommand) | **GET** /cmd/{name} | Detailed command info
*CommandApi* | [**getCommands**](docs/CommandApi.md#getCommands) | **GET** /cmd | Command list
*EntityApi* | [**changeEntity**](docs/EntityApi.md#changeEntity) | **PUT** /entity/{uuid} | Edit entity
*EntityApi* | [**createEntity**](docs/EntityApi.md#createEntity) | **POST** /entity | Create an entity
*EntityApi* | [**destroyEntity**](docs/EntityApi.md#destroyEntity) | **DELETE** /entity/{uuid} | Destroy an entity
*EntityApi* | [**executeEntityMethod**](docs/EntityApi.md#executeEntityMethod) | **POST** /entity/{uuid} | Execute entity method
*EntityApi* | [**getEntities**](docs/EntityApi.md#getEntities) | **GET** /entity | Entities list
*EntityApi* | [**getEntity**](docs/EntityApi.md#getEntity) | **GET** /entity/{uuid} | Detailed entity info
*HistoryApi* | [**getChatHistory**](docs/HistoryApi.md#getChatHistory) | **GET** /history/chat | Chat History
*HistoryApi* | [**getCommandHistory**](docs/HistoryApi.md#getCommandHistory) | **GET** /history/cmd | Command History
*HuskyCratesApi* | [**getCrate**](docs/HuskyCratesApi.md#getCrate) | **GET** /husky/crate/{id} | Detailed crate info
*HuskyCratesApi* | [**getCrates**](docs/HuskyCratesApi.md#getCrates) | **GET** /husky/crate | Crate list
*InfoApi* | [**getInfo**](docs/InfoApi.md#getInfo) | **GET** /info | Server info
*MMCTicketsApi* | [**changeTicket**](docs/MMCTicketsApi.md#changeTicket) | **PUT** /mmctickets/ticket/{id} | Edit ticket
*MMCTicketsApi* | [**getTicket**](docs/MMCTicketsApi.md#getTicket) | **GET** /mmctickets/ticket/{id} | Detailed ticket info
*MMCTicketsApi* | [**getTickets**](docs/MMCTicketsApi.md#getTickets) | **GET** /mmctickets/ticket | Ticket list
*MessageApi* | [**getMessage**](docs/MessageApi.md#getMessage) | **GET** /message/{uuid} | Detailed message info
*MessageApi* | [**getMessages**](docs/MessageApi.md#getMessages) | **GET** /message | Message list
*MessageApi* | [**sendMessage**](docs/MessageApi.md#sendMessage) | **POST** /message | Send an interactive message
*NationsApi* | [**getNation**](docs/NationsApi.md#getNation) | **GET** /nations/nation/{id} | Detailed nation info
*NationsApi* | [**getNations**](docs/NationsApi.md#getNations) | **GET** /nations/nation | Nations list
*NucleusApi* | [**getJail**](docs/NucleusApi.md#getJail) | **GET** /nucleus/jail/{name} | Detailed jail info
*NucleusApi* | [**getJails**](docs/NucleusApi.md#getJails) | **GET** /nucleus/jail | Jail list
*NucleusApi* | [**getKit**](docs/NucleusApi.md#getKit) | **GET** /nucleus/kit/{name} | Detailed kit info
*NucleusApi* | [**getKits**](docs/NucleusApi.md#getKits) | **GET** /nucleus/kit | Kit list
*PlayerApi* | [**changePlayer**](docs/PlayerApi.md#changePlayer) | **PUT** /player/{uuid} | Edit player
*PlayerApi* | [**executePlayerMethod**](docs/PlayerApi.md#executePlayerMethod) | **POST** /player/{uuid} | Execute player method
*PlayerApi* | [**getPlayer**](docs/PlayerApi.md#getPlayer) | **GET** /player/{uuid} | Detailed player info
*PlayerApi* | [**getPlayers**](docs/PlayerApi.md#getPlayers) | **GET** /player | Player list
*PluginApi* | [**getPlugin**](docs/PluginApi.md#getPlugin) | **GET** /plugin/{id} | Detailed plugin info
*PluginApi* | [**getPlugins**](docs/PluginApi.md#getPlugins) | **GET** /plugin | Plugin list
*RegistryApi* | [**getCatalogValues**](docs/RegistryApi.md#getCatalogValues) | **GET** /registry/{className} | List catalog values
*ServletApi* | [**getLoadedServlets**](docs/ServletApi.md#getLoadedServlets) | **GET** /servlet | Loaded servlets
*TileEntityApi* | [**executeTileEntityMethod**](docs/TileEntityApi.md#executeTileEntityMethod) | **POST** /tile-entity/{worldUuid}/{x}/{y}/{z} | Execute tile entity methods
*TileEntityApi* | [**getTileEntities**](docs/TileEntityApi.md#getTileEntities) | **GET** /tile-entity | Tile entities list
*TileEntityApi* | [**getTileEntity**](docs/TileEntityApi.md#getTileEntity) | **GET** /tile-entity/{worldUuid}/{x}/{y}/{z} | Detailed tile entity info
*UserApi* | [**checkUser**](docs/UserApi.md#checkUser) | **GET** /user | Check a user key
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /user | Login
*WorldApi* | [**changeWorld**](docs/WorldApi.md#changeWorld) | **PUT** /world/{uuid} | Edit world
*WorldApi* | [**createWorld**](docs/WorldApi.md#createWorld) | **POST** /world | Create a world
*WorldApi* | [**deleteWorld**](docs/WorldApi.md#deleteWorld) | **DELETE** /world/{uuid} | Delete a world
*WorldApi* | [**executeWorldMethod**](docs/WorldApi.md#executeWorldMethod) | **POST** /world/{uuid} | Execute world methods
*WorldApi* | [**getChunk**](docs/WorldApi.md#getChunk) | **GET** /world/{uuid}/chunk/{x}/{z} | Detailed chunk info
*WorldApi* | [**getChunks**](docs/WorldApi.md#getChunks) | **GET** /world/{uuid}/chunk | Loaded chunk list
*WorldApi* | [**getWorld**](docs/WorldApi.md#getWorld) | **GET** /world/{uuid} | Detailed world info
*WorldApi* | [**getWorlds**](docs/WorldApi.md#getWorlds) | **GET** /world | World list


## Documentation for Models

 - [BlockFull](docs/BlockFull.md)
 - [BlockOperation](docs/BlockOperation.md)
 - [BlockOperationNew](docs/BlockOperationNew.md)
 - [BlockOperationResponse](docs/BlockOperationResponse.md)
 - [BlockOperationsList](docs/BlockOperationsList.md)
 - [CatalogType](docs/CatalogType.md)
 - [CatalogTypesResponse](docs/CatalogTypesResponse.md)
 - [ChatHistoryResponse](docs/ChatHistoryResponse.md)
 - [ChatMessage](docs/ChatMessage.md)
 - [Chunk](docs/Chunk.md)
 - [ChunkResponse](docs/ChunkResponse.md)
 - [ChunksResponse](docs/ChunksResponse.md)
 - [Command](docs/Command.md)
 - [CommandCall](docs/CommandCall.md)
 - [CommandHistoryResponse](docs/CommandHistoryResponse.md)
 - [CommandRequest](docs/CommandRequest.md)
 - [CommandResponse](docs/CommandResponse.md)
 - [CommandResponse1](docs/CommandResponse1.md)
 - [CommandResult](docs/CommandResult.md)
 - [CommandsResponse](docs/CommandsResponse.md)
 - [CreateEntityRequest](docs/CreateEntityRequest.md)
 - [CreateWorldRequest](docs/CreateWorldRequest.md)
 - [DamageRequest](docs/DamageRequest.md)
 - [DamageRequest1](docs/DamageRequest1.md)
 - [Data](docs/Data.md)
 - [EntitiesList](docs/EntitiesList.md)
 - [Entity](docs/Entity.md)
 - [EntityMethodResult](docs/EntityMethodResult.md)
 - [EntityResponse](docs/EntityResponse.md)
 - [ExecuteCommandResponse](docs/ExecuteCommandResponse.md)
 - [ExecutePlayerMethodResponse](docs/ExecutePlayerMethodResponse.md)
 - [ExecuteTileEntityMethodResponse](docs/ExecuteTileEntityMethodResponse.md)
 - [ExecuteWorldMethodResponse](docs/ExecuteWorldMethodResponse.md)
 - [HuskyCrate](docs/HuskyCrate.md)
 - [HuskyCrateFullRewards](docs/HuskyCrateFullRewards.md)
 - [HuskyCrateResponse](docs/HuskyCrateResponse.md)
 - [HuskyCratesResponse](docs/HuskyCratesResponse.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [Inventory](docs/Inventory.md)
 - [ItemStack](docs/ItemStack.md)
 - [Location](docs/Location.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [MMCTicket](docs/MMCTicket.md)
 - [MMCTicketsTicketResponse](docs/MMCTicketsTicketResponse.md)
 - [MMCTicketsTicketsResponse](docs/MMCTicketsTicketsResponse.md)
 - [MMCUpdateTicketRequest](docs/MMCUpdateTicketRequest.md)
 - [Message](docs/Message.md)
 - [MessageOption](docs/MessageOption.md)
 - [MessageRequest](docs/MessageRequest.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [MessagesResponse](docs/MessagesResponse.md)
 - [NationsNation](docs/NationsNation.md)
 - [NationsNationResponse](docs/NationsNationResponse.md)
 - [NationsNationsResponse](docs/NationsNationsResponse.md)
 - [NationsRect](docs/NationsRect.md)
 - [NationsZone](docs/NationsZone.md)
 - [NucleusJailFull](docs/NucleusJailFull.md)
 - [NucleusJailResponse](docs/NucleusJailResponse.md)
 - [NucleusJailsResponse](docs/NucleusJailsResponse.md)
 - [NucleusKit](docs/NucleusKit.md)
 - [NucleusKitResponse](docs/NucleusKitResponse.md)
 - [NucleusKitsResponse](docs/NucleusKitsResponse.md)
 - [Player](docs/Player.md)
 - [PlayerFullAchievements](docs/PlayerFullAchievements.md)
 - [PlayerFullArmour](docs/PlayerFullArmour.md)
 - [PlayerFullConnection](docs/PlayerFullConnection.md)
 - [PlayerFullExperience](docs/PlayerFullExperience.md)
 - [PlayerFullFood](docs/PlayerFullFood.md)
 - [PlayerFullHealth](docs/PlayerFullHealth.md)
 - [PlayerFullJoined](docs/PlayerFullJoined.md)
 - [PlayerResponse](docs/PlayerResponse.md)
 - [PlayersList](docs/PlayersList.md)
 - [Plugin](docs/Plugin.md)
 - [PluginResponse](docs/PluginResponse.md)
 - [PluginsResponse](docs/PluginsResponse.md)
 - [RawRequest](docs/RawRequest.md)
 - [RawRequestParam](docs/RawRequestParam.md)
 - [RawResponse](docs/RawResponse.md)
 - [ServerInfo](docs/ServerInfo.md)
 - [ServerInfoDetail](docs/ServerInfoDetail.md)
 - [ServletsResponse](docs/ServletsResponse.md)
 - [SingleBlock](docs/SingleBlock.md)
 - [TileEntitiesResponse](docs/TileEntitiesResponse.md)
 - [TileEntity](docs/TileEntity.md)
 - [TileEntityResponse](docs/TileEntityResponse.md)
 - [UpdateEntityRequest](docs/UpdateEntityRequest.md)
 - [UpdatePlayerRequest](docs/UpdatePlayerRequest.md)
 - [UpdateWorldRequest](docs/UpdateWorldRequest.md)
 - [User](docs/User.md)
 - [UserResponse](docs/UserResponse.md)
 - [Vector3](docs/Vector3.md)
 - [World](docs/World.md)
 - [WorldFullBorder](docs/WorldFullBorder.md)
 - [WorldFullDimension](docs/WorldFullDimension.md)
 - [WorldFullDimensionType](docs/WorldFullDimensionType.md)
 - [WorldFullGenerator](docs/WorldFullGenerator.md)
 - [WorldResponse](docs/WorldResponse.md)
 - [WorldsResponse](docs/WorldsResponse.md)
 - [BlockOperationFull](docs/BlockOperationFull.md)
 - [ChunkFull](docs/ChunkFull.md)
 - [CommandFull](docs/CommandFull.md)
 - [EntityFull](docs/EntityFull.md)
 - [HuskyCrateFull](docs/HuskyCrateFull.md)
 - [MMCTicketFull](docs/MMCTicketFull.md)
 - [MessageFull](docs/MessageFull.md)
 - [NationsNationFull](docs/NationsNationFull.md)
 - [NucleusKitFull](docs/NucleusKitFull.md)
 - [PlayerFull](docs/PlayerFull.md)
 - [PluginFull](docs/PluginFull.md)
 - [TileEntityFull](docs/TileEntityFull.md)
 - [WorldFull](docs/WorldFull.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### headerKey

- **Type**: API key
- **API key parameter name**: x-webapi-key
- **Location**: HTTP header

### queryKey

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



