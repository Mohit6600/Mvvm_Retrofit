package com.example.mvvm_retrofit

import retrofit2.Response
import retrofit2.http.GET

interface MyApi {

    @GET("posts")
    suspend fun getlist():Response<Result>
}