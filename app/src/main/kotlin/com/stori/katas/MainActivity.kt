package com.stori.katas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.stori.katas.fizzBuzz.feature.presentation.FizzBuzzViewModel
import com.stori.katas.fizzBuzz.feature.view.FizzBuzzScreen
import com.stori.katas.ui.theme.KatasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: FizzBuzzViewModel = viewModel()
            KatasTheme {
                FizzBuzzScreen(viewModel)
            }
        }
    }
}
