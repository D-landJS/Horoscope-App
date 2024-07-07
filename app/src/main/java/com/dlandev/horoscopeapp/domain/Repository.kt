package com.dlandev.horoscopeapp.domain

import com.dlandev.horoscopeapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}