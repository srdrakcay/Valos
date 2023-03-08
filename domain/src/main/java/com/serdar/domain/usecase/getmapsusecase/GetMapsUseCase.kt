package com.serdar.domain.usecase.getmapsusecase

import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface GetMapsUseCase {
    suspend operator fun invoke(): Flow<NetworkResponseState<List<ValorantMapsEntity>>>
}