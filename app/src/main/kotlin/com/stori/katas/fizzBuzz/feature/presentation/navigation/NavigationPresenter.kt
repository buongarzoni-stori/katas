package com.stori.katas.fizzBuzz.feature.presentation.navigation

import androidx.compose.runtime.State
import com.stori.katas.fizzBuzz.feature.domain.View

interface NavigationPresenter {
    val view: State<View>

    fun clickedHomeScreen()
    fun clickedListScreen()
}
