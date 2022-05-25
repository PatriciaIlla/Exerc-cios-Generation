fun main(args: Array<String>) {

     val gato = gato("felix" ,4)
    val cavalo = Cavalo("loupi", 10)
    val preguiça = preguiça("tutu" ,5)

    gato.emitirsom()
    cavalo.emitirsom()
    preguiça.emitirsom()

    gato.deslocamento()
    cavalo.deslocamento()
    preguiça.deslocamento()
}