package com.serdar.presentation.utility

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.presentation.agent.AgentsUiData


fun AgentsUiData.toUiData() = FavoritesDataModel(
    name = displayName?:"",
    desc = killfeedPortrait?:"",
    image = fullPortrait?:"",
    id = 0,
    uuid = uuid?:""
)
