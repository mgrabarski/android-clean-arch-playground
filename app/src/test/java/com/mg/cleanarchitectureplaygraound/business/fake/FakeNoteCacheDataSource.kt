package com.mg.cleanarchitectureplaygraound.business.fake

import com.mg.cleanarchitectureplaygraound.business.domain.data.cache.abstraction.NoteCacheDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

class FakeNoteCacheDataSource : NoteCacheDataSource {

    private val map = mutableMapOf<Id, Note>()

    override suspend fun insertNote(note: Note): Id {
        map[note.id] = note
        return note.id
    }

    override suspend fun deleteNote(primary: String): Int {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNotes(note: List<Note>): Int {
        TODO("Not yet implemented")
    }

    override suspend fun updateNote(primary: String, newTitle: String, newBody: String) {
        TODO("Not yet implemented")
    }

    override suspend fun searchNotes(query: String, filterAndOrder: String, page: Int): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun searchById(id: Id): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getNumberOfNotes(): Int {
        TODO("Not yet implemented")
    }
}