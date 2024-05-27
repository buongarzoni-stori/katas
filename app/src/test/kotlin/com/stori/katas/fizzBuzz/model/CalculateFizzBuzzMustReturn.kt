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
    fun `the FizzBuzz case`() = runTest {
        val result = CalculateFizzBuzz().execute(15)

        "FizzBuzz" isEqualTo result
    }

    private infix fun Any.isEqualTo(other: Any) = assertEquals(this, other)
}
