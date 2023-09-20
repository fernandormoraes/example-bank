package com.home.shared.layout

import io.kvision.core.AlignItems
import io.kvision.core.Container
import io.kvision.html.Align
import io.kvision.html.button
import io.kvision.html.div
import io.kvision.html.h1
import io.kvision.html.h2
import io.kvision.html.p
import io.kvision.panel.TabPosition
import io.kvision.panel.hPanel
import io.kvision.panel.tab
import io.kvision.panel.tabPanel
import io.kvision.panel.vPanel
import io.kvision.utils.px

fun Container.homePage() {
    div(className = "home-page") {
        div(className = "banner") {
            div(className = "container") {
                h1("Example Bank", className = "logo-font")
                p("Modern Banking. Lasting relationships.")
            }
        }
        div(align = Align.CENTER, className = "container") {
            vPanel(alignItems = AlignItems.CENTER, spacing = 64) {
                div(className = "row") {
                    hPanel(spacing = 32, alignItems = AlignItems.CENTER, className = "container") {
                        button("Commercial Real State", "ion-home")
                        button("Private Banking", "ion-card")
                        button("Treasury management solutions", "ion-aperture")
                    }
                }
                div(className = "row") {
                    padding = 16.px

                    h2("Solutions built", align = Align.LEFT)
                    h2("for your needs.", align = Align.LEFT)
                    div { paddingTop = 16.px }
                    tabPanel(tabPosition = TabPosition.LEFT) {
                        tab("BUSINESS", "ion-briefcase") { div("Business description") }
                        tab("WEALTH", "ion-leaf") { div("Wealth description") }
                        tab("PERSONAL", "ion-person") { div("Personal description") }
                    }
                }
            }
        }
    }
}
