package com.serdar.data.di.coroutine

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CoroutineDispatchersModule {

    @IoDispatcher
    @Provides
    @Singleton
    fun providesIoDispatcher() = Dispatchers.IO
}