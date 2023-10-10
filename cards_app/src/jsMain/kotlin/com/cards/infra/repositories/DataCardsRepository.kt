package com.cards.infra.repositories

import com.cards.domain.entities.Card
import com.cards.domain.repositories.CardsRepository
import com.cards.infra.datasources.GraphqlDatasource
import kotlin.collections.listOf

class DataCardsRepository(private val graphqlDatasource: GraphqlDatasource): CardsRepository {
    override suspend fun findByIdUsuario(idUsuario: Int): List<Card> {
        return graphqlDatasource.findCartaoByIdUsuario("1");
    }
}
