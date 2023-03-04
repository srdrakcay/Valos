package com.serdar.common.mapper.di

import com.serdar.common.entity.ValorantEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.common.mapper.ValorantMainMapper
import com.serdar.data.dto.Data
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class MapperModule {

    @Binds
    @ViewModelScoped
    abstract fun valorantMapper(valorantMainMapper: ValorantMainMapper): ValorantListMapper<Data, ValorantEntity>


}
