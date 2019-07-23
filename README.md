# Web-API - Java Client

Access Sponge powered Minecraft servers through a WebAPI

## Introduction

This is the documentation of the various API routes offered by the WebAPI plugin.  
This documentation assumes that you are familiar with the basic concepts of Web API's, such as `GET`, `PUT`, `POST` and `DELETE` methods, request `HEADERS` and `RESPONSE CODES` and `JSON` data.  
By default this documentation can be found at http:/localhost:8080 (while your minecraft server is running) and the various routes start with http:/localhost:8080/api/v5...  
As a quick test try reaching the route http:/localhost:8080/api/v5/info (remember that you can only access \\\"localhost\\\" routes on the server on which you are running minecraft). This route should show you basic information about your server, like the motd and player count.  

## List endpoints

Lots of objects offer an endpoint to list all objects (e.g. `GET: /world` to get all worlds). These endpoints return only the properties marked 'required' by default, because the list might be quite large. If you want to return ALL data for a list endpoint add the query parameter `details`, (e.g. `GET: /world?details`).  
> Remember that in this case the data returned by the endpoint might be quite large.  

## Debugging endpoints

Apart from the `?details` flag you can also pass some other flags for debugging purposes. Remember that you must include the first query parameter with `?`, and further ones with `&`:  
- `details`: Includes details for list endpoints  
- `accept=[json/xml]`: Manually set the accept content type. This is good for browser testing, **BUT DON'T USE THIS IN PRODUCTION, YOU CAN SUPPLY THE `Accepts` HEADER FOR THAT**  
- `pretty`: Pretty prints the data, also good for debugging in the browser.  

An example request might look like this: `http://localhost:8080/api/v5/world?details&accpet=json&pretty&key=MY-API-KEY`  

## Additional data

Certain endpoints (such as `/player`, `/entity` and `/tile-entity` have additional properties which are not documented here, because the data depends on the concrete object type (eg. `Sheep` have a wool color, others do not) and on the other plugins/mods that are running on your server which might add additional data.  
You can also find more information in the github docs (https:/github.com/Valandur/Web-API/tree/master/docs/DATA.md)

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
*HistoryApi* | [**getChat**](docs/HistoryApi.md#getChat) | **GET** /history/message | Get message history
*HistoryApi* | [**getCommands**](docs/HistoryApi.md#getCommands) | **GET** /history/cmd | Get command history
*InfoApi* | [**getInfo**](docs/InfoApi.md#getInfo) | **GET** /info | Server info
*InfoApi* | [**getStats**](docs/InfoApi.md#getStats) | **GET** /info/stats | Server stats
*InfoApi* | [**listServlets**](docs/InfoApi.md#listServlets) | **GET** /info/servlets | List servlets
*InteractiveMessageApi* | [**getMessage**](docs/InteractiveMessageApi.md#getMessage) | **GET** /interactive-message/{uuid} | Get a message
*InteractiveMessageApi* | [**listMessages**](docs/InteractiveMessageApi.md#listMessages) | **GET** /interactive-message | List messages
*InteractiveMessageApi* | [**sendMessage**](docs/InteractiveMessageApi.md#sendMessage) | **POST** /interactive-message | Send a message
*InventoryApi* | [**addElement**](docs/InventoryApi.md#addElement) | **POST** /megamenus/menu/{mid}/{page}/{y}/{x} | Add element
*InventoryApi* | [**closeRenderer**](docs/InventoryApi.md#closeRenderer) | **DELETE** /megamenus/render/{mid}/{viewer} | Close renderer
*InventoryApi* | [**createMenu**](docs/InventoryApi.md#createMenu) | **POST** /megamenus/menu | Create menu
*InventoryApi* | [**createRenderer**](docs/InventoryApi.md#createRenderer) | **POST** /megamenus/render/{mid} | Create menu
*InventoryApi* | [**deleteElement**](docs/InventoryApi.md#deleteElement) | **DELETE** /megamenus/menu/{mid}/{page}/{y}/{x} | Delete menu
*InventoryApi* | [**deleteMenu**](docs/InventoryApi.md#deleteMenu) | **DELETE** /megamenus/menu/{mid} | Delete menu
*InventoryApi* | [**deletePage**](docs/InventoryApi.md#deletePage) | **DELETE** /megamenus/menu/{mid}/{page} | Delete a page of elements
*InventoryApi* | [**deleteRenderer**](docs/InventoryApi.md#deleteRenderer) | **DELETE** /megamenus/renderer/{mid} | Delete menu
*InventoryApi* | [**findRenderer**](docs/InventoryApi.md#findRenderer) | **GET** /megamenus/render/find/{viewer} | Get the renderer for viewer
*InventoryApi* | [**getElement**](docs/InventoryApi.md#getElement) | **GET** /megamenus/menu/{mid}/{page}/{y}/{x} | Get menu
*InventoryApi* | [**getMenu**](docs/InventoryApi.md#getMenu) | **GET** /megamenus/menu/{mid} | Get menu
*InventoryApi* | [**getPage**](docs/InventoryApi.md#getPage) | **GET** /megamenus/menu/{mid}/{page} | Reads a single page of elements
*InventoryApi* | [**getRenderer**](docs/InventoryApi.md#getRenderer) | **GET** /megamenus/render/{mid} | Get the renderer for this menu
*InventoryApi* | [**listMenus**](docs/InventoryApi.md#listMenus) | **GET** /megamenus/menu | List menus
*InventoryApi* | [**listRenderer**](docs/InventoryApi.md#listRenderer) | **GET** /megamenus/render | List renderer
*InventoryApi* | [**openRenderer**](docs/InventoryApi.md#openRenderer) | **PUT** /megamenus/render/{mid}/{viewer} | Open renderer
*InventoryApi* | [**setElement**](docs/InventoryApi.md#setElement) | **PUT** /megamenus/menu/{mid}/{page}/{y}/{x} | Update menu
*InventoryApi* | [**setMenu**](docs/InventoryApi.md#setMenu) | **PUT** /megamenus/menu/{mid} | Update menu
*MapApi* | [**getMap**](docs/MapApi.md#getMap) | **GET** /map/{world}/{x}/{z} | Get a map tile
*MegaMenusApi* | [**addElement**](docs/MegaMenusApi.md#addElement) | **POST** /megamenus/menu/{mid}/{page}/{y}/{x} | Add element
*MegaMenusApi* | [**closeRenderer**](docs/MegaMenusApi.md#closeRenderer) | **DELETE** /megamenus/render/{mid}/{viewer} | Close renderer
*MegaMenusApi* | [**createMenu**](docs/MegaMenusApi.md#createMenu) | **POST** /megamenus/menu | Create menu
*MegaMenusApi* | [**createRenderer**](docs/MegaMenusApi.md#createRenderer) | **POST** /megamenus/render/{mid} | Create menu
*MegaMenusApi* | [**deleteElement**](docs/MegaMenusApi.md#deleteElement) | **DELETE** /megamenus/menu/{mid}/{page}/{y}/{x} | Delete menu
*MegaMenusApi* | [**deleteMenu**](docs/MegaMenusApi.md#deleteMenu) | **DELETE** /megamenus/menu/{mid} | Delete menu
*MegaMenusApi* | [**deletePage**](docs/MegaMenusApi.md#deletePage) | **DELETE** /megamenus/menu/{mid}/{page} | Delete a page of elements
*MegaMenusApi* | [**deleteRenderer**](docs/MegaMenusApi.md#deleteRenderer) | **DELETE** /megamenus/renderer/{mid} | Delete menu
*MegaMenusApi* | [**findRenderer**](docs/MegaMenusApi.md#findRenderer) | **GET** /megamenus/render/find/{viewer} | Get the renderer for viewer
*MegaMenusApi* | [**getElement**](docs/MegaMenusApi.md#getElement) | **GET** /megamenus/menu/{mid}/{page}/{y}/{x} | Get menu
*MegaMenusApi* | [**getMenu**](docs/MegaMenusApi.md#getMenu) | **GET** /megamenus/menu/{mid} | Get menu
*MegaMenusApi* | [**getPage**](docs/MegaMenusApi.md#getPage) | **GET** /megamenus/menu/{mid}/{page} | Reads a single page of elements
*MegaMenusApi* | [**getRenderer**](docs/MegaMenusApi.md#getRenderer) | **GET** /megamenus/render/{mid} | Get the renderer for this menu
*MegaMenusApi* | [**listMenus**](docs/MegaMenusApi.md#listMenus) | **GET** /megamenus/menu | List menus
*MegaMenusApi* | [**listRenderer**](docs/MegaMenusApi.md#listRenderer) | **GET** /megamenus/render | List renderer
*MegaMenusApi* | [**openRenderer**](docs/MegaMenusApi.md#openRenderer) | **PUT** /megamenus/render/{mid}/{viewer} | Open renderer
*MegaMenusApi* | [**setElement**](docs/MegaMenusApi.md#setElement) | **PUT** /megamenus/menu/{mid}/{page}/{y}/{x} | Update menu
*MegaMenusApi* | [**setMenu**](docs/MegaMenusApi.md#setMenu) | **PUT** /megamenus/menu/{mid} | Update menu
*MenuApi* | [**addElement**](docs/MenuApi.md#addElement) | **POST** /megamenus/menu/{mid}/{page}/{y}/{x} | Add element
*MenuApi* | [**closeRenderer**](docs/MenuApi.md#closeRenderer) | **DELETE** /megamenus/render/{mid}/{viewer} | Close renderer
*MenuApi* | [**createMenu**](docs/MenuApi.md#createMenu) | **POST** /megamenus/menu | Create menu
*MenuApi* | [**createRenderer**](docs/MenuApi.md#createRenderer) | **POST** /megamenus/render/{mid} | Create menu
*MenuApi* | [**deleteElement**](docs/MenuApi.md#deleteElement) | **DELETE** /megamenus/menu/{mid}/{page}/{y}/{x} | Delete menu
*MenuApi* | [**deleteMenu**](docs/MenuApi.md#deleteMenu) | **DELETE** /megamenus/menu/{mid} | Delete menu
*MenuApi* | [**deletePage**](docs/MenuApi.md#deletePage) | **DELETE** /megamenus/menu/{mid}/{page} | Delete a page of elements
*MenuApi* | [**deleteRenderer**](docs/MenuApi.md#deleteRenderer) | **DELETE** /megamenus/renderer/{mid} | Delete menu
*MenuApi* | [**findRenderer**](docs/MenuApi.md#findRenderer) | **GET** /megamenus/render/find/{viewer} | Get the renderer for viewer
*MenuApi* | [**getElement**](docs/MenuApi.md#getElement) | **GET** /megamenus/menu/{mid}/{page}/{y}/{x} | Get menu
*MenuApi* | [**getMenu**](docs/MenuApi.md#getMenu) | **GET** /megamenus/menu/{mid} | Get menu
*MenuApi* | [**getPage**](docs/MenuApi.md#getPage) | **GET** /megamenus/menu/{mid}/{page} | Reads a single page of elements
*MenuApi* | [**getRenderer**](docs/MenuApi.md#getRenderer) | **GET** /megamenus/render/{mid} | Get the renderer for this menu
*MenuApi* | [**listMenus**](docs/MenuApi.md#listMenus) | **GET** /megamenus/menu | List menus
*MenuApi* | [**listRenderer**](docs/MenuApi.md#listRenderer) | **GET** /megamenus/render | List renderer
*MenuApi* | [**openRenderer**](docs/MenuApi.md#openRenderer) | **PUT** /megamenus/render/{mid}/{viewer} | Open renderer
*MenuApi* | [**setElement**](docs/MenuApi.md#setElement) | **PUT** /megamenus/menu/{mid}/{page}/{y}/{x} | Update menu
*MenuApi* | [**setMenu**](docs/MenuApi.md#setMenu) | **PUT** /megamenus/menu/{mid} | Update menu
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
*UiApi* | [**addElement**](docs/UiApi.md#addElement) | **POST** /megamenus/menu/{mid}/{page}/{y}/{x} | Add element
*UiApi* | [**closeRenderer**](docs/UiApi.md#closeRenderer) | **DELETE** /megamenus/render/{mid}/{viewer} | Close renderer
*UiApi* | [**createMenu**](docs/UiApi.md#createMenu) | **POST** /megamenus/menu | Create menu
*UiApi* | [**createRenderer**](docs/UiApi.md#createRenderer) | **POST** /megamenus/render/{mid} | Create menu
*UiApi* | [**deleteElement**](docs/UiApi.md#deleteElement) | **DELETE** /megamenus/menu/{mid}/{page}/{y}/{x} | Delete menu
*UiApi* | [**deleteMenu**](docs/UiApi.md#deleteMenu) | **DELETE** /megamenus/menu/{mid} | Delete menu
*UiApi* | [**deletePage**](docs/UiApi.md#deletePage) | **DELETE** /megamenus/menu/{mid}/{page} | Delete a page of elements
*UiApi* | [**deleteRenderer**](docs/UiApi.md#deleteRenderer) | **DELETE** /megamenus/renderer/{mid} | Delete menu
*UiApi* | [**findRenderer**](docs/UiApi.md#findRenderer) | **GET** /megamenus/render/find/{viewer} | Get the renderer for viewer
*UiApi* | [**getElement**](docs/UiApi.md#getElement) | **GET** /megamenus/menu/{mid}/{page}/{y}/{x} | Get menu
*UiApi* | [**getMenu**](docs/UiApi.md#getMenu) | **GET** /megamenus/menu/{mid} | Get menu
*UiApi* | [**getPage**](docs/UiApi.md#getPage) | **GET** /megamenus/menu/{mid}/{page} | Reads a single page of elements
*UiApi* | [**getRenderer**](docs/UiApi.md#getRenderer) | **GET** /megamenus/render/{mid} | Get the renderer for this menu
*UiApi* | [**listMenus**](docs/UiApi.md#listMenus) | **GET** /megamenus/menu | List menus
*UiApi* | [**listRenderer**](docs/UiApi.md#listRenderer) | **GET** /megamenus/render | List renderer
*UiApi* | [**openRenderer**](docs/UiApi.md#openRenderer) | **PUT** /megamenus/render/{mid}/{viewer} | Open renderer
*UiApi* | [**setElement**](docs/UiApi.md#setElement) | **PUT** /megamenus/menu/{mid}/{page}/{y}/{x} | Update menu
*UiApi* | [**setMenu**](docs/UiApi.md#setMenu) | **PUT** /megamenus/menu/{mid} | Update menu
*UniversalMarketApi* | [**listMarketItems**](docs/UniversalMarketApi.md#listMarketItems) | **GET** /universal-market/item | List items
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /user | Create a user
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /user/{name} | Delete a user
*UserApi* | [**getMe**](docs/UserApi.md#getMe) | **GET** /user/me | Check info
*UserApi* | [**getUsers**](docs/UserApi.md#getUsers) | **GET** /user | List users
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /user/login | Login
*UserApi* | [**logout**](docs/UserApi.md#logout) | **POST** /user/logout | Logout
*UserApi* | [**logoutRedirect**](docs/UserApi.md#logoutRedirect) | **GET** /user/logout | 
*UserApi* | [**modifyUser**](docs/UserApi.md#modifyUser) | **PUT** /user/{name} | Update a user
*VShopsApi* | [**addShopItem**](docs/VShopsApi.md#addShopItem) | **POST** /vshop/shop/{id}/item | Add Shop Item
*VShopsApi* | [**createShop**](docs/VShopsApi.md#createShop) | **POST** /vshop/shop | Create Shops
*VShopsApi* | [**deleteShop**](docs/VShopsApi.md#deleteShop) | **DELETE** /vshop/shop/{id} | Delete a Shop
*VShopsApi* | [**deleteShopItem**](docs/VShopsApi.md#deleteShopItem) | **DELETE** /vshop/shop/{id}/item/{item} | Removes a Shop Item
*VShopsApi* | [**getShop**](docs/VShopsApi.md#getShop) | **GET** /vshop/shop/{id} | Get a Shop
*VShopsApi* | [**getShopItem**](docs/VShopsApi.md#getShopItem) | **GET** /vshop/shop/{id}/item/{item} | Get a Shop
*VShopsApi* | [**listShopItems**](docs/VShopsApi.md#listShopItems) | **GET** /vshop/shop/{id}/item | List Shop Items
*VShopsApi* | [**listShops**](docs/VShopsApi.md#listShops) | **GET** /vshop/shop | List Shops
*VShopsApi* | [**updateShop**](docs/VShopsApi.md#updateShop) | **PUT** /vshop/shop/{id} | Change Shop
*VShopsApi* | [**updateShopItem**](docs/VShopsApi.md#updateShopItem) | **PUT** /vshop/shop/{id}/item/{item} | Change Shop Item
*VillagerShopsApi* | [**addShopItem**](docs/VillagerShopsApi.md#addShopItem) | **POST** /vshop/shop/{id}/item | Add Shop Item
*VillagerShopsApi* | [**addShopItem_0**](docs/VillagerShopsApi.md#addShopItem_0) | **POST** /vshop/shop/{id}/item | Add Shop Item
*VillagerShopsApi* | [**createShop**](docs/VillagerShopsApi.md#createShop) | **POST** /vshop/shop | Create Shops
*VillagerShopsApi* | [**createShop_0**](docs/VillagerShopsApi.md#createShop_0) | **POST** /vshop/shop | Create Shops
*VillagerShopsApi* | [**deleteShop**](docs/VillagerShopsApi.md#deleteShop) | **DELETE** /vshop/shop/{id} | Delete a Shop
*VillagerShopsApi* | [**deleteShopItem**](docs/VillagerShopsApi.md#deleteShopItem) | **DELETE** /vshop/shop/{id}/item/{item} | Removes a Shop Item
*VillagerShopsApi* | [**deleteShopItem_0**](docs/VillagerShopsApi.md#deleteShopItem_0) | **DELETE** /vshop/shop/{id}/item/{item} | Removes a Shop Item
*VillagerShopsApi* | [**deleteShop_0**](docs/VillagerShopsApi.md#deleteShop_0) | **DELETE** /vshop/shop/{id} | Delete a Shop
*VillagerShopsApi* | [**getShop**](docs/VillagerShopsApi.md#getShop) | **GET** /vshop/shop/{id} | Get a Shop
*VillagerShopsApi* | [**getShopItem**](docs/VillagerShopsApi.md#getShopItem) | **GET** /vshop/shop/{id}/item/{item} | Get a Shop
*VillagerShopsApi* | [**getShopItem_0**](docs/VillagerShopsApi.md#getShopItem_0) | **GET** /vshop/shop/{id}/item/{item} | Get a Shop
*VillagerShopsApi* | [**getShop_0**](docs/VillagerShopsApi.md#getShop_0) | **GET** /vshop/shop/{id} | Get a Shop
*VillagerShopsApi* | [**listShopItems**](docs/VillagerShopsApi.md#listShopItems) | **GET** /vshop/shop/{id}/item | List Shop Items
*VillagerShopsApi* | [**listShopItems_0**](docs/VillagerShopsApi.md#listShopItems_0) | **GET** /vshop/shop/{id}/item | List Shop Items
*VillagerShopsApi* | [**listShops**](docs/VillagerShopsApi.md#listShops) | **GET** /vshop/shop | List Shops
*VillagerShopsApi* | [**listShops_0**](docs/VillagerShopsApi.md#listShops_0) | **GET** /vshop/shop | List Shops
*VillagerShopsApi* | [**updateShop**](docs/VillagerShopsApi.md#updateShop) | **PUT** /vshop/shop/{id} | Change Shop
*VillagerShopsApi* | [**updateShopItem**](docs/VillagerShopsApi.md#updateShopItem) | **PUT** /vshop/shop/{id}/item/{item} | Change Shop Item
*VillagerShopsApi* | [**updateShopItem_0**](docs/VillagerShopsApi.md#updateShopItem_0) | **PUT** /vshop/shop/{id}/item/{item} | Change Shop Item
*VillagerShopsApi* | [**updateShop_0**](docs/VillagerShopsApi.md#updateShop_0) | **PUT** /vshop/shop/{id} | Change Shop
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
 - [CatalogTypeCurrency](docs/CatalogTypeCurrency.md)
 - [CatalogTypeDifficulty](docs/CatalogTypeDifficulty.md)
 - [CatalogTypeDimensionType](docs/CatalogTypeDimensionType.md)
 - [CatalogTypeEntityType](docs/CatalogTypeEntityType.md)
 - [CatalogTypeGameMode](docs/CatalogTypeGameMode.md)
 - [CatalogTypeGeneratorType](docs/CatalogTypeGeneratorType.md)
 - [CatalogTypeInventoryArchetype](docs/CatalogTypeInventoryArchetype.md)
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
 - [Identifiable](docs/Identifiable.md)
 - [IgniteableData](docs/IgniteableData.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [InlineResponse403](docs/InlineResponse403.md)
 - [InlineResponse404](docs/InlineResponse404.md)
 - [InlineResponse500](docs/InlineResponse500.md)
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
 - [MegaMenusElement](docs/MegaMenusElement.md)
 - [MegaMenusRenderer](docs/MegaMenusRenderer.md)
 - [MenuMenusMenu](docs/MenuMenusMenu.md)
 - [Message](docs/Message.md)
 - [MinecartBlockData](docs/MinecartBlockData.md)
 - [MobSpawnerData](docs/MobSpawnerData.md)
 - [ModifyBlockOperationRequest](docs/ModifyBlockOperationRequest.md)
 - [ModifyUserRequest](docs/ModifyUserRequest.md)
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
 - [VillagerShopsShop](docs/VillagerShopsShop.md)
 - [VillagerShopsStockItem](docs/VillagerShopsStockItem.md)
 - [WebBooksBook](docs/WebBooksBook.md)
 - [WireAttachmentData](docs/WireAttachmentData.md)
 - [World](docs/World.md)
 - [WorldBorder](docs/WorldBorder.md)
 - [BlockChangeOperation](docs/BlockChangeOperation.md)
 - [BlockGetOperation](docs/BlockGetOperation.md)
 - [ChatMessage](docs/ChatMessage.md)


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

