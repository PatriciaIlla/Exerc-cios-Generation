package com.generatioon.nofome

import com.generatioon.nofome.model.Categoria

data class Tipocesta
    (var id: Int,
     var nomeMarca: String,
     var descricao: String,
     var imagem: String,
     var quantidade: Int,
     var valor: Number,
     var categoria: Categoria)
{
}






