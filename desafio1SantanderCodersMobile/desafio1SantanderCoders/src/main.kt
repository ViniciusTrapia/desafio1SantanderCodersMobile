import java.time.LocalDateTime

fun main() {



var digitalHouseManager = DigitalHouseManager(mutableListOf(), mutableListOf(), mutableListOf(), mutableListOf())



digitalHouseManager.registrarProfessorAdjunto("Edu","Android", 1, 50)
digitalHouseManager.registrarProfessorAdjunto("Edu","Android", 2, 50)
digitalHouseManager.registrarProfessorTitular("Ceeeeee","Android",3,"Android")
digitalHouseManager.registrarProfessorTitular("César","Android",4,"Android")
digitalHouseManager.registrarAluno("Vinicius","Trapia",1)
digitalHouseManager.registrarAluno("Teste","teste", 2)
digitalHouseManager.registrarCurso("Android",5,1)
digitalHouseManager.registrarCurso("Front",7,1)
digitalHouseManager.alocarProfessores(7,3,1)
digitalHouseManager.excluirCurso(5)
digitalHouseManager.excluirProfessor(4)
digitalHouseManager.matricularAluno(1,7)
digitalHouseManager.matricularAluno(2,7)


   // val codigo = digitalHouseManager.listaAlunos[0]
   // for(x in 0 until digitalHouseManager.listaAlunos.size -1)




    println(digitalHouseManager.listaAlunos)
println(digitalHouseManager.listaProfessores)


println(digitalHouseManager.listaCursos)
println(digitalHouseManager.listaMatriculas)

}


