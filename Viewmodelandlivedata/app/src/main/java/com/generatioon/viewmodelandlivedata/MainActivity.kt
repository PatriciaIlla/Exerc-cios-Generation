package com.generatioon.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generatioon.viewmodelandlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainviewmodel: Mainviewmodel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainviewmodel = ViewModelProvider(this)
            .get(Mainviewmodel::class.java)

        mainviewmodel.cont.observe(this){
            binding.textresultado.text = it.toString()
        }

        binding.buttonClique.setOnClickListener{
            mainviewmodel.addNum()

        }
    }
}