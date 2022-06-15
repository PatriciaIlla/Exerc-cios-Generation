package com.generatioon.nofome.api

import com.generatioon.nofome.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("Categoria")
    suspend fun listCategoria(): Response<List<Categoria>>
}