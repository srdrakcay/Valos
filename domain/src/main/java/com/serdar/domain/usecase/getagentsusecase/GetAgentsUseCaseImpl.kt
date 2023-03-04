package com.serdar.domain.usecase.getagentsusecase

import com.serdar.core.NetworkResponseState
import com.serdar.core.entity.ValorantEntity
import com.serdar.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAgentsUseCaseImpl @Inject constructor(
    private val repository: ValorantRepository):GetAgentsUseCase {
    override suspend fun invoke(): Flow<NetworkResponseState<List<ValorantEntity>>> =repository.getAgents()
}