package com.generatioon.nofome

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generatioon.nofome.databinding.FragmentCadastroprodutoBinding
import com.generatioon.nofome.model.Categoria


class CadastroprodutoFragment : Fragment() {

    private lateinit var binding: FragmentCadastroprodutoBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecionada = 0L
    private var produtoSelecionado: Tipocesta? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCadastroprodutoBinding.inflate(layoutInflater,container,false)

        carregarDados()

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
         imagem: String
     ): Boolean{
         return !(

                         (produtos == "" ) ||
                         (observacoes == "") ||
                         (valorCesta == "") ||
                         (imagem == "")
                 )
     }

     fun inserirbanco() {

         val nomeMarca = binding.produtos.text.toString()
         val descricao = binding.observacoes.text.toString()
         val imagem = binding.imagem.text.toString()
         val valor = binding.valorCesta.text.toString()
         val quantidade = binding.quantidade.text.toString()
         val categoria = Categoria(categoriaSelecionada, null, null)

         if (validarcampos(nomeMarca, descricao, valor, imagem)) {
             val salvar: String
             if (produtoSelecionado != null){
                 salvar = "Produto Atualizado"
                 val tipocesta = Tipocesta(produtoSelecionado?.id!!,
                     nomeMarca, descricao, imagem, valor.toDouble(), quantidade.toInt(), categoria)
                 mainViewModel.updateProdutos(tipocesta)

             }else{
                 salvar = "Produto Adicionado"
                 val tipocesta = Tipocesta(0, nomeMarca, descricao, imagem, valor.toDouble(), quantidade.toInt(), categoria )
                 mainViewModel.addProduto(tipocesta)
             }


             Toast.makeText(context,salvar,Toast.LENGTH_SHORT).show()
             findNavController().navigate(R.id.action_cadastroprodutoFragment_to_produtoFragment2)

         } else{ Toast.makeText(context,"Erro: Verifique os campos!", Toast.LENGTH_SHORT).show()

         }
         }
         private fun carregarDados(){
             produtoSelecionado = mainViewModel.produtoSelecionado
             if (produtoSelecionado != null){
                 binding.produtos.setText(produtoSelecionado?.nomeMarca)
                 binding.observacoes.setText(produtoSelecionado?.descricao)
                 binding.imagem.setText(produtoSelecionado?.imagem)
                 binding.valorCesta.setText(produtoSelecionado?.valor.toString())
                 binding.quantidade.setText(produtoSelecionado?.quantidade.toString())
             }
         }

     }