package com.cards.application

import com.cards.domain.entities.Card

data class CardsState (
    val cards: List<Card> = listOf(),
    val cardsLoading: Boolean = false
){

}

