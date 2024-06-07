package com.stori.katas.libraries

import android.util.Log

object Amplitude {
    fun log(
        event: String,
    ) {
        Log.d("Amplitude", event)
    }
}
