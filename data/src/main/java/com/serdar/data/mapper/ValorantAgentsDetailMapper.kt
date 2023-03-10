package com.serdar.data.mapper

import com.serdar.common.entity.ValorantAgentsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.agents.Data
import javax.inject.Inject

class ValorantAgentsDetailMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantAgentsDetailEntity> {
    override fun map(input: List<Data>?): List<ValorantAgentsDetailEntity> {
        return input?.map {
            ValorantAgentsDetailEntity(
                displayName = it.displayName,
                fullPortrait = it.fullPortrait,
                fullPortraitV2 = it.fullPortraitV2,
                background = it.background,
                assetPath = it.assetPath,
                bustPortrait = it.bustPortrait,
                description = it.description,
                developerName = it.developerName,
                displayIcon = it.displayIcon,
                displayIconSmall = it.displayIconSmall
            )
        } ?: emptyList()
    }
}