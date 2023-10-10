package com.statement.infra.repositories

import com.statement.domain.entities.Statement
import com.statement.domain.repositories.StatementRepository
import kotlin.collections.listOf

class DataStatementRepository: StatementRepository {

    override fun findByIdUsuario(idUsuario: Int): List<Statement> {
        return listOf(
                Statement("10/03/2023", "R$ 472,33", "FRANK ALLONSO"),
                Statement("10/03/2023", "R$ 232,12", "XOPEE LTDA"),
                Statement("10/01/2023", "R$ 72,25", "PAGSEGURO PAGS"),
                Statement("26/09/2023", "R$ 26,00", "MERCADINHO DO CEARA")
        )
    }
}
