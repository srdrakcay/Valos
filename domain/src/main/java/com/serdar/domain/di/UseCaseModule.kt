package com.serdar.domain.di

import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCase
import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCaseImpl
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



}