package com.serdar.data.source.local

import com.serdar.data.datastore.FavoritesDao
import com.serdar.data.dto.favorite.FavoritesDataModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(private val favoritesDao: FavoritesDao) :
    LocalDataSource {
    override fun readAllProduct(): Flow<List<FavoritesDataModel>> =
        favoritesDao.readAllValorantItem()

    override suspend fun addValorantItem(item: FavoritesDataModel) =
        favoritesDao.addValorantItem(item)

    override suspend fun deleteValorantItem(item: FavoritesDataModel) =
        favoritesDao.deleteValorantItem(item)

    override suspend fun deleteAlValorantItem() =
        favoritesDao.deleteAllValorantItem()
}