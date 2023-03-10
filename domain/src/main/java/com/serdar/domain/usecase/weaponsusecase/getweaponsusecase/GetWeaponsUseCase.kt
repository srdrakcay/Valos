package com.serdar.domain.usecase.weaponsusecase.getweaponsusecase

import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface GetWeaponsUseCase {
    suspend operator fun invoke(): Flow<NetworkResponseState<List<ValorantWeaponsEntity>>>
}