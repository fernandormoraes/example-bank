package com.statement.application

import com.statement.domain.usecases.FindUserStatementUseCase
import com.statement.infra.repositories.DataStatementRepository
import io.kvision.core.Container
import io.kvision.html.main
import io.kvision.state.bind

val statementPresenter: StatementPresenter = StatementPresenter(FindUserStatementUseCase(DataStatementRepository()))

fun Container.initializeStatementModule() {
    statementPresenter.initialize()

    main().bind(statementPresenter.statementStore) { state ->
        if(!state.statementLoading){
            statementPage(state)
        }
    }
}
