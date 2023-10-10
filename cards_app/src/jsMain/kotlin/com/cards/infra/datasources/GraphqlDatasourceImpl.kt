package com.cards.infra.datasources

import com.apollographql.apollo3.ApolloClient
import com.cards.FindCartaoClienteQuery
import com.cards.domain.entities.Card

class GraphqlDatasourceImpl (private val apolloClient: ApolloClient) : GraphqlDatasource {
    override suspend fun findCartaoByIdUsuario(idCliente: String): List<Card> {
        val response = apolloClient.query(FindCartaoClienteQuery(clienteId = "1")).execute()

        val cartoes = mutableListOf<Card>()

        response.data?.findCartaoCliente?.forEach {
            if(it != null) {
                cartoes.add(Card(
                    cardNumber = it.numero,
                    ccv = it.numeroDeSeguranca.toInt(),
                    kind = it.tipo,
                    name = it.tipo,
                    validity = "02/28"))
            }
        }

        return cartoes
    }
}