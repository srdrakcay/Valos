package com.serdar.domain.usecase.favoritesusecase.additemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.data.repository.ValorantRepository
import javax.inject.Inject

class AddItemFavoriteUseCaseImpl @Inject constructor(private val repository: ValorantRepository):
    AddItemFavoriteUseCase {
    override suspend fun invoke(item: FavoritesDataModel) {
        repository.addValorantItem(item)
    }
}