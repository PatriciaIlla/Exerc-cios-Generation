package com.generatioon.nofome

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import com.generatioon.nofome.databinding.FragmentProdutoBinding


class CadastroprodutoFragment : Fragment() {

    private lateinit var binding: FragmentCadastroprodutoBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCadastroprodutoBinding.inflate(layoutInflater,container,false)

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            Log.d("Requisicao", it.body().toString())
        }


        binding.buttoncadastrar.setOnClickListener{
            inserirbanco()
        }

        return binding.root
    }

     fun validarcampos(
         tipoCesta: String,
         produtos: String,
         observacoes: String,
         valorCesta: String,
         imagemProduto: String
     ): Boolean{
         return !(
                         (tipoCesta == "" || tipoCesta.length>20) ||
                         (produtos == "" ) ||
                         (observacoes == "") ||
                         (valorCesta == "") ||
                         (imagemProduto == "")
                 )
     }

     fun inserirbanco() {
         val tipoCesta = binding.tipoCesta.text.toString()
         val produtos = binding.produtos.text.toString()
         val observacoes = binding.observacoes.text.toString()
         val valorCesta = binding.valorCesta.text.toString()
         val imagemProduto = binding.imagemProduto.text.toString()

         if (validarcampos(tipoCesta,produtos,observacoes,valorCesta,imagemProduto)) {
             Toast.makeText(context,"Produto cadastrado com sucesso!",Toast.LENGTH_SHORT).show()
             findNavController().navigate(R.id.action_cadastroprodutoFragment_to_produtoFragment2)

         } else{ Toast.makeText(context,"Erro: Verifique os campos!", Toast.LENGTH_SHORT).show()

         }
         }
     }