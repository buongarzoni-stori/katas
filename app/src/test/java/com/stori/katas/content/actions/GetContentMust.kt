package com.stori.katas.content.actions

import com.stori.katas.content.model.actions.GetContent
import com.stori.katas.content.model.domain.Content
import com.stori.katas.content.model.domain.Contents
import com.stori.katas.content.model.domain.contentRandom
import com.stori.katas.shared.common.model.domain.Id
import com.stori.katas.shared.user.model.domain.Age
import com.stori.katas.shared.user.model.domain.User
import com.stori.katas.shared.user.model.domain.idRandom
import com.stori.katas.shared.user.model.domain.userRandom
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GetContentMust {
    private val fakeContents = FakeContents()
    private val getContent = GetContent(fakeContents)

    private lateinit var user: User
    private var contentId: Id = idRandom()

    private var content: Content? = null

    @Before
    fun setup() {
        fakeContents.contents.clear()
    }

    @Test
    fun `retrieve explicit content for adult users`() {
        givenAnAdultUser()
        givenAnExplicitContent()

        whenGetContent()

        thenContentMustExists()
    }

    @Test
    fun `not retrieve explicit content for minor users`() {
        givenAMinorUser()
        givenAnExplicitContent()

        whenGetContent()

        thenContentMustNotExists()
    }

    private fun givenAnAdultUser() {
         user = userRandom(age = Age(18.toUShort()))
    }

    private fun givenAMinorUser() {
        user = userRandom(age = Age(17.toUShort()))
    }

    private fun givenAnExplicitContent() {
        val inMemoryContent = contentRandom(id = contentId, isExplicit = true)
        fakeContents.contents[inMemoryContent.id] = inMemoryContent
    }

    private fun whenGetContent() {
        content = getContent.execute(user, contentId)
    }

    private fun thenContentMustExists() {
        Assert.assertNotNull(content)
    }

    private fun thenContentMustNotExists() {
        Assert.assertNull(content)
    }
}

class FakeContents: Contents {
    val contents = mutableMapOf<Id, Content>()

    override fun get(id: Id) = contents[id]
}
