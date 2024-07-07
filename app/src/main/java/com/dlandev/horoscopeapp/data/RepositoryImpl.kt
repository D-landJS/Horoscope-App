package com.dlandev.horoscopeapp.data

import android.util.Log
import com.dlandev.horoscopeapp.data.network.HoroscopeApiService
import com.dlandev.horoscopeapp.data.network.response.PredictionResponse
import com.dlandev.horoscopeapp.domain.Repository
import com.dlandev.horoscopeapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Leon", "Ha ocurrido un error ${it.message}") }

        return null
    }
}