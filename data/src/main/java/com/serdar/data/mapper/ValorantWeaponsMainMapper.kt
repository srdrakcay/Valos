package com.serdar.data.mapper

import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.weapons.Data

import javax.inject.Inject

class ValorantWeaponsMainMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantWeaponsEntity> {
    override fun map(input: List<Data>?): List<ValorantWeaponsEntity> {
        return input?.map {
            ValorantWeaponsEntity(
                assetPath = it.assetPath,
                category = it.category,
                defaultSkinUuid = it.defaultSkinUuid,
                displayIcon = it.displayIcon,
                displayName = it.displayName,
                killStreamIcon = it.killStreamIcon,
                uuid = it.uuid,
            )
        } ?: emptyList()
    }
}