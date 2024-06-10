package com.stori.katas.fizzBuzz.model

interface EventTracker {
    fun send(event: String, properties: Map<String, String>)
}
