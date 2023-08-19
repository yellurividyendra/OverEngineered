package com.example.chatbot.apiUse

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiUtilities {
    fun getApiInterface() : ApiInterface {
        return Retrofit.Builder()
            .baseUrl("https://api.openai.com/v1")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}