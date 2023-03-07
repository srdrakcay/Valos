package com.serdar.data.source.remote

import com.serdar.data.NetworkResponseState
import com.serdar.data.api.ValorantApiService
import com.serdar.data.dto.agents.Data
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val valorantApi: ValorantApiService
) : RemoteDataSource {
    override suspend fun getAgents(): NetworkResponseState<List<Data>> =
        try {
            val response = valorantApi.getAgents()
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getWeapons(): NetworkResponseState<List<com.serdar.data.dto.weapons.Data>>  =
        try {
            val response = valorantApi.getWeapons()
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

}