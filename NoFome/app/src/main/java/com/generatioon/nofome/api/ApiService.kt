package com.generatioon.nofome.api

import com.generatioon.nofome.Tipocesta
import com.generatioon.nofome.model.Categoria
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("Categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

    @POST("Produtos")
    suspend fun  addProduto(
        @Body tipocesta: Tipocesta
    ): Response<Tipocesta>

    @GET("Produtos")
    suspend fun  listprodut(
    ): Response<List<Tipocesta>>


}