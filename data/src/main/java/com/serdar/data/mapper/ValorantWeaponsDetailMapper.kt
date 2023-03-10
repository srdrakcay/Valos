package com.serdar.data.mapper

import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class ValorantWeaponsDetailMapper @Inject constructor() :
    ValorantListMapper<com.serdar.data.dto.weapons.Data, ValorantWeaponsDetailEntity> {
    override fun map(input: List<com.serdar.data.dto.weapons.Data>?): List<ValorantWeaponsDetailEntity> {
        return input?.map {
            ValorantWeaponsDetailEntity(
                assetPath = it.assetPath,
                displayIcon = it.displayIcon,
                displayName = it.displayName,
                defaultSkinUuid = it.defaultSkinUuid,
                category = it.category,
                killStreamIcon = it.killStreamIcon
            )
        } ?: emptyList()
    }
}
