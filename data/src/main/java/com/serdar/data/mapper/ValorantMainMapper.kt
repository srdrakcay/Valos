package com.serdar.data.mapper

import com.serdar.common.entity.ValorantEntity
import com.serdar.data.dto.Data
import javax.inject.Inject


class ValorantMainMapper @Inject constructor() :
    ValorantListMapper<Data, ValorantEntity> {
    override fun map(input: List<Data>?): List<ValorantEntity> {
        return input?.map {
            ValorantEntity(
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