package com.example.mvvmretrofit.data.api

import com.example.mvvmretrofit.data.api.model.CharactersItem
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINT)
    suspend fun getCharacters(): List<CharactersItem>

}