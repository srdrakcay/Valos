package com.serdar.data.di.repository

import com.serdar.data.repository.ValorantRepository
import com.serdar.data.repository.ValorantRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton

    abstract fun bindRepository(
        valorantRepositoryImpl: ValorantRepositoryImpl
    ): ValorantRepository
}
