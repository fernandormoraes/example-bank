package com.core

import io.kvision.redux.createTypedReduxStore
import io.kvision.routing.Routing
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

object Manager : CoroutineScope by CoroutineScope(Dispatchers.Default + SupervisorJob()) {
    val exampleStore = createTypedReduxStore(::exampleReducer, State())

    fun initialize() {
        Routing.init().resolve()
        exampleStore.dispatch(ExampleAction.AppLoaded)
    }

    fun homePage() {
        exampleStore.dispatch(ExampleAction.HomePage)
    }
}
