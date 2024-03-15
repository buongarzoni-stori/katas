package com.stori.katas.shared.user.model.domain

import com.stori.katas.shared.common.model.domain.Id

internal fun userRandom(
    id: Id = idRandom(),
    name: Name = nameRandom(),
    age: Age = ageRandom(),
) = User(
    id = id,
    name = name,
    age = age,
)
