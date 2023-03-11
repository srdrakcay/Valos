package com.serdar.presentation.map.detail

import com.serdar.common.entity.ValorantMapsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject


class MapsDetailMapper @Inject constructor() :
    ValorantListMapper<ValorantMapsDetailEntity, MapsDetailData> {
    override fun map(input: List<ValorantMapsDetailEntity>?): List<MapsDetailData> {
        return input?.map {
            MapsDetailData(
                assetPath = it.assetPath,
                coordinates = it.coordinates,
                displayIcon = it.displayIcon,
                displayName = it.displayName,
                listViewIcon = it.listViewIcon,
                splash = it.splash,
                uuid = it.uuid
            )
        } ?: emptyList()
    }
}