package com.generatioon.nofome.api

import com.generatioon.nofome.Tipocesta
import com.generatioon.nofome.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
    suspend fun addProduto(tipocesta: Tipocesta):
            Response<Tipocesta>{
        return RetrofitInstance.api.addProduto(tipocesta)
    }
    suspend fun listprodut(): Response<List<Tipocesta>>{
        return  RetrofitInstance.api.listprodut()
    }

    suspend fun updateProdutos(tipocesta: Tipocesta): Response<Tipocesta>{
        return RetrofitInstance.api.updateProdutos(tipocesta)
    }

    suspend fun deletarCesta(id: Int): Response<Tipocesta>{
        return RetrofitInstance.api.deletarCesta(id)
    }
}