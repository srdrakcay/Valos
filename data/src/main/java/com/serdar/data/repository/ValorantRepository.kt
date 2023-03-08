package com.serdar.data.repository


import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.favorite.FavoritesDataModel
import kotlinx.coroutines.flow.Flow

interface ValorantRepository {
    suspend fun getAgents(): Flow<NetworkResponseState<List<ValorantAgentsEntity>>>

    suspend fun getWeapons(): Flow<NetworkResponseState<List<ValorantWeaponsEntity>>>
    suspend fun getMaps(): Flow<NetworkResponseState<List<ValorantMapsEntity>>>


        //roomDb
     fun readAllProduct(): Flow<List<FavoritesDataModel>>
    suspend fun addValorantItem(item: FavoritesDataModel)
    suspend fun deleteValorantItem(item: FavoritesDataModel)
    suspend fun deleteAllValorantItem()

}