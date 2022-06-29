package com.generatioon.nofome

import com.generatioon.nofome.model.Categoria

data class Tipocesta
    (var id: Int,
     var nomeMarca: String,
     var descricao: String,
     var imagem: String,
     var valor: Double,
     var quantidade: Int,
     var categoria: Categoria)
{
}






