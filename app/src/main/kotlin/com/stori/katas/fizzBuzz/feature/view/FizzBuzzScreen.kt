package com.stori.katas.fizzBuzz.feature.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stori.katas.components.animations.AnimatedSlide
import com.stori.katas.fizzBuzz.feature.domain.ListView
import com.stori.katas.fizzBuzz.feature.domain.MainView
import com.stori.katas.fizzBuzz.feature.presentation.FizzBuzzPresenter

@Composable
fun FizzBuzzScreen(
    presenter: FizzBuzzPresenter,
) = Scaffold(
    bottomBar = { BottomBar(presenter) }
) { paddingValues ->
    Box(
        modifier = Modifier
            .padding(paddingValues)
            .padding(top = 24.dp, bottom = 8.dp)
            .padding(horizontal = 16.dp),
    ) {
        AnimatedSlide(
            targetState = presenter.view.value,
            slideRightIf = { it == MainView },
        ) {
            when (it) {
                MainView -> MainView(presenter)
                ListView -> ListView(presenter)
            }
        }
    }
}
