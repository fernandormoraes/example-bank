package com.example

import com.example.shared.consts.View
import com.example.shared.layout.footer
import com.example.shared.layout.headerNav
import com.example.shared.layout.homePage
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
        Routing.init(null, true, "#")
        Pace.init(require("pace-progressbar/themes/green/pace-theme-bounce.css"))
        Pace.setOptions(PaceOptions(manual = true))
        Manager.initialize()
        root("kvapp") {
            header().bind(Manager.exampleStore) { state ->
                headerNav(state)
            }
            main().bind(Manager.exampleStore) { state ->
                if (!state.appLoading) {
                    when (state.view) {
                        View.HOME -> {
                            homePage()
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
