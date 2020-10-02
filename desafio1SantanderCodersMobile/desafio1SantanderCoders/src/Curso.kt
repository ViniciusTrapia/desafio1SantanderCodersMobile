

open class Curso(
    open var nomeCurso: String?,
    open var codigoCurso: Int?,
    open var professorTitular: ProfessorTitular?,
    open var professorAdjunto: ProfessorAdjunto?,
    open var qtdMaxAlunos: Int?,
    open var listaAlunosMatriculados: MutableList<Aluno> = mutableListOf()
) {



    open fun adicionarAluno(aluno: Aluno): Boolean {

        var qtd = qtdMaxAlunos


        return if (qtd != null && qtd > listaAlunosMatriculados.size) {
            listaAlunosMatriculados.add(aluno)
        } else
            return false

        }







    open fun excluirAluno(aluno: Aluno){
        listaAlunosMatriculados.remove(aluno)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoCurso ?: 0
    }

    override fun toString(): String {
        return "Curso(nomeCurso=$nomeCurso, codigoCurso=$codigoCurso, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, qtdMaxAlunos=$qtdMaxAlunos, listaAlunosMatriculados=$listaAlunosMatriculados)"
    }


}