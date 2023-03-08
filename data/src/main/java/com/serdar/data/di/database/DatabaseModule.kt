package com.serdar.data.di.database

import android.content.Context
import androidx.room.Room
import com.serdar.data.datastore.FavoritesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ):
            ValorantDatabase = Room.databaseBuilder(
        context, ValorantDatabase::class.java,
        "valorant_database"
    ).build()


    @Provides
    fun provideProductDao(database: ValorantDatabase): FavoritesDao = database.favoritesDao()


}