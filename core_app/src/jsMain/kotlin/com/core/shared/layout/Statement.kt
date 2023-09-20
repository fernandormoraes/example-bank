package com.core.shared.layout

import io.kvision.core.Container
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.p

fun Container.statementPage() {
    div(className = "statement-page") {
        div(className = "banner") {
            div(className = "container") {
                h1("User Statement", className = "logo-font")
                p("User statement page.")
            }
        }
    }
}
