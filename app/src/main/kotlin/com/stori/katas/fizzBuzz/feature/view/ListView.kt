package com.stori.katas.fizzBuzz.feature.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stori.katas.fizzBuzz.feature.presentation.list.ListPresenter
import com.stori.katas.fizzBuzz.feature.presentation.MainPreview

@Composable
fun ListView(
    presenter: ListPresenter,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "This are the first 100 numbers as fizz buzz!",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
        )
        ShowList(presenter)
    }
}

@Composable
private fun ShowList(presenter: ListPresenter) {
    val result = presenter.fizzBuzzList.value
    if (result == null) {
        CircularProgressIndicator()
    } else {
        Row {
            Box(modifier = Modifier.fillMaxWidth(0.4f))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(presenter.scrollState.value),
                text = result,
            )
        }
    }
}

@Preview
@Composable
private fun ListPreview() = FizzBuzzScreen(MainPreview.listView)

@Preview
@Composable
private fun ListCompletedPreview() = FizzBuzzScreen(MainPreview.listCompleted)
