package com.stori.katas.fizzBuzz.feature.presentation

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.stori.katas.fizzBuzz.feature.domain.ListView
import com.stori.katas.fizzBuzz.feature.domain.MainView
import com.stori.katas.fizzBuzz.feature.domain.View

class MainPreview private constructor(
    view: View = MainView,
    selectedNumber: String = "1",
    text: String = "",
    fizzBuzzList: String? = null,
) : FizzBuzzPresenter {
    companion object {
        val fizzNumber = MainPreview(selectedNumber = "3", text = "3 = Fizz")
        val buzzNumber = MainPreview(selectedNumber = "5", text = "5 = Buzz")
        val fizzBuzzNumber = MainPreview(selectedNumber = "15", text = "15 = FizzBuzz")
        val listView = MainPreview(view = ListView)
        val listCompleted = MainPreview(
            view = ListView,
            fizzBuzzList = "1 = 1\n2 = 2\n3 = Fizz\n4 = 4\n5 = Buzz\n6 = Fizz\n7 = 7\n8 = 8\n9 = Fizz",
        )
    }

    override val view: State<View> = mutableStateOf(view)
    override val selectedNumber: State<String> = mutableStateOf(selectedNumber)
    override val text: State<String> = mutableStateOf(text)
    override val fizzBuzzList: State<String?> = mutableStateOf(fizzBuzzList)
    override val scrollState: State<ScrollState> = mutableStateOf(ScrollState(0))

    override fun updateSelectedNumber(string: String) = Unit
    override fun clickedCalculateFizzBuzz() = Unit
    override fun clickedHomeScreen() = Unit
    override fun clickedListScreen() = Unit
}
