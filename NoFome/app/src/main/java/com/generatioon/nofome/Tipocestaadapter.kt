package com.generatioon.nofome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generatioon.nofome.databinding.CardLayoutBinding
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import java.time.temporal.ValueRange

class Tipocestaadapter: RecyclerView.Adapter<Tipocestaadapter.TipocestaViewHolder> (){

    var listprodut = emptyList<Tipocesta>()

    class TipocestaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipocestaViewHolder {
        return TipocestaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent,false))


    }


    override fun onBindViewHolder(holder: TipocestaViewHolder, position: Int) {
        val produto = listprodut[position]

        holder.binding.textCestabasica1.text = produto.tipo
        holder.binding.textValor.
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

fun setList(list:List<Tipocesta>){
    listprodut = list

    notifyDataSetChanged()
}

}