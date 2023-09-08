package dev.bmesquita.domain

interface ApplicationRepository {

    suspend fun getCharacters(): Result<List<Character>>
}