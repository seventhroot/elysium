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

package com.rpkit.players.bukkit.profile

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.entities.User

class RPKDiscordProfileImpl(
        override var id: Int = 0,
        override var profile: RPKProfile? = null,
        override val discordId: Long
) : RPKDiscordProfile {

    override fun getDiscordUser(jda: JDA): User? {
        return jda.getUserById(discordId)
    }

}