package dev.bmesquita.domain

class GetCharactersUseCase(
    private val repository: ApplicationRepository
) {

    suspend operator fun invoke(): Result<List<Character>> {
        return repository.getCharacters()
    }
}