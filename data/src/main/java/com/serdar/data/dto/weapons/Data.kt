package com.serdar.data.dto.weapons

data class Data(
    val assetPath: String,
    val category: String,
    val defaultSkinUuid: String,
    val displayIcon: String,
    val displayName: String,
    val killStreamIcon: String,
    val shopData: ShopData,
    val skins: List<Skin>,
    val uuid: String,
    val weaponStats: WeaponStats
)