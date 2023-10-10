package com.cards.application

import com.cards.domain.entities.Card
import com.core.shared.cards.defaultCard
import io.kvision.core.AlignItems
import io.kvision.core.Container
import io.kvision.html.*
import io.kvision.panel.vPanel

fun Container.cardsPage(state: CardsState) {
    div(className = "cards-page") {
        div(className = "banner") {
            div(className = "container") { h1("Cards", className = "logo-font") }
        }
        div(align = Align.CENTER, className = "container") {
            vPanel(alignItems = AlignItems.CENTER, spacing = 64) {
                if(!state.cardsLoading && state.cards.isNotEmpty()) {
                    div(className = "container") {
                        state.cards.forEachIndexed { index: Int, card: Card ->
                            defaultCard (
                                header = "Card " + (index + 1).toString()
                            ){
                                p ("CARD NAME: " + card.name)
                                p ("CARD NUMBER: " + card.cardNumber)
                                p ("CCV: " + card.ccv)
                                p ("VALIDITY: " + card.validity)
                                p (card.kind)
                            }
                        }

                    }
                }
            }
        }
    }
}
