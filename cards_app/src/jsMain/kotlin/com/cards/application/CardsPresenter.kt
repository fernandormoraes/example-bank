package com.cards.application

import com.cards.domain.usecases.FindUserCardsUseCase
import com.cards.domain.usecases.FindUserCardsUseCaseParams
import io.kvision.redux.createTypedReduxStore
import kotlinx.coroutines.*

class CardsPresenter(private val findUserCardsUseCase: FindUserCardsUseCase) :
        CoroutineScope by CoroutineScope(Dispatchers.Default + SupervisorJob())
{

    val cardsStore = createTypedReduxStore(::cardsReducer, CardsState())

    fun initialize() {
        launch {
            val cards =  findUserCardsUseCase.run(FindUserCardsUseCaseParams(1))

            cardsStore.dispatch(CardsAction.CardsLoaded(cards = cards, cardsCount = cards.size))
        }.start()
    }
}