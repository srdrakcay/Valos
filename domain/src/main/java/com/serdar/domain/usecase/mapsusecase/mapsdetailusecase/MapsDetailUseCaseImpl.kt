package com.serdar.domain.usecase.mapsusecase.mapsdetailusecase

import com.serdar.common.entity.ValorantMapsDetailEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MapsDetailUseCaseImpl@Inject constructor(
    private val repository : ValorantRepository
):MapsDetailUseCase {
    override suspend fun invoke(uuid: String): Flow<NetworkResponseState<List<ValorantMapsDetailEntity>>> =repository.getMapsWithUuid(uuid)
    }
