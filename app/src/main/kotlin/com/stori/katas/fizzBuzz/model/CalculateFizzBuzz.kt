package com.stori.katas.fizzBuzz.model

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val toggle: Toggle? = null,
    private val repository: FizzBuzzRepository? = null,
    private val eventTracker: EventTracker? = null,
) {
    suspend fun execute(int: Int) = withContext(dispatcher) {
        val origin: String
        val result: String
        if (toggle?.isFeatureFlagOn("fizzbuzz_service_call_enabled") == true) {
            origin = "server"
            result = repository?.calculate(int) ?: int.toString()
            val properties = mapOf(
                "number" to int.toString(),
                "result" to result,
                "origin" to origin
            )
            eventTracker?.send("fizz_buzz_calculation", properties)
            return@withContext result
        } else {
            when {
                int % 15 == 0 -> "FizzBuzz"
                int % 3 == 0 -> "Fizz"
                int % 5 == 0 -> "Buzz"
                else -> int.toString()
            }
        }
    }
}