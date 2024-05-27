package com.stori.katas.fizzBuzz.feature.presentation.list

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.State

interface ListPresenter {
    val fizzBuzzList: State<String?>
    val scrollState: State<ScrollState>
}
