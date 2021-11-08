import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraPotTest {

    val calacularPot = Calculadora()
    @Test
    fun potencia() {
        assertEquals(16.0, calacularPot.potencia(2.0,4.0))
    }
}