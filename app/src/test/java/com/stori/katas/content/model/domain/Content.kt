package com.stori.katas.content.model.domain

import com.stori.katas.shared.common.model.domain.Id
import com.stori.katas.shared.user.model.domain.idRandom
import com.stori.katas.utils.primitives.randomBoolean

fun contentRandom(
    id: Id = idRandom(),
    isExplicit: Boolean = randomBoolean(),
) = Content(
    id = id,
    isExplicit = isExplicit,
)
