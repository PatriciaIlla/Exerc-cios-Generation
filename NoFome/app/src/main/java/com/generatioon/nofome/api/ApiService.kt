package com.generatioon.nofome.api

import com.generatioon.nofome.Tipocesta
import com.generatioon.nofome.model.Categoria
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

    @POST("produtos")
    suspend fun  addProduto(
        @Body tipocesta: Tipocesta
    ): Response<Tipocesta>

    @GET("produtos")
    suspend fun  listprodut(
    ): Response<List<Tipocesta>>

    @PUT("produtos")
    suspend fun updateProdutos(
      @Body tipocesta: Tipocesta
    ): Response<Tipocesta>


}