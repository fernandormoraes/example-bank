package com.cards.application

import com.apollographql.apollo3.ApolloClient
import com.cards.domain.usecases.FindUserCardsUseCase
import com.cards.infra.datasources.GraphqlDatasourceImpl
import com.cards.infra.repositories.DataCardsRepository
import io.kvision.core.Container
import io.kvision.html.main
import io.kvision.state.bind

val cardsPresenter: CardsPresenter = CardsPresenter(FindUserCardsUseCase(DataCardsRepository(GraphqlDatasourceImpl(
    ApolloClient.builder().serverUrl("http://localhost:8080/graphql").build()))))

fun Container.initializeCardsModule() {
    cardsPresenter.initialize()

    main().bind(cardsPresenter.cardsStore) { state ->
        if(!state.cardsLoading){
            cardsPage(state)
        }
    }
}
