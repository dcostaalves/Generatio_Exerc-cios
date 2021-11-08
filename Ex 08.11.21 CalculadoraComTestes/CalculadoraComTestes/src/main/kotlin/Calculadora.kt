import kotlin.math.pow

class Calculadora {

    fun soma (num1:Int, num2:Int){
        var resSoma = (num1 + num2)
    }

    fun subtracao (num1:Int, num2:Int){
        var resSub = (num1 - num2)
    }

    fun multiplicacao (num1:Int, num2:Int){
        var resMult = (num1 * num2)
    }

    fun divisao (num1:Int, num2:Int){
        var resDiv = (num1 / num2)
    }

    fun raizQuadrada (num1: Double){
        var resRaiz = num1.pow(1/2)
    }

    fun potencia (num1:Double, num2:Double){
        var resPot = num1.pow(num2)
    }
}