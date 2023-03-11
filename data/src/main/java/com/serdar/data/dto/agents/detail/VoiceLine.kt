package com.serdar.data.dto.agents.detail

data class VoiceLine(
    val maxDuration: Double,
    val mediaList: List<Media>,
    val minDuration: Double
)