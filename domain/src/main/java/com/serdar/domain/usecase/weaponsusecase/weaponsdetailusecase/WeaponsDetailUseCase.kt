package com.serdar.domain.usecase.weaponsusecase.weaponsdetailusecase

import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface WeaponsDetailUseCase {
    suspend operator fun invoke(uuid: String): Flow<NetworkResponseState<List<ValorantWeaponsDetailEntity>>>
}