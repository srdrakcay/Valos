package com.serdar.domain.usecase.additemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel

interface AddItemFavoriteUseCase {
    suspend operator fun invoke(item: FavoritesDataModel)
}