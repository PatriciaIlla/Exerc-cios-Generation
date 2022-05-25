class gato(override var nome: String, override var idade: Int) : animal {
    override fun emitirsom() {
        println("Miau")
    }

    override fun deslocamento() {
        println("desfila")
    }


}