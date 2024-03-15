package com.stori.katas.shared.user.model.domain

import com.stori.katas.utils.primitives.randomInt

internal fun ageRandom() = Age(randomInt(0..120).toUShort())

internal fun ageMinor() = Age(randomInt(0..17).toUShort())

internal fun ageAdult() = Age(randomInt(18..120).toUShort())
