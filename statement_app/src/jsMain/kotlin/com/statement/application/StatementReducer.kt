package com.statement.application

import com.statement.domain.entities.Statement
import io.kvision.redux.RAction

sealed class StatementAction: RAction {
    object StatementLoading : StatementAction()
    data class StatementLoaded(val statements: List<Statement>, val statementCount: Int) : StatementAction()
}

fun statementReducer(state: StatementState, action: StatementAction): StatementState = when(action){
    is StatementAction.StatementLoading -> {
        state.copy(statements = listOf(), statementLoading = true)
    }
    is StatementAction.StatementLoaded -> {
        state.copy(statements = action.statements, statementLoading = false)
    }
    else -> {
        state.copy()
    }
}