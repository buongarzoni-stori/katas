package com.stori.katas.content.model.actions

import com.stori.katas.content.model.domain.Content
import com.stori.katas.content.model.domain.Contents
import com.stori.katas.shared.common.model.domain.Id
import com.stori.katas.shared.user.model.domain.User

class GetContent(
    private val contents: Contents
) {
    fun execute(user: User, contentId: Id): Content? {
        val content = contents.get(contentId) ?: return null
        if (user.age.isMinor()) {
            return if (content.isExplicit) null else content
        }
        return content
    }

    private fun User.canWatchContent(content: Content) = age.isMinor() && content.isExplicit.not()
}
