package com.serdar.domain.di

import com.serdar.domain.usecase.agentsusecase.agentsdetailusecase.AgentsDetailUseCase
import com.serdar.domain.usecase.agentsusecase.agentsdetailusecase.AgentsDetailUseCaseImpl
import com.serdar.domain.usecase.favoritesusecase.additemusecase.AddItemFavoriteUseCase
import com.serdar.domain.usecase.favoritesusecase.additemusecase.AddItemFavoriteUseCaseImpl
import com.serdar.domain.usecase.favoritesusecase.deleteallusecase.DeleteAllFavoriteItemUseCase
import com.serdar.domain.usecase.favoritesusecase.deleteallusecase.DeleteAllFavoriteItemUseCaseImpl
import com.serdar.domain.usecase.favoritesusecase.deleteitemusecase.DeleteFavoriteItemUseCase
import com.serdar.domain.usecase.favoritesusecase.deleteitemusecase.DeleteFavoriteItemUseCaseImpl
import com.serdar.domain.usecase.agentsusecase.getagentsusecase.GetAgentsUseCase
import com.serdar.domain.usecase.agentsusecase.getagentsusecase.GetAgentsUseCaseImpl
import com.serdar.domain.usecase.mapsusecase.getmapsusecase.GetMapsUseCase
import com.serdar.domain.usecase.mapsusecase.getmapsusecase.GetMapsUseCaseImpl
import com.serdar.domain.usecase.weaponsusecase.getweaponsusecase.GetWeaponsUseCase
import com.serdar.domain.usecase.weaponsusecase.getweaponsusecase.GetWeaponsUseCaseImpl
import com.serdar.domain.usecase.favoritesusecase.readallitemusecase.ReadAllFavoriteItemUseCase
import com.serdar.domain.usecase.favoritesusecase.readallitemusecase.ReadAllFavoriteItemUseCaseImpl
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

    @Binds
    @ViewModelScoped
    abstract fun bindReadAllItem(readAllFavoriteItemUseCaseImpl: ReadAllFavoriteItemUseCaseImpl): ReadAllFavoriteItemUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindDeleteAllItem(deleteAllFavoriteItemUseCaseImpl: DeleteAllFavoriteItemUseCaseImpl): DeleteAllFavoriteItemUseCase


    @Binds
    @ViewModelScoped
    abstract fun bindDeleteItem(deleteFavoriteItemUseCaseImpl: DeleteFavoriteItemUseCaseImpl): DeleteFavoriteItemUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindAddItem(addItemFavoriteUseCaseImpl: AddItemFavoriteUseCaseImpl): AddItemFavoriteUseCase


    @Binds
    @ViewModelScoped
    abstract fun bindAgentsDetail(agentsDetailUseCaseImpl: AgentsDetailUseCaseImpl): AgentsDetailUseCase


}