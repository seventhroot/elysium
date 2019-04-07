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

package com.rpkit.players.bukkit.player

import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import java.util.*

/**
 * Player implementation.
 */
@Deprecated("Old players API. Please move to new profiles APIs.",
        replaceWith = ReplaceWith("RPKProfileImpl", "com.rpkit.players.bukkit.profile.RPKProfileImpl"))
class RPKPlayerImpl(
        override var id: Int = 0,
        override var name: String,
        var minecraftUUID: UUID? = null,
        override var ircNick: String? = null,
        override var lastKnownIP: String? = null
): RPKPlayer {
    override var bukkitPlayer: OfflinePlayer?
        get() {
            val finalMinecraftUUID = minecraftUUID
            return if (finalMinecraftUUID == null) null else Bukkit.getOfflinePlayer(finalMinecraftUUID)
        }
        set(value) {
            minecraftUUID = value?.uniqueId
        }
}
