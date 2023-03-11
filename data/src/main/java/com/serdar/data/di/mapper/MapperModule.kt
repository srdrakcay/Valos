package com.serdar.data.di.mapper

import com.serdar.common.entity.*
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.dto.agents.Data
import com.serdar.data.mapper.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    @Singleton
    abstract fun valorantMapper(valorantMainMapper: ValorantAgentsMainMapper): ValorantListMapper<Data, ValorantAgentsEntity>

    @Binds
    @Singleton
    abstract fun valorantWeaponMapper(valorantWeaponMainMapper: ValorantWeaponsMainMapper): ValorantListMapper<com.serdar.data.dto.weapons.Data, ValorantWeaponsEntity>

    @Binds
    @Singleton
    abstract fun valorantMapsMapper(valorantMapsMainMapper: ValorantMapsMainMapper): ValorantListMapper<com.serdar.data.dto.maps.Data, ValorantMapsEntity>

    @Binds
    @Singleton
    abstract fun valorantAgentsDetailMapper(valorantAgentsDetailMapper: ValorantAgentsDetailMapper): ValorantListMapper<com.serdar.data.dto.agents.detail.Data, ValorantAgentsDetailEntity>

    @Binds
    @Singleton
    abstract fun valorantWeaponsDetailMapper(valorantWeaponsDetailMapper: ValorantWeaponsDetailMapper): ValorantListMapper<com.serdar.data.dto.weapons.detail.Data, ValorantWeaponsDetailEntity>

    @Binds
    @Singleton
    abstract fun valorantMapsDetailMapper(valorantMapsDetailMapper: ValorantMapsDetailMapper): ValorantListMapper<com.serdar.data.dto.maps.detail.Data, ValorantMapsDetailEntity>

}
