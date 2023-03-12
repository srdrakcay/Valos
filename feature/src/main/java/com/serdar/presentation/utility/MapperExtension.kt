package com.serdar.presentation.utility

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.presentation.agent.AgentsUiData
import com.serdar.presentation.agent.detail.AgentsDetailData


fun AgentsUiData.toUiData() = FavoritesDataModel(
    name = displayName?:"",
    desc = killfeedPortrait?:"",
    image = fullPortrait?:"",
    id = 0,
    uuid = uuid?:""
)
fun AgentsDetailData.toAgentsFavorite()=FavoritesDataModel(
    id = 0,
    uuid = uuid?:"",
    name = displayName?:"",
    image = fullPortrait?:"",
    desc = description?:"",
)
