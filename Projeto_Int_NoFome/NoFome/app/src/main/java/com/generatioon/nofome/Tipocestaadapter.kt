package com.generatioon.nofome

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.generatioon.nofome.databinding.CardLayoutBinding
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import java.time.temporal.ValueRange

class Tipocestaadapter(
    val basketClickListener: BasketClickListener,
    val mainViewModel: MainViewModel,
    val context: Context
): RecyclerView.Adapter<Tipocestaadapter.TipocestaViewHolder> (){

    private var listprodut = emptyList<Tipocesta>()

    class TipocestaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipocestaViewHolder {
        return TipocestaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent,false))


    }


    override fun onBindViewHolder(holder: TipocestaViewHolder, position: Int) {
        val produto = listprodut[position]
        Glide.with(context)
            .load(produto.imagem)
            .placeholder(com.bumptech.glide.R.drawable.abc_btn_check_material)
            .into(holder.binding.imageView)
        holder.binding.textCestabasica1.text = produto.nomeMarca
        holder.binding.textValor.text = produto.valor.toString()
        holder.binding.atualizarCestabutton.setOnClickListener{
             basketClickListener.onBasketClickListener(produto)
            }
        holder.binding.buttonDelete.setOnClickListener{
            showAlertDialog(produto.id)
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
    private fun showAlertDialog(id: Int){
        AlertDialog.Builder(context)
            .setTitle("Excluir cesta")
            .setMessage("Deseja excluir a cesta ?")
            .setPositiveButton("Sim"){
                _,_-> mainViewModel.deletarCesta(id)
            }
            .setNegativeButton("Não"){
                _,_->
            }.show()
    }

}

