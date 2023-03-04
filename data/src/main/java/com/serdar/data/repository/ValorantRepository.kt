package com.serdar.data.repository


import com.serdar.common.entity.ValorantEntity
import com.serdar.data.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface ValorantRepository {
    suspend fun getAgents(): Flow<NetworkResponseState<List<ValorantEntity>>>
}