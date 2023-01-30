package com.geektech.lovecalculator

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun calculateLove(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "7ad41f085cmsh4175f88f8207980p145e95jsn309d649846d8",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"): Call<LoveModel>
}