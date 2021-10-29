fun main(args: Array<String>) {

    var opcao = "sim"
    var usuario = "Novo"
    var escolha = 0


    println("Deseja seguir com escolha? Digite sim ou não: ")
    opcao = readLine()!!

    while(opcao == "sim") {
        print("Escolha 1: para Add convidados; 2: remover convidados ou 3: para cadastro de convidados; Dig aqui>: ")
        escolha = readLine()!!.toInt()
        var convidados = mutableListOf<String>()
        when (escolha) {

            1 -> {
                print("Digite o nome do convidado: ")
                var nomes = readLine()!!
                convidados.add(nomes)
                println(convidados)
                println("Deseja continuar? Dig sim ou não: ")
                opcao   = readLine()!!
            }
            2 -> {
                println("$convidados > Digite qual deseja remover: ")
                var nomes = readLine()!!
                convidados.remove(nomes)
                println("Deseja continuar? Dig sim ou não: ")
                opcao   = readLine()!!
            }
            3 -> {
                print("Digite o nome do convidado: ")
                var nomes = readLine()!!
                convidados.add(nomes)
                println(convidados)
                println("Deseja continuar? Dig sim ou não: ")
                opcao   = readLine()!!
            }
            else -> {
                println("Inv")
            }
        }


    }
}






