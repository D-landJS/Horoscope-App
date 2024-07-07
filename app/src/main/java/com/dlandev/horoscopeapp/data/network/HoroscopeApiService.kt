package com.dlandev.horoscopeapp.data.network

import com.dlandev.horoscopeapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String) : PredictionResponse

    @GET
    suspend fun getDetail()
}