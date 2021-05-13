package com.mg.cleanarchitectureplaygraound.business.domain.data.network.abstraction

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

interface NetworkDataSource {
    suspend fun insertOrUpdateNote(note: Note)
    suspend fun deleteNote(id: Id)
    suspend fun insertDeletedNote(note: Note)
    suspend fun insertDeletedNotes(notes: List<Note>)
    suspend fun deleteDeteledNote(note: Note)
    suspend fun getDeletedNotes(): List<Note>
    suspend fun deleteAllNotes()
    suspend fun searchNote(note: Note): Note?
    suspend fun getAllNotes(): List<Note>
    suspend fun insertOrUpdateNotes(notes: List<Note>)
}