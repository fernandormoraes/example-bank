package com.core.shared.layout

import com.core.shared.consts.View
import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.footer
import io.kvision.html.link
import io.kvision.html.span

fun Container.footer() {
    footer {
        div(className = "container") {
            link("example bank", "#${View.HOME.url}", className = "logo-font")
            span("A web banking example application ", rich = true, className = "attribution")
        }
    }
}
