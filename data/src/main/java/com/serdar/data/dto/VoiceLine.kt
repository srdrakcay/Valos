package com.serdar.data.dto

import com.serdar.data.dto.Media


data class VoiceLine(
    val maxDuration: Double,
    val mediaList: List<Media>,
    val minDuration: Double
)