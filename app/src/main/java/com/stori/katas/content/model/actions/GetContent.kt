package com.stori.katas.content.model.actions

import com.stori.katas.content.model.domain.Content
import com.stori.katas.content.model.domain.Contents
import com.stori.katas.shared.common.model.domain.Id
import com.stori.katas.shared.user.model.domain.User

class GetContent(
    private val contents: Contents
) {
    fun execute(user: User, contentId: Id): Content? {
        return null
    }
}
