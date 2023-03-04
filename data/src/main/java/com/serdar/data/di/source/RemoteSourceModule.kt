package com.serdar.data.di.source

import com.serdar.data.source.remote.RemoteDataSource
import com.serdar.data.source.remote.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RemoteSourceModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetAgentsRemoteSource(remoteDataSourceImp: RemoteDataSourceImpl): RemoteDataSource
}