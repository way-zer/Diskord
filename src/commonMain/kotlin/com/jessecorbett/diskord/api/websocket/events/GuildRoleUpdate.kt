package com.jessecorbett.diskord.api.websocket.events

import com.jessecorbett.diskord.api.common.Role
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GuildRoleUpdate(
    @SerialName("guild_id") val guildId: String,
    @SerialName("role") val role: Role
)
