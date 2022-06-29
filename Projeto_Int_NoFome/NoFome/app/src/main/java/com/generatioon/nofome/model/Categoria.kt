package com.generatioon.nofome.model

import com.generatioon.nofome.Tipocesta

data class Categoria(
    var id: Long,
    var descricao: String?,
    var produtos: List<Tipocesta>?
) {

    override fun toString(): String {
        return descricao!!
    }


    }