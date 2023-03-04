package com.serdar.data.di.network

import com.serdar.data.api.ValorantApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(ViewModelComponent::class)
object NetworkModule {

    @Provides
    @ViewModelScoped
    fun provideValorantApi(): ValorantApiService {
        return Retrofit.Builder()
            .baseUrl("https://valorant-api.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ValorantApiService::class.java)
    }
}