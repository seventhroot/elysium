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

package com.rpkit.professions.bukkit.character

import com.rpkit.characters.bukkit.character.RPKCharacter
import com.rpkit.characters.bukkit.character.field.HideableCharacterCardField
import com.rpkit.core.service.Services
import com.rpkit.professions.bukkit.RPKProfessionsBukkit
import com.rpkit.professions.bukkit.database.table.RPKProfessionHiddenTable
import com.rpkit.professions.bukkit.profession.RPKProfessionService
import java.util.concurrent.CompletableFuture


class ProfessionField(val plugin: RPKProfessionsBukkit) : HideableCharacterCardField {

    override val name = "profession"

    override fun get(character: RPKCharacter): CompletableFuture<String> {
        return isHidden(character).thenApplyAsync { hidden ->
            if (hidden) {
                "[HIDDEN]"
            } else {
                val professionService = Services[RPKProfessionService::class.java]
                    ?: return@thenApplyAsync plugin.messages["no-profession-service"]
                return@thenApplyAsync professionService.getProfessions(character)
                    .join()
                    .joinToString(", ") { profession -> profession.name.value }
            }
        }
    }

    override fun isHidden(character: RPKCharacter): CompletableFuture<Boolean> {
        return plugin.database.getTable(RPKProfessionHiddenTable::class.java)[character].thenApply { it != null }
    }

    override fun setHidden(character: RPKCharacter, hidden: Boolean): CompletableFuture<Void> {
        val professionHiddenTable = plugin.database.getTable(RPKProfessionHiddenTable::class.java)
        return if (hidden) {
            professionHiddenTable[character].thenAcceptAsync { professionHidden ->
                if (professionHidden == null) {
                    professionHiddenTable.insert(RPKProfessionHidden(character = character)).join()
                }
            }
        } else {
            professionHiddenTable[character].thenAcceptAsync { professionHidden ->
                if (professionHidden != null) {
                    professionHiddenTable.delete(professionHidden).join()
                }
            }
        }
    }

}