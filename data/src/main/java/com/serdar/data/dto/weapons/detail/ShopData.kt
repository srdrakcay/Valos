package com.serdar.data.dto.weapons.detail

data class ShopData(
    val assetPath: String,
    val canBeTrashed: Boolean,
    val category: String,
    val categoryText: String,
    val cost: Int,
    val gridPosition: GridPosition,
    val image: Any,
    val newImage: String,
    val newImage2: Any
)