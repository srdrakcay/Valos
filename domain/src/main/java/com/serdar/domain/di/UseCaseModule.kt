package com.serdar.domain.di

import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCase
import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCaseImpl
import com.serdar.domain.usecase.getmapsusecase.GetMapsUseCase
import com.serdar.domain.usecase.getmapsusecase.GetMapsUseCaseImpl
import com.serdar.domain.usecase.getweaponsusecase.GetWeaponsUseCase
import com.serdar.domain.usecase.getweaponsusecase.GetWeaponsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)

abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetAgentsUseCas(getAgentsUseCaseImpl: GetAgentsUseCaseImpl): GetAgentsUseCase


    @Binds
    @ViewModelScoped
    abstract fun bindGetWeaponsUseCas(getWeaponsUseCaseImpl: GetWeaponsUseCaseImpl): GetWeaponsUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetMapsUseCas(getMapsUseCaseImpl: GetMapsUseCaseImpl): GetMapsUseCase
}