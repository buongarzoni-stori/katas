package com.stori.katas.fizzBuzz.model

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculateFizzBuzzMustReturn {

    private val service: FizzBuzzService = mockk()

    @Test
    fun `the same Integer as a String`() = runTest {
        val result = CalculateFizzBuzz().execute(2)

        "2" isEqualTo result
    }

    @Test
    fun `Fizz if the number is divisible by 3`() = runTest {
        val result = CalculateFizzBuzz().execute(3)

        "Fizz" isEqualTo result
    }

    @Test
    fun `Buzz if the number is divisible by 5`() = runTest {
        val result = CalculateFizzBuzz().execute(5)

        "Buzz" isEqualTo result
    }

    @Test
    fun `if fizzbuzz_service_call_enabled is on call web service`() = runTest {

        //Given
        val input = 5

        //When
        CalculateFizzBuzz().execute(input)

        //Then
        coVerify {
            service.execute(input)
        }
    }


    private infix fun Any.isEqualTo(other: Any) = assertEquals(this, other)
}
