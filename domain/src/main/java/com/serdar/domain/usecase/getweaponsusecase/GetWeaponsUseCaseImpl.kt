package com.serdar.domain.usecase.getweaponsusecase

import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeaponsUseCaseImpl @Inject constructor(
    private val repository: ValorantRepository
):GetWeaponsUseCase {
    override suspend fun invoke(): Flow<NetworkResponseState<List<ValorantWeaponsEntity>>> =repository.getWeapons()
}