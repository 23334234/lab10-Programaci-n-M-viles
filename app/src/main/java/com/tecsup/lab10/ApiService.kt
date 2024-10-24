package com.tecsup.lab10

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=2")
    fun getUsers(): Call<UserResponse>
}
