package com.core

import com.core.shared.consts.View
import io.kvision.redux.RAction

data class State(
        val appLoading: Boolean = true,
        val view: View = View.HOME,
) {
    private fun linkClassName(view: View) = if (this.view == view) "nav-link active" else "nav-link"

    val homeLinkClassName = linkClassName(View.HOME)
    val cardsLinkClassName = linkClassName(View.CARDS)
    val statementLinkClassName = linkClassName(View.STATEMENT)
}

sealed class ExampleAction : RAction {
    object AppLoaded : ExampleAction()
    object HomePage : ExampleAction()
    object CardsPage : ExampleAction()
    object StatementPage : ExampleAction()
}

fun exampleReducer(state: State, action: ExampleAction): State =
        when (action) {
            is ExampleAction.AppLoaded -> {
                state.copy(appLoading = false)
            }
            is ExampleAction.HomePage -> {
                state.copy(view = View.HOME)
            }
            is ExampleAction.CardsPage -> {
                state.copy(view = View.CARDS)
            }
            is ExampleAction.StatementPage -> {
                state.copy(view = View.STATEMENT)
            }
        }
