import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{
    @Test
    fun soma(){
      assertEquals(8, Calculadora.soma(4,4))
    }

    @Test
    fun sub(){
        assertEquals(5, Calculadora.sub(7,2))
    }

    @Test
    fun div() {
        assertEquals(10, Calculadora.div(20, 2))
    }
    @Test
    fun mult(){
        assertEquals(10, Calculadora.mult(5,2))
    }
    @Test
    fun porcentagem(){
        assertEquals(20.0, Calculadora.porcentagem(50.0,40.0) )
    }
    @Test
    fun raiz(){
        assertEquals(5.0, Calculadora.raiz(x1 = 25.0))
    }
}
