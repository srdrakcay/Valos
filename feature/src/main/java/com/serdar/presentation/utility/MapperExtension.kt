package com.serdar.presentation.utility

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.presentation.agent.AgentsUiData
import com.serdar.presentation.agent.detail.AgentsDetailData
import com.serdar.presentation.map.detail.MapsDetailData
import com.serdar.presentation.weapon.detail.WeaponsDetailData


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

fun MapsDetailData.toMapsFavorite()=FavoritesDataModel(
    id = 0,
    uuid = uuid?:"",
    name = splash?:"",
    image = displayName?:"",
    desc = coordinates?:"",
)
fun WeaponsDetailData.toMapsFavorite()=FavoritesDataModel(
    id = 0,
    uuid = uuid?:"",
    name = killStreamIcon?:"",
    image = displayName?:"",
    desc = assetPath?:"",
)