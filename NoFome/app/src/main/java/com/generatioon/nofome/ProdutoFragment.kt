package com.generatioon.nofome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generatioon.nofome.databinding.FragmentProdutoBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProdutoFragment : Fragment() {
  private lateinit var binding: FragmentProdutoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProdutoBinding.inflate(layoutInflater,container,false)


        val listprodutos = listOf(
           Tipocesta (
               "Cesta pequena",
               45.55
                   )
        )

        val adapter = Tipocestaadapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)

        adapter.setList(listprodutos)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_produtoFragment_to_cadastroprodutoFragment)
        }

        return binding.root

    }
}