package com.serdar.data.repository

import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.data.di.coroutine.IoDispatcher
import com.serdar.data.dto.agents.Data
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.data.source.local.LocalDataSource
import com.serdar.data.source.remote.RemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ValorantRepositoryImpl @Inject constructor(
    private val bindGetAgentsRemoteSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val valorantMapperA: ValorantListMapper<Data, ValorantAgentsEntity>,
    private val valorantMapperW: ValorantListMapper<com.serdar.data.dto.weapons.Data, ValorantWeaponsEntity>,
    private val valorantMapperM: ValorantListMapper<com.serdar.data.dto.maps.Data, ValorantMapsEntity>,
    @IoDispatcher
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ValorantRepository {
    override suspend fun getAgents(): Flow<NetworkResponseState<List<ValorantAgentsEntity>>> {
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

    override suspend fun getWeapons(): Flow<NetworkResponseState<List<ValorantWeaponsEntity>>> {
        return flow {
            emit(NetworkResponseState.Loading)
            when (val response = bindGetAgentsRemoteSource.getWeapons()) {
                is NetworkResponseState.Error -> {
                    emit(NetworkResponseState.Error(response.exception))
                }
                is NetworkResponseState.Success -> {
                    emit(NetworkResponseState.Success(valorantMapperW.map(response.result)))
                }
                else -> {}
            }
        }.flowOn(ioDispatcher)
    }

    override suspend fun getMaps(): Flow<NetworkResponseState<List<ValorantMapsEntity>>> {
        return flow {
            emit(NetworkResponseState.Loading)
            when (val response = bindGetAgentsRemoteSource.getMaps()) {
                is NetworkResponseState.Error -> {
                    emit(NetworkResponseState.Error(response.exception))
                }
                is NetworkResponseState.Success -> {
                    emit(NetworkResponseState.Success(valorantMapperM.map(response.result)))
                }
                else -> {}
            }
        }.flowOn(ioDispatcher)
    }

    override fun readAllProduct(): Flow<List<FavoritesDataModel>> =
        localDataSource.readAllProduct()

    override suspend fun addValorantItem(item: FavoritesDataModel) {
        withContext(ioDispatcher) {
            try {
                localDataSource.addValorantItem(item)
            } catch (e: Exception) {
                println("Error")
            }
        }
    }

    override suspend fun deleteValorantItem(item: FavoritesDataModel) {
        withContext(ioDispatcher) {
            try {
                localDataSource.deleteValorantItem(item)
            } catch (e: Exception) {
                println("Error")
            }
        }
    }

    override suspend fun deleteAllValorantItem() {
        withContext(ioDispatcher) {
            try {
                localDataSource.deleteAllValorantItem()
            } catch (e: Exception) {
                println("Error")
            }
        }
    }
}
