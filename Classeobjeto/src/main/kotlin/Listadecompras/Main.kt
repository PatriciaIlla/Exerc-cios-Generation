import Listadecompras.Client


fun main() {

    println("Digite o seu nome: ")
    val nome = readln()

    println("Digite o seu endereço: ")
    val endereco = readln()

    println("Digite o seu telefone: ")
    val telefone = readln()

    println()

    try {
        val name = Client(nome)
        while (true) {
            println("1- Adicionar compras")
            println("2- Remover compras")
            println("3- Mostrar compras")
            println("4- Finalizar compras")

            print("Digite um dos números acima: ")
            var opt = readln().toInt()
            println()

            when (opt) {
                1 -> {
                    println("Adicione um produto")
                    var Compras = readln()
                    name.addCompras(Compras)
                }
                2 -> {
                    println("Remova um produto")
                    var Compras = readln()
                    name.run { removeCompras(Compras) }
                }

                3 -> {
                    name.listCompras
                }

                4 -> {
                    break
                }
            }

        }

    } catch (e:Exception){
        println(e.message)
    }
    }