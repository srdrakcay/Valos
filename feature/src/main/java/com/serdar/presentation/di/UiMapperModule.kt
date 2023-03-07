package com.serdar.presentation.di

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.presentation.agents.AgentsUiData
import com.serdar.presentation.agents.AgentsUiMapper
import com.serdar.presentation.weapons.WeaponsUiData
import com.serdar.presentation.weapons.WeaponsUiMapper
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
    abstract fun valorantUiMapper(agentsUiMapper: AgentsUiMapper): ValorantListMapper<ValorantAgentsEntity, AgentsUiData>

    @Binds
    @ViewModelScoped
    abstract fun valorantUiWeaponsMapper(weaponsUiMapper: WeaponsUiMapper): ValorantListMapper<ValorantWeaponsEntity, WeaponsUiData>
}