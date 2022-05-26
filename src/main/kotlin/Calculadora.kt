import kotlin.math.sqrt

class Calculadora {
    companion object{
        fun soma(x1: Int, x2: Int): Int{
            return x1 + x2
        }

        fun sub(x1: Int, x2: Int): Int{
            return x1 - x2

        }
        fun div(x1: Int, x2: Int): Int {
            return x1 / x2
        }

        fun mult(x1: Int, x2: Int): Int {
            return x1 * x2
        }
        fun porcentagem(x1: Double, x2: Double): Double{
            return x1 * (x2/100)

        }
        fun raiz(x1:Double): Double = sqrt(x1)

        }

    }
