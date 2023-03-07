package com.serdar.domain.usecase.getagentsusecase

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAgentsUseCaseImpl @Inject constructor(
    private val repository: ValorantRepository
):GetAgentsUseCase {
    override suspend fun invoke(): Flow<NetworkResponseState<List<ValorantAgentsEntity>>> =repository.getAgents()
}