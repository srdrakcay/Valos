package com.serdar.presentation.home

import com.serdar.common.entity.ValorantEntity
import com.serdar.common.mapper.ValorantListMapper
import javax.inject.Inject

class HomeUiMapper @Inject constructor() :
    ValorantListMapper<ValorantEntity, HomeUiData> {
    override fun map(input: List<ValorantEntity>?): List<HomeUiData> {
        return input?.map {
            HomeUiData(it.displayName,it.fullPortrait,it.killfeedPortrait,it.uuid)
        } ?: emptyList()
    }
}