package com.mg.cleanarchitectureplaygraound.business.domain.data.cache.abstraction

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

interface NoteCacheDataSource {
    suspend fun insertNote(note: Note): Id
    suspend fun deleteNote(primary: String): Int
    suspend fun deleteNotes(note: List<Note>): Int
    suspend fun updateNote(primary: String, newTitle: String, newBody: String)
    suspend fun searchNotes(query: String, filterAndOrder: String, page: Int): List<Note>
    suspend fun searchById(id: Id): Note?
    suspend fun getNumberOfNotes(): Int
}