package com.stori.katas.fizzBuzz.feature.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stori.katas.fizzBuzz.feature.presentation.MainPreview
import com.stori.katas.fizzBuzz.feature.presentation.main.MainPresenter

@Composable
fun MainView(
    mainPresenter: MainPresenter,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        ResultInformation(mainPresenter)
        InputField(mainPresenter)
        CalculateFizzBuzzButton(mainPresenter)
    }
}

@Composable
private fun ResultInformation(mainPresenter: MainPresenter) {
    Text(
        modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
        text = mainPresenter.text.value,
        style = MaterialTheme.typography.displayLarge,
        textAlign = TextAlign.Center,
    )
}

@Composable
private fun InputField(presenter: MainPresenter) = TextField(
    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
    value = presenter.selectedNumber.value,
    keyboardOptions = KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Number,
    ),
    onValueChange = { presenter.updateSelectedNumber(it) },
)

@Composable
private fun CalculateFizzBuzzButton(
    presenter: MainPresenter,
) = Button(
    modifier = Modifier.fillMaxWidth(),
    onClick = { presenter.clickedCalculateFizzBuzz() },
) {
    Text(
        text = "Calculate Fizz Buzz!",
        style = MaterialTheme.typography.headlineSmall,
    )
}

@Preview
@Composable
private fun FizzPreview() = FizzBuzzScreen(MainPreview.fizzNumber)

@Preview
@Composable
private fun BuzzPreview() = FizzBuzzScreen(MainPreview.buzzNumber)

@Preview
@Composable
private fun FizzBuzzPreview() = FizzBuzzScreen(MainPreview.fizzBuzzNumber)
