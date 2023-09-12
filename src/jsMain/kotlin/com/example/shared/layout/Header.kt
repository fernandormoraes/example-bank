package com.example.shared.layout;

import com.example.State
import com.example.shared.consts.View
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.li
import io.kvision.html.link
import io.kvision.html.nav
import io.kvision.html.ul

fun Container.headerNav(state: State) {
    nav(className = "navbar navbar-light") {
        div(className = "container") {
            link("Example Bank", "#${View.HOME.url}", className = "navbar-brand")
            if (!state.appLoading) {
                ul(className = "nav navbar-nav pull-xs-right") {
                    li(className = "nav-item") {
                        link("Home", "#${View.HOME.url}", className = state.homeLinkClassName)
                    }
                }
            }
        }
    }
}