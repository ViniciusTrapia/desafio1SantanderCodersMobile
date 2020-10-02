import java.time.LocalDate
import java.time.LocalDateTime


open class DigitalHouseManager(
        var listaAlunos: MutableList<Aluno> = mutableListOf(),
        var listaProfessores: MutableList<Professor> = mutableListOf(),
        var listaCursos: MutableList<Curso> = mutableListOf(),
        var listaMatriculas: MutableList<Matricula> = mutableListOf()) {


    open fun registrarCurso(nomeCurso: String, codigoCurso: Int, qtdMaxAlunos: Int) {

        var curso = Curso(nomeCurso, codigoCurso, null, null, qtdMaxAlunos, mutableListOf())
        listaCursos.add(curso)

    }


    open fun excluirCurso(codigoCurso: Int) {

        var curso = Curso(null, codigoCurso, null, null, null, mutableListOf())
        listaCursos.remove(curso)
    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, qtdHorasMonitoria: Long) {
        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, LocalDateTime.now(), codigo, qtdHorasMonitoria)
        listaProfessores.add(professorAdjunto)

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        var professorTitular = ProfessorTitular(nome, sobrenome, LocalDateTime.now(), codigo, especialidade)
        listaProfessores.add(professorTitular)
    }


    fun excluirProfessor(codigoProfessor: Int) {

        var nome = ""
        var sobrenome = ""
        var tempo = LocalDateTime.now()
        var especialidade = null
        var qtdHoras = null
        var professorTitular = ProfessorTitular(nome, sobrenome, tempo, codigoProfessor, especialidade)
        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, tempo, codigoProfessor, qtdHoras)


        listaProfessores.remove(professorAdjunto) || listaProfessores.remove(professorTitular)

    }


    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var oCurso: Curso? = null
        var oCara: Aluno? = null



        for (aluno in listaAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                oCara = aluno
                break
            }
        }

        for (curso in listaCursos) {
            if (curso.codigoCurso == codigoCurso) {
                oCurso = curso
                break
            }
        }

        if (oCurso != null && oCara != null && oCurso.qtdMaxAlunos != null) {
            var qtd = oCurso.qtdMaxAlunos
            if (oCurso.listaAlunosMatriculados.size  < qtd as Int && oCurso.qtdMaxAlunos != 0) {
                var matricula = Matricula(oCara, oCurso, LocalDateTime.now())
                listaMatriculas.add(matricula) && oCurso.adicionarAluno(oCara)
                return println("A matrícula foi realizada com sucesso")
            }
            else  {
                println("Infelizmente não foi possível realizar sua matrícula, acabaram as vagas!")
        }

        }


    }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        var curso = Curso(null,codigoCurso,null,null,null)
        var titular = ProfessorTitular(null,null, null,codigoProfessorTitular,null)
        var adjunto = ProfessorAdjunto(null,null,null,codigoProfessorAdjunto,null)
        var oCurso  = listaCursos[listaCursos.lastIndexOf(curso)]
        var oTitular = listaProfessores[listaProfessores.lastIndexOf(titular)]
        var oAdjunto =  listaProfessores[listaProfessores.lastIndexOf(adjunto)]

        oCurso.professorAdjunto = oAdjunto as ProfessorAdjunto
        oCurso.professorTitular = oTitular as ProfessorTitular
        listaCursos.remove(curso)
        listaCursos.add(oCurso)







    }

}












