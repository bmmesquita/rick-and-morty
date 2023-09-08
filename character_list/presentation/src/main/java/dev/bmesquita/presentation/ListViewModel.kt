package dev.bmesquita.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.bmesquita.domain.GetCharactersUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase
): ViewModel() {

    var state by mutableStateOf(ListState())
        private set

    init {

        state = state.copy(isLoading = true)

        viewModelScope.launch {

            getCharactersUseCase()
                .onSuccess {  list ->
                    state = state.copy(isLoading = false, charactersList = list)
                }
                .onFailure {
                    state = state.copy(isLoading = false, hasError = true)
                }
        }
    }
}