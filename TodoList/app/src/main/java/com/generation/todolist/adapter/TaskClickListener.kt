package com.generation.todolist.adapter

import com.generation.todolist.model.Tarefa

interface TaskClickListener {

    fun onTaskClickListener(tarefa: Tarefa)
}