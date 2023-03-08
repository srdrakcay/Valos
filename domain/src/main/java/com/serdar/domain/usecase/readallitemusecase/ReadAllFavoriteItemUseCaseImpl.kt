package com.serdar.domain.usecase.readallitemusecase

import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadAllFavoriteItemUseCaseImpl @Inject constructor(private val repository: ValorantRepository) :
    ReadAllFavoriteItemUseCase {
    override fun invoke(): Flow<List<FavoritesDataModel>> = repository.readAllProduct()
}