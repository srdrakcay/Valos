package com.serdar.presentation.di

import com.serdar.common.entity.*
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.presentation.agent.AgentsUiData
import com.serdar.presentation.agent.AgentsUiMapper
import com.serdar.presentation.agent.detail.AgentsDetailData
import com.serdar.presentation.agent.detail.AgentsDetailMapper
import com.serdar.presentation.map.MapsUiData
import com.serdar.presentation.map.MapsUiMapper
import com.serdar.presentation.map.detail.MapsDetailData
import com.serdar.presentation.map.detail.MapsDetailMapper
import com.serdar.presentation.weapon.WeaponsUiData
import com.serdar.presentation.weapon.WeaponsUiMapper
import com.serdar.presentation.weapon.detail.WeaponsDetailData
import com.serdar.presentation.weapon.detail.WeaponsDetailMapper
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

    @Binds
    @ViewModelScoped
    abstract fun valorantAgentsDetailMapper(agentsDetailMapper: AgentsDetailMapper): ValorantListMapper<ValorantAgentsDetailEntity, AgentsDetailData>

    @Binds
    @ViewModelScoped
    abstract fun valorantMapsDetailMapper(mapsDetailMapper: MapsDetailMapper): ValorantListMapper<ValorantMapsDetailEntity, MapsDetailData>

    @Binds
    @ViewModelScoped
    abstract fun valorantWeaponsDetailMapper(weaponsDetailMapper: WeaponsDetailMapper): ValorantListMapper<ValorantWeaponsDetailEntity, WeaponsDetailData>

}