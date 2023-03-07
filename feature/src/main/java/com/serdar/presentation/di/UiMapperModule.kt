package com.serdar.presentation.di

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.presentation.home.AgentsUiData
import com.serdar.presentation.home.AgentsUiMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UiMapperModule {
    @Binds
    @ViewModelScoped
    abstract fun valorantUiMapper(homeUiMapper: AgentsUiMapper): ValorantListMapper<ValorantAgentsEntity, AgentsUiData>

}