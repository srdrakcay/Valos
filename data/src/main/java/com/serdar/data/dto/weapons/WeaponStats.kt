package com.serdar.data.dto.weapons

data class WeaponStats(
    val adsStats: AdsStats,
    val airBurstStats: AirBurstStats,
    val altFireType: String,
    val altShotgunStats: AltShotgunStats,
    val damageRanges: List<DamageRange>,
    val equipTimeSeconds: Double,
    val feature: String,
    val fireMode: String,
    val fireRate: Double,
    val firstBulletAccuracy: Double,
    val magazineSize: Int,
    val reloadTimeSeconds: Double,
    val runSpeedMultiplier: Double,
    val shotgunPelletCount: Int,
    val wallPenetration: String
)