package com.serdar.domain.di

import com.serdar.domain.usecase.additemusecase.AddItemFavoriteUseCase
import com.serdar.domain.usecase.additemusecase.AddItemFavoriteUseCaseImpl
import com.serdar.domain.usecase.deleteallusecase.DeleteAllFavoriteItemUseCase
import com.serdar.domain.usecase.deleteallusecase.DeleteAllFavoriteItemUseCaseImpl
import com.serdar.domain.usecase.deleteitemusecase.DeleteFavoriteItemUseCase
import com.serdar.domain.usecase.deleteitemusecase.DeleteFavoriteItemUseCaseImpl
import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCase
import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCaseImpl
import com.serdar.domain.usecase.getmapsusecase.GetMapsUseCase
import com.serdar.domain.usecase.getmapsusecase.GetMapsUseCaseImpl
import com.serdar.domain.usecase.getweaponsusecase.GetWeaponsUseCase
import com.serdar.domain.usecase.getweaponsusecase.GetWeaponsUseCaseImpl
import com.serdar.domain.usecase.readallitemusecase.ReadAllFavoriteItemUseCase
import com.serdar.domain.usecase.readallitemusecase.ReadAllFavoriteItemUseCaseImpl
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





}