package com.stori.katas.fizzBuzz.model

import com.stori.katas.fizzBuzz.infrastructure.FizzBuzzService
import com.stori.katas.libraries.Amplitude
import com.stori.katas.libraries.Apptimize
import com.stori.katas.libraries.Braze
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
) {
    suspend fun execute(int: Int) = withContext(dispatcher) {

        Amplitude.log(Amplitude.EVENT) // not here

        if (Apptimize.isFeatureFlagOn(Apptimize.SERVICE_FLAG)) {
            val service = FizzBuzzService()
            val result = service.getCalculation(int)

            sendBrazeEvent(// not here
                num = "$int",
                result = result,
                origin = "server"
            )

            result
        } else {
            val result = when {
                int isDivisibleBy 3 -> "Fizz"

                int isDivisibleBy 5 -> "Buzz"

                else -> int.toString()
            }

            sendBrazeEvent(// not here
                num = "$int",
                result = result,
                origin = "mobile"
            )

            result
        }
    }

    private fun sendBrazeEvent(num: String, result: String, origin: String) {
        val properties = mapOf(
            "number" to num,
            "result" to result,
            "origin" to origin
        )

        Braze.log(Braze.EVENT, properties)
    }

    private infix fun Int.isDivisibleBy(int: Int): Boolean = this.mod(int) == 0
}
