fun main(args: Array<String>) {

    print("Digite um número para descobrir mês ao qual este pertence: ")
    var mes = readLine()!!.toInt()

        when(mes) {

            1 -> println("Este número corresponde a: Janeiro")
            2 -> println("Este número corresponde a: Fevereiro")
            3 -> println("Este número corresponde a: Março")
            4 -> println("Este número corresponde a: Abril")
            5 -> println("Este número corresponde a: Maio")
            6 -> println("Este número corresponde a: Junho")
            7 -> println("Este número corresponde a: Julho")
            8 -> println("Este número corresponde a: Agosto")
            9 -> println("Este número corresponde a: Setembro")
            10 -> println("Este número corresponde a: Outubro")
            11 -> println("Este número corresponde a: Novembro")
            12 -> println("Este número corresponde a: Dezembro")
            else -> println("Valor Inválido")

        }
}