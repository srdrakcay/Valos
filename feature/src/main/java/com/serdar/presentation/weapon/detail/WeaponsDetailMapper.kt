package com.serdar.presentation.weapon.detail

import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class WeaponsDetailMapper @Inject constructor() :
    ValorantListMapper<ValorantWeaponsDetailEntity, WeaponsDetailData> {
    override fun map(input: List<ValorantWeaponsDetailEntity>?): List<WeaponsDetailData> {
        return input?.map {
            WeaponsDetailData(
            assetPath = it.assetPath,
                category = it.category,
                defaultSkinUuid = it.defaultSkinUuid,
                displayIcon = it.displayIcon,
                displayName = it.displayName,
                killStreamIcon = it.killStreamIcon,
                uuid = it.uuid
            )
        } ?: emptyList()
    }
}