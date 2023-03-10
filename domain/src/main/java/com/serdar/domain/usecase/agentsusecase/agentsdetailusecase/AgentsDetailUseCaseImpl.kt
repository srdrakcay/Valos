package com.serdar.domain.usecase.agentsusecase.agentsdetailusecase

import com.serdar.common.entity.ValorantAgentsDetailEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AgentsDetailUseCaseImpl @Inject constructor(
    private val repository: ValorantRepository
):AgentsDetailUseCase {
    override suspend fun invoke(uuid: String): Flow<NetworkResponseState<List<ValorantAgentsDetailEntity>>> =
        repository.getAgentsWithUuid(uuid)
    }
