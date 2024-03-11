package com.example.mvvmretrofit.data.api.repository

import com.example.mvvmretrofit.data.api.CharacterApi
import com.example.mvvmretrofit.data.api.model.CharactersItem
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<CharactersItem> {
        return characterApi.getCharacters()
    }

}