package com.stori.katas.libraries

object Apptimize {
    const val SERVICE_FLAG = "fizzbuzz_service_call_enabled"

    private val toggles = mutableSetOf<String>()

    init {
        fetchToggles()
    }

    fun isFeatureFlagOn(
        name: String,
    ) = toggles.contains(name)


    private fun fetchToggles() {
        toggles.add("toggle1")
        toggles.add("toggle2")
        toggles.add("toggle3")
        //toggles.add("fizzbuzz_service_call_enabled")
    }
}
