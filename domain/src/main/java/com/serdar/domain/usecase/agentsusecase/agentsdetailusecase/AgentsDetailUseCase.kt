package com.serdar.domain.usecase.agentsusecase.agentsdetailusecase

import com.serdar.common.entity.ValorantAgentsDetailEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface AgentsDetailUseCase {
    suspend operator fun invoke(uuid: String): Flow<NetworkResponseState<List<ValorantAgentsDetailEntity>>>
}