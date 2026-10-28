package com.m486.model

import kotlinx.serialization.Serializable


@Serializable
enum class Nivell {
    INFO, WARNING, ERROR
}

@Serializable
data class LogEntry(
    val id: Long,
    val timestamp: String,
    val nivell: Nivell,
    val servei: String,
    val missatge: String
)

@Serializable
data class LogRequest(
    val nivell: Nivell,
    val servei: String,
    val missatge: String
){

}
