class Cavalo(override var nome: String, override var idade: Int) : animal{
    override fun emitirsom() {
        println("relincha")
    }

    override fun deslocamento() {
        println("corre")
    }

}