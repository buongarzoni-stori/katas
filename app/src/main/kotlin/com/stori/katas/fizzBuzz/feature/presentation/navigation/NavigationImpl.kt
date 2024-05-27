package com.stori.katas.fizzBuzz.feature.presentation.navigation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.stori.katas.fizzBuzz.feature.domain.ListView
import com.stori.katas.fizzBuzz.feature.domain.MainView
import com.stori.katas.fizzBuzz.feature.domain.View

class NavigationImpl: NavigationPresenter {
    private val _view = mutableStateOf<View>(MainView)
    override val view: State<View> = _view

    override fun clickedHomeScreen() {
        _view.value = MainView
    }

    override fun clickedListScreen() {
        _view.value = ListView
    }
}
