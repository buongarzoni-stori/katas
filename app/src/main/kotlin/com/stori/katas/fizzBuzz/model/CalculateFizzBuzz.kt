package com.stori.katas.fizzBuzz.model

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
) {
    suspend fun execute(int: Int) = withContext(dispatcher) {
        int.toString()
    }
}
