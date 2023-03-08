package com.serdar.data.di.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.serdar.data.datastore.FavoritesDao
import com.serdar.data.dto.favorite.FavoritesDataModel

@Database(entities = [FavoritesDataModel::class], version = 1, exportSchema = false)
abstract class ValorantDatabase : RoomDatabase() {

    abstract fun favoritesDao(): FavoritesDao
}