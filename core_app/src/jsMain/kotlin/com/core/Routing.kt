package com.core

import com.core.shared.consts.View
import io.kvision.navigo.Navigo

fun Navigo.initialize(): Navigo {
    return on(View.HOME.url, { _ -> Manager.homePage() })
}

fun stringParameter(params: dynamic, parameterName: String): String {
    return (params[parameterName]).toString()
}
