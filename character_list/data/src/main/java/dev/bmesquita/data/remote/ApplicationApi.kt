package dev.bmesquita.data.remote

import retrofit2.http.GET

interface ApplicationApi {

    @GET("api/character")
    suspend fun getCharacters(): ApiResponse
}