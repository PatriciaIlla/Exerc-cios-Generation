class preguiça(override var nome: String, override var idade: Int) : animal{
    override fun emitirsom() {
        println("Aaaaah")
    }

    override fun deslocamento() {
        println("Dorme")
    }

}