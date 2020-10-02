import java.time.LocalDateTime

open class ProfessorAdjunto(override var nome: String?,
                            override var sobrenome: String?,
                            override var tempoDeCasa: LocalDateTime?,
                            override var codigoProfessor: Int,
                            open var qtdHorasMonitoria: Long? ) : Professor(nome, sobrenome, tempoDeCasa,
    codigoProfessor){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoProfessor
    }

    override fun toString(): String {
        return "ProfessorAdjunto(nome=$nome, sobrenome=$sobrenome, tempoDeCasa=$tempoDeCasa, codigoProfessor=$codigoProfessor, qtdHorasMonitoria=$qtdHorasMonitoria)"
    }


}

