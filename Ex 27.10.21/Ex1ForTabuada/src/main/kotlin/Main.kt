fun main(args: Array<String>) {

    //FOR

    //1 - Faça um programa que leia um valor e imprima sua tabuada (aceite apenas números entre 1 e 10).
    // Imprima, logo em seguida, a tabuada ao contrário
        /*
    println("Digite o valor que deseja calcular a tabuada, entre 1 e 10: ")
    var num = readLine()!!.toInt()

    for(x in 10 downTo 1){
        println("$num X $x = ${num*x} ")
    }

        */

    //2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
        /*
    var par = 0
    var impar= 0

    println("Dig o 1° númeoro da sequência a ser analisada")
    var prim = readLine()!!.toInt()

    println("Dig o 2° númeoro da sequência a ser analisada")
    var seg = readLine()!!.toInt()

    for (x in prim..seg){
        if(x % 2==0){
            par ++
        }else impar++
    }
    println("A qtde de números pares = $par")
    println("A qtde de números ímpares = $impar")
        */

    //WHILE

    //3 - Crie um programa para ler 4 notas e mostrar a média delas.
        /*
    var num1 =0
    var num2 = 0
    var num3 = 0
    var num4= 0
    var cont = 0

    //for(nota in 1..4)

        while (cont<1) {
            cont++

            print("Digite o valor da 1° nota: ")
            num1 = readLine()!!.toInt()

            print("Digite o valor da 2° nota: ")
            num2 = readLine()!!.toInt()

            print("Digite o valor da 3° nota: ")
            num3 = readLine()!!.toInt()

            print("Digite o valor da 4° nota: ")
            num4 = readLine()!!.toInt()
        }


    var media = (num1+num2+num3+num4)/4

    print("Sua Média Final é: $media")
        */


    //DO ... WHILE

    //4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares

        /*
    var cont = 0
    var par = 0
    var impar = 0
    var num = 0

    while (cont<10) {
        print("Dig um número: ")
        num = readLine()!!.toInt()
        cont++

        if (num % 2 == 0) {
            par++
        } else impar++
    }
    println("A Qtde de números pares no irtervalo: $par ")
    println("A Qtde de números ímpares no irtervalo: $impar ")
        */



    //DO ... WHILE

    //5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    //No final, mostre:

    //- A soma dos números digitados.
    //- A média deles
    //- O menor número digitado
    //- O maior número digitado


    var num = 1
    var soma = 0
    var media = 0
    var cont =0
    var maior = 1
    var menor = 1

     do {
         print("Digite um valor: ")
         num = readLine()!!.toInt()
         soma+=num


         if (num>maior){
             maior = num
         }else if(num<menor){
             menor=num
         }
         cont++


     }while (num!=0)

    media = soma/(cont-1)
     print("Soma: $soma \nMédia: $media \n Maior N° Dig: $maior \n Menor N° Dig: $menor")

}