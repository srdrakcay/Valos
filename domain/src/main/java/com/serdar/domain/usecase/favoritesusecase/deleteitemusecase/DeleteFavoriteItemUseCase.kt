package com.serdar.domain.usecase.favoritesusecase.deleteitemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel

interface DeleteFavoriteItemUseCase {
    suspend operator fun invoke(item: FavoritesDataModel)

}