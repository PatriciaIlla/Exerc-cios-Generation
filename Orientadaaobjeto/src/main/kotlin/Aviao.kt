class Aviao
    (var asas: Int,
     var tremdepouso: Int,
     var turbina: Int, ) {

    var voando = false


    fun voar() {
        if (voando) {
            println("O avião está no ar")
        } else {
            voando = true
            println("O avião já vai voar")
        }
    }
    fun pousar() {
        if (voando) {
            voando = false
            println("O avião já vai pousar")
        } else {
            println("O avião já está no chão")
        }
    }

}