package com.serdar.presentation.map

import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject


class MapsUiMapper @Inject constructor() :
    ValorantListMapper<ValorantMapsEntity, MapsUiData> {
    override fun map(input: List<ValorantMapsEntity>?): List<MapsUiData> {
        return input?.map {
            MapsUiData(
                it.displayName,
                it.displayIcon,
                it.uuid,
                it.assetPath,
                it.coordinates,
                it.listViewIcon
            )
        } ?: emptyList()
    }
}