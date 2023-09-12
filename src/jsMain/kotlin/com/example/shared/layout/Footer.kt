package com.example.shared.layout

import com.example.shared.consts.View
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.footer
import io.kvision.html.link
import io.kvision.html.span

fun Container.footer() {
    footer {
        div(className = "container") {
            link("example bank", "#${View.HOME.url}", className = "logo-font")
            span(
                "An web banking example application ", rich = true, className = "attribution"
            )
        }
    }
}