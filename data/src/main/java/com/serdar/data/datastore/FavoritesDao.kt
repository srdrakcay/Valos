package com.serdar.data.datastore

import androidx.room.*
import com.serdar.data.dto.favorite.FavoritesDataModel
import kotlinx.coroutines.flow.Flow


@Dao
interface FavoritesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addValorantItem(item: FavoritesDataModel)

    @Query("SELECT * FROM favorite_table ORDER BY id ASC")
    fun readAllValorantItem(): Flow<List<FavoritesDataModel>>

    @Delete
    suspend fun deleteValorantItem(item: FavoritesDataModel)

    @Query("DELETE FROM favorite_table")
    suspend fun deleteAllValorantItem()
}