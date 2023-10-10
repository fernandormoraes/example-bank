package com.statement.application

import com.statement.domain.entities.Statement
import com.core.shared.cards.defaultCard
import io.kvision.core.*
import io.kvision.html.*
import io.kvision.panel.vPanel
import io.kvision.utils.perc
import io.kvision.utils.px

fun Container.statementPage(state: StatementState) {
    div(className = "statement-page") {
        div(className = "banner") {
            div(className = "container") { h1("Statement", className = "logo-font") }
        }
        div(align = Align.CENTER, className = "container") {
            vPanel(alignItems = AlignItems.CENTER, spacing = 64) {
                if(!state.statementLoading && state.statements.isNotEmpty()) {
                    div(className = "container") {
                        state.statements.forEachIndexed { index: Int, statement: Statement ->
                            div (align = Align.LEFT){
                                background = Background(color = Color.rgb(240,240,240))
                                padding = 24.px
                                borderRadius = 12.px
                                Button( "", icon = "wallet")
                                p(
                                    statement.name
                                )
                                p(
                                    statement.valor
                                )
                                p(
                                    statement.date
                                )
                            }
                            div(align = Align.CENTER){
                                height = 1.px
                                background = Background(color = Color.rgb(240, 240, 240) )
                                margin = 16.px
                                paddingRight = 20.perc
                                paddingLeft = 20.perc
                            }
                        }

                    }
                }
            }
        }
    }
}
