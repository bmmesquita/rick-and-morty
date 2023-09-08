package dev.bmesquita.presentation

import dev.bmesquita.domain.Character

data class ListState(
    val isLoading: Boolean = false,
    val hasError: Boolean = false,
    val charactersList: List<Character> = emptyList()
)