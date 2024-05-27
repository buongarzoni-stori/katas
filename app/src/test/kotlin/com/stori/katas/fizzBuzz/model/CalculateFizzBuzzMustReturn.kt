package com.stori.katas.fizzBuzz.model

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculateFizzBuzzMustReturn {
    @Test
    fun `the same Integer as a String`() = runTest {
        val result = CalculateFizzBuzz().execute(2)

        "2" isEqualTo result
    }

    @Test
    fun `when enter a integer multiple of 15 should return fizzbuzz`() = runTest {
        val result = CalculateFizzBuzz().execute(15)
        "FizzBuzz" isEqualTo result
    }

    @Test
    fun `when enter a integer multiple of 3 should return fizz`() = runTest{
        val result = CalculateFizzBuzz().execute(3)
        result isEqualTo "Fizz"
    }

    @Test
    fun `when enter a integer multiple of 5 should return buzz`() = runTest{
        val result = CalculateFizzBuzz().execute(5)
        result isEqualTo "Buzz"
    }

    private infix fun Any.isEqualTo(other: Any) = assertEquals(this, other)
}
