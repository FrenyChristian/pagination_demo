package com.example.practical_31_10_2020.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers(offset : Int, limit : String) = apiService.getUsers(offset, limit)

}