package com.serdar.data.source.remote

import com.serdar.data.NetworkResponseState
import com.serdar.data.api.ValorantApiService
import com.serdar.data.dto.agents.Data as AgentsData
import com.serdar.data.dto.weapons.Data as WeaponsData
import com.serdar.data.dto.maps.Data as MapsData
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val valorantApi: ValorantApiService
) : RemoteDataSource {
    override suspend fun getAgents(): NetworkResponseState<List<AgentsData>> =
        try {
            val response = valorantApi.getAgents()
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getWeapons(): NetworkResponseState<List<WeaponsData>>  =
        try {
            val response = valorantApi.getWeapons()
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getMaps(): NetworkResponseState<List<MapsData>> =
        try {
            val response = valorantApi.getMaps()
            NetworkResponseState.Success(response.data)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getAgentsWithUuid(uuid: String): NetworkResponseState<List<com.serdar.data.dto.agents.detail.Data>> =
        try {
            val response = valorantApi.getAgentsWithUuid(uuid)
            NetworkResponseState.Success(listOf(response.data))
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }

    override suspend fun getWeaponsWithUuid(uuid: String): NetworkResponseState<List<com.serdar.data.dto.weapons.detail.Data>>  =
        try {
            val response = valorantApi.getWeaponsWithUuid(uuid)
            NetworkResponseState.Success(listOf( response.data))
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }
    override suspend fun getMapsWithUuid(uuid: String): NetworkResponseState<List<com.serdar.data.dto.maps.detail.Data>> =
        try {
            val response = valorantApi.getMapsWithUuid(uuid)
            NetworkResponseState.Success(listOf( response.data))
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }
}