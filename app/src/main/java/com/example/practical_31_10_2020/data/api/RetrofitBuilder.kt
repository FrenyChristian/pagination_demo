package com.example.practical_31_10_2020.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit


object RetrofitBuilder {

    private var retrofit: Retrofit? = null
    private const val BASE_URL = "https://sd2-hiring.herokuapp.com/api/"

    fun getRetrofitInstance(): Retrofit {


        if (retrofit == null) {

            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val httpClient = OkHttpClient.Builder()
            httpClient.readTimeout(60, TimeUnit.MINUTES)
            httpClient.connectTimeout(60, TimeUnit.MINUTES)

            httpClient.addInterceptor(loggingInterceptor)
            retrofit =  Retrofit.Builder().client(httpClient.build()).baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build()

        }
        return retrofit!!
    }
}