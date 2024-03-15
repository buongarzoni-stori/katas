package com.stori.katas.content.model.domain

import com.stori.katas.shared.common.model.domain.Id

interface Contents {
    fun get(id: Id): Content?
}
