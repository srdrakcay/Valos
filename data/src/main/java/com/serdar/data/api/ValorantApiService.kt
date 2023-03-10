package com.serdar.data.api

import com.serdar.data.dto.agents.AgentsResponse
import com.serdar.data.dto.maps.MapsResponse
import com.serdar.data.dto.weapons.WeaponResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ValorantApiService {

    @GET("v1/agents")
    suspend fun getAgents(): AgentsResponse

    @GET("v1/agents/{uuid}")
    suspend fun getAgentsWithUuid(@Path("uuid") uuid: String) : AgentsResponse

    @GET("v1/weapons")
    suspend fun getWeapons(): WeaponResponse

    @GET("v1/weapons/{uuid}")
    suspend fun getWeaponsWithUuid(@Path("uuid") uuid: String) : WeaponResponse

    @GET("v1/maps")
    suspend fun getMaps(): MapsResponse

    @GET("v1/maps/{uuid}")
    suspend fun getMapsWithUuid(@Path("uuid") uuid: String) : MapsResponse
}