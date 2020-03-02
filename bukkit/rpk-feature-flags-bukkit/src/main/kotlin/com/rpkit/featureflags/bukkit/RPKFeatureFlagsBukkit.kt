/*
 * Copyright 2020 Ren Binden
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

package com.rpkit.featureflags.bukkit

import com.rpkit.core.bukkit.plugin.RPKBukkitPlugin
import com.rpkit.core.database.Database
import com.rpkit.featureflags.bukkit.database.table.RPKFeatureFlagTable
import com.rpkit.featureflags.bukkit.database.table.RPKProfileFeatureFlagTable
import com.rpkit.featureflags.bukkit.featureflag.RPKFeatureFlagProviderImpl
import org.bstats.bukkit.Metrics


class RPKFeatureFlagsBukkit: RPKBukkitPlugin() {

    override fun onEnable() {
        Metrics(this, 4396)
        saveDefaultConfig()
        serviceProviders = arrayOf(
                RPKFeatureFlagProviderImpl(this)
        )
    }

    override fun createTables(database: Database) {
        database.addTable(RPKFeatureFlagTable(database, this))
        database.addTable(RPKProfileFeatureFlagTable(database, this))
    }

}