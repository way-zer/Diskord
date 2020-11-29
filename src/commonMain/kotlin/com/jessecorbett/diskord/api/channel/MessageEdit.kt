package com.jessecorbett.diskord.api.channel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class MessageEdit(
    @SerialName("content") val content: String?,
    @SerialName("embed") val embed: Embed? = null
)
