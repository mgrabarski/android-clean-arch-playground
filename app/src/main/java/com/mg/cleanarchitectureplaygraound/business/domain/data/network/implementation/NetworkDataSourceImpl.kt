package com.mg.cleanarchitectureplaygraound.business.domain.data.network.implementation

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.data.network.abstraction.NetworkDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id
import com.mg.cleanarchitectureplaygraound.framework.datasource.network.service.NoteWebserviceService

class NetworkDataSourceImpl(
    private val webserviceService: NoteWebserviceService
) : NetworkDataSource {

    override suspend fun insertOrUpdateNote(note: Note) {
        TODO("Not yet implemented")
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

    override suspend fun getAllNotes(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun insertOrUpdateNotes(notes: List<Note>) {
        TODO("Not yet implemented")
    }
}