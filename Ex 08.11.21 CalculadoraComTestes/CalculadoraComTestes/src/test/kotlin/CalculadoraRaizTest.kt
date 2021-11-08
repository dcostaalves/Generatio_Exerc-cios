import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraRaizTest {

    val calcularRaiz = Calculadora()

    @Test
    fun raizQuadrada() {
        assertEquals(4.0, calcularRaiz.raizQuadrada(16.0))
    }
}