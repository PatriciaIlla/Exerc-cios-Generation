package com.generatioon.inserindotodoreciclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        val buttonDelete = view.findViewById<Button>(R.id.buttonDelete)

        buttonDelete.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }


        return view

    }
}