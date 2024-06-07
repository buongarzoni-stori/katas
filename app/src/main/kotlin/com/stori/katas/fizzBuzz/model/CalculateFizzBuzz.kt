package com.stori.katas.fizzBuzz.model

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val toggle: Toggle? = null
) {
    suspend fun execute(int: Int) = withContext(dispatcher) {
        when {
            int % 15 == 0 -> "FizzBuzz"
            int % 3 == 0 -> "Fizz"
            int % 5 == 0 -> "Buzz"
            else -> int.toString()
        }
    }
}