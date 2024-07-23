package com.stori.katas.fizzBuzz.model

interface FizzBuzzService {
    suspend fun execute(int: Int): String
}