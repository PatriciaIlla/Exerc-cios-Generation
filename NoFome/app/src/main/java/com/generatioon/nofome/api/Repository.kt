package com.generatioon.nofome.api

import com.generatioon.nofome.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}