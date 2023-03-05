package com.serdar.data.di.source

import com.serdar.data.source.remote.RemoteDataSource
import com.serdar.data.source.remote.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteSourceModule {

    @Binds
    @Singleton
    abstract fun bindGetAgentsRemoteSource(remoteDataSourceImp: RemoteDataSourceImpl): RemoteDataSource
}