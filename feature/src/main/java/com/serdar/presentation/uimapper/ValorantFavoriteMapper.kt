package com.serdar.presentation.uimapper

import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.presentation.agent.AgentsUiData
import javax.inject.Inject

class ValorantFavoriteMapper @Inject constructor() :
    ValorantListMapper<FavoritesDataModel, AgentsUiData> {
    override fun map(input: List<FavoritesDataModel>?): List<AgentsUiData> {
        return input?.map {
            AgentsUiData(
                displayName = it.name,
                fullPortrait = it.image,
                uuid = it.id.toString(),
                killfeedPortrait = null
            )

        } ?: emptyList()
    }

}