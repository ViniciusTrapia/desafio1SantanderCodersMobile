import java.time.LocalDateTime
import java.util.*

open class Professor(open var nome: String?,
                     open var sobrenome: String?,
                     open var tempoDeCasa: LocalDateTime?,
                     open var codigoProfessor: Int ) {


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
        return "Professor $nome $sobrenome  cód $codigoProfessor, tempoDeCasa=$tempoDeCasa)"
    }


}



