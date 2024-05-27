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
    fun `when integer is three prints Fizz`() = runTest {
        val result = CalculateFizzBuzz().execute(3)

        "Fizz" isEqualTo result
    }

    @Test
    fun `when integer is five prints Buzz`() = runTest {
        val result = CalculateFizzBuzz().execute(5)

        "Buzz" isEqualTo result
    }

    private infix fun Any.isEqualTo(other: Any) = assertEquals(this, other)
}
