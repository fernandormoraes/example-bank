package com.cards.application

import com.cards.domain.entities.Card
import io.kvision.redux.RAction

sealed class CardsAction: RAction {
    object CardsLoading : CardsAction()
    data class CardsLoaded(val cards: List<Card>, val cardsCount: Int) : CardsAction()
}

fun cardsReducer(state: CardsState, action: CardsAction): CardsState = when(action){
    is CardsAction.CardsLoading -> {
        state.copy(cards = listOf(), cardsLoading = true)
    }
    is CardsAction.CardsLoaded -> {
        state.copy(cards = action.cards, cardsLoading = false)
    }
}