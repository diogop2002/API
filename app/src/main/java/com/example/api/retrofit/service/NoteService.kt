package com.example.api.retrofit.service

import com.example.api.model.Note
import retrofit2.Call
import retrofit2.http.GET
interface NoteService {
    @GET("api/notes")
    fun list(): Call<List<Note>>
}