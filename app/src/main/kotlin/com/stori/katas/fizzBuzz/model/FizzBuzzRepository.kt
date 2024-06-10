package com.stori.katas.fizzBuzz.model

interface FizzBuzzRepository {
    suspend fun calculate(int: Int): String
}
