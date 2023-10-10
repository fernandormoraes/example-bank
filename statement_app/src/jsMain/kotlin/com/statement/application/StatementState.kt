package com.statement.application

import com.statement.domain.entities.Statement

data class StatementState (
    val statements: List<Statement> = listOf(),
    val statementLoading: Boolean = false
){

}

