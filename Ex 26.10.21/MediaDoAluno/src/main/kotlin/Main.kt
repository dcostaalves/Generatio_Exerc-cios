fun main(args: Array<String>) {

    //EX 1

    println("Digite a nota do 1° Bimestre: ")
    var nota1 = readLine()!!.toDouble()

    println("Digite a nota do 2° Bimestre: ")
    var nota2 = readLine()!!.toDouble()

    println("Digite a nota do 3° Bimestre: ")
    var nota3 = readLine()!!.toDouble()

    println("Digite a nota do 4° Bimestre: ")
    var nota4 = readLine()!!.toDouble()

    var media = (nota1+nota2+nota3+nota4)/4

    print("Sua média é: $media \n")

    if(media<=4.0){
        print("Reprovado")
    }else if(media>4.0 && media<=5.0){
        print("Regular")
    }else if(media>5.0 && media<=8.0){
        print("Boa!")
    }else if(media>8.0 && media<=10.0){
        print("Excelente!!!")
    }else{
        print("Valores Inválidos, refaça")
    }

}