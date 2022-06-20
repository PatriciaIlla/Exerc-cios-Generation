package com.generatioon.nofome

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import com.generatioon.nofome.databinding.FragmentProdutoBinding
import com.generatioon.nofome.model.Categoria


class CadastroprodutoFragment : Fragment() {

    private lateinit var binding: FragmentCadastroprodutoBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecionada = 0L

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCadastroprodutoBinding.inflate(layoutInflater,container,false)

        mainViewModel.listCategoria()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
          response->  Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }


        binding.buttoncadastrar.setOnClickListener{
            inserirbanco()
        }

        return binding.root
    }

    private fun spinnerCategoria(listCategoria: List<Categoria>?){
        if (listCategoria!= null){
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,listCategoria)

        }


        binding.spinnerCategoria.onItemSelectedListener =
            object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent:AdapterView<*>?,view: View?,position: Int,id: Long) {
                    val selected = binding.spinnerCategoria.selectedItem as Categoria
                    categoriaSelecionada = selected.id
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
    }

    private fun validarcampos(

         produtos: String,
         observacoes: String,
         valorCesta: String,
         imagemProduto: String
     ): Boolean{
         return !(

                         (produtos == "" ) ||
                         (observacoes == "") ||
                         (valorCesta == "") ||
                         (imagemProduto == "")
                 )
     }

     fun inserirbanco() {

         val produtos = binding.produtos.text.toString()
         val observacoes = binding.observacoes.text.toString()
         val valorCesta = binding.valorCesta.text.toString()
         val imagemProduto = binding.imagemProduto.text.toString()

         if (validarcampos(produtos,observacoes,valorCesta,imagemProduto)) {
             Toast.makeText(context,"Produto cadastrado com sucesso!",Toast.LENGTH_SHORT).show()
             findNavController().navigate(R.id.action_cadastroprodutoFragment_to_produtoFragment2)

         } else{ Toast.makeText(context,"Erro: Verifique os campos!", Toast.LENGTH_SHORT).show()

         }
         }
     }