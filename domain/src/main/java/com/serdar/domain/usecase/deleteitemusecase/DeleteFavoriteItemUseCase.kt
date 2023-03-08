package com.serdar.domain.usecase.deleteitemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel

interface DeleteFavoriteItemUseCase {
    suspend operator fun invoke(item: FavoritesDataModel)

}