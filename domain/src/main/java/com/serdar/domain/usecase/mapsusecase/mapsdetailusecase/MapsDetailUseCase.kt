package com.serdar.domain.usecase.mapsusecase.mapsdetailusecase

import com.serdar.common.entity.ValorantMapsDetailEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface MapsDetailUseCase {
    suspend operator fun invoke(uuid:String): Flow<NetworkResponseState<List<ValorantMapsDetailEntity>>>
}