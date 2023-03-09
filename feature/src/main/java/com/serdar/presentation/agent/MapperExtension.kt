package com.serdar.presentation.agent

import com.serdar.data.dto.favorite.FavoritesDataModel


fun AgentsUiData.toAdverts() = FavoritesDataModel(
    name = displayName?:"",
    desc = killfeedPortrait?:"",
    image = fullPortrait?:"",
    id = uuid?.toInt()?:-1

)