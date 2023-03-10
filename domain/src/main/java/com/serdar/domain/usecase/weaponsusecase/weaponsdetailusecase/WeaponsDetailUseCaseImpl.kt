package com.serdar.domain.usecase.weaponsusecase.weaponsdetailusecase

import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeaponsDetailUseCaseImpl@Inject constructor(
    private val repository: ValorantRepository
):WeaponsDetailUseCase {
    override suspend fun invoke(uuid: String): Flow<NetworkResponseState<List<ValorantWeaponsDetailEntity>>> =repository.getWeaponsWithUuid(uuid)

    }

