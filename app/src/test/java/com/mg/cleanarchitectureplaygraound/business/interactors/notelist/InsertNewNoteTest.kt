package com.mg.cleanarchitectureplaygraound.business.interactors.notelist

import com.mg.cleanarchitectureplaygraound.business.domain.data.cache.abstraction.NoteCacheDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.data.model.factories.NoteFactory
import com.mg.cleanarchitectureplaygraound.business.domain.data.network.abstraction.NetworkDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.state.UseCaseState.Success
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id
import com.mg.cleanarchitectureplaygraound.business.fake.FakeNetworkDataSource
import com.mg.cleanarchitectureplaygraound.business.fake.FakeNoteCacheDataSource
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.types.shouldBeInstanceOf
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.flow.collect
import java.util.*

class InsertNewNoteTest : FunSpec({

    val noteCacheDataSource: NoteCacheDataSource = FakeNoteCacheDataSource()
    val networkDataSource: NetworkDataSource = FakeNetworkDataSource()
    val noteFactory: NoteFactory = mockk()

    val sut = InsertNewNote(noteCacheDataSource, networkDataSource, noteFactory)

    test("Inserts new note") {
        val note = anyNote()
        every { noteFactory.createNote(any(), any()) }.returns(note)

        sut.insertNewNote("title", "body").collect { useCaseState ->
            useCaseState.shouldBeInstanceOf<Success<Note>>()
            networkDataSource.getAllNotes().shouldContain(note)
        }
    }
})

private fun anyNote(
    anyId: UUID = Id.randomUUID(),
    title: String = "title",
    body: String = "body"
) = Note(
    id = anyId,
    title = title,
    body = body,
    "",
    ""
)
