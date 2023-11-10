package com.example.countryapp.Api

import com.atilsamancioglu.countryapp.model.Country
import com.example.countryapp.model.Country
import retrofit2.Response
import retrofit2.http.GET

interface CountryAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json

    @GET("https://restcountries.com/v2/")
    suspend fun getCountries(): Response<List<Country>>

}