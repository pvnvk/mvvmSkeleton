package com.yaksha.android.network

import com.praveen.mvvmskeleton.ui.main.model.CovidCountryModel
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("/data.json")
    suspend fun getCountryData(): Response<CovidCountryModel>

    /*@FormUrlEncoded
    @POST("/users/authenticate")
    suspend fun login(@Field("username")userName: String,
                      @Field("password")password: String): Response<LoginResponseModel>

    @FormUrlEncoded
    @POST("/users/register")
    suspend fun register(@Field("username")userName: String,@Field("password") password: String,
                         @Field("name")name: String): Response<RegisterResponseModel>

    @FormUrlEncoded
    @POST("/users/validateOtp")
    fun verifyOtp(mobNo: String, otp: String): Response<OtpVerificationResponseModel>*/
}