package com.core.shared.cards

import io.kvision.core.Component
import io.kvision.core.Container
import io.kvision.html.P
import io.kvision.html.div
import io.kvision.html.h5
import io.kvision.html.p

fun Container.defaultCard(
        header: String? = null,
        contentBuilder: P.() -> Unit,
) {
    div(className = "card") {
        if (header != null) {
            div(header, className = "card-header")
        }
        div(className = "card-body") {
            p(className = "card-text", init = contentBuilder)
        }
    }
}
