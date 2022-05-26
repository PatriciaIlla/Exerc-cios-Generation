package Listadecompras

data class Client(val nome: String){

    var endereco = ""
    var telefone = ""

    constructor(nome: String, endereco: String):this(nome){
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String):this(nome, endereco){
        this.telefone = telefone
    }

    

    val listCompras = mutableListOf<String>()

    fun addCompras (valor: String){
        if (valor!=""){
            listCompras.add(valor)
            println("Produto adicionado com sucesso")
        }else{
            println("Produto inexistente")
        }

        fun removeCompras (valor: String){
            if (listCompras.contains(valor)){
                listCompras.remove(valor)
                println("Produto removido com sucesso!")
            }else{
                println("Produto inexistente")
            }
            fun mostrarCompras (){
                listCompras.forEach(){
                    println(it)
                }
            }
        }


    }

    fun removeCompras(compras: String) {

    }


}