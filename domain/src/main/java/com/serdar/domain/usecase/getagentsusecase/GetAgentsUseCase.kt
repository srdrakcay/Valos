package com.serdar.domain.usecase.getagentsusecase

import com.serdar.common.entity.ValorantEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface GetAgentsUseCase {
    suspend operator fun invoke(): Flow<NetworkResponseState<List<ValorantEntity>>>
}