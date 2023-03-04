package com.serdar.data.repository

import com.serdar.common.entity.ValorantEntity
import com.serdar.data.NetworkResponseState
import com.serdar.data.di.coroutine.IoDispatcher
import com.serdar.data.dto.Data
import com.serdar.data.mapper.ValorantListMapper
import com.serdar.data.source.remote.RemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ValorantRepositoryImpl @Inject constructor(
    private val bindGetAgentsRemoteSource: RemoteDataSource,
    private val valorantMapperA: ValorantListMapper<Data, ValorantEntity>,
    @IoDispatcher
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ValorantRepository {
    override suspend fun getAgents(): Flow<NetworkResponseState<List<ValorantEntity>>> {
        return flow {
            emit(NetworkResponseState.Loading)
            when (val response = bindGetAgentsRemoteSource.getAgents()) {
                is NetworkResponseState.Error -> {
                    emit(NetworkResponseState.Error(response.exception))
                }
                is NetworkResponseState.Success -> {
                    emit(NetworkResponseState.Success(valorantMapperA.map(response.result)))
                }
                else -> {}
            }
        }.flowOn(ioDispatcher)
    }
}
