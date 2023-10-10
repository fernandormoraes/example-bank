package com.cards.infra.datasources

import com.cards.domain.entities.Card
import com.cards.type.Cartao

interface GraphqlDatasource {
    suspend fun findCartaoByIdUsuario(idCliente: String): List<Card>
}