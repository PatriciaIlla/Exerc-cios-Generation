package com.generatioon.viewmodelandlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mainviewmodel : ViewModel() {

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
    }
}