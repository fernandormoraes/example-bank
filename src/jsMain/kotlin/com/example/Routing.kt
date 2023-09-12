package com.example

import com.example.shared.consts.View
import io.kvision.navigo.Navigo
import kotlin.js.RegExp

fun Navigo.initialize(): Navigo {
    return on(View.HOME.url, { _ ->
        Manager.homePage()
    })
}

fun stringParameter(params: dynamic, parameterName: String): String {
    return (params[parameterName]).toString()
}