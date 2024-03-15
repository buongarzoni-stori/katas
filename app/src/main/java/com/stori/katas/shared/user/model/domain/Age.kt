package com.stori.katas.shared.user.model.domain

@JvmInline
value class Age(private val value: UShort) {
    fun isMinor() = value < 18.toUShort()
}

