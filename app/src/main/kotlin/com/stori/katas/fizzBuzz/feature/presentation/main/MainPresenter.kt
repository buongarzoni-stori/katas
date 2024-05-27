package com.stori.katas.fizzBuzz.feature.presentation.main

import androidx.compose.runtime.State

interface MainPresenter {
    val selectedNumber: State<String>
    val text: State<String>

    fun updateSelectedNumber(string: String)
    fun clickedCalculateFizzBuzz()
}
