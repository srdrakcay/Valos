package com.serdar.domain.usecase.getmapsusecase

import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMapsUseCaseImpl @Inject constructor(private val repository: ValorantRepository):GetMapsUseCase {
    override suspend fun invoke(): Flow<NetworkResponseState<List<ValorantMapsEntity>>> =repository.getMaps()
}