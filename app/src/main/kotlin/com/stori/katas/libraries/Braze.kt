package com.stori.katas.libraries

import android.util.Log

object Braze {
    fun log(
        event: String,
        properties: Map<String, String>,
    ) {
        Log.d("Braze", "$event - properties:$properties")
    }
}
