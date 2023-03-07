package com.serdar.data.di.mapper

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.mapper.ValorantAgentsMainMapper
import com.serdar.data.dto.agents.Data
import com.serdar.data.mapper.ValorantWeaponsMainMapper
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

}
