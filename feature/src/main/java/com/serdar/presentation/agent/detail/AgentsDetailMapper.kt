package com.serdar.presentation.agent.detail

import com.serdar.common.entity.ValorantAgentsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class AgentsDetailMapper @Inject constructor() :
    ValorantListMapper<ValorantAgentsDetailEntity, AgentsDetailData> {
    override fun map(input: List<ValorantAgentsDetailEntity>?): List<AgentsDetailData> {
        return input?.map {
            AgentsDetailData(
                it.displayName,
                it.fullPortrait,
                it.fullPortraitV2,
                it.description,
                it.assetPath,
                it.background,
                it.bustPortrait,
                it.displayIconSmall,
                it.developerName,
                it.displayIcon )
        } ?: emptyList()
    }
}