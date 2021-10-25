fun main(args: Array<String>) {

    //Exercício 1

    // 1 - Crie um novo projeto chamado NomeandoVariaveis
    // 2 - Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e tipo sanguíneo
    // 3 - Pense como você pode nomear essas variáveis para ficarem fáceis de serem identificadas
    // 4 - Use a idade do usuário para calcular o ano de seu nascimento, usando o ano atual como base (2021)
    // 5 - No fim, printe todos os valores no console, juntamente com o ano em que o usuário nasceu

    var nome: String = ""
    var idade: Int = 0
    var prefEmprego: String = ""
    var nacionalidade: String = ""
    var tipoSanguineo: String = ""

    print("Dig seu Nome: ")
    nome = readLine()!!.toString()

    print("Dig sua Idade: ")
    idade = readLine()!!.toInt()

    print("Dig Cargo de Preferência: ")
    prefEmprego = readLine()!!.toString()

    print("Dig a Nacionalidade: ")
    nacionalidade = readLine()!!.toString()

    print("Dig o Tipo Sanguineo: ")
    tipoSanguineo = readLine()!!.toString()

    print("Olá $nome , confirmando seus dados: Sua idade é $idade anos nasceu em ${2021 - idade}" +
    ", o cargo de sua preferência é $prefEmprego , nacionalidade $nacionalidade "+
    "e tipo sanguíneo $tipoSanguineo")
}