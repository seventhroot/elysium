/*
 * Copyright 2016 Ross Binden
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rpkit.permissions.bukkit.database.table

import com.rpkit.core.database.Database
import com.rpkit.core.database.Table
import com.rpkit.core.database.use
import com.rpkit.permissions.bukkit.RPKPermissionsBukkit
import com.rpkit.permissions.bukkit.group.RPKGroupProvider
import com.rpkit.permissions.bukkit.group.PlayerGroup
import com.rpkit.players.bukkit.player.RPKPlayer
import com.rpkit.players.bukkit.player.RPKPlayerProvider
import org.ehcache.Cache
import org.ehcache.CacheManager
import org.ehcache.config.builders.CacheConfigurationBuilder
import org.ehcache.config.builders.CacheManagerBuilder
import org.ehcache.config.builders.ResourcePoolsBuilder
import java.sql.PreparedStatement
import java.sql.Statement.RETURN_GENERATED_KEYS

/**
 * Represents the player group table.
 */
class PlayerGroupTable: com.rpkit.core.database.Table<PlayerGroup> {

    private val plugin: RPKPermissionsBukkit
    private val cacheManager: org.ehcache.CacheManager
    private val cache: org.ehcache.Cache<Int, PlayerGroup>
    private val playerCache: org.ehcache.Cache<Int, MutableList<*>>

    constructor(database: com.rpkit.core.database.Database, plugin: RPKPermissionsBukkit): super(database, PlayerGroup::class) {
        this.plugin = plugin
        cacheManager = org.ehcache.config.builders.CacheManagerBuilder.newCacheManagerBuilder().build(true)
        cache = cacheManager.createCache("cache",
                org.ehcache.config.builders.CacheConfigurationBuilder.newCacheConfigurationBuilder(Int::class.javaObjectType, PlayerGroup::class.java,
                        org.ehcache.config.builders.ResourcePoolsBuilder.heap(plugin.server.maxPlayers.toLong())))
        playerCache = cacheManager.createCache("playerCache",
                org.ehcache.config.builders.CacheConfigurationBuilder.newCacheConfigurationBuilder(Int::class.javaObjectType, MutableList::class.java,
                        org.ehcache.config.builders.ResourcePoolsBuilder.heap(plugin.server.maxPlayers.toLong())))
    }

    override fun create() {
        database.createConnection().use { connection ->
            connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS player_group(" +
                            "id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                            "player_id INTEGER," +
                            "group_name VARCHAR(256)" +
                    ")"
            ).use(java.sql.PreparedStatement::executeUpdate)
        }
    }

    override fun applyMigrations() {
        if (database.getTableVersion(this) == null) {
            database.setTableVersion(this, "0.4.0")
        }
    }

    override fun insert(entity: PlayerGroup): Int {
        var id = 0
        database.createConnection().use { connection ->
            connection.prepareStatement(
                    "INSERT INTO player_group(player_id, group_name) VALUES(?, ?)",
                    RETURN_GENERATED_KEYS
            ).use { statement ->
                statement.setInt(1, entity.player.id)
                statement.setString(2, entity.group.name)
                statement.executeUpdate()
                val generatedKeys = statement.generatedKeys
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1)
                    entity.id = id
                    cache.put(id, entity)
                    val playerGroups: MutableList<PlayerGroup> = playerCache.get(entity.player.id) as? MutableList<PlayerGroup>?:get(entity.player).toMutableList()
                    if (!playerGroups.contains(entity)) {
                        playerGroups.add(entity)
                        playerCache.put(entity.player.id, playerGroups)
                    }
                }
            }
        }
        return id
    }

    override fun update(entity: PlayerGroup) {
        database.createConnection().use { connection ->
            connection.prepareStatement(
                    "UPDATE player_group SET player_id = ?, group_name = ? WHERE id = ?"
            ).use { statement ->
                statement.setInt(1, entity.player.id)
                statement.setString(2, entity.group.name)
                statement.setInt(3, entity.id)
                statement.executeUpdate()
                cache.put(entity.id, entity)
                val playerGroups: MutableList<PlayerGroup> = playerCache.get(entity.player.id) as? MutableList<PlayerGroup>?:get(entity.player).toMutableList()
                if (!playerGroups.contains(entity)) {
                    playerGroups.add(entity)
                    playerCache.put(entity.player.id, playerGroups)
                }
            }
        }
    }

    override fun get(id: Int): PlayerGroup? {
        if (cache.containsKey(id)) {
            return cache.get(id)
        } else {
            var playerGroup: PlayerGroup? = null
            database.createConnection().use { connection ->
                connection.prepareStatement(
                        "SELECT id, player_id, group_name FROM player_group WHERE id = ?"
                ).use { statement ->
                    statement.setInt(1, id)
                    val resultSet = statement.executeQuery()
                    if (resultSet.next()) {
                        val finalPlayerGroup = PlayerGroup(
                                resultSet.getInt("id"),
                                plugin.core.serviceManager.getServiceProvider(RPKPlayerProvider::class).getPlayer(resultSet.getInt("player_id"))!!,
                                plugin.core.serviceManager.getServiceProvider(RPKGroupProvider::class).getGroup(resultSet.getString("group_name"))!!
                        )
                        cache.put(finalPlayerGroup.id, finalPlayerGroup)
                        val playerGroups: MutableList<PlayerGroup> = playerCache.get(finalPlayerGroup.player.id) as? MutableList<PlayerGroup>?:get(finalPlayerGroup.player).toMutableList()
                        if (!playerGroups.contains(finalPlayerGroup)) {
                            playerGroups.add(finalPlayerGroup)
                            playerCache.put(finalPlayerGroup.player.id, playerGroups)
                        }
                        playerGroup = finalPlayerGroup
                    }
                }
            }
            return playerGroup
        }
    }

    fun get(player: RPKPlayer): List<PlayerGroup> {
        if (playerCache.containsKey(player.id)) {
            return playerCache.get(player.id) as List<PlayerGroup>
        } else {
            val playerGroups = mutableListOf<PlayerGroup>()
            database.createConnection().use { connection ->
                connection.prepareStatement(
                        "SELECT id FROM player_group WHERE player_id = ?"
                ).use { statement ->
                    statement.setInt(1, player.id)
                    val resultSet = statement.executeQuery()
                    while (resultSet.next()) {
                        val playerGroup = get(resultSet.getInt("id"))
                        if (playerGroup != null) playerGroups.add(playerGroup)
                    }
                }
            }
            return playerGroups
        }
    }

    override fun delete(entity: PlayerGroup) {
        database.createConnection().use { connection ->
            connection.prepareStatement(
                    "DELETE FROM player_group WHERE id = ?"
            ).use { statement ->
                statement.setInt(1, entity.id)
                statement.executeUpdate()
                cache.remove(entity.id)
                val playerGroups: MutableList<PlayerGroup> = playerCache.get(entity.player.id) as? MutableList<PlayerGroup>?:get(entity.player).toMutableList()
                if (playerGroups.contains(entity)) {
                    playerGroups.remove(entity)
                    playerCache.put(entity.player.id, playerGroups)
                }
            }
        }
    }

}