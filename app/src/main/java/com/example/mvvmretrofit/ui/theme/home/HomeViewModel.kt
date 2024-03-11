package com.example.mvvmretrofit.ui.theme.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofit.data.api.model.CharactersItem
import com.example.mvvmretrofit.data.api.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: CharacterRepository
) : ViewModel() {


    private val _state = MutableStateFlow(emptyList<CharactersItem>())
    val state: StateFlow<List<CharactersItem>>
        get() = _state

    init {
        viewModelScope.launch {
            val characters = repository.getCharacters()
            _state.value = characters
        }
    }

}