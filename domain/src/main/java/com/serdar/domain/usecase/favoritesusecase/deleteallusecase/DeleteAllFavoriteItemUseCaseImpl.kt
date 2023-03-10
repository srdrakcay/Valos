package com.serdar.domain.usecase.favoritesusecase.deleteallusecase

import com.serdar.data.repository.ValorantRepository
import javax.inject.Inject

class DeleteAllFavoriteItemUseCaseImpl@Inject constructor(private val repository: ValorantRepository):
    DeleteAllFavoriteItemUseCase {
    override suspend fun invoke() {
        repository.deleteAllValorantItem()
    }
}