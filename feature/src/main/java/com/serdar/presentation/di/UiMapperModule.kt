package com.serdar.presentation.di

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.presentation.agent.AgentsUiData
import com.serdar.presentation.agent.AgentsUiMapper
import com.serdar.presentation.map.MapsAdapter
import com.serdar.presentation.map.MapsUiData
import com.serdar.presentation.map.MapsUiMapper
import com.serdar.presentation.weapon.WeaponsUiData
import com.serdar.presentation.weapon.WeaponsUiMapper
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

    @Binds
    @ViewModelScoped
    abstract fun valorantUiMapsMapper(mapsUiMapper: MapsUiMapper): ValorantListMapper<ValorantMapsEntity, MapsUiData>
}