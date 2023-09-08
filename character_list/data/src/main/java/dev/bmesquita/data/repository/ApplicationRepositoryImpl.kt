package dev.bmesquita.data.repository

import dev.bmesquita.data.mapper.toCharacter
import dev.bmesquita.data.remote.ApplicationApi
import dev.bmesquita.domain.ApplicationRepository
import dev.bmesquita.domain.Character

class ApplicationRepositoryImpl(
    private val api: ApplicationApi
): ApplicationRepository {

    override suspend fun getCharacters(): Result<List<Character>> {
        return try {

            val response = api.getCharacters().charactersList

            Result.success(response.map { it.toCharacter() })

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}