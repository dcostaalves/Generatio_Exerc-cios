fun main(args: Array<String>) {

    //EX 2

    print("Digite o valor de suas vendas: ")
    var valor = readLine()!!.toDouble()

    if(valor>10000){
        print("Parabéns, você terá 30% de comissão, sendo:$ ${valor*0.3}")
    }else if (valor>=5000.00 && valor<10000.00){
        print("Você tem direito a 20% de Comissão, sendo:$ ${valor*0.2}")
    }else if (valor>1000.00 && valor<5000.00){
        print("Você tem direito a 10% de Comissão, sendo:$ ${valor*0.1}")
    }else{
        print("Sem direito a Comissão")
    }

}