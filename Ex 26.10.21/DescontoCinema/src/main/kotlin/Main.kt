fun main(args: Array<String>) {

    //EX 3

    var valorIngr = 25.00


    println("Seja bem vindo!\nPor favor, digite sua idade: ")
    var idade = readLine()!!.toInt()

    println("Digite a quantidade de ingressos: ")
    var qtdeIngr = readLine()!!.toInt()



    if(idade<5){
        print("Possui direito de 60% de desconto, Valor Desc:$ ${valorIngr*0.6}+" +
                ", Total a ser pago: $ ${valorIngr*1.4}")
    }else if(idade>=60){
        print("Possui direito de 55% de desconto, Valor Desc:$ ${valorIngr*0.55}" +
                ", Total a ser pago: $ ${valorIngr*1.45}")
    }else if(qtdeIngr>1){
        print("Você tem direito a 30% de desconto em cada ingresso"+
            "\n $qtdeIngr, logo o valor a ser pago é: $ ${qtdeIngr*valorIngr*1.7}")
    }else{print("Você não se encaixa em nenhuma promoção vigente, logo o valor a ser pago é: $ $valorIngr")

    }
     }
