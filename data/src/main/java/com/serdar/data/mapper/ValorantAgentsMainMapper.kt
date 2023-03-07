package com.serdar.data.mapper

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.agents.Data
import javax.inject.Inject


class ValorantAgentsMainMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantAgentsEntity> {
    override fun map(input: List<Data>?): List<ValorantAgentsEntity> {
        return input?.map {
            ValorantAgentsEntity(
                displayName = it.displayName,
                fullPortrait = it.fullPortrait,
                fullPortraitV2 = it.fullPortraitV2,
                isAvailableForTest = it.isAvailableForTest,
                isBaseContent = it.isBaseContent,
                isFullPortraitRightFacing = it.isFullPortraitRightFacing,
                isPlayableCharacter = it.isPlayableCharacter,
                killfeedPortrait = it.killfeedPortrait,
                uuid = it.uuid
            )
        } ?: emptyList()
    }
}