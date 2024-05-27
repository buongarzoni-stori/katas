package com.stori.katas.fizzBuzz.feature.view

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.stori.katas.fizzBuzz.feature.domain.View
import com.stori.katas.fizzBuzz.feature.presentation.navigation.NavigationPresenter

@Composable
internal fun BottomBar(
    presenter: NavigationPresenter,
) = BottomAppBar {
    val actualView = presenter.view.value
    IconButton(
        modifier = Modifier.weight(1f),
        onClick = { presenter.clickedHomeScreen() },
    ) {
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "",
            tint = actualView.getColor(com.stori.katas.fizzBuzz.feature.domain.MainView),
        )
    }
    IconButton(
        modifier = Modifier.weight(1f),
        onClick = { presenter.clickedListScreen() },
    ) {
        Icon(
            imageVector = Icons.Filled.List,
            contentDescription = "",
            tint = actualView.getColor(com.stori.katas.fizzBuzz.feature.domain.ListView),
        )
    }
}

@Composable
private fun View.getColor(expected: View) =
    if (this == expected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
