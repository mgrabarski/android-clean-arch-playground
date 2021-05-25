package com.mg.cleanarchitectureplaygraound.business.fake

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.data.network.abstraction.NetworkDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

class FakeNetworkDataSource : NetworkDataSource {

    private val map = mutableMapOf<Id, Note>()

    override suspend fun insertOrUpdateNote(note: Note) {
        map[note.id] = note
    }

    override suspend fun deleteNote(id: Id) {
        TODO("Not yet implemented")
    }

    override suspend fun insertDeletedNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun insertDeletedNotes(notes: List<Note>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteDeteledNote(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun getDeletedNotes(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllNotes() {
        TODO("Not yet implemented")
    }

    override suspend fun searchNote(note: Note): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getAllNotes(): List<Note> = map.values.toList()

    override suspend fun insertOrUpdateNotes(notes: List<Note>) {
        TODO("Not yet implemented")
    }
}