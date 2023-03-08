package com.serdar.presentation.weapon

import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class WeaponsUiMapper @Inject constructor() :
    ValorantListMapper<ValorantWeaponsEntity, WeaponsUiData> {
    override fun map(input: List<ValorantWeaponsEntity>?): List<WeaponsUiData> {
        return input?.map {
            WeaponsUiData(it.displayName, it.assetPath, it.defaultSkinUuid, it.killStreamIcon,it.category,it.displayIcon,it.uuid)
        } ?: emptyList()
    }
}