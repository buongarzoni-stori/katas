package com.stori.katas.fizzBuzz.model

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
) {
    suspend fun execute(int: Int) = withContext(dispatcher) {
        when {
            isDivisibleBy(int, 3) -> "Fizz"
            else -> int.toString()
        }
    }

    private fun isDivisibleBy(intA: Int, intB: Int): Boolean = intA.mod(intB) == 0
}
