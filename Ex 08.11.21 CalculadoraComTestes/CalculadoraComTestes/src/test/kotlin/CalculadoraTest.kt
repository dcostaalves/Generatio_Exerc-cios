import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calcular = Calculadora()

    @Test
    fun soma() {
        assertEquals(5,calcular.soma(3,2))
    }

    @Test
    fun subtracao() {
        assertEquals(1, calcular.subtracao(5,4))
    }

    @Test
    fun multiplicacao() {
        assertEquals(6, calcular.multiplicacao(2,3))
    }

    @Test
    fun divisao() {
        assertEquals(3, calcular.divisao(9,3))
    }
}