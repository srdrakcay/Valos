package com.serdar.data.source.local

import com.serdar.data.dto.favorite.FavoritesDataModel
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    fun readAllProduct(): Flow<List<FavoritesDataModel>>
    suspend fun addValorantItem(item: FavoritesDataModel)
    suspend fun deleteValorantItem(item: FavoritesDataModel)
    suspend fun deleteAllValorantItem()


}