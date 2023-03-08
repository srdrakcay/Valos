package com.serdar.data.mapper

import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class ValorantMapsMainMapper @Inject constructor() :
    ValorantListMapper<com.serdar.data.dto.maps.Data, ValorantMapsEntity> {
    override fun map(input: List<com.serdar.data.dto.maps.Data>?): List<ValorantMapsEntity> {
        return input?.map {
            ValorantMapsEntity(
                displayName = it.displayName,
                displayIcon = it.displayIcon,
                uuid = it.uuid,
                coordinates = it.coordinates,
                listViewIcon = it.listViewIcon,
                assetPath = it.assetPath
            )
        } ?: emptyList()
    }
}