package com.generatioon.nofome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generatioon.nofome.databinding.CardLayoutBinding
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import java.time.temporal.ValueRange

class Tipocestaadapter(
    val basketClickListener: BasketClickListener,
    val mainViewModel: MainViewModel
): RecyclerView.Adapter<Tipocestaadapter.TipocestaViewHolder> (){

    private var listprodut = emptyList<Tipocesta>()

    class TipocestaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipocestaViewHolder {
        return TipocestaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent,false))


    }


    override fun onBindViewHolder(holder: TipocestaViewHolder, position: Int) {
        val produto = listprodut[position]

        holder.binding.textCestabasica1.text = produto.nomeMarca
        holder.binding.textValor.text = produto.valor.toString()
        holder.itemView.setOnClickListener{
            basketClickListener.onBasketClickListener(produto)
        }
    }

    override fun getItemCount(): Int {
        return listprodut.size
    }

    fun setList(list: List<Tipocesta>) {
        listprodut = list.sortedByDescending{
            it.id
        }
        notifyDataSetChanged()

    }

}

