package com.stori.katas.libraries

object Apptimize {
    private val toggles = mutableSetOf<String>()

    init {
        fetchToggles()
    }

    fun isFeatureFlagOn(
        name: String,
    ) = toggles.contains(name)


    private fun fetchToggles() {
        toggles.add("fizzbuzz_service_call_enabled")
        toggles.add("toggle2")
        toggles.add("toggle3")
    }
}
