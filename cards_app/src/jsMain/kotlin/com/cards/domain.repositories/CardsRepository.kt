package com.cards.domain.repositories

import com.cards.domain.entities.Card

interface CardsRepository {
    suspend fun findByIdUsuario(idUsuario: Int): List<Card>
}