fun main(args: Array<String>) {

    //Exercício 2
    //
    //1 - Crie um projeto no IntelliJ com o nome CirculoAreaPerimetro
    //2 - Crie um código que pede para o usuário digitar o diâmetro de um círculo (que será uma variável do tipo Int) e calcule a área e o perímetro (que serão Doubles).
    //4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados

    var area: Double = 0.0
    var perimetro: Double =0.0
    var diametro: Int = 0


    print("Digite a área do diametro: ")
    diametro = readLine()!!.toInt()

    var raio = diametro/2

    println("O valor do perímetro deste círculo é: ${2*3.14*raio}")
    println("O valor da área deste círculo é: ${3.14*(raio*raio)}")
    
}