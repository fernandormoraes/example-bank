package com.statement.application

import com.statement.domain.usecases.FindUserStatementUseCase
import com.statement.domain.usecases.FindUserStatementUseCaseParams
import io.kvision.redux.createTypedReduxStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class StatementPresenter(private val findUserStatementUseCase: FindUserStatementUseCase) :
        CoroutineScope by CoroutineScope(Dispatchers.Default + SupervisorJob())
{

    val statementStore = createTypedReduxStore(::statementReducer, StatementState())

    fun initialize() {
        val statements = findUserStatementUseCase.run(FindUserStatementUseCaseParams(1))

        statementStore.dispatch(StatementAction.StatementLoaded(statements = statements, statementCount = statements.size))
    }
}