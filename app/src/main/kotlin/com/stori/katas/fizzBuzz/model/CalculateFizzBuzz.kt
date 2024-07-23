package com.stori.katas.fizzBuzz.model

import com.stori.katas.fizzBuzz.infrastructure.FizzBuzzService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CalculateFizzBuzz(
    private val fizzBuzzService: FizzBuzzService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : Toggle {
    suspend fun execute(int: Int) = withContext(dispatcher) {

        if (isServiceOn(flag)) {
            fizzBuzzService.getCalculation(int)
        } else {
            when {
                int.mod(3) == 0 && int.mod(5) == 0 -> "FizzBuzz"
                int.mod(3) == 0 -> "Fizz"
                int.mod(5) == 0 -> "Buzz"
                else -> int.toString()
            }
        }
    }

    override fun isServiceOn(flag: String): Boolean {
        return if (flag == "flag") {
            true
        } else false
    }
}
