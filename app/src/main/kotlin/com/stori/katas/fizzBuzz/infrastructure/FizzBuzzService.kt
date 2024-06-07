package com.stori.katas.fizzBuzz.infrastructure

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FizzBuzzService {
    private val results = listOf(
        "Fizz",
        "Buzz",
        "FizzBuzz",
        "BuzzBuzz",
        "FizzFizz",
        "FizzFizzBuzz",
        "FizzBuzzBuzz",
        "FizzFizzBuzzBuzz",
    )

    suspend fun getCalculation(int: Int) = withContext(Dispatchers.IO) {
        (results + int.toString()).random()
    }
}
