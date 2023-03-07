package com.serdar.data.api

import com.serdar.data.dto.agents.AgentsResponse
import com.serdar.data.dto.weapons.WeaponResponse
import retrofit2.http.GET

interface ValorantApiService {

@GET("v1/agents")
suspend fun getAgents(): AgentsResponse

@GET("v1/weapons")
suspend fun getWeapons():WeaponResponse
}