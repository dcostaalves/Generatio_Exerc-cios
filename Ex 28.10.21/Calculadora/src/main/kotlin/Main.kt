import kotlin.math.pow


fun main(args: Array<String>) {
        /*
    println("O valor da soma: ${adicao(5,6)}")
    println("O valor da Subtração: ${subt(5,6)}")
    println("O valor da Multiplicação: ${mult(5,6)}")
    println("O valor da Divisão: ${divisao(10,6)}")
    println("O valor da Potência: ${potencia(2.0,2.0)}")
        */



}

fun adicao (num1: Int, num2: Int): Int {
    return (num1+num2)
}

fun subt (num1: Int, num2: Int): Int {
    return (num1-num2)
}

fun mult (num1: Int, num2: Int): Int{
    return (num1*num2)
}

fun divisao (num1:Int, num2: Int): Int{
    return (num1/num2)
}

fun potencia (num: Double,num2: Double): Double{
    return num.pow(num2)
}


