package com.core.shared.layout

import com.core.State
import com.core.shared.consts.View
import io.kvision.core.Container
import io.kvision.core.Display
import io.kvision.html.div
import io.kvision.html.li
import io.kvision.html.link
import io.kvision.html.nav
import io.kvision.html.ul

fun Container.headerNav(state: State) {
    nav(className = "navbar navbar-light") {
        div(className = "container") {
            link("Example Bank", "#${View.HOME.url}", className = "navbar-brand")
            ul(className = "nav navbar-nav pull--right") {
                display = Display.INLINEBLOCK
                li(className = "nav-item") {
                    display = Display.INLINEBLOCK
                    link("Home", "#${View.HOME.url}", className = state.homeLinkClassName)
                }
                li(className = "nav-item") {
                    display = Display.INLINEBLOCK
                    link("My Cards", "#${View.CARDS.url}", className = state.cardsLinkClassName)
                }
                li(className = "nav-item") {
                    display = Display.INLINEBLOCK
                    link(
                            "Statement",
                            "#${View.STATEMENT.url}",
                            className = state.statementLinkClassName
                    )
                }
            }
        }
    }
}
