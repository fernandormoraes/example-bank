package com.example

import com.cards.application.initializeCardsModule
import com.core.Manager
import com.core.shared.consts.View
import com.core.shared.layout.footer
import com.core.shared.layout.headerNav
import com.home.homePage
import com.statement.application.initializeStatementModule
import io.kvision.Application
import io.kvision.BootstrapCssModule
import io.kvision.BootstrapModule
import io.kvision.CoreModule
import io.kvision.html.header
import io.kvision.html.main
import io.kvision.module
import io.kvision.pace.Pace
import io.kvision.pace.PaceOptions
import io.kvision.panel.root
import io.kvision.require
import io.kvision.routing.Routing
import io.kvision.startApplication
import io.kvision.state.bind

class App : Application() {
    init {
        require("css/kvapp.css")
    }

    override fun start() {
        val routing = Routing.init(null, true, "#")

        routing.on(View.HOME.url, { _ -> Manager.homePage() })
                .on(View.CARDS.url, { _ -> Manager.cardsPage() })
                .on(View.STATEMENT.url, { _ -> Manager.statementPage() })

        Pace.init(require("pace-progressbar/themes/green/pace-theme-bounce.css"))
        Pace.setOptions(PaceOptions(manual = true))
        Manager.initialize()

        root("kvapp") {
            header().bind(Manager.exampleStore) { state -> headerNav(state) }
            main().bind(Manager.exampleStore) { state ->
                if (!state.appLoading) {
                    when (state.view) {
                        View.HOME -> {
                            homePage()
                        }
                        View.CARDS -> {
                            initializeCardsModule()
                        }
                        View.STATEMENT -> {
                            initializeStatementModule()
                        }
                    }
                }
            }
            footer()
        }
    }
}

fun main() {
    startApplication(::App, module.hot, BootstrapModule, BootstrapCssModule, CoreModule)
}
