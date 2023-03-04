package com.serdar.data.api

import com.serdar.data.dto.AgentsResponse
import retrofit2.http.GET

interface ValorantApiService {

@GET("v1/agents")
suspend fun getAgents(): AgentsResponse
}