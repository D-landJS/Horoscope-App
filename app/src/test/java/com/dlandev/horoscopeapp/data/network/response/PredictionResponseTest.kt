package com.dlandev.horoscopeapp.data.network.response

import com.dlandev.horoscopeapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe  horoscopeResponse.horoscope
    }
}