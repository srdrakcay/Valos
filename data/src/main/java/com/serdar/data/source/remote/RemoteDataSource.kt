package com.serdar.data.source.remote

import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.agents.Data


interface RemoteDataSource {
    suspend fun getAgents(): NetworkResponseState<List<Data>>

    suspend fun getWeapons(): NetworkResponseState<List<com.serdar.data.dto.weapons.Data>>

    suspend fun getMaps(): NetworkResponseState<List<com.serdar.data.dto.maps.Data>>
}