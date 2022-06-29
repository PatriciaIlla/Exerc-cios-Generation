package com.generatioon.nofome

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generatioon.nofome.api.Repository
import com.generatioon.nofome.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
        ) : ViewModel() {

     var produtoSelecionado: Tipocesta? = null


    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> = _myCategoriaResponse

    private val _myTipocestaResponse =
        MutableLiveData<Response<List<Tipocesta>>>()

    val myTipocestaResponse: LiveData<Response<List<Tipocesta>>> = _myTipocestaResponse


    init {
        //listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            try{
                val response = repository.listCategoria()
                _myCategoriaResponse.value = response

            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }
     fun addProduto(tipocesta: Tipocesta){
         viewModelScope.launch {
             try{
                 val response = repository.addProduto(tipocesta)
                 Log.d("Opa", response.body().toString())

             }catch (e:Exception){
                 Log.d("Erro", e.message.toString())
             }
         }
     }

    fun listprodut(){
        viewModelScope.launch {
            try {
                val response = repository.listprodut()
                _myTipocestaResponse.value = response


            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun updateProdutos(tipocesta: Tipocesta){
        viewModelScope.launch {
            try {
                repository.updateProdutos(tipocesta)
                listprodut()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())

            }
        }
    }

    fun deletarCesta(id: Int){
        viewModelScope.launch {
            try {
                repository.deletarCesta(id)
                listprodut()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

}