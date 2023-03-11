package com.serdar.data.mapper

import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.weapons.detail.Data
import javax.inject.Inject

class ValorantWeaponsDetailMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantWeaponsDetailEntity> {
    override fun map(input: List<Data>?): List<ValorantWeaponsDetailEntity> {
        return input?.map {
            ValorantWeaponsDetailEntity(
                assetPath = it.assetPath,
                displayIcon = it.displayIcon,
                displayName = it.displayName,
                defaultSkinUuid = it.defaultSkinUuid,
                category = it.category,
                killStreamIcon = it.killStreamIcon,
                uuid = it.uuid

            )
        } ?: emptyList()
    }
}
