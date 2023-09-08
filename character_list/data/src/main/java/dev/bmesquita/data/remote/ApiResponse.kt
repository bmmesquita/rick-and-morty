package dev.bmesquita.data.remote

import com.squareup.moshi.Json
import dev.bmesquita.domain.Character

data class ApiResponse(

    @Json(name = "results")
    val charactersList: List<CharacterDto>
)
