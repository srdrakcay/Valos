package com.serdar.data.mapper

import com.serdar.common.entity.ValorantMapsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.maps.detail.Data
import javax.inject.Inject

class ValorantMapsDetailMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantMapsDetailEntity> {
    override fun map(input: List<Data>?): List<ValorantMapsDetailEntity> {
        return input?.map {
            ValorantMapsDetailEntity(
                displayName = it.displayName,
                displayIcon = it.displayIcon,
                uuid = it.uuid,
                coordinates = it.coordinates,
                listViewIcon = it.listViewIcon,
                assetPath = it.assetPath,
                splash = it.splash,
                )
        } ?: emptyList()
    }
}