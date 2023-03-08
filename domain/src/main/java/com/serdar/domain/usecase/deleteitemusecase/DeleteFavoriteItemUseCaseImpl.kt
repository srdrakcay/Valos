package com.serdar.domain.usecase.deleteitemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.data.repository.ValorantRepository
import javax.inject.Inject

class DeleteFavoriteItemUseCaseImpl@Inject constructor(private val repository: ValorantRepository):DeleteFavoriteItemUseCase {
    override suspend fun invoke(item: FavoritesDataModel) {
        repository.deleteValorantItem(item)
    }
}