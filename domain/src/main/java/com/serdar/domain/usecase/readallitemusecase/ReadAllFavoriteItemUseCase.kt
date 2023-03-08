package com.serdar.domain.usecase.readallitemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel
import kotlinx.coroutines.flow.Flow

interface ReadAllFavoriteItemUseCase {
    operator fun invoke(): Flow<List<FavoritesDataModel>>

}