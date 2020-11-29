package com.jessecorbett.diskord.api.exceptions

/**
 * Thrown when a request to the REST API was malformed or had bad data.
 *
 * @property message The error returned by the API.
 */
public class DiscordBadRequestException(override val message: String?) : DiscordException()
