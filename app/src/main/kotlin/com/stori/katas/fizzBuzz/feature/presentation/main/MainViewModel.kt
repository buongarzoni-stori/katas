package com.stori.katas.fizzBuzz.feature.presentation.main

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stori.katas.fizzBuzz.model.CalculateFizzBuzz
import kotlinx.coroutines.launch

class MainViewModel(
    private val calculateFizzBuzz: CalculateFizzBuzz = CalculateFizzBuzz(),
) : MainPresenter, ViewModel() {

    private val _selectedNumber = mutableStateOf("")
    override val selectedNumber: State<String> = _selectedNumber

    private val _text = mutableStateOf("")
    override val text: State<String> = _text

    override fun updateSelectedNumber(string: String) {
        if (string.isBlank()) {
            setSelectedNumber("")
        } else {
            string.toIntOrNull() ?: return
            setSelectedNumber(string)
        }
    }

    override fun clickedCalculateFizzBuzz() {
        val int = getSelectedInteger() ?: return
        updateText(int)
    }

    private fun updateText(int: Int) = viewModelScope.launch {
        _text.value = "$int = ${calculateFizzBuzz.execute(int)}"
    }

    private fun getSelectedInteger() = _selectedNumber.value.toIntOrNull()

    private fun setSelectedNumber(string: String) {
        _selectedNumber.value = string
        _text.value = string
    }
}
