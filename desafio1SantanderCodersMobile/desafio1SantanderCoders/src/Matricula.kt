import java.time.LocalDateTime

open class Matricula(open var aluno: Aluno,
                     open var curso: Curso,
                     open var dataMatricula: LocalDateTime) {

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, dataMatricula=$dataMatricula)"
    }
}