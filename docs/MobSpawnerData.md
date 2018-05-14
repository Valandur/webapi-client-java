
# MobSpawnerData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maximumNearbyEntities** | **Integer** | The maximum number of nearby entities for another mob to spawn | 
**maximumSpawnDelay** | **Integer** | The maximum delay between two consecutive spawns | 
**minimumSpawnDelay** | **Integer** | The minimum delay between two consecutive spawns | 
**nextEntityToSpawn** | [**EntityArchtype**](EntityArchtype.md) | The next entity type that will be spawned by this spawner | 
**possibleEntitiesToSpawn** | [**List&lt;TableEntryEntityArchetype&gt;**](TableEntryEntityArchetype.md) | A weighted table of probability for each entity type to spawn | 
**remainingDelay** | **Integer** | The remaining time until the next spawn attempt | 
**requiredPlayerRange** | **Integer** | The block range within there must be a player to trigger the spawn | 
**spawnCount** | **Integer** | The amount of entities that will spawn in one attempt | 
**spawnRange** | **Integer** | The range from the spawner within which the entities will spawn | 



