package com.stori.katas.shared.user.model.domain

import com.stori.katas.utils.primitives.randomInt

internal fun ageRandom() = Age(randomInt(0..120).toUShort())
