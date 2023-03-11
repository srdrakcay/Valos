package com.serdar.data.source.remote

import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.agents.Data



interface RemoteDataSource {
    suspend fun getAgents(): NetworkResponseState<List<Data>>

    suspend fun getWeapons(): NetworkResponseState<List<com.serdar.data.dto.weapons.Data>>

    suspend fun getMaps(): NetworkResponseState<List<com.serdar.data.dto.maps.Data>>

    suspend fun getAgentsWithUuid(uuid:String):NetworkResponseState<List<com.serdar.data.dto.agents.detail.Data>>

    suspend fun getWeaponsWithUuid(uuid:String):NetworkResponseState<List<com.serdar.data.dto.weapons.detail.Data>>

    suspend fun getMapsWithUuid(uuid:String):NetworkResponseState<List<com.serdar.data.dto.maps.detail.Data>>
}