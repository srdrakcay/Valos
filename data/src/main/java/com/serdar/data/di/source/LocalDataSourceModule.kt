package com.serdar.data.di.source

import com.serdar.data.source.local.LocalDataSource
import com.serdar.data.source.local.LocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataSourceModule {

    @Binds
    @Singleton
    abstract fun bindLocalSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource
}