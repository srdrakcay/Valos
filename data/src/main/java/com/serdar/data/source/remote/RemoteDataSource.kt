package com.serdar.data.source.remote

import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.Data

interface RemoteDataSource {
    suspend fun getAgents(): NetworkResponseState<List<Data>>
}