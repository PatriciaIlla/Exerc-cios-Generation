package com.generation.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todolist.adapter.TarefaAdapter
import com.generation.todolist.adapter.TaskClickListener
import com.generation.todolist.databinding.FragmentListBinding
import com.generation.todolist.model.Tarefa

class ListFragment : Fragment(), TaskClickListener {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding
            .inflate(layoutInflater, container, false)

        mainViewModel.listTarefa()

        val tarefaAdapter = TarefaAdapter(this, mainViewModel, requireContext())

        binding.recyclerTarefa.adapter = tarefaAdapter
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener {
            mainViewModel.tarefaSelecionada = null
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response -> if (response.body() != null){
                tarefaAdapter.setList(response.body()!!)
        }
        }

        return binding.root
    }

    override fun onTaskClickListener(tarefa: Tarefa) {
        mainViewModel.tarefaSelecionada = tarefa
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

}