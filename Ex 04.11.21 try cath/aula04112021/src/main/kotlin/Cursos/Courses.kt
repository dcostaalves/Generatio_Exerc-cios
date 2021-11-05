package Cursos

import alunos.Student

class Courses(val nomeCurso:String?, private var nomeProfessor: String?, private var ano:Int) {

    val listaEstudantes = mutableListOf<Student?>()

    fun cadastrar(student: Student?){
        listaEstudantes.add(student)
        println("Cadastrado c/ Sucesso!")
    }

    fun removerEstudante(student: Student?){
        if(listaEstudantes.contains(student)){
            listaEstudantes.remove(student)
            println("REMOVIDO c/ Sucesso!")
        }else{
            println("Estudante Inexistente!")
        }

    }

    fun numEstudantesCadastrados(){
        println("O n° de estudates cadastrados no curso é: ${listaEstudantes.size}")
    }

    fun melhorNota(){
        var melhorNota = listaEstudantes[0]?.nota
        for(i in listaEstudantes){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota dess curso é $melhorNota")
    }

    fun cadastrar (students: Array<Student?>?){
        if (students != null) {
            for (i in students) {
                listaEstudantes.add(i)
            }
        }
        print("Estudantes Cadastrados com Sucesso!")
    }

    fun verificarAluno (student: Student?){
        if(listaEstudantes.contains((student)){
            println("Esse estudante existe")
    }else{
        throw Exception ("O aluno não existe na lista!")
        }
    }
}