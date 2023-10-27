package com.example.api.retrofit

import com.example.api.retrofit.service.NoteService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class RetrofitInitializer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://adamastor.ipt.pt/DAM-API")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun noteService() = retrofit.create(NoteService::class.java)
}