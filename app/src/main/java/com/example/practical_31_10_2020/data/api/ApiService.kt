package com.example.practical_31_10_2020.data.api

import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    //https://sd2-hiring.herokuapp.com/api/users?offset=10&limit=10

    @GET("users")
    suspend fun getUsers(@Query("offset") offset : Int, @Query("limit") limit : String) : Response<ResponseBody>
}