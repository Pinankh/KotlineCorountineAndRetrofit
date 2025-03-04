package com.pinankh.corountineandretrofit.network

/**
 * Created by @Author Pinankh Patel on 04,March,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */
import com.pinankh.corountineandretrofit.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("users")
    suspend fun getUsers(): Response<List<UserResponse>>
}