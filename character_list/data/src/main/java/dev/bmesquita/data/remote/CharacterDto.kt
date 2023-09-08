package dev.bmesquita.data.remote

import com.squareup.moshi.Json

data class CharacterDto(

    @Json(name = "id")
    val id: Int,

    @Json(name = "name")
    val name: String,

    @Json(name = "type")
    val type: String,

    @Json(name = "image")
    val image: String
)