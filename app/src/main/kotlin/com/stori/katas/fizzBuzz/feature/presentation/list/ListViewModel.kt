package com.stori.katas.fizzBuzz.feature.presentation.list

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stori.katas.fizzBuzz.model.CalculateFizzBuzz
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListViewModel(
    private val calculateFizzBuzz: CalculateFizzBuzz = CalculateFizzBuzz(),
) : ListPresenter, ViewModel() {
    private val _fizzBuzzList = mutableStateOf<String?>(null)
    override val fizzBuzzList: State<String?> = _fizzBuzzList

    override val scrollState: State<ScrollState> = mutableStateOf(ScrollState(0))

    init {
        fillList()
    }

    private fun fillList() = viewModelScope.launch {
        _fizzBuzzList.value = calculateFirst100Elements()
    }

    private suspend fun calculateFirst100Elements() = withContext(Dispatchers.IO) {
        (1..100)
            .fold("") { accumulated, int -> accumulated + generateRow(int) }
    }

    private suspend fun generateRow(int: Int) = "$int = ${calculateFizzBuzz.execute(int)}\n"
}
