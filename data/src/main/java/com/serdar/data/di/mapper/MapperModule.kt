package com.serdar.data.di.mapper

import com.serdar.common.entity.ValorantEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.mapper.ValorantMainMapper
import com.serdar.data.dto.Data
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MapperModule {

    @Binds
    @Singleton
    abstract fun valorantMapper(valorantMainMapper: ValorantMainMapper): ValorantListMapper<Data, ValorantEntity>


}
