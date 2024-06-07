package com.stori.katas.libraries

import android.util.Log

object Braze {
    const val EVENT = "fizz_buzz_calculation"

    fun log(
        event: String,
        properties: Map<String, String>,
    ) {
        //Log.d("Braze", "$event - properties:$properties")
    }
}
