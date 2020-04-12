package com.yaksha.android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    const val BASE_URL = "https://api.covid19india.org"
    const val MOCKY_BASE_URL = "http://www.mocky.io"

    val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
    }

    val mockyRetrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(MOCKY_BASE_URL).addConverterFactory(GsonConverterFactory.create())
    }

    val apiService: ApiService by lazy {
        retrofitBuilder.build().create(ApiService::class.java)
    }

    val mockyApiService: ApiService by lazy {
        mockyRetrofitBuilder.build().create(ApiService::class.java)

    }

}