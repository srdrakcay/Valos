package com.serdar.data.dto.maps.detail

data class Data(
    val assetPath: String,
    val callouts: List<Callout>,
    val coordinates: String,
    val displayIcon: String,
    val displayName: String,
    val listViewIcon: String,
    val mapUrl: String,
    val splash: String,
    val uuid: String,
    val xMultiplier: Int,
    val xScalarToAdd: Double,
    val yMultiplier: Int,
    val yScalarToAdd: Double
)