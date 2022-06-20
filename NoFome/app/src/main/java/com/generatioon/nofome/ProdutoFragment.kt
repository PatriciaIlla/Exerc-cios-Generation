package com.generatioon.nofome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generatioon.nofome.databinding.FragmentProdutoBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProdutoFragment : Fragment() {
  private lateinit var binding: FragmentProdutoBinding
  private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProdutoBinding.inflate(layoutInflater,container,false)

        mainViewModel.listprodut()

        val adapter = Tipocestaadapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)



        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_produtoFragment_to_cadastroprodutoFragment)
        }

        mainViewModel.myTipocestaResponse.observe(viewLifecycleOwner){
            response -> if (response != null){
                adapter.setList(response.body()!!)
        }

        }

        return binding.root

    }

}