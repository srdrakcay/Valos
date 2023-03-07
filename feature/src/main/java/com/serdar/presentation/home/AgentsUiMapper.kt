package com.serdar.presentation.home

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class AgentsUiMapper @Inject constructor() :
    ValorantListMapper<ValorantAgentsEntity, AgentsUiData> {
    override fun map(input: List<ValorantAgentsEntity>?): List<AgentsUiData> {
        return input?.map {
            AgentsUiData(it.displayName,it.fullPortrait,it.killfeedPortrait,it.uuid)
        } ?: emptyList()
    }
}