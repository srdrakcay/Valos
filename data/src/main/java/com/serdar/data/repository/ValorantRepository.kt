package com.serdar.data.repository


import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface ValorantRepository {
    suspend fun getAgents(): Flow<NetworkResponseState<List<ValorantAgentsEntity>>>

    suspend fun getWeapons(): Flow<NetworkResponseState<List<ValorantWeaponsEntity>>>


}