import Cursos.Courses
import alunos.Student

fun main(args: Array<String>) {

    val rosnei = Student("Rosnei", "da Silva", 123, 50.0, 2)
    val maria = Student("Maria", "da Souza", 154, 80.0, 1)
    val henrique = Student("Henrique", "Dantas", 453, 10.0, 3)
    val rebeca = Student("Rebeca", "da Silva", 1553, 70.0, 1)

    rosnei.nomeCompleto()
    rosnei.mudarAnoSeAprovado()

    val cursoIngles = Courses("Ingles","Genivaldo",1)

    cursoIngles.cadastrar(rosnei)
    cursoIngles.cadastrar(maria)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.removerEstudante(rebeca)

    val estudantes: Array<Student?> = arrayOf(henrique, rebeca)
    cursoIngles.cadastrar(estudantes)
    cursoIngles.numEstudantesCadastrados()
    cursoIngles.melhorNota()

    val consulta = Cursos()

    try{
        cursoIngles.verificarAluno(rebeca)
    }catch (e: Exception){
        println(e.message) //aqui recuperamo a exceção e exibimos a mensagem dela
    }


}