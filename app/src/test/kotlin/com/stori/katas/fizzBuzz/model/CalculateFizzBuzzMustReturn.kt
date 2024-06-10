package com.stori.katas.fizzBuzz.model

import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.BeforeEach

class CalculateFizzBuzzMustReturn {
    private val toggle: Toggle = mockk()
    private val repository: FizzBuzzRepository = mockk()
    private val useCase = CalculateFizzBuzz(
        toggle = toggle,
        repository = repository,
    )

    @Before
    fun setup() {
        coEvery { toggle.isFeatureFlagOn("fizzbuzz_service_call_enabled") } returns false
    }

    @Test
    fun `the same Integer as a String`() = runTest {
        val result = useCase.execute(2)

        "2" isEqualTo result
    }

    @Test
    fun `when enter a integer multiple of 15 should return fizzbuzz`() = runTest {
        val result = useCase.execute(15)
        "FizzBuzz" isEqualTo result
    }

    @Test
    fun `when enter a integer multiple of 3 should return fizz`() = runTest {
        val result = useCase.execute(3)
        result isEqualTo "Fizz"
    }

    @Test
    fun `when enter a integer multiple of 5 should return buzz`() = runTest {
        val result = useCase.execute(5)
        result isEqualTo "Buzz"
    }

    @Test
    fun `when toggle is on must call the service`() = runTest {
        val int = 2
        val expected = "Pepe"

        coEvery { toggle.isFeatureFlagOn("fizzbuzz_service_call_enabled") } returns true
        coEvery { repository.calculate(int) } returns expected
        val result = useCase.execute(int)

        result isEqualTo expected
        coVerify { repository.calculate(int) }
    }

    private infix fun Any.isEqualTo(other: Any) = assertEquals(this, other)
}
