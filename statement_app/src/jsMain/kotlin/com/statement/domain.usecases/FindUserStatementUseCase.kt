package com.statement.domain.usecases

import com.statement.domain.entities.Statement
import com.statement.domain.repositories.StatementRepository

class FindUserStatementUseCase (private val statementRepository: StatementRepository){
    fun run(params: FindUserStatementUseCaseParams) : List<Statement>{
        return statementRepository.findByIdUsuario(params.idUser);
    }
}

final class FindUserStatementUseCaseParams (val idUser: Int){}