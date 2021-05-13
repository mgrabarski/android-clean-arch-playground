package com.mg.cleanarchitectureplaygraound.business.domain.data.model.factories

import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.joda.time.DateTime

class NoteFactoryTest : FunSpec({

    val timeProvider: TimeProvider = mockk()
    val sut = NoteFactory(timeProvider)

    val anyTitle = "title"
    val anyBody = "body"
    val anyTime = TimeProvider.AppDateTime(DateTime.now(), "details", "short")

    beforeTest {
        every { timeProvider.now() }.returns(anyTime)
    }

    test("Provides note with title and body") {
        val result = sut.createNote(anyTitle, anyBody)

        result.title shouldBe anyTitle
        result.body shouldBe anyBody
        result.createdAt shouldBe anyTime.detailsFormat
        result.updatedAt.isEmpty() shouldBe true
    }

    test("Provides note with empty body when put null as parameter") {
        val result = sut.createNote(anyTitle, null)

        result.body shouldBe ""
    }
})
